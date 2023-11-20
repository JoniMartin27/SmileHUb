package Modelo;

import java.sql.Date;

public abstract class  Usuario {
	
	
	protected int idUsuario,tipoUsuario;
	protected String nombre,apellidos,direccion,genero,telefono,pass,fechaDeAlta,fechaNacimiento;

	
	public Usuario(int idUsuario, int tipoUsuario,String nombre, String apellidos, String direccion, String genero,
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

	
	public Usuario(String nombre,String apellidos, String direccion, String genero,String telefono,  String fechaNacimiento) {
		// TODO Auto-generated constructor stub
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.genero=genero;
		this.telefono=telefono;
		this.fechaNacimiento=fechaNacimiento;
	}

	public Usuario(String nombre, String apellidos, String direccion, String genero, String telefono,
			String fechaDeAlta, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.genero = genero;
		this.telefono = telefono;
		this.fechaDeAlta = fechaDeAlta;
		this.fechaNacimiento = fechaNacimiento;
	}




	public Usuario(int idUsuario, String nombre, String direccion, String telefono) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}




	public Usuario() {
		// TODO Auto-generated constructor stub
	}




	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getFechaDeAlta() {
		return fechaDeAlta;
	}


	public void setFechaDeAlta(String fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}


	@Override
	public String toString() {
		return "Usuario " + idUsuario + "tipo de usuario: "+tipoUsuario+", nombre: " + nombre + ", apellidos: " + apellidos + ", direccion: "
				+ direccion + ", genero: " + genero + ", fechaNacimiento: " + fechaNacimiento + ", telefono: " + telefono
				+ ", fechaDeAlta: " + fechaDeAlta +".";
	}
	

	
}
