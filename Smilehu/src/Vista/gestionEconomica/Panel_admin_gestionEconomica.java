package Vista.gestionEconomica;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Panel_admin_gestionEconomica extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane miDesktopPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionEconomica frame = new Panel_admin_gestionEconomica();
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
	public Panel_admin_gestionEconomica() {
		getContentPane().setBackground(new Color(60, 129, 170));
		setBounds(219, 44, 799, 487);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(4, 20, 36));
		panel.setBounds(190, 43, 593, 414);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 129, 170));
		panel_1.setBounds(0, 0, 179, 438);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn_realizarinformes = new JButton("Realizar Informes");
		btn_realizarinformes.setBounds(25, 205, 144, 23);
		panel_1.add(btn_realizarinformes);
		
		JButton btn_consultapaciente = new JButton("Consulta Paciente");
		btn_consultapaciente.setBounds(25, 95, 144, 23);
		panel_1.add(btn_consultapaciente);
		
		JButton btn_realizarpago = new JButton("Realizar Pago");
		btn_realizarpago.setBounds(25, 318, 144, 23);
		panel_1.add(btn_realizarpago);
		
		textField = new JTextField();
		textField.setText("SmileHub\r\n");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(205, 234, 251));
		textField.setBounds(221, 0, 277, 42);
		getContentPane().add(textField);
		btn_realizarpago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_gestionEconomica_tipoPago tipoPago=new JDialog_admin_gestionEconomica_tipoPago();
				
				tipoPago.setVisible(true);
				tipoPago.setLocation(200, 200);
				tipoPago.setModal(true);
				tipoPago.setUndecorated(true);
				dispose();
			}
		});
		btn_consultapaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionEconomica_consultarPaciente ConsultarPaciente = new Panel_admin_gestionEconomica_consultarPaciente(); 
				ConsultarPaciente.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				ConsultarPaciente.setBorder(null);
				((BasicInternalFrameUI) ConsultarPaciente.getUI()).setNorthPane(null);
				ConsultarPaciente.setLocation(0,0);
				ConsultarPaciente.show();
				ConsultarPaciente.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				miDesktopPane.add(ConsultarPaciente);
				
			}
		});
		btn_realizarinformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionEconomica_GenerarInforme generarInforme = new Panel_admin_gestionEconomica_GenerarInforme(); 
				generarInforme.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(generarInforme);
				generarInforme.setBorder(null);
				((BasicInternalFrameUI) generarInforme.getUI()).setNorthPane(null);
				generarInforme.setLocation(0,0);
				generarInforme.show();
				generarInforme.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				
				
				
				
				
			}
		});

	}
}