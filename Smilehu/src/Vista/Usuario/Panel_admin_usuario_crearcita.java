package Vista.Usuario;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Panel_admin_usuario_crearcita extends JInternalFrame {

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
					Panel_admin_usuario_crearcita frame = new Panel_admin_usuario_crearcita();
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
	public Panel_admin_usuario_crearcita() {
		getContentPane().setBackground(new Color(159, 862, 531));
		setBounds(100, 100, 862, 531);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 862, 531);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(Color.BLACK);
		lbl_nombrepaciente.setBounds(58, 86, 105, 14);
		panel.add(lbl_nombrepaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(Color.BLACK);
		lbl_tratamiento.setBounds(58, 122, 105, 14);
		panel.add(lbl_tratamiento);
		
		JLabel lbl_fecha = new JLabel("Fecha");
		lbl_fecha.setForeground(Color.BLACK);
		lbl_fecha.setBounds(58, 153, 46, 14);
		panel.add(lbl_fecha);
		
		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(Color.BLACK);
		lbl_hora.setBounds(58, 186, 46, 14);
		panel.add(lbl_hora);
		
		JLabel bll_especialista = new JLabel("Especialista");
		bll_especialista.setForeground(Color.BLACK);
		bll_especialista.setBounds(58, 217, 105, 14);
		panel.add(bll_especialista);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(195, 214, 105, 20);
		panel.add(textField);
		
		JButton btn_crearcita = new JButton("Crear Cita");
		btn_crearcita.setBounds(294, 323, 128, 23);
		panel.add(btn_crearcita);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 183, 105, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 150, 105, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 119, 105, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 83, 105, 20);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(425, 83, 338, 166);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_admin_usuario_crearcita.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 862, 531);
		panel.add(lblNewLabel);

	}
}