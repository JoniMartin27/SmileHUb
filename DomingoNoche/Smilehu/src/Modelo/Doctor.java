package Modelo;

import java.util.Date;

public class Doctor extends Usuario{

	String pass;
	int estadoDeBaja,idEspecialidad;
	//constructor usado para crear los objetos en si
	public Doctor(int idUsuario,  String nombre, String apellidos, String direccion, String genero,
			String telefono, String fechaDeAlta, String fechaNacimiento,String pass, int estadoDeBaja, int idEspecialidad) {
		super(idUsuario, 1, nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
		// TODO Auto-generated constructor stub
			this.pass=pass;
			this.estadoDeBaja=estadoDeBaja;
			this.idEspecialidad=idEspecialidad;
	}
	//constructor que usara SQL
	public Doctor(int idUsuario, int tipoUsuario, String nombre, String apellidos, String direccion, String genero,
			String telefono, String fechaDeAlta, String fechaNacimiento,String pass, int estadoDeBaja, int idEspecialidad) {
		super(idUsuario, tipoUsuario, nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
		// TODO Auto-generated constructor stub
			this.pass=pass;
			this.estadoDeBaja=estadoDeBaja;
			this.idEspecialidad=idEspecialidad;
	}

	
	
	
	public String getPass() {
		return pass;
	}




	public void setPass(String pass) {
		this.pass = pass;
	}




	public int getEstadoDeBaja() {
		return estadoDeBaja;
	}




	public void setEstadoDeBaja(int estadoDeBaja) {
		this.estadoDeBaja = estadoDeBaja;
	}




	public int getIdEspecialidad() {
		return idEspecialidad;
	}




	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}




	@Override
	public String toString() {
		return "Doctor [pass=" + pass + ", estadoDeBaja=" + estadoDeBaja + ", idEspecialidad=" + idEspecialidad + "]"+super.toString();
	}



	
	
}
