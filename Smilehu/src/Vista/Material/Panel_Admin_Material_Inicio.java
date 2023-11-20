package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Usuario.Panel_admin_usuario_generarInforme;

import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Admin_Material_Inicio extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_Inicio frame = new Panel_Admin_Material_Inicio();
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
	public Panel_Admin_Material_Inicio() {
		getContentPane().setBackground(new Color(42, 61, 80));
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		JDesktopPane desktopPane2 = new JDesktopPane();
		desktopPane2.setBackground(new Color(4, 20, 36));
		desktopPane2.setBounds(192, 0, 591, 457);
		getContentPane().add(desktopPane2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 129, 170));
		panel.setBounds(0, 0, 194, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JButton btn_pedidos = new JButton("Pedidos");
		btn_pedidos.setBounds(47, 123, 113, 23);
		panel.add(btn_pedidos);
		
		JButton btn_proveedores = new JButton("Proveedores");
		btn_proveedores.setBounds(47, 311, 113, 23);
		panel.add(btn_proveedores);
		btn_proveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Material_Proveedores proveedores =new Panel_Admin_Material_Proveedores();
				
				proveedores.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
				desktopPane2.removeAll();
				desktopPane2.add(proveedores);
				((BasicInternalFrameUI) proveedores.getUI()).setNorthPane(null);
				proveedores.setLocation(0,0);
				proveedores.setVisible(true);
				proveedores.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
				
			}
		});
		btn_pedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Material_Pedidos pedidos=new Panel_Admin_Material_Pedidos(); 
				pedidos.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
				desktopPane2.removeAll();
				desktopPane2.add(pedidos);
				((BasicInternalFrameUI) pedidos.getUI()).setNorthPane(null);
				pedidos.setLocation(0,0);
				pedidos.setVisible(true);
				pedidos.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
				
				
				
				
				
				
				
				
			}
		});
		
		

	}

}
