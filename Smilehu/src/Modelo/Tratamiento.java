package Modelo;

public class Tratamiento {

	int idTratamiento;
	int precio;
	int id_especialidad;
	public Tratamiento(int idTratamiento, int precio, int id_especialidad) {
		super();
		this.idTratamiento = idTratamiento;
		this.precio = precio;
		this.id_especialidad = id_especialidad;
	}
	public int getIdTratamiento() {
		return idTratamiento;
	}
	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId_especialidad() {
		return id_especialidad;
	}
	public void setId_especialidad(int id_especialidad) {
		this.id_especialidad = id_especialidad;
	}
	
	
	
}
