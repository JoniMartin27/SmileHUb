package Vista.Usuario;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import Boton_Personalizado.Boton_personalizado;

public class Panel_Admin_Usuario_Proveedores extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane miDesktopPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Usuario_Proveedores frame = new Panel_Admin_Usuario_Proveedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;}
	/**
	 * Create the frame.
	 */
	public Panel_Admin_Usuario_Proveedores() {
		setBounds(219, 44, 799, 487);
		getContentPane().setBackground(new Color(42, 61, 80));
		getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(4, 20, 36));
		desktopPane.setBounds(191, 0, 592, 457);
		getContentPane().add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 129, 170));
		panel.setBounds(0, 0, 195, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_verperfil = new JButton("Ver perfil");
		btn_verperfil.setBounds(42, 103, 121, 23);
		panel.add(btn_verperfil);
		
		JButton btn_crearperfil = new JButton("Crear perfil");
		btn_crearperfil.setBounds(42, 331, 121, 23);
		panel.add(btn_crearperfil);
		
		


	}
}
