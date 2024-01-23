package Modelo;

import java.sql.Time;
import java.util.Date;

public class ConsultaCita  {

	private int id_cita,id_tratamiento,id_paciente;
	private String observaciones,hora;
	private String fecha;
	
	public ConsultaCita( int id_tratamiento, String observaciones, String fecha,
			String hora,int id_paciente) {
		super();
	
		this.id_tratamiento = id_tratamiento;
		this.observaciones = observaciones;
		this.fecha = fecha;
		this.hora = hora;
		this.id_paciente=id_paciente;
	}

	public ConsultaCita(int id_cita, int id_tratamiento, String observaciones, String hora, String fecha,
			int id_paciente) {
		super();
		this.id_cita = id_cita;
		this.id_tratamiento = id_tratamiento;
		this.observaciones = observaciones;
		this.hora = hora;
		this.fecha = fecha;
		this.id_paciente = id_paciente;
	}

	public ConsultaCita() {
		super();
	}

	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public int getId_tratamiento() {
		return id_tratamiento;
	}

	public void setId_tratamiento(int id_tratamiento) {
		this.id_tratamiento = id_tratamiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getid_paciente() {
		return id_paciente;
	}

	public void setid_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	@Override
	public String toString() {
		return "ConsultaCita [id_cita=" + id_cita + ", id_tratamiento=" + id_tratamiento + ", observaciones="
				+ observaciones + ", hora=" + hora + ", fecha=" + fecha + ", nombrePaciente=" + id_paciente + "]";
	}

	
}