package Vista.Material;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

public class JDialog_admin_Material_CrearPedido extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JDesktopPane miDesktopPane;
	private JTextField tf_materialseleccionado;
	private JTextField tf_cantidadmaterial;
	private JTextField tf_preciounitario;
	private JTextField tf_preciototal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_Material_CrearPedido dialog = new JDialog_admin_Material_CrearPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane=desktopPane;
	}
	/**
	 * Create the dialog.
	 */
	public JDialog_admin_Material_CrearPedido() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(190, 43, 593, 414);
		getContentPane().setLayout(null);
		
		JLabel lbl_crearpedido = new JLabel("Crear Pedido");
		lbl_crearpedido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_crearpedido.setForeground(new Color(0, 0, 0));
		lbl_crearpedido.setBounds(23, 11, 111, 14);
		getContentPane().add(lbl_crearpedido);
		
		JLabel lbl_materialseleccionado = new JLabel("Material Seleccionado");
		lbl_materialseleccionado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_materialseleccionado.setForeground(new Color(0, 0, 0));
		lbl_materialseleccionado.setBounds(124, 127, 141, 14);
		getContentPane().add(lbl_materialseleccionado);
		
		tf_materialseleccionado = new JTextField();
		tf_materialseleccionado.setBounds(124, 152, 141, 20);
		getContentPane().add(tf_materialseleccionado);
		tf_materialseleccionado.setColumns(10);
		
		
		
		JLabel lbl_preciounitario = new JLabel("Precio Unitario");
		lbl_preciounitario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_preciounitario.setForeground(new Color(0, 0, 0));
		lbl_preciounitario.setBounds(337, 46, 105, 14);
		getContentPane().add(lbl_preciounitario);
		
		tf_preciounitario = new JTextField();
		tf_preciounitario.setBounds(337, 62, 141, 20);
		getContentPane().add(tf_preciounitario);
		tf_preciounitario.setColumns(10);
		
		
		
		JLabel lbl_cantidadmaterial = new JLabel("Cantidad Material");
		lbl_cantidadmaterial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_cantidadmaterial.setForeground(new Color(0, 0, 0));
		lbl_cantidadmaterial.setBounds(124, 46, 111, 14);
		getContentPane().add(lbl_cantidadmaterial);
		
		tf_cantidadmaterial = new JTextField();
		tf_cantidadmaterial.setBounds(124, 62, 141, 20);
		getContentPane().add(tf_cantidadmaterial);
		tf_cantidadmaterial.setColumns(10);
		
		
		
		
		JLabel lbl_preciototal = new JLabel("Precio Total");
		lbl_preciototal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_preciototal.setForeground(new Color(0, 0, 0));
		lbl_preciototal.setBounds(337, 127, 105, 14);
		getContentPane().add(lbl_preciototal);
		
		tf_preciototal = new JTextField();
		tf_preciototal.setColumns(10);
		tf_preciototal.setBounds(337, 152, 141, 20);
		getContentPane().add(tf_preciototal);
		
		JTable table = new JTable();
		table.setBounds(200, 248, 201, 95);
		getContentPane().add(table);
		
		
		JButton btn_enviarpedido = new JButton("Enviar Pedido");
		btn_enviarpedido.setBounds(462, 341, 105, 23);
		getContentPane().add(btn_enviarpedido);
		
		JButton btn_seleccionarmaterial = new JButton("Seleccionar Material");
		btn_seleccionarmaterial.setBounds(221, 194, 151, 23);
		getContentPane().add(btn_seleccionarmaterial);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JDialog_admin_Material_CrearPedido.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 577, 375);
		getContentPane().add(lblNewLabel);
	
		
		
		

	}
}

