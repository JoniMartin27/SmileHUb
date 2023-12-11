package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Panel_Admin_Material_ProveedoresConsultar extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_nombreProveedor;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_ProveedoresConsultar frame = new Panel_Admin_Material_ProveedoresConsultar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_Admin_Material_ProveedoresConsultar() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(190, 43, 593, 414);
		getContentPane().setLayout(null);
		
		JButton btn_consultarproveedor = new JButton("Consultar Proveedor");
		btn_consultarproveedor.setBounds(14, 70, 160, 23);
		getContentPane().add(btn_consultarproveedor);
		
		table = new JTable();
		table.setBounds(14, 159, 357, 150);
		getContentPane().add(table);
		
		tf_nombreProveedor = new JTextField();
		tf_nombreProveedor.setBounds(184, 70, 187, 22);
		getContentPane().add(tf_nombreProveedor);
		tf_nombreProveedor.setColumns(10);

	}
}
