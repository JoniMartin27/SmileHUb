package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Admin_Material_ModificarPedido extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_cantidadmaterial;
	private JTextField tf_preciounitario;
	private JTextField tf_materialseleccionado;
	private JTextField tf_preciototal;
	private JTable table;
	private JTextField tf_nombrepedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_ModificarPedido frame = new Panel_Admin_Material_ModificarPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JDesktopPane miDesktopPane;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_Admin_Material_ModificarPedido() {
		setBounds(190, 43, 593, 414);
		getContentPane().setBackground(new Color(159, 232, 223));
		getContentPane().setLayout(null);
		
		JLabel lbl_preciototal = new JLabel("Precio Total");
		lbl_preciototal.setForeground(new Color(0, 0, 0));
		lbl_preciototal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_preciototal.setBounds(181, 106, 174, 14);
		getContentPane().add(lbl_preciototal);
		
		JLabel lbl_crearpedido_1 = new JLabel("Modificar Pedido");
		lbl_crearpedido_1.setForeground(new Color(0, 0, 0));
		lbl_crearpedido_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_crearpedido_1.setBounds(25, 11, 136, 14);
		getContentPane().add(lbl_crearpedido_1);
		
		JLabel lbl_cantidadmaterial = new JLabel("Cantidad Material");
		lbl_cantidadmaterial.setForeground(new Color(0, 0, 0));
		lbl_cantidadmaterial.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_cantidadmaterial.setBounds(25, 36, 186, 14);
		getContentPane().add(lbl_cantidadmaterial);
		
		JLabel lbl_preciounitario = new JLabel("Precio Unitario");
		lbl_preciounitario.setForeground(new Color(0, 0, 0));
		lbl_preciounitario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_preciounitario.setBounds(181, 36, 174, 14);
		getContentPane().add(lbl_preciounitario);
		
		JLabel lbl_materialseleccionado = new JLabel("Material Seleccionado");
		lbl_materialseleccionado.setForeground(new Color(0, 0, 0));
		lbl_materialseleccionado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_materialseleccionado.setBounds(25, 106, 186, 14);
		getContentPane().add(lbl_materialseleccionado);
		
		tf_cantidadmaterial = new JTextField();
		tf_cantidadmaterial.setBounds(25, 56, 101, 23);
		getContentPane().add(tf_cantidadmaterial);
		tf_cantidadmaterial.setColumns(10);
		
		tf_preciounitario = new JTextField();
		tf_preciounitario.setBounds(181, 56, 101, 23);
		getContentPane().add(tf_preciounitario);
		tf_preciounitario.setColumns(10);
		
		tf_materialseleccionado = new JTextField();
		tf_materialseleccionado.setBounds(25, 133, 101, 23);
		getContentPane().add(tf_materialseleccionado);
		tf_materialseleccionado.setColumns(10);
		
		tf_preciototal = new JTextField();
		tf_preciototal.setBounds(181, 131, 101, 23);
		getContentPane().add(tf_preciototal);
		tf_preciototal.setColumns(10);
		
		JButton btn_buscarmaterial = new JButton("Buscar Material");
		btn_buscarmaterial.setBounds(10, 209, 127, 23);
		getContentPane().add(btn_buscarmaterial);
		
		table = new JTable();
		table.setBounds(26, 243, 312, 81);
		getContentPane().add(table);
		
		JButton btn_modificarpedido = new JButton("Modificar Pedido");
		btn_modificarpedido.setBounds(75, 335, 165, 23);
		getContentPane().add(btn_modificarpedido);
		
		tf_nombrepedido = new JTextField();
		tf_nombrepedido.setText("Ponga aquí el nombre del pedido");
		tf_nombrepedido.setBounds(147, 209, 174, 23);
		getContentPane().add(tf_nombrepedido);
		tf_nombrepedido.setColumns(10);
		

	}
}
