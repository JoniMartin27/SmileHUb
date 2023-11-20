package Vista.gestionMedica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class Panel_admin_gestionMedica_CrearEspecialidad extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_NombreEspecialidad;
	private JTextField tf_Doctor;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_CrearEspecialidad frame = new Panel_admin_gestionMedica_CrearEspecialidad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Panel_admin_gestionMedica_CrearEspecialidad() {
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 783, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(599, 95, 127, 315);
		panel.add(table);
		
		JLabel lbl_NombreEspecialidad = new JLabel("Nombre Especialidad");
		lbl_NombreEspecialidad.setBounds(70, 156, 127, 14);
		panel.add(lbl_NombreEspecialidad);
		
		tf_NombreEspecialidad = new JTextField();
		tf_NombreEspecialidad.setBounds(228, 153, 115, 20);
		panel.add(tf_NombreEspecialidad);
		tf_NombreEspecialidad.setColumns(10);
		
		JLabel lbl_Doctor = new JLabel("Doctor");
		lbl_Doctor.setBounds(70, 210, 118, 14);
		panel.add(lbl_Doctor);
		
		tf_Doctor = new JTextField();
		tf_Doctor.setBounds(228, 207, 115, 20);
		panel.add(tf_Doctor);
		tf_Doctor.setColumns(10);
		
		JButton btn_CrearEspecialidad = new JButton("Crear Especialidad");
		btn_CrearEspecialidad.setBounds(265, 294, 159, 23);
		panel.add(btn_CrearEspecialidad);
		
		JLabel lbl_Listado = new JLabel("Listado Especialidades");
		lbl_Listado.setBounds(597, 48, 150, 14);
		panel.add(lbl_Listado);

	}
}
