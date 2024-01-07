package Vista.gestionEconomica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;

public class Panel_admin_gestionEconomica_consultarPaciente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionEconomica_consultarPaciente frame = new Panel_admin_gestionEconomica_consultarPaciente();
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
	public Panel_admin_gestionEconomica_consultarPaciente() {
		setBounds(190, 43, 593, 414);
		getContentPane().setBackground(new Color(4, 20, 36));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 783, 457);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(48, 159, 364, 125);
		panel.add(table);
		
		JButton btn_BuscarPaciente = new JButton("Buscar Paciente");
		btn_BuscarPaciente.setBounds(48, 113, 161, 23);
		panel.add(btn_BuscarPaciente);
		
		textField = new JTextField();
		textField.setBounds(251, 113, 161, 23);
		panel.add(textField);
		textField.setColumns(10);
		
	}
}
