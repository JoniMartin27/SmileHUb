package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Conexion.ConexionMySQL;
import Modelo.Proveedor;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Panel_ProveedorCrear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nombre;
	private JTextField tf_direccion;
	private JTextField tf_telefono;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_correo;
	private JDesktopPane miDesktopPane_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_ProveedorCrear frame = new Panel_ProveedorCrear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane_1 = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Panel_ProveedorCrear() {
		setBorder(null);
		setBounds(100, 100, 1018, 576);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_ficha = new JLabel("FICHA PROVEEDOR CREAR");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_ficha.setBounds(23, 11, 226, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		JButton btn_crearproveedor = new JButton("Crear Proveedor");
		btn_crearproveedor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_crearproveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proveedor proveedor=new Proveedor(tf_direccion.getText(),tf_direccion.getText(),tf_telefono.getText(),tf_correo.getText());
				
				try {
					ConexionMySQL.conectar();
					ConexionMySQL.insertarProveedor(proveedor);
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_crearproveedor.setBounds(407, 432, 173, 23);
		contentPanel.add(btn_crearproveedor);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(320, 139, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_direccion = new JTextField();
		tf_direccion.setBounds(509, 164, 153, 20);
		contentPanel.add(tf_direccion);
		tf_direccion.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_direccion = new JLabel("Dirección");
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(509, 139, 102, 14);
		contentPanel.add(lbl_direccion);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(320, 164, 153, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_telefono = new JLabel("Telefono");
		lbl_telefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_telefono.setForeground(new Color(0, 0, 0));
		lbl_telefono.setBounds(320, 209, 102, 14);
		contentPanel.add(lbl_telefono);
		
		tf_telefono = new JTextField();
		tf_telefono.setBounds(320, 234, 153, 20);
		contentPanel.add(tf_telefono);
		tf_telefono.setColumns(10);
		
		tf_correo = new JTextField();
		tf_correo.setBounds(509, 234, 153, 20);
		contentPanel.add(tf_correo);
		tf_correo.setColumns(10);
		
		JLabel lbl_correo = new JLabel("Correo");
		lbl_correo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_correo.setForeground(new Color(0, 0, 0));
		lbl_correo.setBounds(509, 209, 75, 14);
		contentPanel.add(lbl_correo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_ProveedorCrear.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 559);
		contentPanel.add(lblNewLabel);
		
		
		ButtonGroup g1 = new ButtonGroup();
		
		ButtonGroup g2 = new ButtonGroup();
		
	}

}
