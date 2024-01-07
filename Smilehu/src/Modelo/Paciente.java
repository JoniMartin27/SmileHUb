package Modelo;

import java.sql.Date;

public class Paciente extends Usuario{

	
	
	public Paciente() {
	
	}

	
	//constructor usado para crear los objetos en si
		public Paciente(int idUsuario, String nombre, String apellidos, String direccion, String genero,
				String telefono, String fechaDeAlta, String fechaNacimiento) {
			super(idUsuario, 2, nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
			// TODO Auto-generated constructor stub
		}
		
		//constructor que usara SQL
	public Paciente(int idUsuario, int tipoUsuario, String nombre, String apellidos, String direccion, String genero,
			String telefono, String fechaDeAlta, String fechaNacimiento) {
		super(idUsuario, tipoUsuario, nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}


	public Paciente(String nombre,String apellidos, String direccion, String genero,String telefono, String fechaDeAlta, String fechaNacimiento) {
		// TODO Auto-generated constructor stub
		super(nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
	}
	public Paciente(String nombre,String apellidos, String direccion, String genero,String telefono,String fechaNacimiento) {
		// TODO Auto-generated constructor stub
		super(nombre, apellidos, direccion, genero, telefono,fechaNacimiento);
	}
	


}
