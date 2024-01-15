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

import Modelo.ConsultaCita;
import Modelo.Doctor_administrador;
import Modelo.Especialidad;
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
             pstmt.setString(6, paciente.getFechaDeAlta());
             pstmt.setString(7, paciente.getFechaNacimiento());
             pstmt.setInt(8, paciente.getIdUsuario ()); // id en la cláusula WHERE
            

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

    	            return new Paciente(id, nombrePaciente, apellidoPaciente, direccion, genero, telefono, fecha_alta, fecha_nacimiento);
    	        }
    	    }

    	    return null;
    	}
  
     
     public static ResultSet ejecutarSelect(String consulta)throws SQLException{
         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery(consulta);
         
         return rset;
     }
     
     
     
     
     
     public static List<Paciente> buscarPacientes(String nombrePaciente) throws SQLException {
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

    	            Paciente paciente = new Paciente(id, nombrePaciente, apellidos, direccion, genero, telefono, fecha_alta, fecha_nacimiento);
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
		                   paciente.getFechaDeAlta() + "', '" + paciente.getFechaNacimiento() + "')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     
     
     
     
     
     
     
     public static void insertarEspecialidad(String nombre) throws SQLException {
		    String query = "INSERT INTO especialidad (nombre_especialidad) VALUES ('"+nombre+"')";
		    
		    Statement stmt = connection.createStatement(); 
		    stmt.executeUpdate(query);
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
    	        pstmt.setString(3, "1");

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
        String precio=rset.getString("precio");
       

        
        
        
        
        
        tratamiento=new Tratamiento(id_tratamiento,id_especialidad,nombre,precio);
         }
         stmt.close();
  
 	


        return tratamiento;
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     //COMBOBOX Doctores gestion medica crear especialidad
     
     public static List<Doctor_administrador> buscarDoctor() throws SQLException {
    	 List<Doctor_administrador> combo = new ArrayList<>();
    	 String query = "SELECT * FROM doctor_administrador WHERE tipo_usuario='1'";
    	 
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
    		        String precio=rset.getString("precio");
    			 
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
     
     
     
     
    

     public static void insertarCita(ConsultaCita cita) throws SQLException {
		    String query = "INSERT INTO consulta_cita (id_tratamiento, observaciones, fecha, hora, nombrePaciente)" +
		                   "VALUES('" + cita.getId_tratamiento() + "', '" + cita.getObservaciones() 
		                   + "', '" + cita.getFecha() + "', '" + cita.getHora() + "', '"+cita.getNombrePaciente()+"')";
		    
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
         ResultSet rset=stmt.executeQuery("SELECT id_tratamiento,observaciones, fecha,hora,nombrePaciente "+
        		   " from consulta_cita where id_cita  = "+ idCita);//consulta

         ConsultaCita consultaCita=null;
         if (rset.next()) {
       
        int id_tratamiento=rset.getInt("id_tratamiento");
        String observaciones=rset.getString("observaciones");
        String fecha=rset.getString("fecha");
        String hora=rset.getString("hora");
        String nombrePaciente=rset.getString("nombrePaciente");
        consultaCita=new ConsultaCita(idCita,id_tratamiento,observaciones,fecha,hora,nombrePaciente);
         }
         stmt.close();
  
 	


        return consultaCita;
    }
      
     public static ConsultaCita consultarCitaNombre(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from consulta_cita where nombrePaciente  = '"+ nombre+"'");//consulta

         ConsultaCita consultaCita=null;
         if (rset.next()) {
        	 
        int id_cita=rset.getInt("id_cita");
        int id_tratamiento=rset.getInt("id_tratamiento");
        String observaciones=rset.getString("observaciones");
        String fecha=rset.getString("fecha");
        String hora=rset.getString("hora");
        
        consultaCita=new ConsultaCita(id_cita,id_tratamiento,observaciones,fecha,hora,nombre);
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