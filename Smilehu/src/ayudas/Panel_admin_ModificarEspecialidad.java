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

public class Panel_admin_ModificarEspecialidad extends JInternalFrame {

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
					Panel_admin_ModificarEspecialidad frame = new Panel_admin_ModificarEspecialidad();
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
	public Panel_admin_ModificarEspecialidad() {
		setBounds(100, 100, 974, 373);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(42, 61, 80));
		panel.setBounds(0, 0, 974, 343);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtn_LimpiezaDental = new JRadioButton("Limpieza Dental");
		rdbtn_LimpiezaDental.setBorderPainted(true);
		rdbtn_LimpiezaDental.setBackground(new Color(42, 61, 83));
		rdbtn_LimpiezaDental.setBounds(26, 73, 166, 23);
		panel.add(rdbtn_LimpiezaDental);
		
		JRadioButton rdbtn_Extraccion_Dental = new JRadioButton("Extracción Dental");
		rdbtn_Extraccion_Dental.setBorderPainted(true);
		rdbtn_Extraccion_Dental.setBackground(new Color(42, 61, 83));
		rdbtn_Extraccion_Dental.setBounds(26, 99, 166, 23);
		panel.add(rdbtn_Extraccion_Dental);
		
		JRadioButton rdbtn_Empaste_Dental = new JRadioButton("Empaste Dental");
		rdbtn_Empaste_Dental.setBorderPainted(true);
		rdbtn_Empaste_Dental.setBackground(new Color(42, 61, 83));
		rdbtn_Empaste_Dental.setBounds(26, 125, 166, 23);
		panel.add(rdbtn_Empaste_Dental);
		
		JRadioButton rdbtn_Endodoncia = new JRadioButton("Endodoncia");
		rdbtn_Endodoncia.setBorderPainted(true);
		rdbtn_Endodoncia.setBackground(new Color(42, 61, 83));
		rdbtn_Endodoncia.setBounds(26, 151, 166, 23);
		panel.add(rdbtn_Endodoncia);
		
		JRadioButton rdbtn_CoronaDental = new JRadioButton("Corona Dental");
		rdbtn_CoronaDental.setBorderPainted(true);
		rdbtn_CoronaDental.setBounds(26, 210, 166, 23);
		panel.add(rdbtn_CoronaDental);
		rdbtn_CoronaDental.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtnPuenteDental = new JRadioButton("Puente Dental");
		rdbtnPuenteDental.setBorderPainted(true);
		rdbtnPuenteDental.setBounds(26, 236, 166, 23);
		panel.add(rdbtnPuenteDental);
		rdbtnPuenteDental.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_ImplantesDentales = new JRadioButton("Implantes Dentales");
		rdbtn_ImplantesDentales.setBorderPainted(true);
		rdbtn_ImplantesDentales.setBounds(26, 262, 166, 23);
		panel.add(rdbtn_ImplantesDentales);
		rdbtn_ImplantesDentales.setBackground(new Color(42, 61, 83));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(42, 61, 100));
		panel_1.setBounds(10, 62, 246, 236);
		panel.add(panel_1);
		
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
		tablePacientes.setBounds(266, 62, 198, 237);
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
