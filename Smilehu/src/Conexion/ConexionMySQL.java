/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */
package Conexion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import Modelo.ConsultaCita;
import Modelo.Doctor_administrador;
import Modelo.Especialidad;
import Modelo.ModeloDiente;
import Modelo.Paciente;
import Modelo.Proveedor;
import Modelo.Solicitud;
import Modelo.StockMaterial;
import Modelo.Tratamiento;

import java.sql.*;
import java.text.SimpleDateFormat;

public class ConexionMySQL {
	private static  final String BD="prdatos";
    private static  final String USUARIO="root";
    private static  final String PASS="1234";
    private static  Connection connection=null;
    private static  final String HOST="localhost";
    private static TimeZone zonaHoraria;



   public static void conectar() throws SQLException, ClassNotFoundException{
        if(connection == null || connection.isClosed()){
            try{

                Class.forName("com.mysql.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonaHoraria = now.getTimeZone();
                //add ?useSSL=false to the url if i dont want a warning about verification
                connection = (Connection)DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user="+USUARIO+"&password="+PASS+"&userLegacyDateTimeCode=false&serverTimeZone="+zonaHoraria.getID());
                System.out.println("Conexion OK");

            } catch(SQLException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
   
   
   public static Connection obtenerConexion() {
	
   try {
	   Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user="+USUARIO+"&password="+PASS);
	   return con;
	   
   }catch(SQLException ex) {
	   System.out.println(ex.toString());
	   return null;
	   
   }
 
   
   }
   
 
    
    public static void desconectar()throws SQLException{
        if(connection!=null && connection.isClosed()){
        connection.close();  
        }
    }
    
     
    
     public static int ejecutarInsertDeleteUpdate(String consulta) throws SQLException{
        Statement stmt=connection.createStatement();
        int fila=stmt.executeUpdate(consulta);
        return fila;
    }
    
     public static void modificarPaciente(Paciente paciente) throws SQLException {
         // Verificar si el paciente existe antes de intentar la actualización
         if (!existePaciente(paciente.getNombre(), paciente.getApellidos())) {
             System.out.println("El paciente no existe en la base de datos.");
             System.out.println(paciente.getApellidos());
             return;
         }

         String query = "UPDATE paciente SET " +
                 "nombre = ?, " +
                 "apellidos = ?, " +
                 "direccion = ?, " +
                 "genero = ?, " +
                 "telefono = ?, " +
                 "fecha_alta = ?, " +
                 "fecha_nacimiento = ? " +
                 "WHERE id_paciente = ? ";

         try (PreparedStatement pstmt = connection.prepareStatement(query)) {
             pstmt.setString(1, paciente.getNombre());
             pstmt.setString(2, paciente.getApellidos());
             pstmt.setString(3, paciente.getDireccion());
             pstmt.setString(4, paciente.getGenero());
             pstmt.setString(5, paciente.getTelefono());
             pstmt.setString(6, paciente.getFechaComoCadena());
             pstmt.setString(7, paciente.getFechaNacimiento());
             pstmt.setInt(8, paciente.getIdPaciente()); // id en la cláusula WHERE
            

             pstmt.executeUpdate();
             System.out.println("Paciente modificado correctamente");
         }
     }

   
     private static boolean existePaciente(String nombre, String apellidos) throws SQLException {
         String query = "SELECT COUNT(*) FROM paciente WHERE nombre = ? AND apellidos = ?";
         try (PreparedStatement pstmt = connection.prepareStatement(query)) {
             pstmt.setString(1, nombre);
             pstmt.setString(2, apellidos);
             try (ResultSet resultSet = pstmt.executeQuery()) {
                 resultSet.next();
                 return resultSet.getInt(1) > 0;
             }
         }
     }
  
     
      public static void modificarDoctor(Doctor_administrador doctor) throws SQLException {
          // Verificar si el paciente existe antes de intentar la actualización
          if (!existeDoctor(doctor.getNombre(), doctor.getApellidos())) {
              System.out.println("El paciente no existe en la base de datos.");
              System.out.println(doctor.getNombre()+doctor.getApellidos());
              return;
          }

          String query = "UPDATE doctor_administrador SET " +
        		  "direccion = ?, " +
                  "estado_baja = ?, " +
                  "pass = ?, " +
                  "telefono = ? " +
                  "WHERE nombre = ? AND apellidos = ? ";

          try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        	
              pstmt.setString(1, doctor.getDireccion());
              pstmt.setInt(2, doctor.getEstado_baja()); 
              pstmt.setString(3, doctor.getPass());
              pstmt.setString(4, doctor.getTeléfono()); 
              pstmt.setString(5, doctor.getNombre()); 
              pstmt.setString(6, doctor.getApellidos()); 
             

              pstmt.executeUpdate();
              System.out.println("doctor modificado correctamente");
              
          }
      }

      private static boolean existeDoctor(String nombre, String apellidos) throws SQLException {
          String query = "SELECT COUNT(*) FROM doctor_administrador WHERE nombre = ? AND apellidos = ?";
          try (PreparedStatement pstmt = connection.prepareStatement(query)) {
              pstmt.setString(1, nombre);
              pstmt.setString(2, apellidos);
              try (ResultSet resultSet = pstmt.executeQuery()) {
                  resultSet.next();
                  return resultSet.getInt(1) > 0;
              }
          }
      }
     
     
     
    /* public static void modificarCita(ConsultaCita cita) throws SQLException {
    	 String query = "UPDATE consulta_cita SET " +
    	            "nombre = '" + cita.getId_doctor() + "', " +
    	            "apellidos = '" + cita.getId_historial() + "', " +
    	            "direccion = '" + cita.getId_tratamiento() + "', " +
    	            "genero = '" + cita.getObservaciones() + "', " +
    	            "telefono = '" + cita.getFecha() + "', " +
    	            "fecha_alta = '" + cita.getHora() + "', " +
    	            
    	            "WHERE id_cita = " + cita.getId_cita();
         
         Statement stmt = connection.createStatement();
         stmt.executeUpdate(query);
        
         System.out.println("hola");
         stmt.close();
         }*/
     
     
     
     
     
     
     
    /* public void modificarCita1(ConsultaCita cita,int id) throws SQLException {
    	 String query = "UPDATE consulta_cita SET " +
                 "id_tratamiento = ?, " +
                 "observaciones = ?, " +
                 "fecha = ?, " +
                 "hora = ? " +
                 "WHERE id_cita = ?";

  try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	  
      pstmt.setInt(1, cita.getId_tratamiento());
      pstmt.setString(2, cita.getObservaciones());
      pstmt.setString(3, cita.getFecha());
      pstmt.setString(4, cita.getHora());
      pstmt.setInt(5, id);

      int rowsAffected = pstmt.executeUpdate();
      System.out.println("Actualización exitosa. Filas afectadas: " + rowsAffected);
  } catch (SQLException e) {
      e.printStackTrace();
  }
    	}*/

     
    /* public static Proveedor consultaProveedor(int idProveedor) throws SQLException {








         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("Select * from paciente where id_paciente = " + idProveedor);//consulta

         Proveedor proveedor=null;
         if (rset.next()) {
        	 String nombre=rset.getString("nombre");
        int telefono=rset.getInt("telefono");
        String correo=rset.getString("correo");
       
         proveedor=new Proveedor();
         }
         stmt.close();
  
 	


        return proveedor;
    }*/
     
     
     
     
     public static Paciente buscarPacientes(String nombrePaciente, String apellidoPaciente) throws SQLException {
    	    String query = "SELECT * FROM Paciente WHERE nombre = ? AND apellidos = ?";
    	    
    	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    	        pstmt.setString(1, nombrePaciente);
    	        pstmt.setString(2, apellidoPaciente);
    	        
    	        ResultSet rset = pstmt.executeQuery();

    	        if (rset.next()) {
    	            int id = rset.getInt("id_paciente");
    	            String direccion = rset.getString("direccion");
    	            String genero = rset.getString("genero");
    	            String telefono = rset.getString("telefono");
    	            String fecha_alta = rset.getString("fecha_alta");
    	            String fecha_nacimiento = rset.getString("fecha_nacimiento");
    	            System.out.println(id);
    	            Paciente paciente= new Paciente(id, nombrePaciente, apellidoPaciente, direccion, genero, telefono, fecha_alta, fecha_nacimiento);
    	            return paciente;
    	        }
    	        
    	    }
			return null;
    	   
    	    
    	}
  
     
     public static ResultSet ejecutarSelect(String consulta)throws SQLException{
         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery(consulta);
         
         return rset;
     }
     
     public static void crearRegistrosDientes(Paciente paciente) {
         try {
             try {
				conectar();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
             // Consultar si el paciente existe
             String consultaExistenciaPaciente = "SELECT COUNT(*) FROM Paciente WHERE id_paciente = ?";
             try (PreparedStatement stmt = connection.prepareStatement(consultaExistenciaPaciente)) {
            	 int id =paciente.getIdPaciente(); 
                 stmt.setInt(1,id);
                 System.out.println(id);
                 try (ResultSet resultSet = stmt.executeQuery()) {
                     resultSet.next();
                     int cantidadRegistrosPaciente = resultSet.getInt(1);
                     if (cantidadRegistrosPaciente == 0) {
                         System.out.println("El paciente no existe en la base de datos.");
                         return;
                     }
                 }
             }
             
             // Consultar si ya existen registros de dientes para el paciente
             String consultaExistenciaDientes = "SELECT COUNT(*) FROM Dientes WHERE id_Paciente = ?";
             try (PreparedStatement statement = connection.prepareStatement(consultaExistenciaDientes)) {
                 statement.setInt(1, paciente.getIdPaciente());
                 try (ResultSet resultSet = statement.executeQuery()) {
                     resultSet.next();
                     int cantidadRegistros = resultSet.getInt(1);
                     if (cantidadRegistros > 0) {
                         abrirInformacionPaciente(paciente);
                     } else {
                         // Insertar 10 nuevos registros de dientes para el paciente
                         String insercionRegistros = "INSERT INTO Dientes (nDiente, descripcion, id_Paciente) VALUES (?, ?, ?)";
                         try (PreparedStatement insertStatement = connection.prepareStatement(insercionRegistros)) {
                             for (int i = 1; i <= 10; i++) {
                                 insertStatement.setInt(1, i);
                                 insertStatement.setString(2, "Descripción del diente " + i);
                                 insertStatement.setInt(3, paciente.getIdPaciente());
                                 insertStatement.executeUpdate();
                             }
                             JOptionPane.showMessageDialog(null, "Se han creado 10 registros para el paciente.");
                         }
                     }
                 }
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 
     
     
     
     
     
     
     
     public static ModeloDiente consultarDiente(int idDiente) throws SQLException {
         ModeloDiente diente = null;
         Connection connection = null;
         PreparedStatement pstmt = null;
         ResultSet resultSet = null;
         
         try {
             connection = obtenerConexion();
             String query = "SELECT * FROM dientes WHERE idDiente = ?";
             pstmt = connection.prepareStatement(query);
             pstmt.setInt(1, idDiente);
             resultSet = pstmt.executeQuery();

             if (resultSet.next()) {
                 int id = resultSet.getInt("idDiente");
                 int numeroDiente = resultSet.getInt("nDiente");
                 int idPaciente = resultSet.getInt("id_Paciente");
                 String descripcion = resultSet.getString("descripcion");

                 diente = new ModeloDiente(id, numeroDiente, descripcion, idPaciente);
                 
                 
                 
                 
                 
             }
         } finally {
             // Cerrar recursos en un bloque finally para asegurarse de que se cierren correctamente
             if (resultSet != null) {
                 resultSet.close();
             }
             if (pstmt != null) {
                 pstmt.close();
             }
             if (connection != null) {
                 connection.close();
             }
         }

         return diente;
     }
 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     public static void abrirInformacionPaciente(Paciente paciente) {
         // Aquí puedes implementar la lógica para abrir la información del paciente
         JOptionPane.showMessageDialog(null, "Abrir información del paciente con ID: " + paciente.getIdPaciente());
     }
     
     
     
     
     
     
     
     
     public static List<Paciente> buscarPacientesCombo(String nombrePaciente) throws SQLException {
    	    List<Paciente> pacientes = new ArrayList<>();
    	    String query = "SELECT * FROM paciente WHERE nombre = ?";
    	    
    	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    	        pstmt.setString(1, nombrePaciente);
    	        ResultSet rset = pstmt.executeQuery();

    	        while (rset.next()) {
    	            int id = rset.getInt("id_paciente");
    	            String apellidos = rset.getString("apellidos");
    	            String direccion = rset.getString("direccion");
    	            String genero = rset.getString("genero");
    	            String telefono = rset.getString("telefono");
    	            String fecha_alta = rset.getString("fecha_alta");
    	            String fecha_nacimiento = rset.getString("fecha_nacimiento");

    	            System.out.println("Justo antes de crear objetop"+id);
    	            Paciente paciente = new Paciente(id, nombrePaciente, apellidos, direccion, genero, telefono, fecha_alta, fecha_nacimiento);
    	            System.out.println("Despues de crear objeto"+paciente.getIdPaciente());
    	            pacientes.add(paciente);
    	        }
    	    }

    	    return pacientes;
    	}
     
     
     
     
     public static Paciente consultaPaciente(int idPaciente) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("Select * from paciente where id_paciente = " + idPaciente);//consulta

         Paciente paciente=null;
         if (rset.next()) {
        String nombre=rset.getString("nombre");
        String apellidos=rset.getString("apellidos");
        String direccion=rset.getString("direccion");
        String genero=rset.getString("genero");
        String telefono=rset.getString("telefono");
        String fecha_alta=rset.getString("fecha_alta");
        String fecha_nacimiento=rset.getString("fecha_nacimiento");
         paciente=new Paciente(idPaciente,nombre,apellidos,direccion,genero,telefono,fecha_alta,fecha_nacimiento);
         }
         stmt.close();
  
 	


        return paciente;
    }
    
     public static void insertarPaciente(Paciente paciente) throws SQLException {
		    String query = "INSERT INTO paciente (nombre, apellidos, direccion, genero, telefono, fecha_alta, fecha_nacimiento) " +
		                   "VALUES ('" + paciente.getNombre() + "', '" + paciente.getApellidos() + "', '" +
		                   paciente.getDireccion() + "', '" + paciente.getGenero() + "', '" + paciente.getTelefono() + "', '" + 
		                   paciente.getFechaComoCadena() + "', '" + paciente.getFechaNacimiento() + "')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     
     
     
     
     
     
     
     public static void insertarEspecialidad(String nombre) throws SQLException {
		    String query = "INSERT INTO especialidad (nombre_especialidad) VALUES ('"+nombre+"')";
		    
		    Statement stmt = connection.createStatement(); 
		    stmt.executeUpdate(query);
		}
     
     
     
     
     
     
     
     public static void insertarDoctor(Doctor_administrador doctor) throws SQLException {
    	    String query = "INSERT INTO doctor_administrador (id_especialidad, nombre, apellidos, direccion, fecha_alta, estado_baja, genero, pass, tipo_usuario, telefono, fecha_nacimiento) " +
    	                   "VALUES (" + doctor.getId_especialidad() + ", '" + doctor.getNombre() + "', '" + doctor.getApellidos() + "', '" +
    	                   doctor.getDireccion() + "', '" + doctor.getFecha_alta() + "', " + doctor.getEstado_baja() + ", '" +
    	                   doctor.getGenero() + "', '" + doctor.getPass() + "', 1, '" + doctor.getTeléfono() + "', '" + 
    	                   doctor.getFecha_nacimiento() + "')";

    	    Statement stmt = connection.createStatement(); 
    	    stmt.executeUpdate(query);
    	}
     
     
     
     
     
     public static Especialidad buscarEspecialidadId(int id_especialidad) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from especialidad where id_especialidad  ='"+id_especialidad+"'");//consulta

         Especialidad especialidad=null;
         if (rset.next()) {
       
        String nombre=rset.getString("nombre");
       

        
        
        
        
        
        especialidad=new Especialidad(id_especialidad,nombre);
         }
         stmt.close();
  
 	


        return especialidad;
    }
     
    
     
     public static Especialidad buscarEspecialidad(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from especialidad where nombre_especialidad  ='"+nombre+"'");//consulta

         Especialidad especialidad=null;
         if (rset.next()) {
       
        int id_especialidad=rset.getInt("id_especialidad");
       

        
        
        
        
        
        especialidad=new Especialidad(id_especialidad,nombre);
         }
         stmt.close();
  
 	


        return especialidad;
    }
     
     
     
     
     
     
     
     
     public static Connection getConnection() throws SQLException {
         if (connection == null || connection.isClosed()) {
             // Si la conexión no está establecida o está cerrada, crea una nueva conexión
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 connection = DriverManager.getConnection(HOST, USUARIO, PASS);
             } catch (ClassNotFoundException e) {
                 // Manejo de excepciones en caso de que el controlador no se encuentre
                 throw new SQLException("Controlador MySQL no encontrado", e);
             }
         }
         return connection;
     }
     
     
     
     
     
     
     
     
     
     public static Doctor_administrador buscarDoctor(String nombre, String apellidos) throws SQLException {
    	    // Utilizar PreparedStatement para manejar la consulta con parámetros
    	    String sql = "SELECT * FROM doctor_administrador WHERE nombre = ? AND apellidos = ? AND tipo_usuario = ?";
    	    Doctor_administrador doctor = null;

    	    try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
    	        pstmt.setString(1, nombre);
    	        pstmt.setString(2, apellidos);
    	        pstmt.setString(3, "0");

    	        try (ResultSet rset = pstmt.executeQuery()) {
    	            if (rset.next()) {
    	                // Obtener los datos del ResultSet
    	                int id_doctor_administrador = rset.getInt("id_doctor_administrador");
    	                int id_especialidad = rset.getInt("id_especialidad");
    	                String direccion = rset.getString("direccion");
    	                String fecha_alta = rset.getString("fecha_alta");
    	                int estado_baja = rset.getInt("estado_baja");
    	                String genero = rset.getString("genero");
    	                String pass = rset.getString("pass");
    	                String tipo_usuario = rset.getString("tipo_usuario");
    	                String telefono = rset.getString("telefono");
    	                String fecha_nacimiento = rset.getString("fecha_nacimiento");
    	                int activo = rset.getInt("activo");

    	                // Crear y retornar el objeto Doctor_administrador
    	                doctor = new Doctor_administrador(id_doctor_administrador, id_especialidad, nombre, apellidos,
    	                        direccion, fecha_alta, estado_baja, genero, pass, tipo_usuario, telefono,
    	                        fecha_nacimiento, activo);
    	            }
    	        }
    	    } catch (SQLException e) {
    	      
    	        e.printStackTrace();
    	        
    	        throw e;
    	    }

    	    return doctor;
    	}
     
     
     
     
     public static Tratamiento buscarTratamiento(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from tratamiento where nombre  ='"+nombre+"'");//consulta

         Tratamiento tratamiento=null;
         if (rset.next()) {
       
        int id_tratamiento=rset.getInt("id_tratamiento");
        int id_especialidad=rset.getInt("id_especialidad");
        double precio=rset.getDouble("precio");
       

        
        
        
        
        
        tratamiento=new Tratamiento(id_tratamiento,id_especialidad,nombre,precio);
         }
         stmt.close();
  
 	


        return tratamiento;
    }
     public static StockMaterial buscarMaterial(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from tratamiento where nombre  ='"+nombre+"'");//consulta

         StockMaterial material=null;
         if (rset.next()) {
       
        int id_material=rset.getInt("id_material");
        int id_proveedor=rset.getInt("id_proveedor"); 
        int disponible=rset.getInt("disponible");  
        int solicitado=rset.getInt("solicitado");  
        int bajo_pedido=rset.getInt("bajo_pedido");  
        double precio=rset.getDouble("precio");  
        int id_paciente=rset.getInt("id_paciente");  
        
        material=new StockMaterial(id_material,id_proveedor,nombre,disponible,solicitado,bajo_pedido,precio);
         }
         stmt.close();
  

        return material;
    }
     
     
     
     
     
     
   //COMBOBOX Doctores Crear cita
     
     public static List<Doctor_administrador> buscarDoctorCita(int id_especialidad) throws SQLException {
    	 List<Doctor_administrador> combo = new ArrayList<>();
    	 String query = "SELECT * FROM doctor_administrador WHERE id_especialidad='"+id_especialidad+"'AND tipo_usuario = '1'";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 int id_doctor_administrador=rset.getInt("id_doctor_administrador");
    		        String nombre=rset.getString("nombre");
    		        String apellidos=rset.getString("apellidos");

    			 
    		        Doctor_administrador doctor=new Doctor_administrador(id_doctor_administrador,id_especialidad,nombre,apellidos);
    		        combo.add(doctor);
    		 }
    	 }
    	 
    	 return combo;
     }
     
//COMBOBOX Proveedores proveedor creado
     
