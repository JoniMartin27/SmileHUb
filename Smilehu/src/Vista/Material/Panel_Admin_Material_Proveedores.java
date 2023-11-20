package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Panel_Admin_Material_Proveedores extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_Proveedores frame = new Panel_Admin_Material_Proveedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JDesktopPane miDesktopPane;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_Admin_Material_Proveedores() {
		getContentPane().setBackground(new Color(4, 20, 36));
		setBounds(192, 0, 591, 457);
		getContentPane().setLayout(null);
		
		JDesktopPane desktopPane2 = new JDesktopPane();
		desktopPane2.setBackground(new Color(4, 20, 36));
		desktopPane2.setBounds(192, 0, 383, 427);
		getContentPane().add(desktopPane2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 129, 170));
		panel.setBounds(0, 0, 192, 427);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_crearproveedor = new JButton("Crear Proveedor");
		btn_crearproveedor.setBounds(10, 326, 172, 23);
		panel.add(btn_crearproveedor);
		
		JButton btn_modificarproveedor = new JButton("Modificar Proveedor");
		btn_modificarproveedor.setBounds(10, 241, 172, 23);
		panel.add(btn_modificarproveedor);
		
		JButton btn_dardebajaproveedor = new JButton("Dar de baja Proveedor");
		btn_dardebajaproveedor.setBounds(10, 150, 172, 23);
		panel.add(btn_dardebajaproveedor);
		
		JButton btn_ConsultarProveedor = new JButton("Buscar Proveedor");
		btn_ConsultarProveedor.setBounds(10, 59, 172, 23);
		panel.add(btn_ConsultarProveedor);
		btn_ConsultarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Material_ProveedoresConsultar consultarProveedor=new Panel_Admin_Material_ProveedoresConsultar(); 
				consultarProveedor.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
				desktopPane2.removeAll();
				desktopPane2.add(consultarProveedor);
				((BasicInternalFrameUI) consultarProveedor.getUI()).setNorthPane(null);
				consultarProveedor.setLocation(0,0);
				consultarProveedor.setVisible(true);
				consultarProveedor.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
				
				
				
				
			}
		});
		btn_dardebajaproveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDialog_Admin_Baja_Proveedor Baja=new JDialog_Admin_Baja_Proveedor();
				Baja.setVisible(true);
				Baja.setLocation(200, 200);
				Baja.setModal(true);
				Baja.setUndecorated(true);
				dispose();
			}
		});
		
		
	}
}
