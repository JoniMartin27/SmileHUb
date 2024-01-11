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
             pstmt.setInt(8, paciente.getIdUsuario()); // id en la cláusula WHERE
            

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
     
     
     public static void modificarCita(ConsultaCita cita) throws SQLException {
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
         }
     
     
     
     
     
     
     
     public void modificarCita1(ConsultaCita cita,int id) throws SQLException {
    	 String query = "UPDATE consulta_cita SET " +
                 "id_doctor = ?, " +
                 "id_tratamiento = ?, " +
                 "id_historial = ?, " +
                 "observaciones = ?, " +
                 "fecha = ?, " +
                 "hora = ? " +
                 "WHERE id_cita = ?";

  try (PreparedStatement pstmt = connection.prepareStatement(query)) {
      pstmt.setInt(1, cita.getId_doctor());
      pstmt.setInt(2, cita.getId_tratamiento());
      pstmt.setInt(3, cita.getId_historial());
      pstmt.setString(4, cita.getObservaciones());
      pstmt.setString(5, cita.getFecha());
      pstmt.setString(6, cita.getHora());
      pstmt.setInt(7, id);

      int rowsAffected = pstmt.executeUpdate();
      System.out.println("Actualización exitosa. Filas afectadas: " + rowsAffected);
  } catch (SQLException e) {
      e.printStackTrace();
  }
    	}

     
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
		    String query = "INSERT INTO especialidad ( nombre_especialidad ) " +
		                   "VALUES ('" + nombre  + "')";
		    
		    Statement stmt = connection.createStatement(); 
		    stmt.executeUpdate(query);
		}
     public static Especialidad buscarEspecialidad(String nombre) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from ESPECIALIDAD where nombre  =" +nombre);//consulta

         Especialidad especialidad=null;
         if (rset.next()) {
       
        int id_especialidad=rset.getInt("id_especialidad");
       

        
        
        
        
        
        especialidad=new Especialidad(id_especialidad,nombre);
         }
         stmt.close();
  
 	


        return especialidad;
    }
     
     public static Doctor_administrador buscarDoctor(String nombre,String apellidos) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT * from doctor_administrador where nombre  =" +nombre+ " and apellidos = " + apellidos + "and tipo_usuario = 1");//consulta

         Doctor_administrador doctor=null;
         if (rset.next()) {
       
        int id_doctor_administrador=rset.getInt("id_doctor_administrador");
        int id_especialidad=rset.getInt("id_especialidad");
        String direccion=rset.getString("direccion");
        String fecha_alta=rset.getString("fecha_alta");
        int estado_baja=rset.getInt("estado_baja");
        String genero=rset.getString("genero");
        String pass=rset.getString("pass");
        String tipo_usuario=rset.getString("tipo_usuario");
        String teléfono=rset.getString("teléfono");
        String fecha_nacimiento=rset.getString("fecha_nacimiento");
        int activo=rset.getInt("activo");

        
        
        
        
        
         doctor=new Doctor_administrador(id_doctor_administrador,id_especialidad,nombre,apellidos,direccion,fecha_alta,estado_baja,genero,pass,tipo_usuario,teléfono,fecha_nacimiento,activo);
         }
         stmt.close();
  
 	


        return doctor;
    }
     

     public static void insertarCita(ConsultaCita cita) throws SQLException {
		    String query = "INSERT INTO consulta_cita (id_doctor, id_tratamiento, id_historial, observaciones, fecha, hora) " +
		                   "VALUES ('" + cita.getId_doctor() + "', '" + cita.getId_tratamiento() + "', '" +
		                   cita.getId_historial() + "', '" + cita.getObservaciones() + "', '" + cita.getFecha() + "', '" + 
		                   cita.getHora() + "')";
		    
		    Statement stmt = connection.createStatement();
		    stmt.executeUpdate(query);
		}
     
     
     
     public static ConsultaCita consultaCita(int idCita) throws SQLException {

         Statement stmt=connection.createStatement();
         ResultSet rset=stmt.executeQuery("SELECT id_doctor,id_tratamiento,id_historial,observaciones, fecha,hora"+
        		   " from consulta_cita where id_cita  = "+ idCita);//consulta

         ConsultaCita consultaCita=null;
         if (rset.next()) {
       
        int id_doctor=rset.getInt("id_doctor");
        int id_tratamiento=rset.getInt("id_tratamiento");
        int id_historial=rset.getInt("id_historial");
        String observaciones=rset.getString("observaciones");
        String fecha=rset.getString("fecha");
        String hora=rset.getString("hora");
        consultaCita=new ConsultaCita(idCita,id_doctor,id_tratamiento,id_historial,observaciones,fecha,hora);
         }
         stmt.close();
  
 	


        return consultaCita;
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