     public static List<Proveedor> buscarProveedor(String nombre) throws SQLException {
    	 List<Proveedor> combo = new ArrayList<>();
    	 String query = "SELECT * FROM proveedor WHERE nombre='"+nombre+"'";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 	int id_proveedor=rset.getInt("id_proveedor");
    		      
    		        String direccion=rset.getString("direccion");
    		        String telefono=rset.getString("telefono");
    		        String correo=rset.getString("correo");

    			 
    		        Proveedor proveedor=new Proveedor(id_proveedor,nombre,direccion,telefono,correo);
    		        combo.add(proveedor);
    		 }
    	 }
    	 
    	 return combo;
     }
     
     
     //COMBOBOX Doctores gestion medica crear especialidad
     
     public static List<Doctor_administrador> buscarDoctor() throws SQLException {
    	 List<Doctor_administrador> combo = new ArrayList<>();
    	 String query = "SELECT * FROM doctor_administrador WHERE tipo_usuario='1' ";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 int id_doctor_administrador=rset.getInt("id_doctor_administrador");
    		        int id_especialidad=rset.getInt("id_especialidad");
    		        String direccion=rset.getString("direccion");
    		        String nombre=rset.getString("nombre");
    		        String apellidos=rset.getString("apellidos");
    		        String fecha_alta=rset.getString("fecha_alta");
    		        int estado_baja=rset.getInt("estado_baja");
    		        String genero=rset.getString("genero");
    		        String pass=rset.getString("pass");
    		        String tipo_usuario=rset.getString("tipo_usuario");
    		        String teléfono=rset.getString("telefono");
    		        String fecha_nacimiento=rset.getString("fecha_nacimiento");
    		        int activo=rset.getInt("activo");
    			 
    		        Doctor_administrador doctor=new Doctor_administrador(id_doctor_administrador,id_especialidad,nombre,apellidos,direccion,fecha_alta,estado_baja,genero,pass,tipo_usuario,teléfono,fecha_nacimiento,activo);
    		        combo.add(doctor);
    		 }
    	 }
    	 
    	 return combo;
     }
     //COMBOBOX Doctores Ficha Modificar nombre Doctor

     
     public static List<Doctor_administrador> buscarDoctorModificar(String nombre) throws SQLException {
    	 List<Doctor_administrador> combo = new ArrayList<>();
    	 String query = "SELECT * FROM doctor_administrador WHERE tipo_usuario='0' AND nombre = '"+nombre+"'" ;
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 int id_doctor_administrador=rset.getInt("id_doctor_administrador");
    		        int id_especialidad=rset.getInt("id_especialidad");
    		        String direccion=rset.getString("direccion"); 
    		        String nom=rset.getString("nombre"); 
    		        String apellidos=rset.getString("apellidos");
    		        String fecha_alta=rset.getString("fecha_alta");
    		        int estado_baja=rset.getInt("estado_baja");
    		        String genero=rset.getString("genero");
    		        String pass=rset.getString("pass");
    		        String tipo_usuario=rset.getString("tipo_usuario");
    		        String teléfono=rset.getString("telefono");
    		        String fecha_nacimiento=rset.getString("fecha_nacimiento");
    		        int activo=rset.getInt("activo");
    			 
    		        Doctor_administrador doctor=new Doctor_administrador(id_doctor_administrador,id_especialidad,nom,apellidos,direccion,fecha_alta,estado_baja,genero,pass,tipo_usuario,teléfono,fecha_nacimiento,activo);
    		        combo.add(doctor);
    		 }
    	 }
    	 
    	 return combo;
     }
     
     
     
     
     
     
     
     
     
     
     
     
