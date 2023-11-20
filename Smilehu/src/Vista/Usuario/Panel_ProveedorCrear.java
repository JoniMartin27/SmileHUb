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

public class Panel_ProveedorCrear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
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
		setBounds(100, 100, 550, 353);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_ficha = new JLabel("Ficha de Proveedor Creado");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha.setBounds(23, 11, 226, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		JButton btn_crearproveedor = new JButton("Crear Proveedor");
		btn_crearproveedor.setBounds(164, 252, 173, 23);
		contentPanel.add(btn_crearproveedor);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(98, 80, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(277, 105, 102, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_direccion = new JLabel("Dirección:");
		lbl_direccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(277, 80, 102, 14);
		contentPanel.add(lbl_direccion);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(98, 105, 102, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_telefono = new JLabel("Telefono:");
		lbl_telefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_telefono.setForeground(new Color(0, 0, 0));
		lbl_telefono.setBounds(98, 150, 102, 14);
		contentPanel.add(lbl_telefono);
		
		tf_telefono = new JTextField();
		tf_telefono.setBounds(277, 175, 102, 20);
		contentPanel.add(tf_telefono);
		tf_telefono.setColumns(10);
		
		tf_correo = new JTextField();
		tf_correo.setBounds(98, 175, 102, 20);
		contentPanel.add(tf_correo);
		tf_correo.setColumns(10);
		
		JLabel lbl_correo = new JLabel("Correo:");
		lbl_correo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_correo.setForeground(new Color(0, 0, 0));
		lbl_correo.setBounds(277, 150, 75, 14);
		contentPanel.add(lbl_correo);
		
		
		ButtonGroup g1 = new ButtonGroup();
		
		ButtonGroup g2 = new ButtonGroup();
		
	}

}
