package Modelo;

public class Solicitud {

	int id_material,id_Solicitud,id_Cita,id_Proveedor,cantidad;
	String nombreMaterial,nombreProveedor;
	@Override
	public String toString() {
		return "Solicitud [id_material=" + id_material + ", id_Solicitud=" + id_Solicitud + ", id_Cita=" + id_Cita
				+ ", id_Proveedor=" + id_Proveedor + ", cantidad=" + cantidad + "]";
	}
	public int getId_material() {
		return id_material;
	}
	public void setId_material(int id_material) {
		this.id_material = id_material;
	}
	public int getId_Solicitud() {
		return id_Solicitud;
	}
	public void setId_Solicitud(int id_Solicitud) {
		this.id_Solicitud = id_Solicitud;
	}
	public int getId_Cita() {
		return id_Cita;
	}
	public void setId_Cita(int id_Cita) {
		this.id_Cita = id_Cita;
	}
	public int getId_Proveedor() {
		return id_Proveedor;
	}
	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombreMaterial() {
		return nombreMaterial;
	}
	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public Solicitud(int id_Solicitud, int id_Cita, int cantidad, String nombreMaterial, String nombreProveedor) {
		super();
		this.id_Solicitud = id_Solicitud;
		this.id_Cita = id_Cita;
		this.cantidad = cantidad;
		this.nombreMaterial = nombreMaterial;
		this.nombreProveedor = nombreProveedor;
	}
	public Solicitud() {
		super();
	}
	public Solicitud(int id_material, int id_Solicitud, int id_Cita, int id_Proveedor, int cantidad) {
		super();
		this.id_material = id_material;
		this.id_Solicitud = id_Solicitud;
		this.id_Cita = id_Cita;
		this.id_Proveedor = id_Proveedor;
		this.cantidad = cantidad;
	}
	
	
}
