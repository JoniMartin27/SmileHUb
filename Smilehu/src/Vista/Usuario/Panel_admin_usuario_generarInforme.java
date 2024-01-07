package Vista.Usuario;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Panel_admin_usuario_generarInforme extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane miDesktopPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_usuario_generarInforme frame = new Panel_admin_usuario_generarInforme();
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
	public Panel_admin_usuario_generarInforme() {
		getContentPane().setForeground(new Color(159, 232, 223));

		setBounds(100, 100, 862, 531);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 862, 531);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(Color.BLACK);
		lbl_nombrepaciente.setBounds(42, 86, 105, 14);
		panel.add(lbl_nombrepaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(Color.BLACK);
		lbl_tratamiento.setBounds(42, 122, 105, 14);
		panel.add(lbl_tratamiento);
		
		JLabel lbl_fecha = new JLabel("Fecha");
		lbl_fecha.setForeground(Color.BLACK);
		lbl_fecha.setBounds(42, 153, 46, 14);
		panel.add(lbl_fecha);
		
		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(Color.BLACK);
		lbl_hora.setBounds(42, 186, 46, 14);
		panel.add(lbl_hora);
		
		JLabel bll_especialista = new JLabel("Especialista");
		bll_especialista.setForeground(Color.BLACK);
		bll_especialista.setBounds(42, 217, 105, 14);
		panel.add(bll_especialista);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(179, 214, 105, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 183, 105, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(179, 150, 105, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(179, 119, 105, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(179, 83, 105, 20);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(409, 83, 338, 166);
		panel.add(panel_1);
		
		JButton btn_crearcita = new JButton("Crear Cita");
		btn_crearcita.setBounds(278, 323, 128, 23);
		panel.add(btn_crearcita);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Panel_admin_usuario_generarInforme.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(-16, 0, 862, 531);
		panel.add(lblNewLabel);

	}

}