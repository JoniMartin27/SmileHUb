package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import org.apache.commons.collections4.map.HashedMap;

import Conexion.ConexionMySQL;
import Modelo.Paciente;
import Vista.gestionMedica.Odontograma;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import Conexion.ConexionMySQL;
public class Panel_PacienteCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_direccion;
	private JTextField tf_apellidos;
	private JTextField tf_genero;

	
	private JTextField tf_buscaPaciente;

	private JasperReport reporte;
	private JTextField tf_telefono;
	private JTextField tf_fechaAlta;
	private JTextField tf_fechaNacimiento;
	private JTextField tf_nombre;
	private JDesktopPane miDesktopPane;
	private JTextField tf_id;
	private int idPaciente;
	ConexionMySQL conexion=new ConexionMySQL();

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
		this.miDesktopPane = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Panel_PacienteCreado() {
		setBorder(null);
		setBounds(100, 100, 1018, 576);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		/* Botones Alta/Baja */

		ButtonGroup g1 = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 549);
		contentPanel.add(panel);
		panel.setLayout(null);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String texto;
				String nombre;
				String apellido;
				String[] partes;
				// recojo los datos del comboBox
				texto = (String) comboBox.getSelectedItem();
				// divide el string comlpeto del comboBox en nombre y apellidos
				 if (texto != null) {
				         partes = texto.split(" ", 2);
				if (partes.length >= 2) {
					// Guardar las partes en variables
					nombre = partes[0];
					apellido = partes[1];
				
					// buscamos al paciente con nombre y apellido e insertamos datos en textfields
					try {
						Paciente paciente = ConexionMySQL.buscarPacientes(nombre, apellido);
						tf_id.setText(Integer.toString(paciente.getIdPaciente()));
						tf_apellidos.setText(paciente.getApellidos());
						tf_direccion.setText(paciente.getDireccion());
						tf_fechaAlta.setText(paciente.getFechaComoCadena());
						tf_fechaNacimiento.setText(paciente.getFechaNacimiento());
						tf_genero.setText(paciente.getGenero());
						tf_telefono.setText(paciente.getTelefono());
						tf_nombre.setText(paciente.getNombre());
						
						System.out.println(paciente.getIdPaciente());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					System.out.println("El texto no contiene un espacio.");
				}
				 }
			};
		});
		
		
		JButton btn_historial = new JButton("Historial");
		btn_historial.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_historial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Map<String, Object> parametros = new HashedMap<String, Object>();
					parametros.put("id_paciente", Integer.parseInt(tf_id.getText()));
					reporte = JasperCompileManager
							.compileReport("src/Informs/Informe1.jrxml");
					JasperPrint p= JasperFillManager.fillReport(reporte, parametros, conexion.conectar1());
					JasperViewer viewer = new JasperViewer(p, false);
		            viewer.setVisible(true);
		            dispose();
		            viewer.toFront();
				} catch (ClassNotFoundException | JRException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		JButton btn_realizarpago = new JButton();
		btn_realizarpago.setText("Registrar Pago");
		btn_realizarpago.setBounds(829, 26, 136, 23);
		panel.add(btn_realizarpago);
		btn_historial.setBounds(253, 354, 173, 23);
		panel.add(btn_historial);
		
		
		
		JLabel lbl_fichaPaciente = new JLabel("FICHA PACIENTE ");
		lbl_fichaPaciente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_fichaPaciente.setBounds(10, 11, 228, 14);
		panel.add(lbl_fichaPaciente);
		
		tf_id = new JTextField();
		tf_id.setEditable(false);
		tf_id.setColumns(10);
		tf_id.setBounds(315, 161, 126, 20);
		panel.add(tf_id);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_id.setBounds(220, 164, 46, 14);
		panel.add(lbl_id);
		comboBox.setBounds(425, 56, 126, 22);
		panel.add(comboBox);

		tf_telefono = new JTextField();
		tf_telefono.setBounds(315, 288, 126, 20);
		panel.add(tf_telefono);
		tf_telefono.setColumns(10);

		tf_genero = new JTextField();
		tf_genero.setEditable(false);
		tf_genero.setBounds(315, 265, 126, 20);
		panel.add(tf_genero);
		tf_genero.setColumns(10);

		tf_direccion = new JTextField();
		tf_direccion.setBounds(315, 240, 126, 20);
		panel.add(tf_direccion);
		tf_direccion.setColumns(10);

		tf_apellidos = new JTextField();
		tf_apellidos.setEditable(false);
		tf_apellidos.setBounds(315, 215, 126, 20);
		panel.add(tf_apellidos);
		tf_apellidos.setColumns(10);

		tf_nombre = new JTextField();
		tf_nombre.setEditable(false);
		tf_nombre.setBounds(315, 189, 126, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);

		JLabel lbl_buscar = new JLabel("Buscar paciente:");
		lbl_buscar.setBounds(288, 28, 126, 14);
		panel.add(lbl_buscar);
		lbl_buscar.setForeground(new Color(0, 0, 0));
		lbl_buscar.setFont(new Font("Tahoma", Font.BOLD, 14));

		tf_buscaPaciente = new JTextField();
		tf_buscaPaciente.setBounds(425, 25, 126, 20);
		panel.add(tf_buscaPaciente);
		tf_buscaPaciente.setColumns(10);

		JButton btn_BuscarPaciente = new JButton("Buscar");
		btn_BuscarPaciente.setBounds(561, 24, 109, 23);
		panel.add(btn_BuscarPaciente);

		JLabel lbl_dni_1 = new JLabel("Fecha alta");
		lbl_dni_1.setBounds(452, 190, 91, 14);
		panel.add(lbl_dni_1);
		lbl_dni_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni_1.setForeground(Color.BLACK);
		lbl_dni_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		tf_fechaAlta = new JTextField();
		tf_fechaAlta.setBounds(589, 189, 126, 20);
		panel.add(tf_fechaAlta);
		tf_fechaAlta.setEditable(false);
		tf_fechaAlta.setColumns(10);

		JLabel lbl_nombre_1 = new JLabel("Fecha nacimiento");
		lbl_nombre_1.setBounds(452, 215, 127, 14);
		panel.add(lbl_nombre_1);
		lbl_nombre_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_1.setForeground(Color.BLACK);
		lbl_nombre_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		tf_fechaNacimiento = new JTextField();
		tf_fechaNacimiento.setBounds(589, 215, 126, 20);
		panel.add(tf_fechaNacimiento);
		tf_fechaNacimiento.setEditable(false);
		tf_fechaNacimiento.setColumns(10);
		JLabel lbl_dni = new JLabel("Nombre");
		lbl_dni.setBounds(220, 189, 85, 14);
		panel.add(lbl_dni);
		lbl_dni.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_dni.setForeground(new Color(0, 0, 0));
		JLabel lbl_nombre = new JLabel("Apellidos");
		lbl_nombre.setBounds(220, 214, 85, 14);
		panel.add(lbl_nombre);
		lbl_nombre.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		JLabel lbl_apellidos = new JLabel("Direccion");
		lbl_apellidos.setBounds(220, 239, 85, 14);
		panel.add(lbl_apellidos);
		lbl_apellidos.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		JLabel lbl_fechanacimiento = new JLabel("Genero");
		lbl_fechanacimiento.setBounds(220, 264, 85, 14);
		panel.add(lbl_fechanacimiento);
		lbl_fechanacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_fechanacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_fechanacimiento.setForeground(new Color(0, 0, 0));
		JLabel lbl_sexo = new JLabel("Telefono");
		lbl_sexo.setBounds(220, 289, 85, 14);
		panel.add(lbl_sexo);
		lbl_sexo.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_sexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja:");
		lbl_altabaja.setBounds(269, 329, 173, 14);
		panel.add(lbl_altabaja);
		lbl_altabaja.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_altabaja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_altabaja.setForeground(new Color(0, 0, 0));

		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_alta.setBounds(457, 325, 68, 23);
		panel.add(rdbtn_alta);
		g1.add(rdbtn_alta);

		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_baja.setBounds(557, 325, 68, 23);
		panel.add(rdbtn_baja);
		g1.add(rdbtn_baja);

		JButton btn_consultarpagos = new JButton("Consultar Pagos");
		btn_consultarpagos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_consultarpagos.setBounds(253, 374, 173, 23);
		panel.add(btn_consultarpagos);

		JButton btn_odontograma = new JButton("Odontograma");
		btn_odontograma.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_odontograma.setBounds(253, 396, 173, 23);
		panel.add(btn_odontograma);

		JButton btn_modificar = new JButton("Modificar Paciente");
		btn_modificar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_modificar.setBounds(253, 420, 173, 23);
		panel.add(btn_modificar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_PacienteCreado.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1033, 561);
		panel.add(lblNewLabel);
		btn_modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = cbSplitter(comboBox);
				  // Obtener los datos de los textfields
		       
		        String apellidos = tf_apellidos.getText();
		        String direccion = tf_direccion.getText();
		        String genero = tf_genero.getText();
		        String telefono = tf_telefono.getText();
		        String fechaAlta = tf_fechaAlta.getText();
		        
		        
		        
		        
		        String fechaNacimiento = tf_fechaNacimiento.getText();
		        int id=Integer.parseInt(tf_id.getText());
		       
		        // Crear un objeto Paciente con los datos modificados
		        Paciente pacienteModificado = new Paciente(id,nombre, apellidos, direccion, genero, telefono, fechaAlta, fechaNacimiento);

		       
		        

		        // Llamar al método para modificar en la base de datos y Mostrar un mensaje de confirmación 
		        try {
		            ConexionMySQL.modificarPaciente(pacienteModificado);
		            JOptionPane.showMessageDialog(btn_modificar, "Paciente Modificado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        } catch (SQLException e1) {
		            e1.printStackTrace();
		            System.err.println(e1.getLocalizedMessage());
		           
		        }
			}

			
		});
		btn_odontograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	
			
				if(tf_id.getText().equals("")) {
					JOptionPane.showMessageDialog(btn_odontograma, "Busque primero un paciente", "Selección", JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					 try {
							int id = Integer.parseInt(tf_id.getText()); // Obtener el ID del paciente
							Paciente paciente=new Paciente(id);
							System.out.println("El id insertado al crear registro es: "+id);
							ConexionMySQL.crearRegistrosDientes(paciente);
					       
					            abrirOdontograma(getDesktopPane(), id); // Pasar el ID del paciente al método
					        } catch (PropertyVetoException e1) {
					        	
					            e1.printStackTrace();
				}
			
				      
		            
		        }
			}
			
		});
		btn_consultarpagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Map<String, Object> parametros = new HashedMap<String, Object>();
					
					parametros.put("id_paciente", Integer.parseInt(tf_id.getText()));
					reporte = JasperCompileManager
							.compileReport("src/Informs/Factura1.jrxml");
					JasperPrint p;
					p = JasperFillManager.fillReport(reporte, parametros, ConexionMySQL.obtenerConexion());
					JasperViewer viewer = new JasperViewer(p, false);
		            viewer.setVisible(true);
		            dispose();
		            viewer.toFront();
				} catch (JRException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

		btn_BuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cargarPacientesAlComboBox(tf_buscaPaciente.getText(), comboBox);

			}
		});

	}
	
	private String cbSplitter(JComboBox<String> comboBox) {
		String texto;
		String nombre="";
		
		String[] partes;
		// recojo los datos del comboBox
		texto = (String) comboBox.getSelectedItem();
		// divide el string comlpeto del comboBox en nombre y apellidos
		 if (texto != null) {
		         partes = texto.split(" ", 2);
		if (partes.length >= 2) {
			// Guardar las partes en variables
			nombre = partes[0];
			}}
		return nombre;
	}
	

	private static void abrirOdontograma(JDesktopPane desktopPane,int id) throws PropertyVetoException {
		
		Odontograma odonto = new Odontograma(id);
		odonto.setBorder(null);
		((BasicInternalFrameUI) odonto.getUI()).setNorthPane(null);
		odonto.setLocation(0, 0);
		odonto.show();
		odonto.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		odonto.setVisible(true);
		desktopPane.add(odonto); // Usar el parámetro en lugar de la variable local
		odonto.setSelected(true);
	}
	


	
	

	private void cargarPacientesAlComboBox(String nombre, JComboBox<String> comboBox) {
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
}