package Modelo;

import java.sql.Date;

public class Paciente extends Usuario{

	
	
	public Paciente() {
	
	}

	
	//constructor usado para crear los objetos en si
		public Paciente(int idUsuario, String nombre, String apellidos, String direccion, String genero,
				String telefono, String fechaComoCadena, String fechaNacimiento) {
			super(idUsuario, nombre, apellidos, direccion, genero, telefono, fechaComoCadena, fechaNacimiento);
			// TODO Auto-generated constructor stub
		}
		
	


	public Paciente(String nombre,String apellidos, String direccion, String genero,String telefono, String fechaDeAlta, String fechaNacimiento) {
		// TODO Auto-generated constructor stub
		super(nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
	}

	


}
