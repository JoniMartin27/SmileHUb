package Modelo;

public class Tratamiento {

	int idTratamiento;
	String precio;
	int id_especialidad;
	String nombre;
	
	
	
	public Tratamiento(int idTratamiento, int id_especialidad, String nombre, String precio) {
		super();
		this.idTratamiento = idTratamiento;
		this.precio = precio;
		this.id_especialidad = id_especialidad;
		this.nombre = nombre;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTratamiento() {
		return idTratamiento;
	}
	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getId_especialidad() {
		return id_especialidad;
	}
	public void setId_especialidad(int id_especialidad) {
		this.id_especialidad = id_especialidad;
	}
	
	
	
}
