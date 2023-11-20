package Vista.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import Boton_Personalizado.Boton_personalizado;

public class JDialog_Admin_id_Doctores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_smilehub;
	private JTextField tf_volver;
	private JTextField tf_nombreid;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_Admin_id_Doctores dialog = new JDialog_Admin_id_Doctores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;}
	/**
	 * Create the dialog.
	 */
	public JDialog_Admin_id_Doctores() {
		setBounds(100, 100, 695, 459);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(4, 20, 36));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			tf_smilehub = new JTextField();
			tf_smilehub.setHorizontalAlignment(SwingConstants.CENTER);
			tf_smilehub.setText("Smile Hub");
			tf_smilehub.setFont(new Font("Tahoma", Font.BOLD, 16));
			tf_smilehub.setBackground(new Color(176, 255, 250));
			tf_smilehub.setBounds(106, 11, 464, 31);
			contentPanel.add(tf_smilehub);
			tf_smilehub.setColumns(10);
		}
		{
			tf_volver = new JTextField();
			tf_volver.setForeground(new Color(255, 255, 255));
			tf_volver.setText("Volver");
			tf_volver.setBackground(new Color(42, 61, 80));
			tf_volver.setBounds(10, 18, 86, 20);
			contentPanel.add(tf_volver);
			tf_volver.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(42, 61, 80));
			panel.setBounds(32, 71, 611, 303);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Insertar nombre o id");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setBounds(234, 29, 134, 14);
				panel.add(lblNewLabel);
			}
			
			
			
			
			
			
			JRadioButton rdbtn_nombre = new JRadioButton("Nombre");
			rdbtn_nombre.setBounds(173, 61, 89, 23);
			panel.add(rdbtn_nombre);
			
			JRadioButton rdbtn_id = new JRadioButton("ID");
			rdbtn_id.setBounds(316, 61, 89, 23);
			panel.add(rdbtn_id);
			
			ButtonGroup g1 = new ButtonGroup();
			g1.add(rdbtn_nombre);
			g1.add(rdbtn_id);
			
			
			
			
			
			
			
			
			
			tf_nombreid = new JTextField();
			tf_nombreid.setBounds(225, 132, 143, 20);
			panel.add(tf_nombreid);
			tf_nombreid.setColumns(10);
			
			JButton btn_buscar = new JButton("Buscar");
			btn_buscar.setBounds(251, 180, 89, 23);
			panel.add(btn_buscar);
			
			JLabel lblNewLabel_1 = new JLabel("Una vez haya escogido, escriba el nombre/id");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(188, 107, 240, 14);
			panel.add(lblNewLabel_1);
		}
	}
}
