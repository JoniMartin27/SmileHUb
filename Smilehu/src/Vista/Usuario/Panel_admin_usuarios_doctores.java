package Vista.Usuario;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_admin_usuarios_doctores extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_usuarios_doctores frame = new Panel_admin_usuarios_doctores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel_admin_usuarios_doctores() {
		getContentPane().setBackground(new Color(4, 20, 36));
		getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 66, 652, 244);
		getContentPane().add(desktopPane);
		
		JButton btn_ver_perfil = new JButton("Ver perfil");
		btn_ver_perfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_Admin_id_Doctores id_doctor =new JDialog_Admin_id_Doctores();
				
				id_doctor.setLocation(200, 200);
				id_doctor.setUndecorated(true);
				id_doctor.setVisible(true);
			}
		});
		btn_ver_perfil.setBounds(31, 32, 89, 23);
		getContentPane().add(btn_ver_perfil);
		
		JButton btn_Crear_Perfil = new JButton("Crear Perfil");
		btn_Crear_Perfil.setBounds(176, 32, 89, 23);
		getContentPane().add(btn_Crear_Perfil);
		
		JButton btn_cambiar = new JButton("Cambiar Contraseña doctor");
		btn_cambiar.setBounds(313, 32, 165, 23);
		getContentPane().add(btn_cambiar);
		setBounds(100, 100, 688, 351);

	}
}
