package Modelo;

public class Proveedor {

	private String id_proveedor;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	
	
	public Proveedor(String id_proveedor, String nombre, String direccion, String telefono) {
		super();
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Proveedor() {
		super();
	}
	public Proveedor(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Proveedor [id_proveedor=" + id_proveedor + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	public String getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}