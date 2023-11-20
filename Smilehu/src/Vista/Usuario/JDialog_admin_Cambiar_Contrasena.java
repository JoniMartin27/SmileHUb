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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialog_admin_Cambiar_Contrasena extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_nombredoctor;
	private JTextField tf_contraseña;
	private JTextField tf_confirmarcontraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_Cambiar_Contrasena dialog = new JDialog_admin_Cambiar_Contrasena();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JDialog_admin_Cambiar_Contrasena(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;}
	/**
	 * Create the dialog.
	 */
	public JDialog_admin_Cambiar_Contrasena() {
		setBounds(100, 100, 510, 233);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_Doctores = new JLabel("Doctores");
			lbl_Doctores.setForeground(new Color(0, 0, 0));
			lbl_Doctores.setBounds(196, 11, 139, 14);
			contentPanel.add(lbl_Doctores);
		}
		{
			tf_nombredoctor = new JTextField();
			tf_nombredoctor.setBounds(279, 36, 107, 20);
			contentPanel.add(tf_nombredoctor);
			tf_nombredoctor.setColumns(10);
		}
		{
			JButton btn_cambiarcontraseña = new JButton("Cambiar Contraseña");
			btn_cambiarcontraseña.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn_cambiarcontraseña.setBounds(149, 129, 157, 23);
			contentPanel.add(btn_cambiarcontraseña);
		}
		{
			tf_contraseña = new JTextField();
			tf_contraseña.setColumns(10);
			tf_contraseña.setBounds(279, 67, 107, 20);
			contentPanel.add(tf_contraseña);
		}
		{
			tf_confirmarcontraseña = new JTextField();
			tf_confirmarcontraseña.setColumns(10);
			tf_confirmarcontraseña.setBounds(279, 98, 107, 20);
			contentPanel.add(tf_confirmarcontraseña);
		}
		{
			JLabel lbl_nombredoctor = new JLabel("Nombre Doctor");
			lbl_nombredoctor.setForeground(new Color(0, 0, 0));
			lbl_nombredoctor.setBounds(111, 39, 107, 14);
			contentPanel.add(lbl_nombredoctor);
		}
		{
			JLabel lbl_contraseña = new JLabel("Contraseña");
			lbl_contraseña.setForeground(new Color(0, 0, 0));
			lbl_contraseña.setBounds(111, 70, 94, 14);
			contentPanel.add(lbl_contraseña);
		}
		{
			JLabel lbl_confirmarcontraseña = new JLabel("Confirmar Contraseña");
			lbl_confirmarcontraseña.setForeground(new Color(0, 0, 0));
			lbl_confirmarcontraseña.setBounds(111, 101, 145, 14);
			contentPanel.add(lbl_confirmarcontraseña);
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
