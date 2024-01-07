package ayudas;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Panel_admin_CrearTratamiento extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_CrearTratamiento frame = new Panel_admin_CrearTratamiento();
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
	public Panel_admin_CrearTratamiento() {
		setBounds(100, 100, 974, 373);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(42, 61, 80));
		panel.setBounds(0, 0, 974, 343);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		//Empiezan Los radioButtons
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
		
		JRadioButton rdbtnOrtodoncia = new JRadioButton("Ortodoncia");
		rdbtnOrtodoncia.setBorderPainted(true);
		rdbtnOrtodoncia.setBounds(26, 288, 166, 23);
		panel.add(rdbtnOrtodoncia);
		rdbtnOrtodoncia.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_IncrustacionesDentales = new JRadioButton("Incrustaciones Dentales");
		rdbtn_IncrustacionesDentales.setBorderPainted(true);
		rdbtn_IncrustacionesDentales.setBounds(225, 288, 166, 23);
		panel.add(rdbtn_IncrustacionesDentales);
		rdbtn_IncrustacionesDentales.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_BlanqueamientoDental = new JRadioButton("Blanqueamiento Dental");
		rdbtn_BlanqueamientoDental.setBorderPainted(true);
		rdbtn_BlanqueamientoDental.setBounds(225, 262, 166, 23);
		panel.add(rdbtn_BlanqueamientoDental);
		rdbtn_BlanqueamientoDental.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_CarillasDentales = new JRadioButton("Carillas Dentales");
		rdbtn_CarillasDentales.setBorderPainted(true);
		rdbtn_CarillasDentales.setBounds(225, 236, 166, 23);
		panel.add(rdbtn_CarillasDentales);
		rdbtn_CarillasDentales.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_OrtodonciaQuirúrgica = new JRadioButton("Ortodoncia quirúrgica");
		rdbtn_OrtodonciaQuirúrgica.setBorderPainted(true);
		rdbtn_OrtodonciaQuirúrgica.setBounds(225, 210, 166, 23);
		panel.add(rdbtn_OrtodonciaQuirúrgica);
		rdbtn_OrtodonciaQuirúrgica.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_TratamientoPeriodontitis = new JRadioButton("Tratamiento de Periodontitis");
		rdbtn_TratamientoPeriodontitis.setBorderPainted(true);
		rdbtn_TratamientoPeriodontitis.setBounds(225, 151, 166, 23);
		panel.add(rdbtn_TratamientoPeriodontitis);
		rdbtn_TratamientoPeriodontitis.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_Odontopediatría = new JRadioButton("Odontopediatría");
		rdbtn_Odontopediatría.setBorderPainted(true);
		rdbtn_Odontopediatría.setBounds(225, 125, 166, 23);
		panel.add(rdbtn_Odontopediatría);
		rdbtn_Odontopediatría.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_Apicectomía = new JRadioButton("Apicectomía");
		rdbtn_Apicectomía.setBorderPainted(true);
		rdbtn_Apicectomía.setBounds(225, 99, 166, 23);
		panel.add(rdbtn_Apicectomía);
		rdbtn_Apicectomía.setBackground(new Color(42, 61, 83));
		
		JRadioButton rdbtn_TratamientoATM = new JRadioButton("Tratamiento de ATM");
		rdbtn_TratamientoATM.setBorderPainted(true);
		rdbtn_TratamientoATM.setBounds(225, 73, 166, 23);
		panel.add(rdbtn_TratamientoATM);
		rdbtn_TratamientoATM.setBackground(new Color(42, 61, 83));
		
		
		//Acaban los RadioButtons
		
		
	//contenido del panel Crear Tratamiento
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(42, 61, 100));
		panel_1.setBounds(10, 62, 393, 270);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(616, 49, 112, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn_CrearTratamiento = new JButton("Crear Tratamiento");
		btn_CrearTratamiento.setBounds(413, 309, 135, 23);
		panel.add(btn_CrearTratamiento);
		
		JLabel lbl_Tratamiento = new JLabel("Tratamiento");
		lbl_Tratamiento.setBounds(794, 24, 69, 14);
		panel.add(lbl_Tratamiento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(794, 49, 112, 20);
		panel.add(textField_1);
		
		JLabel lbl_Precio = new JLabel("Precio");
		lbl_Precio.setBounds(616, 77, 46, 14);
		panel.add(lbl_Precio);
		
		textField_2 = new JTextField();
		textField_2.setBounds(616, 100, 112, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtn_Nombre = new JRadioButton("Nombre");
		rdbtn_Nombre.setBackground(new Color(42, 61, 83));
		rdbtn_Nombre.setBounds(534, 31, 76, 23);
		panel.add(rdbtn_Nombre);
		
		JRadioButton rdbtn_Id = new JRadioButton("ID");
		rdbtn_Id.setBackground(new Color(42, 61, 83));
		rdbtn_Id.setBounds(534, 62, 76, 23);
		panel.add(rdbtn_Id);
		
		JLabel lblNewLabel = new JLabel("Buscar Paciente");
		lblNewLabel.setBounds(616, 24, 91, 14);
		panel.add(lblNewLabel);
		
		JLabel lbl_FechaInicio = new JLabel("Fecha Inicio");
		lbl_FechaInicio.setRequestFocusEnabled(false);
		lbl_FechaInicio.setBounds(616, 155, 63, 14);
		panel.add(lbl_FechaInicio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(616, 184, 112, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(743, 184, 112, 20);
		panel.add(textField_4);
		
		JLabel lbl_FechaFin = new JLabel("Fecha Fin");
		lbl_FechaFin.setBounds(743, 155, 46, 14);
		panel.add(lbl_FechaFin);
		
	}
}
