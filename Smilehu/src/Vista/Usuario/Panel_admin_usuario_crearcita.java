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
import Modelo.ConsultaCita;
import Modelo.Doctor_administrador;
import Modelo.Especialidad;
import Modelo.Paciente;
import Modelo.StockMaterial;
import Modelo.Tratamiento;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

public class Panel_admin_usuario_crearcita extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_nombre;
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
		setBorder(null);
		setBounds(100, 100, 1018, 576);
		getContentPane().setForeground(new Color(159, 232, 223));
		
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 576);
		getContentPane().add(panel);

		setBounds(100, 100, 862, 531);

		JTextField tf_nombrePaciente = new JTextField();
		tf_nombrePaciente.setColumns(10);
		tf_nombrePaciente.setBounds(284, 11, 176, 20);

		JComboBox<String> cB_especialista = new JComboBox<>();
		cB_especialista.setBounds(284, 254, 176, 23);
		panel.setLayout(null);
		
				JLabel lbl_fecha = new JLabel("Fecha");
				lbl_fecha.setFont(new Font("Tahoma", Font.BOLD, 11));
				lbl_fecha.setForeground(Color.BLACK);
				lbl_fecha.setBounds(684, 137, 45, 14);
				panel.add(lbl_fecha);
		
		JLabel lbl_doctor = new JLabel("Doctor");
		lbl_doctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_doctor.setBounds(65, 163, 105, 23);
		panel.add(lbl_doctor);
		
		JComboBox<String> cb_doctor = new JComboBox<String>();
		cb_doctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb_doctor.setBounds(201, 163, 176, 23);
		panel.add(cb_doctor);
		
		JLabel lbl_crearCita = new JLabel("CREAR CITA");
		lbl_crearCita.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_crearCita.setBounds(10, 11, 193, 14);
		panel.add(lbl_crearCita);

		JComboBox<String> cb_hora = new JComboBox<>(getAvailableTimes());
		cb_hora.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb_hora.setBounds(516, 162, 114, 28);
		panel.add(cb_hora);

		JLabel lbl_observaciones = new JLabel("Observaciones");
		lbl_observaciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_observaciones.setBounds(65, 329, 105, 14);
		panel.add(lbl_observaciones);

		JTextArea tA_Observaciones = new JTextArea();
		tA_Observaciones.setBounds(65, 354, 253, 103);
		panel.add(tA_Observaciones);

		JComboBox<String> cb_material = new JComboBox<>();
		cb_material.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb_material.setBounds(201, 204, 176, 23);
		panel.add(cb_material);

		JLabel lbl_material = new JLabel("Material");
		lbl_material.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_material.setBounds(66, 201, 105, 23);
		panel.add(lbl_material);

		JComboBox<String> cB_nombrePaciente = new JComboBox<>();
		cB_nombrePaciente.setFont(new Font("Tahoma", Font.BOLD, 14));
		cB_nombrePaciente.setBounds(201, 69, 176, 23);
		panel.add(cB_nombrePaciente);

		JButton btn_BuscarPaciente = new JButton("Buscar");
		btn_BuscarPaciente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_BuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cargarPacientes(tf_nombre.getText(), cB_nombrePaciente);

			}
		});
		btn_BuscarPaciente.setBounds(400, 37, 128, 23);
		panel.add(btn_BuscarPaciente);

		JLabel lbl_hora = new JLabel("Hora");
		lbl_hora.setForeground(Color.BLACK);
		lbl_hora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_hora.setBounds(551, 137, 46, 14);
		panel.add(lbl_hora);

		tf_nombre = new JTextField();
		tf_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_nombre.setColumns(10);
		tf_nombre.setBounds(201, 38, 176, 20);
		panel.add(tf_nombre);

		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(Color.BLACK);
		lbl_tratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_tratamiento.setBounds(66, 119, 105, 14);
		panel.add(lbl_tratamiento);

		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(Color.BLACK);
		lbl_nombrepaciente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombrepaciente.setBounds(64, 41, 128, 14);
		panel.add(lbl_nombrepaciente);

	

		JComboBox<String> cb_Tratamiento = new JComboBox<>();
		cb_Tratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb_Tratamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb_doctor.removeAllItems();
				 
				try {
					
					Tratamiento tratamiento = ConexionMySQL.buscarTratamiento(cb_Tratamiento.getSelectedItem().toString());
					cargarDoctores(tratamiento.getId_especialidad(),cb_doctor);
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
			}
		});
		

		
		
		cb_Tratamiento.setBounds(201, 115, 176, 23);
		panel.add(cb_Tratamiento);
		cargarTratamientos(cb_Tratamiento);
		cargarMateriales(cb_material);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(new Color(240, 240, 240));
		dateChooser.setDateFormatString("dd MM yyyy");
		dateChooser.setBounds(656, 163, 114, 28);
		panel.add(dateChooser);

		JButton btn_crearcita = new JButton("Crear Cita");
		btn_crearcita.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_crearcita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Date selectedDate = dateChooser.getDate();


				// usar SimpleDateFormat para convertir a String

				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String formattedDate = dateFormat.format(selectedDate);

				System.out.println(formattedDate);
				String selectedTime = (String) cb_hora.getSelectedItem();
				
				String texto;
				String nombre="";
				String apellido="";
				String[] partes;
				// recojo los datos del comboBox
				texto = (String) cB_nombrePaciente.getSelectedItem();
				// divide el string comlpeto del comboBox en nombre y apellidos
				 if (texto != null) {
				         partes = texto.split(" ", 2);
				if (partes.length >= 2) {
					// Guardar las partes en variables
					nombre = partes[0];
					apellido = partes[1];
				}}
				
				
					String text="";
					String name="";
					String last_name="";
					String[] slides = null;
					// recojo los datos del comboBox
					text = (String) cb_doctor.getSelectedItem();
					// divide el string comlpeto del comboBox en nombre y apellidos
					 if (text != null) {
						 slides = text.split(" ", 2);
					if (slides.length >= 2) {
						// Guardar las partes en variables
						name = slides[0];
						last_name = slides[1];
						System.out.println(name+last_name);
					}}
				
				
	

				if (!existeCita(formattedDate, selectedTime)) {
					try {
						Paciente paciente =ConexionMySQL.buscarPacientes(nombre,apellido);
						
						Tratamiento tratamiento = ConexionMySQL.buscarTratamiento(cb_Tratamiento.getSelectedItem().toString());
					
						StockMaterial material =ConexionMySQL.buscarMaterial(cb_material.getSelectedItem().toString());
						
						System.out.println("bua"+material.getIdMaterial());
						System.out.println(formattedDate);
						ConsultaCita cita = new ConsultaCita(tratamiento.getIdTratamiento(),paciente.getIdPaciente(),tA_Observaciones.getText(),selectedTime,formattedDate
								);
						
						ConexionMySQL.insertarCita(cita);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						e1.getLocalizedMessage();
					}
					JOptionPane.showMessageDialog(null, "Cita guardada correctamente.");
				} else {
					JOptionPane.showMessageDialog(null, "Ya hay una cita programada a esa hora en ese día.");
				}
			}

		});
		btn_crearcita.setBounds(400, 434, 128, 23);
		panel.add(btn_crearcita);
		JLabel icon = new JLabel("New label");
		icon.setIcon(new ImageIcon(Panel_admin_usuario_crearcita.class.getResource("/img/fondoDientes.jpg")));
		icon.setBounds(0, 0, 1018, 576);
		panel.add(icon);
		
		JLabel lblNewLabel_1 = new JLabel("fecha");
		lblNewLabel_1.setBounds(683, 137, 46, 14);
		panel.add(lblNewLabel_1);

	}

	
	
	
	
	private static String[] getAvailableTimes() {
		// Obtener las horas disponibles desde la base de datos o definirlas manualmente
		return new String[] { "9:00 AM", "10:00 AM", "11:00 AM", "12:00 AM", "2:00 PM", "3:00 PM" };
	}

	
	
	
	private static boolean existeCita(String date, String time) {
		boolean exists = false;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			ConexionMySQL.conectar();
			String query = "SELECT * FROM consulta_cita WHERE fecha = ? AND hora = ?";
			statement = ConexionMySQL.getConnection().prepareStatement(query);
			statement.setString(1, date);
			statement.setString(2, time);

			resultSet = statement.executeQuery();
			exists = resultSet.next();
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				ConexionMySQL.desconectar();
				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		return exists;
	}

	
	//Cargar materiales al combobox
	private void cargarMateriales(JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<StockMaterial> materiales = ConexionMySQL.buscarMaterial();

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (StockMaterial material : materiales) {

				comboBox.addItem(material.getNombre());
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar materiales", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	
	//Cargar tratamientos al combobox
	private void cargarTratamientos(JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Tratamiento> tratamientos = ConexionMySQL.buscarTratamiento();

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Tratamiento tratamiento : tratamientos) {

				comboBox.addItem(tratamiento.getNombre());
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar tratamientos", "Error", JOptionPane.ERROR_MESSAGE);
			System.out.println(ex.getLocalizedMessage());
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	
	//Cargar pacientes al combobox
	private void cargarPacientes(String nombre, JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Paciente> pacientes = ConexionMySQL.buscarPacientesCombo(nombre);

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
	
	
	//Cargar doctores al combobox
	private void cargarDoctores(int id_especialidad, JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Doctor_administrador> doctores = ConexionMySQL.buscarDoctorCita(id_especialidad);

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Doctor_administrador doctor : doctores) {
				String nombreCompleto = doctor.getNombre() ;
				comboBox.addItem(nombreCompleto);
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar doctores", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
