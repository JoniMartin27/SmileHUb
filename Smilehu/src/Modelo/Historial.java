package Modelo;

public class Historial {

	private int idHistorial,idPaciente,idTratamiento,odontogramaId;



	public Historial(int idHistorial, int idPaciente, int idTratamiento, int odontogramaId) {
		super();
		this.idHistorial = idHistorial;
		this.idPaciente = idPaciente;
		this.idTratamiento = idTratamiento;
		this.odontogramaId = odontogramaId;
	}

	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdTratamiento() {
		return idTratamiento;
	}

	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}
	

	public int getoDontogramaId() {
		return odontogramaId;
	}

	public void setoDontogramaId(int oDontogramaId) {
		this.odontogramaId = oDontogramaId;
	}

	@Override
	public String toString() {
		return "Historial:" + idHistorial + ", idPaciente: " + idPaciente + "Ondotograma Id: "+odontogramaId+", idTratamiento: "
				+ idTratamiento ;
	}
	
	
	
	
}
