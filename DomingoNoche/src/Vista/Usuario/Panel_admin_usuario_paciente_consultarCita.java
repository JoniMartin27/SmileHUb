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

        // Resto del código...
    }

    // Método para simular la obtención de ConsultaCita desde la base de datos
    

    private void agregarFilaConsultaCita(ConsultaCita consultaCita) {
        // Asegurarse de que la consultaCita no sea null antes de agregar la fila
        if (consultaCita != null) {
            Object[] fila = {

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

    // Método para limpiar la tabla
    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }
}