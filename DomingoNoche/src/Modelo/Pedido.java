package Modelo;

public class Pedido {

	int idPedido,idProveedor,cantidad;
	String idMaterial;
	public Pedido(int idPedido, int idProveedor, int cantidad, String idMaterial) {
		super();
		this.idPedido = idPedido;
		this.idProveedor = idProveedor;
		this.cantidad = cantidad;
		this.idMaterial = idMaterial;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(String idMaterial) {
		this.idMaterial = idMaterial;
	}
	
	
}
