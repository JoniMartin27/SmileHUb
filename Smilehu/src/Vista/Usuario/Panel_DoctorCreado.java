package Vista.Usuario;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

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
import Modelo.Paciente;
import Vista.gestionEconomica.JDialog_admin_gestionEconomica_tipoPago;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Panel_DoctorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	private JTextField tf_buscarNombre;
	private JTextField tf_direcion;
	private JTextField tf_telefono;
	private JTextField tf_pass;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_DoctorCreado frame = new Panel_DoctorCreado();
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
	public Panel_DoctorCreado() {
		setBorder(null);
		setBounds(100, 100, 1018, 576);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 546);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		tf_pass = new JTextField();
		tf_pass.setBounds(500, 281, 174, 20);
		panel.add(tf_pass);
		tf_pass.setColumns(10);
		
		JLabel lbl_pass = new JLabel("Contraseña");
		lbl_pass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_pass.setBounds(298, 282, 136, 14);
		panel.add(lbl_pass);
		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_alta.setBounds(500, 253, 174, 23);
		panel.add(rdbtn_alta);

		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_baja.setBounds(676, 253, 173, 23);
		panel.add(rdbtn_baja);
		JComboBox<String> cb_nombreDoctor = new <String> JComboBox();
		cb_nombreDoctor.setBounds(501, 164, 173, 22);
		panel.add(cb_nombreDoctor);
		
		
		
		JButton btn_modificarCita = new JButton("Modificar Cita");
		btn_modificarCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				int estado= 0;
				if(rdbtn_baja.isSelected()) {
					estado=1;
					
				}else if( rdbtn_alta.isSelected()) {
					estado=0;
					
				}else {
					JOptionPane.showMessageDialog(null, "Selecciona el estado del doctor.");
				}
		        
				String texto;
				String nombre;
				String apellido;
				String[] partes;
				// recojo los datos del comboBox
				texto = (String) cb_nombreDoctor.getSelectedItem();
				// divide el string comlpeto del comboBox en nombre y apellidos
				 if (texto != null) {
				         partes = texto.split(" ", 2);
				if (partes.length >= 2) {
					// Guardar las partes en variables
					nombre = partes[0];
					apellido = partes[1];
				
					// buscamos al paciente con nombre y apellido e insertamos datos en textfields
					try {
						Doctor_administrador doctor = ConexionMySQL.buscarDoctor(nombre, apellido);
					
			
						String direccion = tf_direcion.getText();
						int estado_baja = estado;
						String telefono = tf_telefono.getText();
						String pass = tf_pass.getText();
					

						
						
						
						Doctor_administrador doctors =new Doctor_administrador(estado_baja,direccion,telefono,pass,nombre,apellido);
						
						try {
							ConexionMySQL.modificarDoctor(doctors);	
						}catch(Exception ex) {
							System.out.println(ex.getMessage());
							JOptionPane.showMessageDialog(getContentPane(), "Error al modficar doctor", "Error", JOptionPane.ERROR_MESSAGE);
						}
						
		;
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					System.out.println("El texto no contiene un espacio.");
				}
				 }
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		
		
		
		
		
		JLabel lbl_telefono = new JLabel("Teléfono");
		lbl_telefono.setForeground(Color.BLACK);
		lbl_telefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_telefono.setBounds(298, 207, 151, 14);
		panel.add(lbl_telefono);
		
		tf_telefono = new JTextField();
		tf_telefono.setColumns(10);
		tf_telefono.setBounds(501, 202, 173, 20);
		panel.add(tf_telefono);
		btn_modificarCita.setBounds(501, 452, 116, 23);
		panel.add(btn_modificarCita);
		
	
		
		JLabel lbl_ficha = new JLabel("FICHA DOCTOR");
		lbl_ficha.setBackground(new Color(192, 192, 192));
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_ficha.setBounds(10, 11, 173, 14);
		panel.add(lbl_ficha);
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setForeground(Color.BLACK);
		lbl_altabaja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_altabaja.setBounds(298, 257, 151, 14);
		panel.add(lbl_altabaja);
		
		
		cb_nombreDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String texto;
				String nombre;
				String apellido;
				String[] partes;
				// recojo los datos del comboBox
				texto = (String) cb_nombreDoctor.getSelectedItem();
				// divide el string comlpeto del comboBox en nombre y apellidos
				 if (texto != null) {
				         partes = texto.split(" ", 2);
				if (partes.length >= 2) {
					// Guardar las partes en variables
					nombre = partes[0];
					apellido = partes[1];
				
					// buscamos al paciente con nombre y apellido e insertamos datos en textfields
					try {
						Doctor_administrador doctor = ConexionMySQL.buscarDoctor(nombre, apellido);
						tf_direcion.setText(doctor.getDireccion());
						tf_pass.setText(doctor.getPass());
						tf_telefono.setText(doctor.getTeléfono());
						
						
						
						
						if(doctor.getEstado_baja()==1) {
							rdbtn_baja.setSelected(true);
						}else {
							rdbtn_alta.setSelected(true);
						}
						
						
					
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
		JLabel lbl_direccion = new JLabel("Dirección");
		lbl_direccion.setForeground(Color.BLACK);
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setBounds(298, 232, 151, 14);
		panel.add(lbl_direccion);
		
		JLabel lbl_Buscardoctor = new JLabel("Nombre doctor");
		lbl_Buscardoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Buscardoctor.setBounds(298, 136, 162, 14);
		panel.add(lbl_Buscardoctor);
		
		tf_buscarNombre = new JTextField();
		tf_buscarNombre.setColumns(10);
		tf_buscarNombre.setBounds(500, 136, 174, 20);
		panel.add(tf_buscarNombre);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cargarDoctoresAlComboBox(tf_buscarNombre.getText(), cb_nombreDoctor); 
			
				
				
				
				
				
				
				
			}
		});
		btn_buscar.setBounds(684, 135, 89, 23);
		panel.add(btn_buscar);
		
		tf_direcion = new JTextField();
		tf_direcion.setColumns(10);
		tf_direcion.setBounds(501, 226, 173, 20);
		panel.add(tf_direcion);
		
		
		JButton btn_realizarpago=new JButton();
		btn_realizarpago.setBounds(845, 22, 136, 23);
		btn_realizarpago.setText("Registrar Pago");
		btn_realizarpago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_gestionEconomica_tipoPago tipoPago=new JDialog_admin_gestionEconomica_tipoPago();
				
				tipoPago.setVisible(true);
				tipoPago.setLocation(200, 200);
				tipoPago.setModal(true);
				tipoPago.setUndecorated(true);
				dispose();
			}
		});
		panel.add(btn_realizarpago);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCreado.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 546);
		panel.add(lblNewLabel);
		
		
		ButtonGroup g1 = new ButtonGroup();

		
		JLabel lbl_ficha1 = new JLabel("Ficha de Doctor");
		lbl_ficha1.setForeground(new Color(0, 0, 0));
		lbl_ficha1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha1.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha1);
		
		


		
		
	}
	private Doctor_administrador cbSplitter(JComboBox<String> comboBox) {
		String texto;
		String nombre="";
		String apellidos="";
		
		
		String[] partes;
		// recojo los datos del comboBox
		texto = (String) comboBox.getSelectedItem();
		// divide el string comlpeto del comboBox en nombre y apellidos
		 if (texto != null) {
		         partes = texto.split(" ", 2);
		if (partes.length >= 2) {
			// Guardar las partes en variables
			nombre = partes[0];
			apellidos = partes[1];
			}}
		 Doctor_administrador doctor =new Doctor_administrador(nombre,apellidos);;
		return doctor;
	
	}

	private void cargarDoctoresAlComboBox(String nombre, JComboBox<String> comboBox) {
		// Limpiar ComboBox antes de cargar nuevos datos
		comboBox.removeAllItems();

		try {

			// Obtener pacientes desde la base de datos
			ConexionMySQL.conectar();

			// Supongamos que tienes un método para obtener pacientes por nombre
			List<Doctor_administrador> doctores = ConexionMySQL.buscarDoctorModificar(nombre);

			// Agregar nombre y apellidos de cada paciente al ComboBox
			for (Doctor_administrador doctor : doctores) {
				String nombreCompleto = doctor.getNombre() + " " + doctor.getApellidos();
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
