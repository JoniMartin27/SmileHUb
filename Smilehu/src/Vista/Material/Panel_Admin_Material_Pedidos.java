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
import javax.swing.UIManager;
import java.awt.Rectangle;
import java.awt.Component;

public class Panel_Admin_Material_Pedidos extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_Pedidos frame = new Panel_Admin_Material_Pedidos();
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
	public Panel_Admin_Material_Pedidos() {
		getContentPane().setBackground(new Color(4, 20, 36));
		setBounds(192, 0, 591, 457);
		getContentPane().setLayout(null);
		JDesktopPane desktopPane2 = new JDesktopPane();
		desktopPane2.setBackground(new Color(4, 20, 36));
		desktopPane2.setBounds(177, 0, 398, 427);
		getContentPane().add(desktopPane2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 129, 170));
		panel.setBounds(0, 0, 179, 427);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_modificarpedido = new JButton("Modificar Pedido");
		btn_modificarpedido.setBounds(28, 179, 140, 23);
		panel.add(btn_modificarpedido);
		
				JButton btn_crearpedido = new JButton("Crear Pedido");
				btn_crearpedido.setBorder(UIManager.getBorder("RadioButton.border"));
				btn_crearpedido.setBounds(28, 84, 140, 23);
				panel.add(btn_crearpedido);
				
				JButton btn_actualizarstock = new JButton("Actualizar Stock");
				btn_actualizarstock.setBounds(28, 278, 140, 23);
				panel.add(btn_actualizarstock);
				btn_actualizarstock.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Panel_Admin_Material_Stock Stock=new Panel_Admin_Material_Stock(); 
						Stock.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
						desktopPane2.removeAll();
						desktopPane2.add(Stock);
						((BasicInternalFrameUI) Stock.getUI()).setNorthPane(null);
						Stock.setLocation(0,0);
						Stock.setVisible(true);
						Stock.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
						
					}
				});
				btn_crearpedido.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Panel_admin_Material_CrearPedido crearPedido=new Panel_admin_Material_CrearPedido();
						crearPedido.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
						desktopPane2.removeAll();
						desktopPane2.add(crearPedido);
						((BasicInternalFrameUI) crearPedido.getUI()).setNorthPane(null);
						crearPedido.setLocation(0,0);
						crearPedido.setVisible(true);
						crearPedido.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
						
						
						
						
						
					}
				});
		btn_modificarpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Material_ModificarPedido modPedido=new Panel_Admin_Material_ModificarPedido();
				modPedido.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
				desktopPane2.removeAll();
				desktopPane2.add(modPedido);
				((BasicInternalFrameUI) modPedido.getUI()).setNorthPane(null);
				modPedido.setLocation(0,0);
				modPedido.setVisible(true);
				modPedido.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
				
				
				
			}
		});
		

	}
}
