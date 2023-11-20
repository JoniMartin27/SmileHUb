package Conexion;

import java.io.IOException;
import java.sql.SQLException;

public class conexion {
	
	public static void main(String[] args) {
	
	
	
	
		
	
ConexionMySQL conec =new ConexionMySQL();
try {
	conec.conectar();
} catch (SQLException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



  }}
