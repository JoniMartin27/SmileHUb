package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ConexionMySQL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.sql.*;
public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tF_Usuario;
	private JTextField tf_contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(new ImageIcon(getClass().getResource("/img/SmileHub.png")).getImage());
				
				setResizable(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
				contentPane.setBackground(new Color(4, 20, 36));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

				setContentPane(contentPane);
				contentPane.setLayout(null);
//Etiquetas y textFields para inicio de sesion
		JLabel lbl_Usuario = new JLabel("Usuario");
				lbl_Usuario.setFont(new Font("Tahoma", Font.BOLD, 26));
				lbl_Usuario.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_Usuario.setForeground(Color.WHITE);
				lbl_Usuario.setBounds(407, 280, 145, 56);
				contentPane.add(lbl_Usuario);
		
		JLabel lbl_Contrasena = new JLabel("Contraseña");
				lbl_Contrasena.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_Contrasena.setForeground(Color.WHITE);
				lbl_Contrasena.setFont(new Font("Tahoma", Font.BOLD, 26));
				lbl_Contrasena.setBounds(374, 387, 210, 56);
				contentPane.add(lbl_Contrasena);
		
		tF_Usuario = new JTextField();
				tF_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
				tF_Usuario.setBackground(new Color(176, 255, 250));
				tF_Usuario.setBounds(362, 334, 234, 34);
				contentPane.add(tF_Usuario);
				tF_Usuario.setColumns(10);
//Boton de acceder
		JButton btn_Acceder = new JButton("Acceder");
				btn_Acceder.setBackground(new Color(192, 192, 192));
				btn_Acceder.setFont(new Font("Tahoma", Font.BOLD, 16));
				
//Boton de ayuda		
		JButton btn_Help = new JButton("");
		btn_Help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn_Help, "Introduce un NOMBRE válido.");
			}
		});
				btn_Help.setBounds(606, 334, 34, 34);
		
		ImageIcon icoHelp = new ImageIcon(getClass().getResource("/img/ayuda.png"));
				btn_Help.setIcon(icoHelp);
				contentPane.add(btn_Help);
		
		JLabel lbl_Icon = new JLabel("");
				lbl_Icon.setBounds(344, 11, 270, 271);

				ImageIcon icoLogo = new ImageIcon(getClass().getResource("/img/SmileHub.png"));
				ImageIcon imgLogo = new ImageIcon(icoLogo.getImage().getScaledInstance(lbl_Icon.getWidth(), lbl_Icon.getHeight(), Image.SCALE_SMOOTH));

		lbl_Icon.setIcon(new ImageIcon(Login.class.getResource("/img/SmileHub.png")));
				contentPane.add(lbl_Icon);

		
		JButton btn_ocultarCont = new JButton("");
		
				btn_ocultarCont.setBounds(606, 441, 34, 34);

		JButton btn_verCont = new JButton("");
		ImageIcon icoOjo = new ImageIcon(getClass().getResource("/img/ojo.png"));
		


				btn_verCont.setIcon(icoOjo);
				btn_verCont.setBounds(606, 441, 34, 34);
				contentPane.add(btn_verCont);
		
		ImageIcon icoVisible = new ImageIcon(getClass().getResource("/img/visible.png"));
				btn_ocultarCont.setIcon(icoVisible);
				contentPane.add(btn_ocultarCont);
		
		
		
		JLabel lbl_IconUser = new JLabel("");
				lbl_IconUser.setBounds(318, 334, 34, 34);
		
		ImageIcon icoUser = new ImageIcon(getClass().getResource("/img/usuario.png"));
				lbl_IconUser.setIcon(icoUser);
				contentPane.add(lbl_IconUser);
		
		JLabel lbl_IconCont = new JLabel("");
				lbl_IconCont.setBounds(318, 441, 34, 34);
				ImageIcon icoCont = new ImageIcon(getClass().getResource("/img/cerrar-con-llave.png"));
				lbl_IconCont.setIcon(icoCont);
				contentPane.add(lbl_IconCont);
				
				tf_contrasena = new JTextField();
				tf_contrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
				tf_contrasena.setColumns(10);
				tf_contrasena.setBackground(new Color(176, 255, 250));
				tf_contrasena.setBounds(362, 441, 234, 34);
				contentPane.add(tf_contrasena);
				btn_Acceder.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String user = tF_Usuario.getText();
				        String pass = tf_contrasena.getText();
				        String url = "SELECT nombre,pass,tipo_usuario FROM doctor_administrador where estado_baja = 0 and nombre='" + user + "'";

				        try {
				            Connection con = ConexionMySQL.obtenerConexion();
				            PreparedStatement ps = con.prepareStatement(url);
				            ResultSet rs = ps.executeQuery();

				            if (rs.next()) {
				                // SI EXISTE EL USUARIO
				                System.out.println("hola");
				                String u = rs.getString("nombre");
				                String p = rs.getString("pass");
				                String rol = rs.getString("tipo_usuario");

				                if (pass.equals(p)) {
				                    // VAMOS A JFRAME DOCTOR O ADMIN
				                    if (rol.equals("1")) {
				                        Login.this.setVisible(false); // Referencia correcta al objeto Login
				                        Inicio_Panel_Doctor doctor = new Inicio_Panel_Doctor();
				                        doctor.setVisible(true);
				                    } else if (rol.equals("0")) {
				                        Login.this.setVisible(false); // Referencia correcta al objeto Login
				                        Inicio_Panel_Administrador admin = new Inicio_Panel_Administrador();
				                        admin.setVisible(true);
				                    }
				                } else {
				                    JOptionPane.showMessageDialog(null, "LA CONTRASEÑA ES INCORRECTA");
				                }

				            } else {
				                // EL USUARIO NO EXISTE
				                JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE EN LA BASE DE DATOS");
				            }

				        } catch (SQLException e1) {
				            e1.printStackTrace();
				        }
				    
			
						
						
						
						
						
						
					}

					private void setVisible(boolean b) {
						// TODO Auto-generated method stub
						
					}
				});
						btn_Acceder.setBounds(426, 513, 107, 34);
						contentPane.add(btn_Acceder);
	}
}
