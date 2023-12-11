package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class Panel_admin_Material_CrearPedido extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_materialseleccionado;
	private JTextField tf_preciounitario;
	private JTextField tf_cantidadmaterial;
	private JTextField tf_preciototal;
	private JTable table;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_Material_CrearPedido frame = new Panel_admin_Material_CrearPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane=desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_admin_Material_CrearPedido() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(190, 43, 593, 414);
		getContentPane().setLayout(null);
		
		JLabel lbl_crearpedido = new JLabel("Crear Pedido");
		lbl_crearpedido.setForeground(new Color(0, 0, 0));
		lbl_crearpedido.setBounds(23, 11, 89, 14);
		getContentPane().add(lbl_crearpedido);
		
		JLabel lbl_materialseleccionado = new JLabel("Material Selccionado");
		lbl_materialseleccionado.setForeground(new Color(0, 0, 0));
		lbl_materialseleccionado.setBounds(23, 117, 123, 14);
		getContentPane().add(lbl_materialseleccionado);
		
		tf_materialseleccionado = new JTextField();
		tf_materialseleccionado.setBounds(23, 142, 86, 20);
		getContentPane().add(tf_materialseleccionado);
		tf_materialseleccionado.setColumns(10);
		
		JLabel lbl_preciounitario = new JLabel("Precio Unitario");
		lbl_preciounitario.setForeground(new Color(0, 0, 0));
		lbl_preciounitario.setBounds(156, 36, 86, 14);
		getContentPane().add(lbl_preciounitario);
		
		tf_preciounitario = new JTextField();
		tf_preciounitario.setBounds(156, 71, 86, 20);
		getContentPane().add(tf_preciounitario);
		tf_preciounitario.setColumns(10);
		
		JLabel lbl_cantidadmaterial = new JLabel("Cantidad Material");
		lbl_cantidadmaterial.setForeground(new Color(0, 0, 0));
		lbl_cantidadmaterial.setBounds(23, 36, 111, 14);
		getContentPane().add(lbl_cantidadmaterial);
		
		JLabel lbl_preciototal = new JLabel("Precio Total");
		lbl_preciototal.setForeground(new Color(0, 0, 0));
		lbl_preciototal.setBounds(156, 118, 105, 14);
		getContentPane().add(lbl_preciototal);
		
		tf_cantidadmaterial = new JTextField();
		tf_cantidadmaterial.setColumns(10);
		tf_cantidadmaterial.setBounds(23, 71, 86, 20);
		getContentPane().add(tf_cantidadmaterial);
		
		tf_preciototal = new JTextField();
		tf_preciototal.setColumns(10);
		tf_preciototal.setBounds(156, 142, 86, 20);
		getContentPane().add(tf_preciototal);
		
		table = new JTable();
		table.setBounds(96, 250, 201, 95);
		getContentPane().add(table);
		
		JButton btn_enviarpedido = new JButton("Enviar Pedido");
		btn_enviarpedido.setBounds(357, 322, 105, 23);
		getContentPane().add(btn_enviarpedido);
		
		JButton btn_seleccionarmaterial = new JButton("Seleccionar Material");
		btn_seleccionarmaterial.setBounds(56, 184, 151, 23);
		getContentPane().add(btn_seleccionarmaterial);

	}

}
