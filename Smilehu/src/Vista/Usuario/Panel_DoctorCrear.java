package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Conexion.ConexionMySQL;
import Modelo.Doctor_administrador;
import Modelo.Especialidad;
import Modelo.Paciente;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class Panel_DoctorCrear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_direccion;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_telefono;
	private JTextField tf_pass;
	private JTextField tf_fecha_nacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_DoctorCrear frame = new Panel_DoctorCrear();
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
	public Panel_DoctorCrear() {
		setBorder(null);
		setBounds(100, 100, 1018, 576);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	
		ButtonGroup g1 = new ButtonGroup();
		ButtonGroup g2 = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 546);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JDateChooser dt_fecha = new JDateChooser();
		dt_fecha.setBounds(365, 287, 147, 20);
		panel.add(dt_fecha);
		
		JLabel lbl_fechaNacimiento = new JLabel("Fecha nacimiento");
		lbl_fechaNacimiento.setForeground(Color.BLACK);
		lbl_fechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_fechaNacimiento.setBounds(214, 258, 147, 14);
		panel.add(lbl_fechaNacimiento);
		
		tf_fecha_nacimiento = new JTextField();
		tf_fecha_nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_fecha_nacimiento.setColumns(10);
		tf_fecha_nacimiento.setBounds(365, 256, 147, 20);
		panel.add(tf_fecha_nacimiento);
		
		
		JRadioButton rdbtn_BajaNo = new JRadioButton("Alta");
		rdbtn_BajaNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_BajaNo.setBounds(514, 374, 147, 23);
		panel.add(rdbtn_BajaNo);
		g2.add(rdbtn_BajaNo);
		
		JRadioButton rdbtn_BajaSi = new JRadioButton("Baja");
		rdbtn_BajaSi.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_BajaSi.setBounds(368, 374, 144, 23);
		panel.add(rdbtn_BajaSi);
		g2.add(rdbtn_BajaSi);
		
		JLabel lbl_estado = new JLabel("Estado");
		lbl_estado.setForeground(Color.BLACK);
		lbl_estado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_estado.setBounds(214, 374, 147, 14);
		panel.add(lbl_estado);
	
		tf_pass = new JTextField();
		tf_pass.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_pass.setColumns(10);
		tf_pass.setBounds(365, 225, 147, 20);
		panel.add(tf_pass);
		
		JLabel lbl_contrasenia = new JLabel("Contraseña");
		lbl_contrasenia.setForeground(Color.BLACK);
		lbl_contrasenia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_contrasenia.setBounds(214, 227, 147, 14);
		panel.add(lbl_contrasenia);
		
		tf_telefono = new JTextField();
		tf_telefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_telefono.setColumns(10);
		tf_telefono.setBounds(365, 198, 147, 20);
		panel.add(tf_telefono);
		
		JLabel lbl_telefono = new JLabel("Teléfono");
		lbl_telefono.setForeground(Color.BLACK);
		lbl_telefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_telefono.setBounds(214, 200, 147, 14);
		panel.add(lbl_telefono);
		
		JComboBox<String> cb_especialidad = new JComboBox();
		cb_especialidad.setBounds(365, 137, 147, 22);
		panel.add(cb_especialidad);
		
		//Llenamos el comboBox de especialidad con las especialidades
		cargarEspecialidad(cb_especialidad);
		
		
		
		JLabel lbl_ficha = new JLabel("FICHA CREAR DOCTOR");
		lbl_ficha.setBackground(new Color(128, 64, 0));
		lbl_ficha.setBounds(30, 11, 173, 14);
		panel.add(lbl_ficha);
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lbl_especialidad = new JLabel("Especialidad");
		lbl_especialidad.setBounds(214, 139, 147, 14);
		panel.add(lbl_especialidad);
		lbl_especialidad.setForeground(Color.BLACK);
		lbl_especialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tf_nombre = new JTextField();
		tf_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_nombre.setBounds(365, 79, 147, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(214, 81, 147, 14);
		panel.add(lbl_nombre);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		JLabel lbl_apellidos = new JLabel("Apellidos");
		lbl_apellidos.setBounds(214, 112, 147, 14);
		panel.add(lbl_apellidos);
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setBounds(214, 172, 147, 14);
		panel.add(lbl_direccion);
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		JLabel lbl_sexo = new JLabel("Genero");
		lbl_sexo.setBounds(214, 339, 147, 14);
		panel.add(lbl_sexo);
		lbl_sexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sexo.setForeground(new Color(0, 0, 0));
				
				
				JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
				rdbtn_femenino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_femenino.setBounds(514, 339, 147, 23);
				panel.add(rdbtn_femenino);
				g1.add(rdbtn_femenino);
				
				JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
				rdbtn_masculino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_masculino.setBounds(368, 339, 144, 23);
				panel.add(rdbtn_masculino);
				g1.add(rdbtn_masculino);
				
				tf_direccion = new JTextField();
				tf_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_direccion.setBounds(365, 170, 147, 20);
				panel.add(tf_direccion);
				tf_direccion.setColumns(10);
				
				tf_apellidos = new JTextField();
				tf_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_apellidos.setBounds(365, 110, 147, 20);
				panel.add(tf_apellidos);
				tf_apellidos.setColumns(10);
				
				JButton btn_crearDoctor = new JButton("Crear Doctor");
				btn_crearDoctor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
						
						
						String especialidadCB= (String) cb_especialidad.getSelectedItem();
						
						  // Obtener la fecha del día actual
				        Date fecha = new Date();

				        // Crear un objeto SimpleDateFormat para formatear la fecha
				        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

				        // Formatear la fecha como una cadena de texto
				        String fechaActual = formato.format(fecha);
				     

				        
				        //Estado de baja y genero
					String genero="";
					int estado=0;
				
						if(rdbtn_femenino.isSelected()) {
							genero="Mujer";
							
						}else if(rdbtn_masculino.isSelected()) {
							genero="Hombre";
							
						}else {
							JOptionPane.showMessageDialog(null, "Selecciona el genero del paciente.");
						}
						if(rdbtn_BajaNo.isSelected()) {
							estado=1;
							
						}else if(rdbtn_BajaSi.isSelected()) {
							estado=0;
							
						}else {
							JOptionPane.showMessageDialog(null, "Selecciona el estado del doctor.");
						}
				        						
						
						crearDoctor(dt_fecha, cb_especialidad, fechaActual, genero, estado);
				        				
						
					}

					private void crearDoctor(JDateChooser dt_fecha, JComboBox<String> cb_especialidad,
							String fechaActual, String genero, int estado) {
						Date selectedDate = dt_fecha.getDate();


						// usar SimpleDateFormat para convertir a String

						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String fechaNacimiento = dateFormat.format(selectedDate);
						// Obtener la fecha actual
		
				        LocalDate fechaRep = LocalDate.now();
				        
				        
				        LocalDate fechaIngresada = LocalDate.parse(fechaNacimiento);
				        
				        // Comparar la fecha ingresada con la fecha actual
				        if (fechaIngresada.isAfter(fechaRep)) {

							JOptionPane.showMessageDialog(null, "La fecha ingresada es posterior a la fecha actual. No se puede insertar.");

				        } else if (fechaIngresada.isBefore(fechaRep)) {


				        
							try {
								ConexionMySQL.conectar();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								Especialidad especialidad = ConexionMySQL.buscarEspecialidad(cb_especialidad.getSelectedItem().toString());
								 int idEspecialidad=especialidad.getIdEspecialidad();
								 Doctor_administrador doctor =new Doctor_administrador(idEspecialidad,tf_nombre.getText(),tf_apellidos.getText(),tf_direccion.getText(),fechaActual,estado,genero,tf_pass.getText(),tf_telefono.getText(),tf_fecha_nacimiento.getText());
								 ConexionMySQL.insertarDoctor(doctor);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Paciente Creado.");
				        } else {
				   
				        
							try {
								ConexionMySQL.conectar();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								Especialidad especialidad = ConexionMySQL.buscarEspecialidad(cb_especialidad.getSelectedItem().toString());
								 int idEspecialidad=especialidad.getIdEspecialidad();
								 Doctor_administrador doctor =new Doctor_administrador(idEspecialidad,tf_nombre.getText(),tf_apellidos.getText(),tf_direccion.getText(),fechaActual,estado,genero,tf_pass.getText(),tf_telefono.getText(),tf_fecha_nacimiento.getText());
								 ConexionMySQL.insertarDoctor(doctor);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Paciente Creado.");
				        }
						
						
						
						
						
						
				        
				        
					
					}
				});
				btn_crearDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
				btn_crearDoctor.setBounds(365, 434, 147, 23);
				panel.add(btn_crearDoctor);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCrear.class.getResource("/img/fondoDientes.jpg")));
				lblNewLabel.setBounds(0, 0, 1018, 569);
				panel.add(lblNewLabel);
		
	}
	
	
	//Cargar especialidad al combobox
	private void cargarEspecialidad(JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Especialidad> especialidades = ConexionMySQL.buscarEspecialidad();

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Especialidad especialidad : especialidades) {

				comboBox.addItem(especialidad.getNombreEspecialidad());
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al cargar tratamientos", "Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				ConexionMySQL.desconectar();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
