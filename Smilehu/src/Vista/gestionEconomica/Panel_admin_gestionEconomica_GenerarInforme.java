package Vista.gestionEconomica;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

public class Panel_admin_gestionEconomica_GenerarInforme extends JInternalFrame {

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
					Panel_admin_gestionEconomica_GenerarInforme frame = new Panel_admin_gestionEconomica_GenerarInforme();
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
	public Panel_admin_gestionEconomica_GenerarInforme() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(190, 43, 593, 414);
		getContentPane().setLayout(null);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(new Color(0, 0, 0));
		lbl_nombrepaciente.setBounds(22, 30, 105, 14);
		getContentPane().add(lbl_nombrepaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(new Color(0, 0, 0));
		lbl_tratamiento.setBounds(22, 55, 105, 14);
		getContentPane().add(lbl_tratamiento);
		
		JLabel lbl_fecha = new JLabel("Fecha");
		lbl_fecha.setForeground(new Color(0, 0, 0));
		lbl_fecha.setBounds(22, 80, 46, 14);
		getContentPane().add(lbl_fecha);
		
		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(new Color(0, 0, 0));
		lbl_hora.setBounds(22, 105, 46, 14);
		getContentPane().add(lbl_hora);
		
		JLabel bll_especialista = new JLabel("Especialista");
		bll_especialista.setForeground(new Color(0, 0, 0));
		bll_especialista.setBounds(22, 130, 105, 14);
		getContentPane().add(bll_especialista);
		
		tf_nomberpaciente = new JTextField();
		tf_nomberpaciente.setBounds(160, 27, 86, 20);
		getContentPane().add(tf_nomberpaciente);
		tf_nomberpaciente.setColumns(10);
		
		tf_tratamiento = new JTextField();
		tf_tratamiento.setColumns(10);
		tf_tratamiento.setBounds(160, 52, 86, 20);
		getContentPane().add(tf_tratamiento);
		
		tf_fecha = new JTextField();
		tf_fecha.setColumns(10);
		tf_fecha.setBounds(160, 77, 86, 20);
		getContentPane().add(tf_fecha);
		
		tf_hora = new JTextField();
		tf_hora.setColumns(10);
		tf_hora.setBounds(160, 102, 86, 20);
		getContentPane().add(tf_hora);
		
		tf_especialista = new JTextField();
		tf_especialista.setColumns(10);
		tf_especialista.setBounds(160, 127, 86, 20);
		getContentPane().add(tf_especialista);
		
		JButton btn_modificarcita = new JButton("Modificar Cita");
		btn_modificarcita.setBounds(69, 176, 128, 23);
		getContentPane().add(btn_modificarcita);
		
		JPanel panel = new JPanel();
		panel.setBounds(336, 16, 167, 131);
		getContentPane().add(panel);

	}

}