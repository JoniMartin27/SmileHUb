package ayudas;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Panel_admin_CrearEspecialidad extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_NombrePaciente;
	private JTextField tf_Especialista;
	private JTextField tf_FechaInicio;
	private JTextField tf_FechaFin;
	private JTable tablePacientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_CrearEspecialidad frame = new Panel_admin_CrearEspecialidad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel_admin_CrearEspecialidad() {
		setBounds(100, 100, 974, 373);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(42, 61, 80));
		panel.setBounds(0, 0, 974, 343);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtn_Dentista_general = new JRadioButton("Dentista general");
		rdbtn_Dentista_general.setBorderPainted(true);
		rdbtn_Dentista_general.setBackground(new Color(42, 61, 83));
		rdbtn_Dentista_general.setBounds(26, 73, 166, 23);
		panel.add(rdbtn_Dentista_general);
		
		JRadioButton rdbtn_Odontopediatra = new JRadioButton("Odontopediatra ");
		rdbtn_Odontopediatra.setBorderPainted(true);
		rdbtn_Odontopediatra.setBackground(new Color(42, 61, 83));
		rdbtn_Odontopediatra.setBounds(26, 105, 166, 23);
		panel.add(rdbtn_Odontopediatra);
		
		JRadioButton rdbtn_Ortodoncista = new JRadioButton("Ortodoncista");
		rdbtn_Ortodoncista.setBorderPainted(true);
		rdbtn_Ortodoncista.setBackground(new Color(42, 61, 83));
		rdbtn_Ortodoncista.setBounds(26, 137, 166, 23);
		panel.add(rdbtn_Ortodoncista);
		
		JRadioButton rdbtn_Periodoncista = new JRadioButton("Periodoncista ");
		rdbtn_Periodoncista.setBorderPainted(true);
		rdbtn_Periodoncista.setBackground(new Color(42, 61, 83));
		rdbtn_Periodoncista.setBounds(26, 169, 166, 23);
		panel.add(rdbtn_Periodoncista);
		
		JRadioButton rdbtn_Endodoncista = new JRadioButton("Endodoncista ");
		rdbtn_Endodoncista.setBorderPainted(true);
		rdbtn_Endodoncista.setBounds(26, 201, 166, 23);
		panel.add(rdbtn_Endodoncista);
		rdbtn_Endodoncista.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_cirujano_oral = new JRadioButton("cirujano oral");
		rdbtn_cirujano_oral.setBorderPainted(true);
		rdbtn_cirujano_oral.setBounds(26, 233, 166, 23);
		panel.add(rdbtn_cirujano_oral);
		rdbtn_cirujano_oral.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_Prostodoncista = new JRadioButton("Prostodoncista");
		rdbtn_Prostodoncista.setBorderPainted(true);
		rdbtn_Prostodoncista.setBounds(26, 265, 166, 23);
		panel.add(rdbtn_Prostodoncista);
		rdbtn_Prostodoncista.setBackground(new Color(42, 61, 83));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(42, 61, 100));
		panel_1.setBounds(10, 62, 246, 236);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		tf_NombrePaciente = new JTextField();
		tf_NombrePaciente.setEditable(false);
		tf_NombrePaciente.setBounds(616, 49, 112, 20);
		panel.add(tf_NombrePaciente);
		tf_NombrePaciente.setColumns(10);
		
		JButton btn_SeleccionarPaciente = new JButton("Seleccionar Paciente");
		btn_SeleccionarPaciente.setBounds(276, 309, 135, 23);
		panel.add(btn_SeleccionarPaciente);
		
		JLabel lbl_Especialista = new JLabel("Especialista");
		lbl_Especialista.setBounds(738, 24, 69, 14);
		panel.add(lbl_Especialista);
		
		tf_Especialista = new JTextField();
		tf_Especialista.setEditable(false);
		tf_Especialista.setColumns(10);
		tf_Especialista.setBounds(738, 49, 112, 20);
		panel.add(tf_Especialista);
		
		JLabel lbl_NombrePaciente = new JLabel("Nombre Paciente");
		lbl_NombrePaciente.setBounds(616, 24, 112, 14);
		panel.add(lbl_NombrePaciente);
		
		JLabel lbl_listado = new JLabel("Listado Citas");
		lbl_listado.setBounds(266, 36, 76, 14);
		panel.add(lbl_listado);
		
		JLabel lbl_FechaInicio = new JLabel("Fecha Inicio");
		lbl_FechaInicio.setRequestFocusEnabled(false);
		lbl_FechaInicio.setBounds(616, 155, 63, 14);
		panel.add(lbl_FechaInicio);
		
		tf_FechaInicio = new JTextField();
		tf_FechaInicio.setColumns(10);
		tf_FechaInicio.setBounds(616, 184, 112, 20);
		panel.add(tf_FechaInicio);
		
		tf_FechaFin = new JTextField();
		tf_FechaFin.setColumns(10);
		tf_FechaFin.setBounds(743, 184, 112, 20);
		panel.add(tf_FechaFin);
		
		JLabel lbl_FechaFin = new JLabel("Fecha Fin");
		lbl_FechaFin.setBounds(743, 155, 46, 14);
		panel.add(lbl_FechaFin);
		
		tablePacientes = new JTable();
		tablePacientes.setBounds(304, 61, 198, 237);
		panel.add(tablePacientes);
		
		JButton btn_SeleccionarEspecialista = new JButton("Seleccionar Especialista");
		btn_SeleccionarEspecialista.setBounds(40, 309, 152, 23);
		panel.add(btn_SeleccionarEspecialista);
		
		JButton btn_AsignarDoctor = new JButton("Asignar Doctor");
		btn_AsignarDoctor.setBounds(683, 275, 135, 23);
		panel.add(btn_AsignarDoctor);
		
		JLabel lbl_listEspecialistas = new JLabel("Especialistas");
		lbl_listEspecialistas.setBounds(10, 36, 76, 14);
		panel.add(lbl_listEspecialistas);
		
	}
}
