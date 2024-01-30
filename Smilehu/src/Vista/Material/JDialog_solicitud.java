package Vista.Material;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Conexion.ConexionMySQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialog_solicitud extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	 private DefaultTableModel model;
	    private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_solicitud dialog = new JDialog_solicitud();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_solicitud() {
		setBounds(850, 350, 694, 605);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 678, 566);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		
		table = new JTable();
		table.setBounds(70, 38, 528, 438);
		panel.add(table);
		 JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(6,57,666,428);
	        panel.add(scrollPane);
	        String[] columnas = {"id_solicitud", "nombreMaterial","Cantidad","NombreProveedor" };
	        
	        

	        model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnas);
	        
	        try {
				ConexionMySQL.conectar();
				contruirTablaSolicitudes(ConexionMySQL.ejecutarSelect("SELECT\r\n"
						+ "    s.id_solicitud,\r\n" 
				 		+ "    m.nombre AS nombre_material,\r\n"
				 		+ "    s.cantidad,\r\n"
				 		+ "    p.nombre AS nombre_proveedor\r\n"
				 		+ "FROM\r\n"
				 		+ "    prdatos.solicitud s\r\n"
				 		+ "JOIN\r\n"
				 		+ "    prdatos.stock_material m ON s.id_material = m.id_material\r\n"
				 		+ "JOIN\r\n"
				 		+ "    prdatos.proveedor p ON s.id_proveedor = p.id_proveedor;"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		JLabel lbl_solicitudes = new JLabel("SOLICITUDES");
		lbl_solicitudes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_solicitudes.setBounds(10, 11, 167, 14);
		panel.add(lbl_solicitudes);
		
		JButton btn_rechazar = new JButton("Rechazar");
		btn_rechazar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_rechazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RechazarSolicitud();
				JOptionPane.showMessageDialog(btn_rechazar, "Solicitud Rechazada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btn_rechazar.setBounds(450, 508, 155, 23);
		panel.add(btn_rechazar);
		
		JButton btn_aceptar = new JButton("Aceptar");
		btn_aceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  procesarSolicitudSeleccionada(); 
				  JOptionPane.showMessageDialog(btn_aceptar, "Solicitud Aceptada, Procesando Mercancía", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			}});
				
	
				
	
		btn_aceptar.setBounds(88, 508, 155, 23);
		panel.add(btn_aceptar);
	   
	        
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JDialog_solicitud.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 678, 566);
		panel.add(lblNewLabel);
	}
	
	private void RechazarSolicitud() {
        // Obtén la fila seleccionada de la tabla
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            try {
                // Obtén los datos necesarios de la fila seleccionada
                Object idSolicitudObject = table.getValueAt(filaSeleccionada, 0);
                int idSolicitudRechazada = Integer.parseInt(idSolicitudObject.toString());

               

                // Construye la consulta SQL para eliminar la fila de la tabla solicitud
                String consultaDelete = "DELETE FROM solicitud WHERE id_solicitud = " + idSolicitudRechazada + ";";

             
                // Ejecuta la consulta de eliminación
                ConexionMySQL.ejecutarInsertDeleteUpdate(consultaDelete);

                // Refresca la tabla de solicitudes
                limpiarTabla();
                contruirTablaSolicitudes(ConexionMySQL.ejecutarSelect("SELECT\r\n"
                		+ "    s.id_solicitud,\r\n"
                		+ "    m.nombre AS nombre_material,\r\n"
                		+ "    s.cantidad,\r\n"
                		+ "    p.nombre AS nombre_proveedor\r\n"
                		+ "FROM\r\n"
                		+ "    prdatos.solicitud s\r\n"
                		+ "JOIN\r\n"
                		+ "    prdatos.stock_material m ON s.id_material = m.id_material\r\n"
                		+ "JOIN\r\n"
                		+ "    prdatos.proveedor p ON s.id_proveedor = p.id_proveedor;"));
            } catch (SQLException ex) {
                ex.printStackTrace();
                // Maneja la excepción según sea necesario
            }
        }
    }

	
	
	 private void procesarSolicitudSeleccionada() {
	        // Obtén la fila seleccionada de la tabla
	        int filaSeleccionada = table.getSelectedRow();

	        if (filaSeleccionada != -1) {
	            try {
	                // Obtén los datos necesarios de la fila seleccionada
	                Object idSolicitudObject = table.getValueAt(filaSeleccionada, 0);
	                int idSolicitudAceptada = Integer.parseInt(idSolicitudObject.toString());

	                // Construye la consulta SQL para actualizar la cantidad en el material
	                String consultaUpdate = "UPDATE stock_material sm "
	                        + "JOIN solicitud s ON sm.id_material = s.id_material "
	                        + "SET sm.disponible = sm.disponible + s.cantidad "
	                        + "WHERE s.id_solicitud = " + idSolicitudAceptada
	                        + " AND sm.id_material = s.id_material ";

	                // Construye la consulta SQL para eliminar la fila de la tabla solicitud
	                String consultaDelete = "DELETE FROM solicitud WHERE id_solicitud = " + idSolicitudAceptada + ";";

	                // Ejecuta la consulta de actualización
	                ConexionMySQL.ejecutarInsertDeleteUpdate(consultaUpdate);

	                // Ejecuta la consulta de eliminación
	                ConexionMySQL.ejecutarInsertDeleteUpdate(consultaDelete);

	                // Refresca la tabla de solicitudes
	                limpiarTabla();
	                contruirTablaSolicitudes(ConexionMySQL.ejecutarSelect("SELECT\r\n"
	                		+ "    s.id_solicitud,\r\n"
	                		+ "    m.nombre AS nombre_material,\r\n"
	                		+ "    s.cantidad,\r\n"
	                		+ "    p.nombre AS nombre_proveedor\r\n"
	                		+ "FROM\r\n"
	                		+ "    prdatos.solicitud s\r\n"
	                		+ "JOIN\r\n"
	                		+ "    prdatos.stock_material m ON s.id_material = m.id_material\r\n"
	                		+ "JOIN\r\n"
	                		+ "    prdatos.proveedor p ON s.id_proveedor = p.id_proveedor;"));
	                
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	                // Maneja la excepción según sea necesario
	            }
	        }
	        
	        
	        
	        
	    }
	
	
	
	
	private void limpiarTabla() {
		model.setRowCount(0);
	}
	
	
	
    private void contruirTablaSolicitudes(ResultSet rs) {
        try {
            while (rs.next()) {
                Object[] fila = new Object[4]; // Hay 4 columna que mostrar ocultando id solicitud
            
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
           
                

                model.addRow(fila);
            }

            table.setModel(model);


          

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
    }
