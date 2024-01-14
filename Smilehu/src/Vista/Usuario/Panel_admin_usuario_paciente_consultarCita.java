package Vista.Usuario;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Conexion.ConexionMySQL;
import Modelo.ConsultaCita;
import Modelo.Paciente;
import Vista.gestionMedica.Panel_admin_gestionMedica_CrearTratamiento;
import Vista.gestionMedica.Panel_admin_gestionMedica_ModEspecialidad;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Font;

public class Panel_admin_usuario_paciente_consultarCita extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JDesktopPane miDesktopPane;
	DefaultTableModel modeloTabla = new DefaultTableModel();
	private JButton btn_modificar;
	private JButton btn_Crear;
	private JPanel panel;
	private JTextField tf_buscarCita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_usuario_paciente_consultarCita frame = new Panel_admin_usuario_paciente_consultarCita();
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
	public Panel_admin_usuario_paciente_consultarCita() {
		setBorder(null);
		setRootPaneCheckingEnabled(false);
		this.modeloTabla = new DefaultTableModel();

		// Configurar las columnas del modelo
		String[] columnas = { "ID Cita", "ID Tratamiento", "Observaciones", "Fecha", "Hora", "Nombre Paciente" };
		modeloTabla.setColumnIdentifiers(columnas);

		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 1018, 576);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 1018, 549);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_citas = new JLabel("Citas");
		lbl_citas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_citas.setBounds(10, 11, 46, 14);
		panel.add(lbl_citas);

		tf_buscarCita = new JTextField();
		tf_buscarCita.setBounds(87, 149, 115, 20);
		panel.add(tf_buscarCita);
		tf_buscarCita.setColumns(10);
		// Inicializar la tabla y el modelo
		this.table = new JTable();

		// Establecer el modelo en la tabla
		table.setModel(modeloTabla);
		 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	        centerRenderer.setHorizontalAlignment(JLabel.CENTER); // Centrar el contenido

	        for (int i = 0; i < table.getColumnCount(); i++) {
	            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
	        }
		// Configurar la posición y el tamaño de la tabla
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(87, 201, 869, 234);
		panel.add(scrollPane);

		JButton btn_buscarcita = new JButton("Buscar cita");
		btn_buscarcita.setBounds(237, 148, 106, 23);
		panel.add(btn_buscarcita);

		btn_modificar = new JButton("Modificar cita");
		btn_modificar.setBounds(237, 74, 117, 23);
		panel.add(btn_modificar);

		btn_Crear = new JButton("Crear cita");
		btn_Crear.setBounds(87, 74, 117, 23);
		panel.add(btn_Crear);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(
				new ImageIcon(Panel_admin_usuario_paciente_consultarCita.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 549);
		panel.add(lblNewLabel);
		btn_Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Panel_admin_usuario_crearcita crearCita = new Panel_admin_usuario_crearcita();
				crearCita.setBorder(null);
				crearCita.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(crearCita);
				((BasicInternalFrameUI) crearCita.getUI()).setNorthPane(null);
				crearCita.setLocation(0, 0);
				crearCita.show();
				crearCita.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());

			}
		});

		btn_modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tf_buscarCita.getText());
				if (id == 0) {
					System.out.println("aqui esta el error");
				} else {
					try {
						ConexionMySQL.conectar();
						obtenerDatosFilaSeleccionada();
					} catch (SQLException | ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			} 
		});
		
