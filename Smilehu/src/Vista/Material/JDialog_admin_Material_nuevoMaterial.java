package Vista.Material;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDialog_admin_Material_nuevoMaterial extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_Material_nuevoMaterial dialog = new JDialog_admin_Material_nuevoMaterial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private JDesktopPane miDesktopPane;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	public JDialog_admin_Material_nuevoMaterial() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 444, 290);
		getContentPane().setLayout(null);
		
		JLabel lbl_añadirmaterial = new JLabel("Añadir Material");
		lbl_añadirmaterial.setForeground(new Color(0, 0, 0));
		lbl_añadirmaterial.setBounds(22, 11, 80, 14);
		getContentPane().add(lbl_añadirmaterial);
		
		JLabel lbl_material = new JLabel("Material");
		lbl_material.setForeground(new Color(0, 0, 0));
		lbl_material.setBounds(22, 36, 46, 14);
		getContentPane().add(lbl_material);
		
		JTextField tf_material = new JTextField();
		tf_material.setBounds(22, 61, 86, 20);
		getContentPane().add(tf_material);
		tf_material.setColumns(10);
		
		JLabel lbl_preciounitario = new JLabel("Precio Unitario");
		lbl_preciounitario.setForeground(new Color(0, 0, 0));
		lbl_preciounitario.setBounds(142, 36, 80, 14);
		getContentPane().add(lbl_preciounitario);
		
		JTextField tf_preciounitario = new JTextField();
		tf_preciounitario.setBounds(142, 61, 86, 20);
		getContentPane().add(tf_preciounitario);
		tf_preciounitario.setColumns(10);
		
		JLabel lbl_proveedor = new JLabel("Proveedor");
		lbl_proveedor.setForeground(new Color(0, 0, 0));
		lbl_proveedor.setBounds(266, 36, 64, 14);
		getContentPane().add(lbl_proveedor);
		
		JTextField tf_proveedor = new JTextField();
		tf_proveedor.setBounds(266, 61, 86, 20);
		getContentPane().add(tf_proveedor);
		tf_proveedor.setColumns(10);
		
		JLabel lbl_proveedor2 = new JLabel("Proveedor");
		lbl_proveedor2.setForeground(new Color(0, 0, 0));
		lbl_proveedor2.setBounds(22, 137, 64, 14);
		getContentPane().add(lbl_proveedor2);
		
		JList list = new JList();
		list.setBounds(96, 107, 234, 86);
		getContentPane().add(list);
		
		JButton btn_añadirmaterial = new JButton("Añadir Material");
		btn_añadirmaterial.setBounds(103, 215, 105, 23);
		getContentPane().add(btn_añadirmaterial);

	}
		
	

}
