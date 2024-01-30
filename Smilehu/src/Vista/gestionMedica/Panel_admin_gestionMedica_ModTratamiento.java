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
import javax.swing.ImageIcon;
import java.awt.Font;

public class Panel_admin_gestionMedica_ModTratamiento extends JInternalFrame {

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
					Panel_admin_gestionMedica_ModTratamiento frame = new Panel_admin_gestionMedica_ModTratamiento();
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
	public Panel_admin_gestionMedica_ModTratamiento() {
		setBorder(null);
		setBounds(219, 44, 1018, 576);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 1018, 549);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_tratamientos = new JLabel("Listado tratamientos");
		lbl_tratamientos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_tratamientos.setBounds(770, 50, 163, 14);
		panel.add(lbl_tratamientos);
		
		table = new JTable();
		table.setBounds(770, 97, 195, 289);
		panel.add(table);
		
		JLabel lbl_NombreTratamiento = new JLabel("Nombre Tratamiento");
		lbl_NombreTratamiento.setBounds(178, 130, 195, 14);
		lbl_NombreTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lbl_NombreTratamiento);
		
		tf_NombreTratamiento = new JTextField();
		tf_NombreTratamiento.setBounds(383, 127, 174, 20);
		tf_NombreTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(tf_NombreTratamiento);
		tf_NombreTratamiento.setColumns(10);
		
		JLabel lbl_PrecioTratamiento = new JLabel("Precio Tratamiento");
		lbl_PrecioTratamiento.setBounds(180, 187, 193, 14);
		lbl_PrecioTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lbl_PrecioTratamiento);
		
		tf_PrecioTratamiento = new JTextField();
		tf_PrecioTratamiento.setBounds(383, 184, 174, 20);
		tf_PrecioTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(tf_PrecioTratamiento);
		tf_PrecioTratamiento.setColumns(10);
		
		JLabel lbl_DuracionTratamiento = new JLabel("Duracion del Tratamiento");
		lbl_DuracionTratamiento.setBounds(180, 252, 193, 14);
		lbl_DuracionTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lbl_DuracionTratamiento);
		
		tf_DuracionTratamiento = new JTextField();
		tf_DuracionTratamiento.setBounds(383, 249, 174, 20);
		tf_DuracionTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_DuracionTratamiento.setColumns(10);
		panel.add(tf_DuracionTratamiento);
		
		JButton btn_ModificarTratamiento = new JButton("Modificar Tratamiento");
		btn_ModificarTratamiento.setBounds(429, 363, 224, 23);
		btn_ModificarTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btn_ModificarTratamiento);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1018, 549);
		lblNewLabel.setIcon(new ImageIcon(Panel_admin_gestionMedica_ModTratamiento.class.getResource("/img/fondoDientes.jpg")));
		panel.add(lblNewLabel);

	}
}
