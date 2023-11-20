package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Panel_Admin_Material_consultarPedido extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField txtIdpedido;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_consultarPedido frame = new Panel_Admin_Material_consultarPedido();
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
	public Panel_Admin_Material_consultarPedido() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 451, 253);
		getContentPane().setLayout(null);
		
		JButton btn_consultarpedido = new JButton("Consultar Pedido");
		btn_consultarpedido.setBounds(182, 11, 132, 23);
		getContentPane().add(btn_consultarpedido);
		
		table = new JTable();
		table.setBounds(40, 45, 310, 133);
		getContentPane().add(table);
		
		txtIdpedido = new JTextField();
		txtIdpedido.setText("ID/pedido");
		txtIdpedido.setBounds(57, 11, 115, 22);
		getContentPane().add(txtIdpedido);
		txtIdpedido.setColumns(10);

	}
}