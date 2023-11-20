/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */
package Conexion;

import java.util.Calendar;
import java.util.TimeZone;

import Modelo.ConsultaCita;
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
   
 
    
    public void desconectar()throws SQLException{
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
    	 String query = "UPDATE paciente SET " +
    	            "nombre = '" + paciente.getNombre() + "', " +
    	            "apellidos = '" + paciente.getApellidos() + "', " +
    	            "direccion = '" + paciente.getDireccion() + "', " +
    	            "genero = '" + paciente.getGenero() + "', " +
    	            "telefono = '" + paciente.getTelefono() + "', " +
    	            "fecha_alta = '" + paciente.getFechaDeAlta() + "', " +
    	            "fecha_nacimiento = '" + paciente.getFechaNacimiento() + "' " +
    	            "WHERE id_paciente = " + paciente.getIdUsuario();
         
         Statement stmt = connection.createStatement();
         stmt.executeUpdate(query);
        
         System.out.println("hola");
         stmt.close();
         }
     public void modificarCita(ConsultaCita cita,int id) throws SQLException {
    	 String query = "UPDATE consulta_cita SET " +
    	            "id_doctor = " + cita.getId_doctor() + ", " +
    	            "id_tratamiento = " + cita.getId_tratamiento() + ", " +
    	            "id_historial = " + cita.getId_historial() + ", " +
    	            "observaciones = '" + cita.getObservaciones() + "', " +
    	            "fecha = '" + cita.getFecha() + "', " +
    	            "hora = '" + cita.getHora() + "' " +
    	            "WHERE id_cita = " + id;
    	 	System.out.println(query);
    	    Statement stmt = connection.createStatement();
    	    stmt.executeUpdate(query);

    	    System.out.println("Actualización exitosa");
    	    stmt.close();
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