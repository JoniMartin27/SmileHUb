package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Panel_ProveedorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_telefono;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_correo;
	private JTextField textField;
	private JTextField tf_buscarProveedor;
	private JDesktopPane miDesktopPane_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_ProveedorCreado frame = new Panel_ProveedorCreado();
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
	public Panel_ProveedorCreado() {

		setBounds(100, 100, 550, 353);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(42, 61, 80));
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_ficha = new JLabel("Ficha de Proveedor");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		JButton btn_modificarproveedor = new JButton("Modificar Proveedor");
		btn_modificarproveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
			}
		});
		btn_modificarproveedor.setBounds(176, 220, 173, 23);
		contentPanel.add(btn_modificarproveedor);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(23, 39, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(202, 38, 126, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_direccion = new JLabel("Dirección:");
		lbl_direccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(23, 70, 102, 14);
		contentPanel.add(lbl_direccion);
		
		JTextField tf_direccion = new JTextField();
		tf_direccion.setBounds(347, 69, 126, 20);
		
		tf_direccion.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_telefono = new JLabel("Telefono:");
		lbl_telefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_telefono.setForeground(new Color(0, 0, 0));
		lbl_telefono.setBounds(23, 105, 102, 14);
		contentPanel.add(lbl_telefono);
		
		tf_telefono = new JTextField();
		tf_telefono.setBounds(202, 104, 126, 20);
		contentPanel.add(tf_telefono);
		tf_telefono.setColumns(10);
		
		tf_correo = new JTextField();
		tf_correo.setBounds(202, 136, 126, 20);
		contentPanel.add(tf_correo);
		tf_correo.setColumns(10);
		
		JLabel lbl_correo = new JLabel("Correo:");
		lbl_correo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_correo.setForeground(new Color(0, 0, 0));
		lbl_correo.setBounds(23, 137, 75, 14);
		contentPanel.add(lbl_correo);
		
		/*JButton BTN_BuscarProveedor = new JButton("Buscar");
		BTN_BuscarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= tf_buscarProveedor.getText();
				int nume=Integer.parseInt(num);
				
				try {
					ConexionMySQL.conectar();
					Proveedor proveedor=ConexionMySQL.consultaProveedor(nume);
					tf_nombre.setText(proveedor.getNombre());
					tf_correo.setText(proveedor.getCorreo());
					int tel=proveedor.getTelefono();
					String telefono=Integer.toString(tel);
					tf_telefono.setText(telefono);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
						
			}
		});
		BTN_BuscarProveedor.setBounds(348, 172, 102, 23);
		contentPanel.add(BTN_BuscarProveedor);
		*/
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 69, 126, 20);
		contentPanel.add(textField);
		
		tf_buscarProveedor = new JTextField();
		tf_buscarProveedor.setColumns(10);
		tf_buscarProveedor.setBounds(202, 173, 126, 20);
		contentPanel.add(tf_buscarProveedor);
		
		JLabel lbl_buscar = new JLabel("Buscar proveedor:");
		lbl_buscar.setForeground(new Color(0, 0, 0));
		lbl_buscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_buscar.setBounds(23, 174, 167, 14);
		contentPanel.add(lbl_buscar);
		
		
		ButtonGroup g1 = new ButtonGroup();
		
		ButtonGroup g2 = new ButtonGroup();
		
		
	
	}

}
