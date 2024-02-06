package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Conexion.ConexionMySQL;
import Modelo.Paciente;
import Modelo.Proveedor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Panel_ProveedorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_telefono;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_correo;
	private JTextField tf_direccion;
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
		setBorder(null);

		setBounds(100, 100, 1018,576);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(42, 61, 80));
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(469, 108, 207, 22);
		contentPanel.add(comboBox);
		
		JButton btn_buscarProveedor = new JButton("Buscar");
		btn_buscarProveedor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_buscarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre=tf_nombre.getText();
				
				cargarProveedoresAlComboBox(nombre,comboBox);
				
				
				
			}
		});
		btn_buscarProveedor.setBounds(705, 74, 89, 23);
		contentPanel.add(btn_buscarProveedor);
		
		JLabel lbl_ficha = new JLabel("FICHA PROVEEDOR");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		JButton btn_modificarproveedor = new JButton("Modificar Proveedor");
		btn_modificarproveedor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_modificarproveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
			}
		});
		btn_modificarproveedor.setBounds(469, 414, 207, 23);
		contentPanel.add(btn_modificarproveedor);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(302, 78, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(469, 77, 207, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_direccion = new JLabel("Dirección");
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(302, 224, 102, 14);
		contentPanel.add(lbl_direccion);
		

		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_telefono = new JLabel("Telefono");
		lbl_telefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_telefono.setForeground(new Color(0, 0, 0));
		lbl_telefono.setBounds(302, 255, 102, 14);
		contentPanel.add(lbl_telefono);
		
		tf_telefono = new JTextField();
		tf_telefono.setBounds(469, 254, 207, 20);
		contentPanel.add(tf_telefono);
		tf_telefono.setColumns(10);
		
		tf_correo = new JTextField();
		tf_correo.setBounds(469, 285, 207, 20);
		contentPanel.add(tf_correo);
		tf_correo.setColumns(10);
		
		JLabel lbl_correo = new JLabel("Correo");
		lbl_correo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_correo.setForeground(new Color(0, 0, 0));
		lbl_correo.setBounds(302, 286, 75, 14);
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
		tf_direccion = new JTextField();
		tf_direccion.setColumns(10);
		tf_direccion.setBounds(469, 223, 207, 20);
		contentPanel.add(tf_direccion);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_ProveedorCreado.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 564);
		contentPanel.add(lblNewLabel);
		
		
		ButtonGroup g1 = new ButtonGroup();
		
		ButtonGroup g2 = new ButtonGroup();
		
		
	
	}
	

	private void cargarProveedoresAlComboBox(String nombre, JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener proveedores desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener proveedores por nombre
			List<Proveedor> proveedores = ConexionMySQL.buscarProveedor(nombre);
			
			// Agregar nombre de cada proveedor al ComboBox
			for (Proveedor proveedor : proveedores) {
				String nombreCompleto = proveedor.getNombre() ;
				tf_correo.setText(proveedor.getCorreo());
				tf_direccion.setText(proveedor.getDireccion());
				tf_telefono.setText(proveedor.getTelefono());
				System.out.println(nombreCompleto);
				comboBox.addItem(nombreCompleto);
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar pacientes", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
	
	

