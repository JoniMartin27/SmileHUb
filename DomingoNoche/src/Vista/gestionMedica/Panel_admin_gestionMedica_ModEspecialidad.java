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

public class Panel_admin_gestionMedica_ModEspecialidad extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_NombreEspecialidad;
	private JTextField tf_PrecioEspecialidad;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_ModEspecialidad frame = new Panel_admin_gestionMedica_ModEspecialidad();
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
	public Panel_admin_gestionMedica_ModEspecialidad() {
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 783, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(622, 97, 115, 328);
		panel.add(table);
		
		JLabel lbl_NombreEspecialidad = new JLabel("Nombre Especialidad");
		lbl_NombreEspecialidad.setBounds(96, 158, 129, 14);
		panel.add(lbl_NombreEspecialidad);
		
		tf_NombreEspecialidad = new JTextField();
		tf_NombreEspecialidad.setBounds(254, 155, 115, 20);
		panel.add(tf_NombreEspecialidad);
		tf_NombreEspecialidad.setColumns(10);
		
		JLabel lbl_PrecioTratamiento = new JLabel("Precio Especialidad");
		lbl_PrecioTratamiento.setBounds(98, 222, 127, 14);
		panel.add(lbl_PrecioTratamiento);
		
		tf_PrecioEspecialidad = new JTextField();
		tf_PrecioEspecialidad.setBounds(254, 219, 115, 20);
		panel.add(tf_PrecioEspecialidad);
		tf_PrecioEspecialidad.setColumns(10);
		
		JButton btn_ModificarEspecialidad = new JButton("Modificar Especialidad");
		btn_ModificarEspecialidad.setBounds(203, 304, 185, 23);
		panel.add(btn_ModificarEspecialidad);
		
		JLabel lbl_Listado = new JLabel("Listado Especialidades");
		lbl_Listado.setBounds(622, 40, 151, 14);
		panel.add(lbl_Listado);

	}
}
