package Vista.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JDialog_Pacientes_Insertar_Id_Nombre extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_insertar;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_Pacientes_Insertar_Id_Nombre dialog = new JDialog_Pacientes_Insertar_Id_Nombre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	public JDialog_Pacientes_Insertar_Id_Nombre(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;}
	/**
	 * Create the dialog.
	 */
	public JDialog_Pacientes_Insertar_Id_Nombre() {
		setBounds(100, 100, 463, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_idnombre = new JLabel("Insertar ID/Nombre");
			lbl_idnombre.setForeground(new Color(0, 0, 0));
			lbl_idnombre.setBounds(168, 11, 103, 14);
			contentPanel.add(lbl_idnombre);
		}
		{
			tf_insertar = new JTextField();
			tf_insertar.setBounds(168, 36, 103, 20);
			contentPanel.add(tf_insertar);
			tf_insertar.setColumns(10);
		}
		{
			JButton btn_buscar = new JButton("Buscar");
			btn_buscar.setBounds(168, 67, 103, 23);
			contentPanel.add(btn_buscar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(159, 232, 223));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
