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
import javax.swing.table.DefaultTableModel;

import Controlador.ConexionMySQL;
import Modelo.ConsultaCita;
import Modelo.Paciente;
import Vista.gestionMedica.Panel_admin_gestionMedica_CrearTratamiento;

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

public class Panel_admin_usuario_paciente_consultarCita extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_buscarCita;
	private JTable table;
	private JDesktopPane miDesktopPane;
	DefaultTableModel modeloTabla = new DefaultTableModel();
	private JButton btn_modificar;
	private JButton btn_insertarCita;

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
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_admin_usuario_paciente_consultarCita() {
		// Inicializar la tabla y el modelo
        this.table = new JTable();
        this.modeloTabla = new DefaultTableModel();

        // Establecer el modelo en la tabla
        table.setModel(modeloTabla);

        // Configurar las columnas del modelo
        String[] columnas = {"ID Doctor", "ID Tratamiento", "ID Historial", "Observaciones", "Fecha", "Hora"};
        modeloTabla.setColumnIdentifiers(columnas);

        getContentPane().setBackground(new Color(159, 232, 223));
        setBounds(100, 100, 652, 381);
        getContentPane().setLayout(null);

        // Configurar la posición y el tamaño de la tabla
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 153, 600, 150);
        getContentPane().add(scrollPane);

        tf_buscarCita = new JTextField();
        tf_buscarCita.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Al obtener el foco, se elimina el texto predeterminado
                if (tf_buscarCita.getText().equals("Insertar ID cita")) {
                	tf_buscarCita.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Al perder el foco, si el campo está vacío, se vuelve a establecer el texto predeterminado
                if (tf_buscarCita.getText().isEmpty()) {
                    tf_buscarCita.setText("Insertar ID cita");
                }
            }
        });
    
        tf_buscarCita.setBounds(99, 122, 185, 20);
        getContentPane().add(tf_buscarCita);
        tf_buscarCita.setColumns(10);

        JButton btn_buscarcita = new JButton("Buscar");
        btn_buscarcita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
//Comprobamos que no haya dejado en blanco el textField del id    
                if(!tf_buscarCita.getText().equals("Insertar ID cita")) {
                	try {
                		 int id = Integer.parseInt(tf_buscarCita.getText());
                		 	ConexionMySQL.conectar();
                		 	ConsultaCita cita;
                		 
     					cita = ConexionMySQL.consultaCita(id);
// Limpiar la tabla antes de agregar nuevas filas
     	                limpiarTabla();
 // Agregar la fila a la tabla
     	                agregarFilaConsultaCita(cita);
                	}catch(NumberFormatException ex) {
                		ex.getLocalizedMessage();
                		System.out.println("Fallo al insertar String");
                		JOptionPane.showMessageDialog(tf_buscarCita, "Introduce únicamente números","Error", JOptionPane.ERROR_MESSAGE);
                        
                	}catch (ClassNotFoundException | SQLException e1) {
    				
    					e1.printStackTrace();
    				}
                	

                    
                   
    				
                }else {
                	JOptionPane.showMessageDialog(tf_buscarCita, "Inserta un id ","Error", JOptionPane.ERROR_MESSAGE);
                    
                }
               
			
               
            }
        });
        btn_buscarcita.setBounds(370, 119, 97, 23);
        getContentPane().add(btn_buscarcita);
        
        btn_modificar = new JButton("Modificar cita");
        btn_modificar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int id=Integer.parseInt(tf_buscarCita.getText());
        		if(id==0) {
        			System.out.println("aqui esta el error");
        		}else {
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
        btn_modificar.setBounds(116, 43, 117, 23);
        getContentPane().add(btn_modificar);
        
        btn_insertarCita = new JButton("Insertar cita");
        btn_insertarCita.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
        btn_insertarCita.setBounds(243, 43, 122, 23);
        getContentPane().add(btn_insertarCita);

       
    }

    // Método para simular la obtención de ConsultaCita desde la base de datos
    

    private void agregarFilaConsultaCita(ConsultaCita consultaCita) {
        // Asegurarse de que la consultaCita no sea null antes de agregar la fila
        if (consultaCita != null) {
            Object[] fila = {
            		consultaCita.getId_doctor(),
                    consultaCita.getId_tratamiento(),
                    consultaCita.getId_historial(),
                    consultaCita.getObservaciones(),
                    consultaCita.getFecha(),
                    consultaCita.getHora()
            };
            modeloTabla.addRow(fila);
        }
        	
        
        else {
        	
            // Aquí puedes manejar el caso en que no se encuentra la consultaCita
            JOptionPane.showMessageDialog(this, "id no encontrado en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void obtenerDatosFilaSeleccionada() throws SQLException {
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = table.getSelectedRow();

        // Verificar si se ha seleccionado alguna fila
        if (filaSeleccionada != -1) {
            // Obtener los valores de las celdas en la fila seleccionada
            int idDoctor = (int) table.getValueAt(filaSeleccionada, 0);
            int idTratamiento = (int) table.getValueAt(filaSeleccionada, 1);
            int idHistorial = (int) table.getValueAt(filaSeleccionada, 2);
            String observaciones = (String) table.getValueAt(filaSeleccionada, 3);
            String fecha = (String) table.getValueAt(filaSeleccionada, 4);
            String hora = (String) table.getValueAt(filaSeleccionada, 5);

            // Crear un objeto Cita con los valores obtenidos
            ConsultaCita cita=new ConsultaCita();
            cita.setId_doctor(idDoctor);
            cita.setId_tratamiento(idTratamiento);
            cita.setId_historial(idHistorial);
            cita.setObservaciones(observaciones);
            cita.setFecha(fecha);
            cita.setHora(hora);
            ConexionMySQL.insertarCita(cita);
            
            // Puedes imprimir los valores, pasarlo a un formulario de edición, etc.
            System.out.println("Datos de la fila seleccionada:");
            System.out.println("ID Doctor: " + cita.getId_doctor());
            System.out.println("ID Tratamiento: " + cita.getId_tratamiento());
           
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para limpiar la tabla
    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }
}