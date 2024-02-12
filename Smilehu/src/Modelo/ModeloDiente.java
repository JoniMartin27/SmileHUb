package Modelo;

import javax.swing.JButton;

public class ModeloDiente {

	// idPaciente es el id de la base de datos
	// nDiente es la posicion que ocupa el diente en el odontograma
	private int idDiente, nDiente, idPaciente,protesis;
	private String descripcion,estado;
	private JButton botonDiente;

	public ModeloDiente(int idDiente, int nDiente, String descripcion, int idPaciente,String estado,int protesis) {
		super();
		this.protesis=protesis;
		this.estado=estado;
		this.idDiente = idDiente;
		this.nDiente = nDiente;
		this.idPaciente = idPaciente;
		this.descripcion = descripcion;
	}

	public int getIdDiente() {
		return idDiente;
	}

	public void setIdDiente(int idDiente) {
		this.idDiente = idDiente;
	}

	public int getnDiente() {
		return nDiente;
	}

	public void setnDiente(int nDiente) {
		this.nDiente = nDiente;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public JButton getBotonDiente() {
		return botonDiente;
	}

	public void setBotonDiente(JButton botonDiente) {
		this.botonDiente = botonDiente;
	}

	@Override
	public String toString() {
		return "Diente Numero " + nDiente + " Descripcion: " + descripcion;
	}

	public int getProtesis() {
		return protesis;
	}

	public void setProtesis(int protesis) {
		this.protesis = protesis;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}