package Modelo;

import java.util.Date;

public class Facturacion {

	
	int idFacturacion,idTratamiento,totalFactura,importe,pagosRestantes,proximoPago,cantidad;
	private Date fecha=new Date();
	String tipo,tipoDePago;
	public Facturacion(int idFacturacion, int idTratamiento, int totalFactura, int importe, int pagosRestantes,
			int proximoPago, int cantidad, Date fecha, String tipo, String tipoDePago) {
		super();
		this.idFacturacion = idFacturacion;
		this.idTratamiento = idTratamiento;
		this.totalFactura = totalFactura;
		this.importe = importe;
		this.pagosRestantes = pagosRestantes;
		this.proximoPago = proximoPago;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
		this.tipoDePago = tipoDePago;
	}
	public int getIdFacturacion() {
		return idFacturacion;
	}
	public void setIdFacturacion(int idFacturacion) {
		this.idFacturacion = idFacturacion;
	}
	public int getIdTratamiento() {
		return idTratamiento;
	}
	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}
	public int getTotalFactura() {
		return totalFactura;
	}
	public void setTotalFactura(int totalFactura) {
		this.totalFactura = totalFactura;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public int getPagosRestantes() {
		return pagosRestantes;
	}
	public void setPagosRestantes(int pagosRestantes) {
		this.pagosRestantes = pagosRestantes;
	}
	public int getProximoPago() {
		return proximoPago;
	}
	public void setProximoPago(int proximoPago) {
		this.proximoPago = proximoPago;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}
	
	
	
}
