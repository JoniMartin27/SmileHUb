package Vista.Material;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JDialog_Admin_Baja_Proveedor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nombreproveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_Admin_Baja_Proveedor dialog = new JDialog_Admin_Baja_Proveedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_Admin_Baja_Proveedor() {
		setBounds(100, 100, 287, 221);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_nombreproveedor = new JLabel("Nombre Proveedor");
			lbl_nombreproveedor.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_nombreproveedor.setForeground(new Color(0, 0, 0));
			lbl_nombreproveedor.setBounds(70, 37, 120, 14);
			contentPanel.add(lbl_nombreproveedor);
		}
		{
			tf_nombreproveedor = new JTextField();
			tf_nombreproveedor.setBounds(52, 62, 163, 20);
			contentPanel.add(tf_nombreproveedor);
			tf_nombreproveedor.setColumns(10);
		}
		{
			JButton btn_dardebajaproveedor = new JButton("Dar de baja Proveedor");
			btn_dardebajaproveedor.setBounds(52, 104, 163, 23);
			contentPanel.add(btn_dardebajaproveedor);
		}
	}

}
