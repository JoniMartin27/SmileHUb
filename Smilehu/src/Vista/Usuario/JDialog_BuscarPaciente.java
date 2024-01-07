package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class JDialog_BuscarPaciente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_BuscarPaciente dialog = new JDialog_BuscarPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_BuscarPaciente() {
		setResizable(false);
		setModal(true);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 490, 336);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 474, 297);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(85, 89, 86, 22);
			panel.add(comboBox);
			{
				JButton btn_buscar = new JButton("Buscar nombre");
				btn_buscar.setBounds(196, 44, 141, 23);
				panel.add(btn_buscar);
			}
			{
				tf_nombre = new JTextField();
				tf_nombre.setBounds(85, 45, 86, 20);
				panel.add(tf_nombre);
				tf_nombre.setColumns(10);
			}
			{
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon(JDialog_BuscarPaciente.class.getResource("/img/fondoDientes.jpg")));
				lblNewLabel.setBounds(0, 0, 474, 297);
				panel.add(lblNewLabel);
			}
		}
	}
}
