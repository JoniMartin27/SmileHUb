package Modelo;

import java.sql.Date;

public class Paciente {

	private int idPaciente;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String genero;
	private String telefono;
	private String fechaComoCadena;
	private String fechaNacimiento;

	
	public Paciente() {
	
	
	}
	
	//constructor usado para crear los objetos en si
		public Paciente(int idPaciente, String nombre, String apellidos, String direccion, String genero,
				String telefono, String fechaComoCadena, String fechaNacimiento) {
			this.idPaciente=idPaciente;
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.direccion=direccion;
			this.genero=genero;
			this.telefono=telefono;
			this.fechaComoCadena=fechaComoCadena;
			this.fechaNacimiento=fechaNacimiento;

		}
		
	


	public Paciente(String nombre,String apellidos, String direccion, String genero,String telefono,  String fechaComoCadena, String fechaNacimiento) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.genero=genero;
		this.telefono=telefono;
		this.fechaComoCadena=fechaComoCadena;
		this.fechaNacimiento=fechaNacimiento;
	}

	public Paciente(int id) {
		// TODO Auto-generated constructor stub
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
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

	public String getFechaComoCadena() {
		return fechaComoCadena;
	}

	public void setFechaComoCadena(String fechaComoCadena) {
		this.fechaComoCadena = fechaComoCadena;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", genero=" + genero + ", telefono=" + telefono + ", fechaComoCadena=" + fechaComoCadena
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	


}
