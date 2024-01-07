package Vista.Usuario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.ConexionMySQL;
import Modelo.Paciente;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

public class Panel_admin_usuario_crearcita extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
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

	/**
	 * Create the frame.
	 */
	public void setDesktopPane(JDesktopPane desktopPane) {
		this.miDesktopPane = desktopPane;
	}
	public Panel_admin_usuario_crearcita() {
		
		
		getContentPane().setForeground(new Color(159, 232, 223));
		setBounds(100, 100, 862, 531);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 846, 501);
		getContentPane().add(panel);
		
		setBounds(100, 100, 862, 531);

		
		JTextField tf_nombrePaciente = new JTextField();
		tf_nombrePaciente.setColumns(10);
		tf_nombrePaciente.setBounds(284, 11, 176, 20);
		
		
		JLabel icon = new JLabel("New label");
		icon.setIcon(new ImageIcon(Panel_admin_usuario_crearcita.class.getResource("/img/fondoDientes.jpg")));
		icon.setBounds(0, 0, 912, 531);

		JComboBox cB_especialista = new JComboBox<>();
		cB_especialista.setBounds(284, 254, 176, 23);
		panel.setLayout(null);
		
		JComboBox<String> cB_nombrePaciente = new JComboBox<>();
		cB_nombrePaciente.setBounds(201, 69, 176, 23);
		panel.add(cB_nombrePaciente);
		
		JButton btn_BuscarPaciente = new JButton("Buscar");
		btn_BuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cB_nombrePaciente.removeAllItems();
				cargarPacientesAlComboBox(tf_nombrePaciente.getText(), cB_nombrePaciente);
				
	
			}
		});
		
		JComboBox cb_especialista = new JComboBox<>();
		cb_especialista.setBounds(201, 282, 176, 23);
		panel.add(cb_especialista);
		btn_BuscarPaciente.setBounds(406, 37, 109, 23);
		panel.add(btn_BuscarPaciente);
		
	
		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(Color.BLACK);
		lbl_hora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_hora.setBounds(528, 139, 46, 14);
		panel.add(lbl_hora);
		
		JLabel bll_especialista = new JLabel("Especialista");
		bll_especialista.setForeground(Color.BLACK);
		bll_especialista.setFont(new Font("Dialog", Font.BOLD, 12));
		bll_especialista.setBackground(Color.BLACK);
		bll_especialista.setBounds(64, 285, 105, 14);
		panel.add(bll_especialista);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(201, 38, 176, 20);
		panel.add(textField);
		
		JButton btn_crearcita_1 = new JButton("Crear Cita");
		btn_crearcita_1.setBounds(249, 440, 128, 23);
		panel.add(btn_crearcita_1);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(Color.BLACK);
		lbl_tratamiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_tratamiento.setBounds(64, 169, 105, 14);
		panel.add(lbl_tratamiento);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(Color.BLACK);
		lbl_nombrepaciente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_nombrepaciente.setBounds(64, 41, 105, 14);
		panel.add(lbl_nombrepaciente);
		
		JLabel lbl_fecha_1 = new JLabel("Fecha");
		lbl_fecha_1.setForeground(Color.BLACK);
		lbl_fecha_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_fecha_1.setBounds(640, 139, 46, 14);
		panel.add(lbl_fecha_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(435, 173, 304, 174);
		panel.add(panel_1);
		
		JComboBox cb_Tratamiento = new JComboBox<>();
		cb_Tratamiento.setBounds(201, 165, 176, 23);
		panel.add(cb_Tratamiento);
		
		
		JLabel lbl_fecha = new JLabel("Fecha");
		lbl_fecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_fecha.setForeground(Color.BLACK);
		lbl_fecha.setBounds(413, -137, 29, 14);
		panel.add(lbl_fecha);
		panel.add(icon);
	}
	private void cargarPacientesAlComboBox(String nombre, JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Paciente> pacientes = ConexionMySQL.buscarPacientes(nombre);

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Paciente paciente : pacientes) {
				String nombreCompleto = paciente.getNombre() + " " + paciente.getApellidos();
				comboBox.addItem(nombreCompleto);
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar pacientes", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}


