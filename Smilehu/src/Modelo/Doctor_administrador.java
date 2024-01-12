package Modelo;

import java.util.Date;

public class Doctor_administrador {

	
	public int id_doctor_administrador,id_especialidad,activo,estado_baja;
	
	public String nombre,apellidos,direccion,genero,pass,tipo_usuario,teléfono,fecha_nacimiento,fecha_alta;
	
	
	
	
	
	

	
	
	
	public Doctor_administrador(int id_doctor_administrador, int id_especialidad, String nombre, String apellidos,
			String direccion, String fecha_alta, int estado_baja, String genero, String pass, String tipo_usuario,
			String teléfono, String fecha_nacimiento, int activo ) {
		super();
		this.id_doctor_administrador = id_doctor_administrador;
		this.id_especialidad = id_especialidad;
		this.activo = activo;
		this.estado_baja = estado_baja;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.genero = genero;
		this.pass = pass;
		this.tipo_usuario = tipo_usuario;
		this.teléfono = teléfono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_alta = fecha_alta;
	}









	public Doctor_administrador() {
		// TODO Auto-generated constructor stub
	}









	public int getId_doctor_administrador() {
		return id_doctor_administrador;
	}










	public void setId_doctor_administrador(int id_doctor_administrador) {
		this.id_doctor_administrador = id_doctor_administrador;
	}










	public int getId_especialidad() {
		return id_especialidad;
	}










	public void setId_especialidad(int id_especialidad) {
		this.id_especialidad = id_especialidad;
	}










	public int getActivo() {
		return activo;
	}










	public void setActivo(int activo) {
		this.activo = activo;
	}










	public int getEstado_baja() {
		return estado_baja;
	}










	public void setEstado_baja(int estado_baja) {
		this.estado_baja = estado_baja;
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










	public String getPass() {
		return pass;
	}










	public void setPass(String pass) {
		this.pass = pass;
	}










	public String getTipo_usuario() {
		return tipo_usuario;
	}










	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}










	public String getTeléfono() {
		return teléfono;
	}










	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}










	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}










	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}










	public String getFecha_alta() {
		return fecha_alta;
	}










	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}


}