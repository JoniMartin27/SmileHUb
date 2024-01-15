package Vista.Material;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexion.ConexionMySQL;
import Modelo.Paciente;
import Modelo.Proveedor;
import Modelo.StockMaterial;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

public class Material_nuevomaterial extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_material;
	private JTextField tf_precio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Material_nuevomaterial dialog = new Material_nuevomaterial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Material_nuevomaterial() {
		setBounds(850, 350, 694, 605);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 678, 566);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		
		
		
		
		
		JTextField tf_precio = new JTextField();
		tf_precio.setBounds(390, 155, 124, 20);
		panel.add(tf_precio);
		tf_precio.setColumns(10);
		
		tf_material = new JTextField();
		tf_material.setBounds(69, 155, 186, 20);
		panel.add(tf_material);
		tf_material.setColumns(10);
		
		JComboBox<String> cb_proveedor = new JComboBox<>();
		cb_proveedor.setBounds(69, 228, 186, 22);
		panel.add(cb_proveedor);
		
		
		
		cargarProveedoresAlComboBox(cb_proveedor);
		
		
		
		
		JLabel lbl_nombre = new JLabel("Nombre Material");
		lbl_nombre.setBounds(69, 130, 118, 14);
		panel.add(lbl_nombre);
		
		JLabel lbl_proveedor = new JLabel("Nombre Proveedor");
		lbl_proveedor.setBounds(69, 203, 118, 14);
		panel.add(lbl_proveedor);
		
		JLabel lbl_precio = new JLabel("precio");
		lbl_precio.setBounds(390, 130, 95, 14);
		panel.add(lbl_precio);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setIcon(new ImageIcon(Material_nuevomaterial.class.getResource("/img/fondoDientes.jpg")));
		lbl_fondo.setBounds(0, 0, 678, 566);
		panel.add(lbl_fondo);
		JButton btn_crearMaterial = new JButton("Crear Material");
		btn_crearMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double ds =Double.parseDouble(tf_precio.getText());
				
				StockMaterial mat =new StockMaterial();
				mat.setPrecio(ds);
				mat.setNombre(tf_material.getText());
				mat.setNombreProveedor((String)cb_proveedor.getSelectedItem());
				
				//Insertar Material
				try {
					ConexionMySQL.insertarMaterial(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_crearMaterial.setBounds(251, 287, 124, 23);
		panel.add(btn_crearMaterial);
		
	}
	private void cargarProveedoresAlComboBox( JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Proveedor> proveedores = ConexionMySQL.buscarProvedor();

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Proveedor proveedor : proveedores) {
				String nombreCompleto = proveedor.getNombre() ;
				comboBox.addItem(nombreCompleto);
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar proveedores", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