//Boton buscar cita 
		btn_buscarcita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//Comprobamos que no haya dejado en blanco el textField del id    
				
				try {
				    if (esNumeroEntero(tf_buscarCita.getText())) {
				        int id = Integer.parseInt(tf_buscarCita.getText());
				        ConexionMySQL.conectar();

				        ConsultaCita cita = ConexionMySQL.consultaCitaId(id);

				        // Limpiar la tabla antes de agregar nuevas filas
				        limpiarTabla();

				        // Agregar filas a la tabla
				        if (cita != null) {
				            agregarFilaConsultaCita(cita);
				        } else {
				            JOptionPane.showMessageDialog(tf_buscarCita, "No se encontró ninguna cita con ese Id", "Información",
				                    JOptionPane.INFORMATION_MESSAGE);
				        }
				    } else {
				        String nombre = tf_buscarCita.getText();
				        ConexionMySQL.conectar();

				        ConsultaCita cita = ConexionMySQL.consultarCitaNombre(nombre);
				     
				        // Limpiar la tabla antes de agregar nuevas filas
				        limpiarTabla();

				        // Agregar filas a la tabla
				        if (cita != null) {
				            agregarFilaConsultaCita(cita); 
				        } else {
				            JOptionPane.showMessageDialog(tf_buscarCita, "No se encontró ninguna cita con ese Nombre", "Información",
				                    JOptionPane.INFORMATION_MESSAGE);
				        }
				    }
				} catch (NumberFormatException | ClassNotFoundException | SQLException ex) {
				    ex.printStackTrace();
				    JOptionPane.showMessageDialog(tf_buscarCita, "Error al buscar la cita: " + ex.getMessage(), "Error",
				            JOptionPane.ERROR_MESSAGE);
				} 
				}

			
		});

	}

	// Método para simular la obtención de ConsultaCita desde la base de datos

	private void agregarFilaConsultaCita(ConsultaCita consultaCita) {
		// Asegurarse de que la consultaCita no sea null antes de agregar la fila
		if (consultaCita != null) {
			Object[] fila = { consultaCita.getId_cita(),consultaCita.getId_tratamiento(), consultaCita.getObservaciones(),
					consultaCita.getFecha(), consultaCita.getHora(),consultaCita.getNombrePaciente() };
			modeloTabla.addRow(fila);
		}

		else {

			// Aquí puedes manejar el caso en que no se encuentra la consultaCita
			JOptionPane.showMessageDialog(this, "id no encontrado en la base de datos", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void obtenerDatosFilaSeleccionada() throws SQLException, ClassNotFoundException {
		// Obtener el índice de la fila seleccionada
		int filaSeleccionada = table.getSelectedRow();

		// Verificar si se ha seleccionado alguna fila
		if (filaSeleccionada != -1) {
			// Obtener los valores de las celdas en la fila seleccionada
			int idCita = (int) table.getValueAt(filaSeleccionada, 0);
			int idTratamiento = (int) table.getValueAt(filaSeleccionada, 1);
			String observaciones = (String) table.getValueAt(filaSeleccionada, 2);
			String fecha = (String) table.getValueAt(filaSeleccionada, 3);
			String hora = (String) table.getValueAt(filaSeleccionada, 4);
			String paciente = (String) table.getValueAt(filaSeleccionada, 5);

			// Crear un objeto Cita con los valores obtenidos
			ConsultaCita cita = new ConsultaCita();
			cita.setId_cita(idCita);
			cita.setNombrePaciente(paciente);
			cita.setId_tratamiento(idTratamiento);
			cita.setObservaciones(observaciones);
			cita.setFecha(fecha);
			cita.setHora(hora);

			ConexionMySQL.conectar();
			ConexionMySQL.insertarCita(cita);



		} else {
			JOptionPane.showMessageDialog(null, "Seleccione una fila primero", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para limpiar la tabla
	private void limpiarTabla() {
		modeloTabla.setRowCount(0);
	}
	 private static boolean esNumeroEntero(String input) {
	        try {
	            // Intentar convertir la cadena a un número entero
	            int se=Integer.parseInt(input);
	            return true;
	        } catch (NumberFormatException e) {
	            // Capturar la excepción si la conversión falla
	            return false;
	        }
	    }

	public void setDesktopPane(JDesktopPane desktopPane) {
		this.miDesktopPane = desktopPane;
	}
}