//COMBOBOX Citas tratamiento 
     
     public static List<Tratamiento> buscarTratamiento() throws SQLException {
    	 List<Tratamiento> combo = new ArrayList<>();
    	 String query = "SELECT * FROM tratamiento";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 int id_tratamiento=rset.getInt("id_tratamiento");
    		        int id_especialidad=rset.getInt("id_especialidad");
    		        String nombre=rset.getString("nombre");
    		        double precio=rset.getDouble("precio");
    			 
    		        Tratamiento doctor=new Tratamiento(id_tratamiento,id_especialidad,nombre,precio);
    		        combo.add(doctor);
    		 }
    	 }
    	 
    	 return combo;
     }
//COMBOBOX Citas material
     
     public static List<StockMaterial> buscarMaterial() throws SQLException {
    	 List<StockMaterial> combo = new ArrayList<>();
    	 String query = "SELECT * FROM stock_material";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 
    			 
    			 	int id_material=rset.getInt("id_material");
    		        int id_proveedor=rset.getInt("id_proveedor");
    		        String nombre=rset.getString("nombre");
    		        int disponible=rset.getInt("disponible");
    		        int solicitado=rset.getInt("solicitado");
    		        int bajo_pedido=rset.getInt("bajo_pedido");
    		        int precio=rset.getInt("precio");
    			 
    		        StockMaterial material=new StockMaterial(id_material,id_proveedor,nombre,disponible,solicitado,bajo_pedido,precio);
    		        combo.add(material);
    		 }
    	 }
    	 
    	 return combo;
     }
