package Modelo;

public class Tratamiento {

	int idTratamiento;
	double precio;
	int id_especialidad;
	String nombre;
	
	
	
	public Tratamiento(int idTratamiento, int id_especialidad, String nombre, double precio) {
		super();
		this.idTratamiento = idTratamiento;
		this.precio = precio;
		this.id_especialidad = id_especialidad;
		this.nombre = nombre;
	}
	
	
	
	
	
	public Tratamiento(int id_especialidad,double precio,  String nombre) {
		super();
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getId_especialidad() {
		return id_especialidad;
	}
	public void setId_especialidad(int id_especialidad) {
		this.id_especialidad = id_especialidad;
	}
	
	
	
}
