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

public class JDialog_Admin_Material_Baja extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nombrematerial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_Admin_Material_Baja dialog = new JDialog_Admin_Material_Baja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_Admin_Material_Baja() {
		setBounds(100, 100, 269, 197);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel btn_nombrematerial = new JLabel("Nombre Material");
			btn_nombrematerial.setForeground(new Color(0, 0, 0));
			btn_nombrematerial.setBounds(79, 32, 103, 14);
			contentPanel.add(btn_nombrematerial);
		}
		{
			tf_nombrematerial = new JTextField();
			tf_nombrematerial.setBounds(44, 57, 154, 20);
			contentPanel.add(tf_nombrematerial);
			tf_nombrematerial.setColumns(10);
		}
		{
			JButton btn_dardebajamaterial = new JButton("Dar de baja Material");
			btn_dardebajamaterial.setBounds(44, 88, 154, 23);
			contentPanel.add(btn_dardebajamaterial);
		}
	}

}
