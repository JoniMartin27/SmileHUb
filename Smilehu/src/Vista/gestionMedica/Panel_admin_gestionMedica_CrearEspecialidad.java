package Vista.gestionMedica;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Conexion.ConexionMySQL;
import Modelo.Doctor_administrador;
import Modelo.Especialidad;
import Modelo.Paciente;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_admin_gestionMedica_CrearEspecialidad extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_NombreEspecialidad;
	private JDesktopPane miDesktopPane;
    private DefaultTableModel modelEspecialidad;
    private JScrollPane specialityScrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_CrearEspecialidad frame = new Panel_admin_gestionMedica_CrearEspecialidad();
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
	public Panel_admin_gestionMedica_CrearEspecialidad() {
		setBounds(219, 44, 862, 562);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 846, 532);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox<String> cb_doctor = new JComboBox<>();
		cb_doctor.setBounds(228, 206, 115, 20);
		panel.add(cb_doctor);
		
		
		
		cargarDoctorAlComboBox(cb_doctor);
		
		
		
		
		 table = new JTable();
		table.setBounds(525, 95, 260, 315);
		panel.add(table);
        JScrollPane specialityScrollPane = new JScrollPane(table);
        specialityScrollPane.setBounds(467,33,300,200);
        panel.add(specialityScrollPane);
        String[] columnasEspecialidad = { "nombre especialidad","Doctor" };
        this.modelEspecialidad = new DefaultTableModel();
        this.modelEspecialidad.setColumnIdentifiers(columnasEspecialidad);
	    
      
        
		
		
		try {
			ConexionMySQL.conectar();
			contruirTablaEspecialidad(ConexionMySQL.ejecutarSelect("SELECT nombre_especialidad , doctor_administrador.nombre  FROM especialidad JOIN doctor_administrador ON doctor_administrador.id_especialidad  = especialidad.id_especialidad "));
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		JLabel lbl_NombreEspecialidad = new JLabel("Nombre Especialidad");
		lbl_NombreEspecialidad.setBounds(70, 156, 127, 14);
		panel.add(lbl_NombreEspecialidad);
		
		tf_NombreEspecialidad = new JTextField();
		tf_NombreEspecialidad.setBounds(228, 153, 115, 20);
		panel.add(tf_NombreEspecialidad);
		tf_NombreEspecialidad.setColumns(10);
		
		JLabel lbl_Doctor = new JLabel("Doctor");
		lbl_Doctor.setBounds(70, 210, 118, 14);
		panel.add(lbl_Doctor);
		
		JButton btn_CrearEspecialidad = new JButton("Crear Especialidad");
		btn_CrearEspecialidad.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = null;
		        String apellido = null;
		        String[] partes;
		        String especialidad = tf_NombreEspecialidad.getText();
		        String doctor = (String) cb_doctor.getSelectedItem();

		        if (doctor != null) {
		            partes = doctor.split(" ", 2);

		            if (partes.length >= 2) {
		                nombre = partes[0];
		                apellido = partes[1];
		            }

	
		            if(especialidad=="") {
		            	JOptionPane.showMessageDialog( btn_CrearEspecialidad, "Error al cargar doctores", "Error", JOptionPane.ERROR_MESSAGE);
				        }else {
				        	try {
				                ConexionMySQL.insertarEspecialidad(especialidad);
				                Doctor_administrador doc = ConexionMySQL.buscarDoctor(nombre, apellido);

				                if (doc != null) {
				                    Especialidad esp = ConexionMySQL.buscarEspecialidad(especialidad);

				                    if (esp != null) {
				                        doc.setId_especialidad(esp.getIdEspecialidad());
				                        ConexionMySQL.ejecutarInsertDeleteUpdate("UPDATE doctor_administrador SET id_especialidad='" + doc.getId_especialidad() + "' WHERE nombre='" + doc.getNombre() + "' and apellidos='" + doc.getApellidos() + "'");
				                    } else {
				                        // La especialidad no se encontró, manejar según sea necesario
				                        System.out.println("La especialidad no se encontró.");
				                    }
				                } else {
				                    // El doctor no se encontró, manejar según sea necesario
				                    System.out.println("El doctor no se encontró.");
				                    
				                }
				            } catch (SQLException e1) {
				                e1.printStackTrace();
				            }
				        	
				        }
		            }
		        try {
					ConexionMySQL.conectar();
					table.removeAll();
					contruirTablaEspecialidad(ConexionMySQL.ejecutarSelect("SELECT nombre_especialidad , doctor_administrador.nombre  FROM especialidad JOIN doctor_administrador ON doctor_administrador.id_especialidad  = especialidad.id_especialidad "));
				} catch (SQLException | ClassNotFoundException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
		    }
		});
		btn_CrearEspecialidad.setBounds(265, 294, 159, 23);
		panel.add(btn_CrearEspecialidad);
		
		JLabel lbl_Listado = new JLabel("Listado Especialidades");
		lbl_Listado.setBounds(597, 48, 150, 14);
		panel.add(lbl_Listado);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 846, 532);
		lblNewLabel.setIcon(new ImageIcon(Panel_admin_gestionMedica_CrearEspecialidad.class.getResource("/img/fondoDientes.jpg")));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(646, 291, 2, 2);
		panel.add(scrollPane);

	}
	
	  private void contruirTablaEspecialidad(ResultSet rs) {
	        try {
	            while (rs.next()) {
	                Object[] fila = new Object[2]; // Hay 2 columna que mostrar
	            
	                fila[0] = rs.getString(1);
	                fila[1] = rs.getString(2);

	                modelEspecialidad.addRow(fila);
	                
	            }
	            this.table.setModel(modelEspecialidad);
	            


	          

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	  

		private void cargarDoctorAlComboBox(JComboBox<String> comboBox) {
			// Limpiar ComboBox antes de cargar nuevos datos
			comboBox.removeAllItems();

			try {

				// Obtener pacientes desde la base de datos
				ConexionMySQL.conectar();

				// Supongamos que tienes un método para obtener pacientes por nombre
				List<Doctor_administrador> combo = ConexionMySQL.buscarDoctor();

				// Agregar nombre y apellidos de cada paciente al ComboBox
				for (Doctor_administrador doctor_administrador : combo) {
					String nombreCompleto = doctor_administrador.getNombre() + " " + doctor_administrador.getApellidos();
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