//COMBOBOX Nuevo material proveedor
     
     public static List<Proveedor> buscarProvedor() throws SQLException {
    	 List<Proveedor> combo = new ArrayList<>();
    	 String query = "SELECT * FROM proveedor";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 
    			 
    			 	int id_proveedor=rset.getInt("id_proveedor");
    		        String nombre=rset.getString("nombre");
    		        String direccion=rset.getString("direccion");
    		        String telefono=rset.getString("telefono");
    		        String correo=rset.getString("correo");
    		       
    			 
    		        Proveedor prov=new Proveedor(id_proveedor,nombre,direccion,telefono,correo);
    		        combo.add(prov);
    		 }
    	 }
    	 
    	 return combo;
     }
//COMBOBOX Crear Especialidad Seleccionar especialidad 
     
     public static List<Especialidad> buscarEspecialidad() throws SQLException {
    	 List<Especialidad> combo = new ArrayList<>();
    	 String query = "SELECT * FROM especialidad";
    	 
    	 try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    		
    		 ResultSet rset = pstmt.executeQuery();
    		 
    		 while (rset.next()) {
    			 
    			 
    			 	int id_especialidad=rset.getInt("id_especialidad");
    		        String nombre_especialidad=rset.getString("nombre_especialidad");
    		
    		       
    			 
    		        Especialidad esp=new Especialidad(id_especialidad,nombre_especialidad);
    		        combo.add(esp);
    		 }
    	 }
    	 
    	 return combo;
     }
     
     
     
     
    

     public static void insertarCita(ConsultaCita cita) throws SQLException {
		    String query = "INSERT INTO consulta_cita (id_tratamiento, observaciones, fecha, hora, id_paciente)" +
		                   "VALUES('" + cita.getId_tratamiento() + "', '" + cita.getObservaciones() 
		                   + "', '" + cita.getFecha() + "', '" + cita.getHora() + "', '"+cita.getid_paciente()+"')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     public static void insertarTratamiento(Tratamiento tratamiento) throws SQLException {
		    String query = "INSERT INTO tratamiento (id_especialidad, nombre, precio)" +
		                   "VALUES('" + tratamiento.getId_especialidad() + "', '" + tratamiento.getNombre() 
		                   + "', '" + tratamiento.getPrecio() + "')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     public static void insertarProveedor(Proveedor proveedor) throws SQLException {
		    String query = "INSERT INTO proveedor (nombre, direccion,telefono,correo)" +
		                   "VALUES('" + proveedor.getNombre() + "', '" + proveedor.getDireccion() 
		                   + "', '" + proveedor.getTelefono() + proveedor.getCorreo() +"')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     
     
     
     
     public static void insertarMaterial(StockMaterial material) throws SQLException {
		    String query = "INSERT INTO consulta_cita (id_proveedor, nombre, precio)" +
		                   "VALUES('" + material.getIdProveedor() + "', '" + material.getNombre() 
		                   + "', '" + material.getPrecio() + "')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     
     
     public static ConsultaCita consultaCitaId(int idCita) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT id_tratamiento,observaciones, fecha,hora,id_paciente "+
        		   " from consulta_cita where id_cita  = "+ idCita);//consulta

         ConsultaCita consultaCita=null;
         if (rset.next()) {
       
        int id_tratamiento=rset.getInt("id_tratamiento");
        String observaciones=rset.getString("observaciones");
        String fecha=rset.getString("fecha");
        String hora=rset.getString("hora");
        int id_paciente=rset.getInt("id_paciente");
        consultaCita=new ConsultaCita(idCita,id_tratamiento,observaciones,fecha,hora,id_paciente);
         }
         stmt.close();
  
 	


        return consultaCita;
    }
      
     public static ConsultaCita consultarCitaNombre(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from consulta_cita where fecha  = '"+ nombre+"'");//consulta

         ConsultaCita consultaCita=null;
         if (rset.next()) {
        	 
        int id_cita=rset.getInt("id_cita");
        int id_tratamiento=rset.getInt("id_tratamiento");
        String observaciones=rset.getString("observaciones");
        String fecha=rset.getString("fecha");
        String hora=rset.getString("hora");
        int id_paciente=rset.getInt("id_paciente");
        consultaCita=new ConsultaCita(id_cita,id_tratamiento,observaciones,fecha,hora,id_paciente);
         }
         stmt.close();
  
 	


        return consultaCita;
    }
     
     
     
     
     public static StockMaterial consultarMaterial(String nombre) throws SQLException {

    	    String query = "SELECT sm.id_material, p.nombre AS nombre_proveedor, sm.nombre, sm.disponible, sm.solicitado, sm.bajo_pedido, sm.precio " +
    	            "FROM stock_material sm " +
    	            "JOIN proveedor p ON sm.id_proveedor = p.id_proveedor " +
    	            "WHERE sm.nombre = ?";

    	    StockMaterial material = null;

    	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    	        // Configurar el parámetro en lugar de concatenar directamente en la cadena SQL
    	        pstmt.setString(1, nombre);

    	        try (ResultSet rset = pstmt.executeQuery()) {
    	            if (rset.next()) {
    	                int id_material = rset.getInt("id_material");
    	                String nombre_proveedor = rset.getString("nombre_proveedor");
    	                int disponible = rset.getInt("disponible");
    	                int solicitado = rset.getInt("solicitado");
    	                int bajo_pedido = rset.getInt("bajo_pedido");
    	                Double precio = rset.getDouble("precio");

    	                material = new StockMaterial(nombre_proveedor, nombre, id_material, disponible, solicitado, bajo_pedido, precio);
    	            }
    	        }
    	    }

    	    return material;
    	}
        	 
        	 
     
     
     
     public static List<StockMaterial> obtenerStockMaterial() {
         List<StockMaterial> stockMateriales = new ArrayList<>();

         String query = "SELECT * FROM stock_material";

         try (PreparedStatement pstmt = connection.prepareStatement(query)) {
             try (ResultSet resultSet = pstmt.executeQuery()) {
                 while (resultSet.next()) {
                     int idMaterial = resultSet.getInt("id_material");
                     int idProveedor = resultSet.getInt("id_proveedor");
                     String nombreMaterial = resultSet.getString("nombre");
                     int disponible = resultSet.getInt("disponible");
                     int solicitado = resultSet.getInt("solicitado");
                     int bajoPedido = resultSet.getInt("bajo_pedido");
                     double precio = resultSet.getDouble("precio");

                     StockMaterial stockMaterial = new StockMaterial(idMaterial, idProveedor, nombreMaterial,
                             disponible, solicitado, bajoPedido, precio);

                     stockMateriales.add(stockMaterial);
                 }
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }

         return stockMateriales;
     }
    
     public static List<Solicitud> obtenerSolicitudes() {
         List<Solicitud> soli = new ArrayList<>();

         String query = "SELECT * FROM solicitud";

         try (PreparedStatement pstmt = connection.prepareStatement(query)) {
             try (ResultSet resultSet = pstmt.executeQuery()) {
                 while (resultSet.next()) {
                     int id_solicitud = resultSet.getInt("id_solicitud");
                     int id_cita = resultSet.getInt("id_cita");
                     int cantidad = resultSet.getInt("cantidad");
                     String nombreMaterial = resultSet.getString("nombreMaterial");
                     String solicitado = resultSet.getString("solicitado");
                     

                     Solicitud solicitud = new Solicitud(id_solicitud, id_cita, cantidad,
                    		 nombreMaterial, solicitado);

                     soli.add(solicitud);
                 }
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }

         return soli;
     }
     
     
     


public static Proveedor consultaProveedor(int idProveedor) throws SQLException {

    Statement stmt=connection.createStatement();
    ResultSet rset=stmt.executeQuery("Select * from proveedor where id_proveedor = " + idProveedor);//consulta

    Proveedor proveedor=null;
    if (rset.next()) {
   String nombre=rset.getString("nombre");
   String direccion=rset.getString("direccion");
   String telefono=rset.getString("telefono");
   proveedor=new Proveedor(nombre,direccion,telefono);
    }
    stmt.close();




   return proveedor;
}

}