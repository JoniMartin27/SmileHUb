package Vista.Usuario;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import Controlador.ConexionMySQL;
import Modelo.Paciente;
import Vista.gestionMedica.Panel_admin_gestionMedica_CrearTratamiento;

import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Panel_admin_usuario_paciente_consultarCita_Funciona extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_buscarCita;
	private JTable table;
	private JDesktopPane miDesktopPane;
	DefaultTableModel modeloTabla = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_usuario_paciente_consultarCita_Funciona frame = new Panel_admin_usuario_paciente_consultarCita_Funciona();
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
	public Panel_admin_usuario_paciente_consultarCita_Funciona() {
		getContentPane().setForeground(new Color(159, 232, 223));
		
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 652, 263);
		getContentPane().setLayout(null);
		JRadioButton rdbtn_id = new JRadioButton("ID");
		rdbtn_id.setBounds(101, 11, 79, 23);
		getContentPane().add(rdbtn_id);
		tf_buscarCita = new JTextField();
		tf_buscarCita.setBounds(20, 43, 171, 20);
		getContentPane().add(tf_buscarCita);
		tf_buscarCita.setColumns(10);
		
		
		
		
		JButton btn_buscarcita = new JButton("Buscar");
		btn_buscarcita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConexionMySQL.conectar();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String id=tf_buscarCita.getText();
				int ids=Integer.parseInt(id);
				
				System.out.println("hola"+ids+id);
				
				
				if(rdbtn_id.isSelected()) {
					try {
						 // Crear un modelo de tabla
				        DefaultTableModel model = new DefaultTableModel();

				        // Agregar columnas al modelo
				        model.addColumn("Nombre");
				        model.addColumn("Edad");
				        Paciente paciente=ConexionMySQL.consultaPaciente(ids);
				        Object[] fila = {
							   
							    paciente.getNombre(),
							    paciente.getApellidos(),
							    paciente.getDireccion(),
							    paciente.getGenero(),
							    paciente.getTelefono(),
							    paciente.getFechaDeAlta(),
							    paciente.getFechaNacimiento(),
							    
							   
							};
				        // Agregar filas de datos al modelo
				        
				        model.addRow(new Object[]{ paciente.getNombre(),
							    paciente.getApellidos(),
							    paciente.getDireccion(),
							    paciente.getGenero(),
							    paciente.getTelefono(),
							    paciente.getFechaDeAlta(),
							    paciente.getFechaNacimiento(),});

				        model.addRow(new Object[]{"Juan", 25});
				        model.addRow(new Object[]{"María", 30});
				        model.addRow(new Object[]{"Pedro", 28});
				        model.addRow(new Object[]{"Luisa", 35});

				        // Asignar el modelo a la tabla
				        table.setModel(model);
						
				        System.out.println(model.getRowCount());
						

System.out.println("hpña");
						// Supongamos que tienes una clase Paciente con los siguientes atributos: ID_Paciente, DNI_Paciente, Nombre_Paciente, etc.
						// Supongamos también que tienes un objeto paciente que quieres agregar a la JTable

						
						// Agregar fila a la JTable
						



					

						// Asegúrate de que el modelo tenga la misma cantidad de columnas que la JTable
						modeloTabla.setColumnCount(table.getColumnCount());
						System.out.println("Final");
						
						
						
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
					
					
				}
				
			}
		});
		btn_buscarcita.setBounds(208, 42, 97, 23);
		getContentPane().add(btn_buscarcita);
		
		
		
		JRadioButton rdbtn_nombre = new JRadioButton("Nombre");
		rdbtn_nombre.setBounds(198, 11, 79, 23);
		getContentPane().add(rdbtn_nombre);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_nombre);
		g1.add(rdbtn_id);
		
		
		
		JLabel lblNewLabel = new JLabel("Buscar Por");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 18, 73, 14);
		getContentPane().add(lblNewLabel);
		
		table = new JTable(modeloTabla);
		table.setBounds(173, 100, 171, 90);
		getContentPane().add(table);
		
		JButton btn_modificarcita = new JButton("Modificar Cita");
		btn_modificarcita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_modificarcita.setBounds(10, 128, 130, 23);
		getContentPane().add(btn_modificarcita);
		
		JButton btn_borrarcita = new JButton("Borrar Cita");
		btn_borrarcita.setBounds(10, 167, 130, 23);
		getContentPane().add(btn_borrarcita);
		
		JButton btn_crearcita = new JButton("Crear Cita");
		btn_crearcita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_usuario_crearcita crearCita = new Panel_admin_usuario_crearcita();
				crearCita.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(crearCita);
				((BasicInternalFrameUI) crearCita.getUI()).setNorthPane(null);
				crearCita.setLocation(0,0);
				crearCita.setVisible(true);
				crearCita.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				
			}
		});
		btn_crearcita.setBounds(10, 86, 130, 23);
		getContentPane().add(btn_crearcita);

	}

}