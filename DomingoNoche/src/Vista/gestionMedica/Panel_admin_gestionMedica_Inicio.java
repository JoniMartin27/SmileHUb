package Vista.gestionMedica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_admin_gestionMedica_Inicio extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JDesktopPane miDesktopPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_Inicio frame = new Panel_admin_gestionMedica_Inicio();
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
	public Panel_admin_gestionMedica_Inicio() {

		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 783, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(75, 58, 203, 178);
		panel.add(table);
		
		JButton btn_Crear = new JButton("Crear");
		btn_Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionMedica_CrearTratamiento CrearTratamiento = new Panel_admin_gestionMedica_CrearTratamiento();
				CrearTratamiento.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(CrearTratamiento);
				((BasicInternalFrameUI) CrearTratamiento.getUI()).setNorthPane(null);
				CrearTratamiento.setLocation(0,0);
				CrearTratamiento.show();
				CrearTratamiento.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
		    }
		});
			
		
		btn_Crear.setBounds(117, 258, 125, 23);
		panel.add(btn_Crear);
		
		JButton btn_Borrar = new JButton("Borrar");
		btn_Borrar.setBounds(117, 391, 125, 23);
		panel.add(btn_Borrar);
		
		JButton btn_Modificar = new JButton("Modificar");
		btn_Modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionMedica_ModTratamiento ModTratamiento = new Panel_admin_gestionMedica_ModTratamiento();
				ModTratamiento.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(ModTratamiento);
				((BasicInternalFrameUI) ModTratamiento.getUI()).setNorthPane(null);
				ModTratamiento.setLocation(0,0);
				ModTratamiento.show();
				ModTratamiento.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
			}
		});
		btn_Modificar.setBounds(117, 326, 125, 23);
		panel.add(btn_Modificar);
		
		JButton btn_CrearEspecialidad = new JButton("Crear");
		btn_CrearEspecialidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionMedica_CrearEspecialidad CrearEspecialidad = new Panel_admin_gestionMedica_CrearEspecialidad();
				CrearEspecialidad.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(CrearEspecialidad);
				((BasicInternalFrameUI) CrearEspecialidad.getUI()).setNorthPane(null);
				CrearEspecialidad.setLocation(0,0);
				CrearEspecialidad.show();
				CrearEspecialidad.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
			}
		});
		btn_CrearEspecialidad.setBounds(533, 258, 125, 23);
		panel.add(btn_CrearEspecialidad);
		
		JButton btn_ModificarEspecialidad = new JButton("Modificar");
		btn_ModificarEspecialidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionMedica_ModEspecialidad ModEspecialidad = new Panel_admin_gestionMedica_ModEspecialidad();
				ModEspecialidad.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(ModEspecialidad);
				((BasicInternalFrameUI) ModEspecialidad.getUI()).setNorthPane(null);
				ModEspecialidad.setLocation(0,0);
				ModEspecialidad.show();
				ModEspecialidad.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
			}
		});
		btn_ModificarEspecialidad.setBounds(533, 326, 125, 23);
		panel.add(btn_ModificarEspecialidad);
		
		JButton btn_BorrarEspecialidad = new JButton("Borrar");
		btn_BorrarEspecialidad.setBounds(533, 391, 125, 23);
		panel.add(btn_BorrarEspecialidad);
		
		table_1 = new JTable();
		table_1.setBounds(488, 58, 203, 183);
		panel.add(table_1);

	}
}
