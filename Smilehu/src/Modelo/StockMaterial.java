package Modelo;

public class StockMaterial {

	private String nombre;
	private int idProveedor,idMaterial,disponible,solicitado,bajoPedido;
	private double precio;
	public StockMaterial(int idMaterial, int idProveedor,String nombre, int disponible, int solicitado, int bajoPedido,double precio) {
		super();
		this.idMaterial = idMaterial;
		this.nombre=nombre;
		this.idProveedor = idProveedor;
		this.disponible = disponible;
		this.solicitado = solicitado;
		this.bajoPedido = bajoPedido;
		this.precio =precio;
	}
	
	
	public StockMaterial() {
		super();
	}
	
	
	
	
	
	
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public int getDisponible() {
		return disponible;
	}
	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
	public int getSolicitado() {
		return solicitado;
	}
	public void setSolicitado(int solicitado) {
		this.solicitado = solicitado;
	}
	public int getBajoPedido() {
		return bajoPedido;
	}
	public void setBajoPedido(int bajoPedido) {
		this.bajoPedido = bajoPedido;
	}
	
	
	
}
