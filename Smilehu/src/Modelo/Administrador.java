package Modelo;

import java.sql.Date;

public class Administrador extends Usuario{

	String pass;
	int estadoDeBaja;
	
	//constructor usado para crear los objetos en si
	public Administrador(int idUsuario,  String nombre, String apellidos, String direccion,
			String genero, String telefono, String fechaDeAlta, String fechaNacimiento,String pass,int estadoDeBaja) {
		super(idUsuario,nombre, apellidos, direccion, genero, telefono, fechaDeAlta, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.pass=pass;
		this.estadoDeBaja=estadoDeBaja;
	}
	
	public Administrador(int idUsuario, int tipoUsuario,String nombre, String apellidos, String direccion, String genero,
			 String telefono, String fechaDeAlta,String fechaNacimiento) {
		super();
		this.tipoUsuario=tipoUsuario;
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.fechaDeAlta = fechaDeAlta;
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
	@Override
	public String toString() {
		return "Administrador [pass=" + pass + ", estadoDeBaja=" + estadoDeBaja + "]"+super.toString();
	}

	

	
}
