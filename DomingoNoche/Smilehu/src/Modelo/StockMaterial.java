package Modelo;

public class StockMaterial {

	String idMaterial;
	int idProveedor,disponible,solicitado,bajoPedido;
	public StockMaterial(String idMaterial, int idProveedor, int disponible, int solicitado, int bajoPedido) {
		super();
		this.idMaterial = idMaterial;
		this.idProveedor = idProveedor;
		this.disponible = disponible;
		this.solicitado = solicitado;
		this.bajoPedido = bajoPedido;
	}
	public String getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(String idMaterial) {
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
