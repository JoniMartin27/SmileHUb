package Vista.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Admin_Usuario_Doctor extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btn_CambiarContrasena;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Panel_Admin_Usuario_Doctor frame = new Panel_Admin_Usuario_Doctor();
			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the dialog.
	 */
	public Panel_Admin_Usuario_Doctor() {

	
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(42, 61, 80));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JDesktopPane desktopPane2 = new JDesktopPane();
		desktopPane2.setBackground(new Color(4, 20, 36));
		desktopPane2.setBounds(244, 0, 539, 457);
		contentPanel.add(desktopPane2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 120, 170));
		panel.setBounds(0, 0, 246, 457);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		btn_CambiarContrasena = new JButton("Cambiar contraseña Doctor");
		btn_CambiarContrasena.setBounds(29, 83, 207, 23);
		panel.add(btn_CambiarContrasena);
		
		JButton btn_CrearPerfil = new JButton("Crear Perfil");
		btn_CrearPerfil.setBounds(29, 217, 207, 23);
		panel.add(btn_CrearPerfil);
		
		JButton btn_verPerfil = new JButton("Ver perfil");
		btn_verPerfil.setBounds(29, 379, 207, 23);
		panel.add(btn_verPerfil);
		btn_verPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
			}
		});
	
		btn_CambiarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_Cambiar_Contrasena contrasena=new JDialog_admin_Cambiar_Contrasena();
				
				contrasena.setVisible(true);
				contrasena.setLocation(200, 200);
				contrasena.setModal(true);
				contrasena.setUndecorated(true);
				dispose();
			}
		});
		
		
	}
}