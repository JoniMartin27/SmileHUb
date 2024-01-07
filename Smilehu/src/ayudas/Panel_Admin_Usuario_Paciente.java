package ayudas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Usuario.Panel_admin_usuario_paciente_consultarCita;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Admin_Usuario_Paciente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btn_verperfil;
	private JDesktopPane miDesktopPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Panel_Admin_Usuario_Paciente frame = new Panel_Admin_Usuario_Paciente();
			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane_1 = desktopPane;
	}
	/**
	 * Create the dialog.
	 */
	public Panel_Admin_Usuario_Paciente() {

	
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(42, 61, 80));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JDesktopPane desktopPane2 = new JDesktopPane();
		desktopPane2.setBackground(new Color(4, 20, 36));
		desktopPane2.setBounds(212, 0, 571, 457);
		contentPanel.add(desktopPane2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 120, 170));
		panel.setBounds(0, 0, 213, 457);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btn_gestionarcitas = new JButton("Gestionar Citas");
		btn_gestionarcitas.setBounds(27, 75, 149, 23);
		panel.add(btn_gestionarcitas);
		
		JButton btn_generarinforme = new JButton("Generar Informe");
		btn_generarinforme.setBounds(27, 164, 149, 23);
		panel.add(btn_generarinforme);
		
		btn_verperfil = new JButton("Ver Perfil");
		btn_verperfil.setBounds(27, 261, 149, 23);
		panel.add(btn_verperfil);
		
		JButton btn_crearperfil = new JButton("Crear Perfil");
		btn_crearperfil.setBounds(27, 359, 149, 23);
		panel.add(btn_crearperfil);
		btn_crearperfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btn_verperfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		btn_gestionarcitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_usuario_paciente_consultarCita consultarCita=new Panel_admin_usuario_paciente_consultarCita(); 
				consultarCita.setDesktopPane(desktopPane2); // Asigna la referencia del DesktopPane
				desktopPane2.removeAll();
				desktopPane2.add(consultarCita);
				((BasicInternalFrameUI) consultarCita.getUI()).setNorthPane(null);
				consultarCita.setLocation(0,0);
				consultarCita.setVisible(true);
				consultarCita.setSize(desktopPane2.getWidth(), desktopPane2.getWidth());
		
			}
		});
		
		
	}
}