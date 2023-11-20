package Vista.Usuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialog_Admin_Usuario_inicio extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtSmileHub;
	private JTextField txtVolver;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;}
	public void agregarInternalFrame(JInternalFrame internalFrame) {
        miDesktopPane.add(internalFrame);
        internalFrame.setVisible(true);
        internalFrame.setLocation(0, 0);
        ((BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
    }
	/**
	 * Create the dialog.
	 */
	public JDialog_Admin_Usuario_inicio(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.miDesktopPane = desktopPane;
		setBounds(100, 100, 708, 420);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(4, 20, 36));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtSmileHub = new JTextField();
			txtSmileHub.setHorizontalAlignment(SwingConstants.CENTER);
			txtSmileHub.setFont(new Font("Tahoma", Font.BOLD, 16));
			txtSmileHub.setBounds(160, 10, 379, 31);
			txtSmileHub.setText("SMILE HUB");
			txtSmileHub.setBackground(new Color(176, 255, 250));
			contentPanel.add(txtSmileHub);
			txtSmileHub.setColumns(10);
		}
		{
			txtVolver = new JTextField();
			txtVolver.setText("VOLVER");
			txtVolver.setBackground(new Color(176, 255, 250));
			txtVolver.setBounds(21, 17, 86, 20);
			contentPanel.add(txtVolver);
			txtVolver.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(42, 61, 80));
			panel.setBounds(87, 81, 517, 176);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lbl_elegirusuario = new JLabel("Elegir tipo de usuario");
				lbl_elegirusuario.setForeground(new Color(255, 255, 255));
				lbl_elegirusuario.setBounds(212, 86, 113, 14);
				panel.add(lbl_elegirusuario);
			}
			{
				JButton btn_pacientes = new JButton("Pacientes");
				btn_pacientes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JDialog_Admin_Usuario_inicio usuario_paciente = new JDialog_Admin_Usuario_inicio(parentFrame, desktopPane);
						
						
						
						dispose();
					}
				});
				btn_pacientes.setBounds(31, 31, 108, 23);
				panel.add(btn_pacientes);
			}
			{
				JButton btn_doctores = new JButton("Doctores");
				btn_doctores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Panel_Admin_Usuario_Doctor usuario_doctor =new Panel_Admin_Usuario_Doctor();
						agregarInternalFrame(usuario_doctor);
						dispose();
						
				
						
						
						
					}
				});
				btn_doctores.setBounds(31, 82, 108, 23);
				panel.add(btn_doctores);
			}
			{
				JButton btn_proveedores = new JButton("Proveedores");
				btn_proveedores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Panel_Admin_Usuario_Proveedores usuario_proveedor = new Panel_Admin_Usuario_Proveedores();
						agregarInternalFrame(usuario_proveedor);
						dispose();
					}
				});
				btn_proveedores.setBounds(31, 129, 108, 23);
				panel.add(btn_proveedores);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(4, 20, 36));
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
