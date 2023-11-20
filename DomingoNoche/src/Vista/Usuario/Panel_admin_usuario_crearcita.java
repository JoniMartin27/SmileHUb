package Vista.Usuario;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

public class Panel_admin_usuario_crearcita extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_nomberpaciente;
	private JTextField tf_tratamiento;
	private JTextField tf_fecha;
	private JTextField tf_hora;
	private JTextField tf_especialista;
	private JDesktopPane miDesktopPane;

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
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 550, 353);
		getContentPane().setLayout(null);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(new Color(0, 0, 0));
		lbl_nombrepaciente.setBounds(44, 52, 105, 14);
		getContentPane().add(lbl_nombrepaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(new Color(0, 0, 0));
		lbl_tratamiento.setBounds(44, 77, 105, 14);
		getContentPane().add(lbl_tratamiento);
		
		JLabel lbl_fecha = new JLabel("Fecha");
		lbl_fecha.setForeground(new Color(0, 0, 0));
		lbl_fecha.setBounds(44, 102, 46, 14);
		getContentPane().add(lbl_fecha);
		
		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(new Color(0, 0, 0));
		lbl_hora.setBounds(44, 127, 46, 14);
		getContentPane().add(lbl_hora);
		
		JLabel bll_especialista = new JLabel("Especialista");
		bll_especialista.setForeground(new Color(0, 0, 0));
		bll_especialista.setBounds(44, 152, 105, 14);
		getContentPane().add(bll_especialista);
		
		tf_nomberpaciente = new JTextField();
		tf_nomberpaciente.setBounds(181, 49, 105, 20);
		getContentPane().add(tf_nomberpaciente);
		tf_nomberpaciente.setColumns(10);
		
		tf_tratamiento = new JTextField();
		tf_tratamiento.setColumns(10);
		tf_tratamiento.setBounds(181, 74, 105, 20);
		getContentPane().add(tf_tratamiento);
		
		tf_fecha = new JTextField();
		tf_fecha.setColumns(10);
		tf_fecha.setBounds(181, 99, 105, 20);
		getContentPane().add(tf_fecha);
		
		tf_hora = new JTextField();
		tf_hora.setColumns(10);
		tf_hora.setBounds(181, 124, 105, 20);
		getContentPane().add(tf_hora);
		
		tf_especialista = new JTextField();
		tf_especialista.setColumns(10);
		tf_especialista.setBounds(181, 149, 105, 20);
		getContentPane().add(tf_especialista);
		
		JButton btn_crearcita = new JButton("Crear Cita");
		btn_crearcita.setBounds(89, 192, 128, 23);
		getContentPane().add(btn_crearcita);
		
		JPanel panel = new JPanel();
		panel.setBounds(325, 49, 184, 120);
		getContentPane().add(panel);

	}

}