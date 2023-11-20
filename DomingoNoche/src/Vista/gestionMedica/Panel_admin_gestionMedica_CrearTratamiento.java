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

public class Panel_admin_gestionMedica_CrearTratamiento extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_NombreTratamiento;
	private JTextField tf_PrecioTratamiento;
	private JTextField tf_DuracionTratamiento;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_CrearTratamiento frame = new Panel_admin_gestionMedica_CrearTratamiento();
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
	public Panel_admin_gestionMedica_CrearTratamiento() {
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 783, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(629, 110, 127, 275);
		panel.add(table);
		
		JLabel lbl_NombreTratamiento = new JLabel("Nombre Tratamiento");
		lbl_NombreTratamiento.setBounds(53, 124, 140, 14);
		panel.add(lbl_NombreTratamiento);
		
		tf_NombreTratamiento = new JTextField();
		tf_NombreTratamiento.setBounds(225, 121, 127, 20);
		panel.add(tf_NombreTratamiento);
		tf_NombreTratamiento.setColumns(10);
		
		JLabel lbl_PrecioTratamiento = new JLabel("Precio Tratamiento");
		lbl_PrecioTratamiento.setBounds(55, 195, 118, 14);
		panel.add(lbl_PrecioTratamiento);
		
		tf_PrecioTratamiento = new JTextField();
		tf_PrecioTratamiento.setBounds(225, 192, 127, 20);
		panel.add(tf_PrecioTratamiento);
		tf_PrecioTratamiento.setColumns(10);
		
		JLabel lbl_DuracionTratamiento = new JLabel("Duracion del Tratamiento");
		lbl_DuracionTratamiento.setBounds(55, 266, 160, 14);
		panel.add(lbl_DuracionTratamiento);
		
		tf_DuracionTratamiento = new JTextField();
		tf_DuracionTratamiento.setColumns(10);
		tf_DuracionTratamiento.setBounds(225, 263, 127, 20);
		panel.add(tf_DuracionTratamiento);
		
		JButton btn_CrearTratamiento = new JButton("Crear Tratamiento");
		btn_CrearTratamiento.setBounds(276, 362, 153, 23);
		panel.add(btn_CrearTratamiento);
		
		JLabel lblNewLabel_1 = new JLabel("Listado Tratamientos");
		lblNewLabel_1.setBounds(629, 59, 144, 14);
		panel.add(lblNewLabel_1);

	}
}
