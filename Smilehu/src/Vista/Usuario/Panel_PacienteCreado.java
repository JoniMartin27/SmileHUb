package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controlador.ConexionMySQL;
import Modelo.Paciente;

public class Panel_PacienteCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_direccion;
	private JTextField tf_apellidos;
	private JTextField tf_genero;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_buscaPaciente;
	private JPanel contentPane;

	private JTextField tf_telefono;
	private JTextField tf_fechaAlta;
	private JTextField tf_fechaNacimiento;
	private JTextField tf_nombre;
	private JDesktopPane miDesktopPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_PacienteCreado frame = new Panel_PacienteCreado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane_1 = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Panel_PacienteCreado() {
		setBounds(100, 100, 722, 527);

		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btn_consultarpagos = new JButton("Consultar Pagos");
		btn_consultarpagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_consultarpagos.setBounds(99, 320, 173, 23);
		contentPanel.add(btn_consultarpagos);

		JButton btn_odontograma = new JButton("Odontograma");
		btn_odontograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_odontograma.setBounds(99, 342, 173, 23);
		contentPanel.add(btn_odontograma);

		/* DNI */
		JLabel lbl_dni = new JLabel("Nombre");
		lbl_dni.setBounds(99, 113, 46, 14);
		lbl_dni.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_dni.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_dni);

		/* Nombre */
		JLabel lbl_nombre = new JLabel("Apellidos");
		lbl_nombre.setBounds(99, 138, 48, 14);
		lbl_nombre.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_nombre);

		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(165, 136, 126, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);

		/* Apellidos */
		JLabel lbl_apellidos = new JLabel("direccion");
		lbl_apellidos.setBounds(99, 163, 48, 14);
		lbl_apellidos.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_apellidos);

		tf_direccion = new JTextField();
		tf_direccion.setBounds(165, 161, 126, 20);
		contentPanel.add(tf_direccion);
		tf_direccion.setColumns(10);

		/* Fecha de nacimiento */
		JLabel lbl_fechanacimiento = new JLabel("genero");
		lbl_fechanacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_fechanacimiento.setBounds(99, 188, 51, 14);
		lbl_fechanacimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_fechanacimiento.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_fechanacimiento);

		tf_genero = new JTextField();
		tf_genero.setBounds(165, 186, 126, 20);
		contentPanel.add(tf_genero);
		tf_genero.setColumns(10);

		/* Botones Sexo */
		JLabel lbl_sexo = new JLabel("telefono");
		lbl_sexo.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_sexo.setBounds(99, 213, 48, 14);
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_sexo);

		ButtonGroup g1 = new ButtonGroup();

		/* Botones Alta/Baja */
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja:");
		lbl_altabaja.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_altabaja.setBounds(99, 256, 173, 14);
		lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		contentPanel.add(lbl_altabaja);

		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(306, 254, 68, 23);
		contentPanel.add(rdbtn_alta);

		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(406, 254, 68, 23);
		contentPanel.add(rdbtn_baja);

		ButtonGroup g2 = new ButtonGroup();
		g1.add(rdbtn_baja);
		g1.add(rdbtn_alta);

		JButton btn_BuscarPaciente = new JButton("Buscar");
		btn_BuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConexionMySQL.conectar();

					int ids = Integer.parseInt(tf_buscaPaciente.getText());

					Paciente paciente = ConexionMySQL.consultaPaciente(ids);
					tf_nombre.setText(paciente.getNombre());
					tf_apellidos.setText(paciente.getApellidos());
					tf_genero.setText(paciente.getGenero());
					tf_telefono.setText(paciente.getTelefono());
					tf_direccion.setText(paciente.getDireccion());
					tf_fechaAlta.setText(paciente.getFechaDeAlta());
					tf_fechaNacimiento.setText(paciente.getFechaNacimiento());

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_BuscarPaciente.setBounds(481, 52, 109, 23);
		contentPanel.add(btn_BuscarPaciente);

		JLabel lbl_buscar = new JLabel("Buscar paciente:");
		lbl_buscar.setForeground(new Color(0, 0, 0));
		lbl_buscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_buscar.setBounds(178, 56, 126, 14);
		contentPanel.add(lbl_buscar);

		tf_buscaPaciente = new JTextField();
		tf_buscaPaciente.setColumns(10);
		tf_buscaPaciente.setBounds(302, 53, 126, 20);
		contentPanel.add(tf_buscaPaciente);

		tf_telefono = new JTextField();
		tf_telefono.setColumns(10);
		tf_telefono.setBounds(165, 209, 126, 20);
		contentPanel.add(tf_telefono);

		JLabel lbl_nombre_1 = new JLabel("fecha nacimiento");
		lbl_nombre_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_1.setForeground(Color.BLACK);
		lbl_nombre_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre_1.setBounds(302, 136, 92, 14);
		contentPanel.add(lbl_nombre_1);

		JLabel lbl_dni_1 = new JLabel("fecha alta");
		lbl_dni_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni_1.setForeground(Color.BLACK);
		lbl_dni_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_dni_1.setBounds(302, 111, 91, 14);
		contentPanel.add(lbl_dni_1);

		tf_fechaAlta = new JTextField();
		tf_fechaAlta.setEditable(false);
		tf_fechaAlta.setColumns(10);
		tf_fechaAlta.setBounds(397, 109, 126, 20);
		contentPanel.add(tf_fechaAlta);

		tf_fechaNacimiento = new JTextField();
		tf_fechaNacimiento.setEditable(false);
		tf_fechaNacimiento.setColumns(10);
		tf_fechaNacimiento.setBounds(397, 134, 126, 20);
		contentPanel.add(tf_fechaNacimiento);

		tf_nombre = new JTextField();
		tf_nombre.setColumns(10);
		tf_nombre.setBounds(165, 110, 126, 20);
		contentPanel.add(tf_nombre);

		JButton btn_modificar = new JButton("Modificar Paciente");
		btn_modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int ids = Integer.parseInt(tf_buscaPaciente.getText());

				Paciente paciente = new Paciente(ids, tf_nombre.getText(), tf_apellidos.getText(),
						tf_direccion.getText(), tf_genero.getText(), tf_telefono.getText(), tf_fechaAlta.getText(),
						tf_fechaNacimiento.getText());

				try {
					ConexionMySQL.modificarPaciente(paciente);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btn_modificar.setBounds(99, 366, 173, 23);
		contentPanel.add(btn_modificar);

	}

}