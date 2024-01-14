package Vista.Material;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import Conexion.ConexionMySQL;
import Modelo.ConsultaCita;
import Modelo.StockMaterial;
import Vista.gestionEconomica.JDialog_admin_gestionEconomica_Mixto;
import Vista.gestionMedica.Odontograma;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioMaterial extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_buscar;
	private JDesktopPane miDesktopPane;
	private DefaultTableModel modelMaterial;
	private JScrollPane scrollPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioMaterial frame = new InicioMaterial();
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
	public InicioMaterial() {
		setBorder(null);
		setBounds(100, 100, 1018, 476);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 476);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		tf_buscar = new JTextField();
		tf_buscar.setBounds(82, 154, 117, 23);
		panel.add(tf_buscar);
		tf_buscar.setColumns(10);
		
		table = new JTable();
		table.setBounds(82, 185, 711, 208);
		table.setAutoCreateRowSorter(true); // Esto permite ordenar las filas haciendo clic en los encabezados
        table.getTableHeader().setReorderingAllowed(false); // Esto evita que las columnas se reorganicen mediante arrastrar y soltar
		panel.add(table);
		
		
		 JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(82,188,845,214);
	        String[] columnas = {"Id_material", "Proveedor", "Nombre", "Disponible", "Solicitado", "Bajo_pedido", "Precio" };
	        panel.add(scrollPane);

	        modelMaterial = new DefaultTableModel();
	        modelMaterial.setColumnIdentifiers(columnas);
		
	        try {
	            ConexionMySQL.conectar();
	            
	           
	            
	            contruirTablaMaterial(ConexionMySQL.ejecutarSelect("SELECT\r\n"
	            		+ "    sm.id_material,\r\n"
	            		+ "    p.nombre AS nombre_proveedor,\r\n"
	            		+ "    sm.nombre,\r\n"
	            		+ "    sm.disponible,\r\n"
	            		+ "    sm.solicitado,\r\n"
	            		+ "    sm.bajo_pedido,\r\n"
	            		+ "    sm.precio\r\n"
	            		+ "FROM\r\n"
	            		+ "    stock_material sm\r\n"
	            		+ "JOIN\r\n"
	            		+ "    proveedor p ON sm.id_proveedor = p.id_proveedor;"));
	            
	          
	        } catch (SQLException | ClassNotFoundException e1) {
	            e1.printStackTrace();
	        }
		
		
		
		
		JButton btn_solicitudes = new JButton("Solicitudes");
		btn_solicitudes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					abrirSolicitudes(getDesktopPane());
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_solicitudes.setBounds(82, 25, 117, 23);
		panel.add(btn_solicitudes);
		
		JButton btn_buscar = new JButton("buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ConexionMySQL.conectar();
					StockMaterial material =ConexionMySQL.consultarMaterial(tf_buscar.getText());
					

			    
			     
			        // Limpiar la tabla antes de agregar nuevas filas
			        limpiarTabla();

			        // Agregar filas a la tabla
			        if (material != null) {
			        	agregarFilaConsultaMaterial(material); 
			        } else {
			            JOptionPane.showMessageDialog(tf_buscar, "No se encontró ninguna cita con ese Nombre", "Información",
			                    JOptionPane.INFORMATION_MESSAGE);
			        }
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btn_buscar.setBounds(237, 154, 117, 23);
		panel.add(btn_buscar);
		
		JButton btn_stock = new JButton("Stock");
		btn_stock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					abrirStock(getDesktopPane());
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_stock.setBounds(237, 25, 117, 23);
		panel.add(btn_stock);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(InicioMaterial.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 476);
		panel.add(lblNewLabel);

	}
	
	private void agregarFilaConsultaMaterial(StockMaterial material) {
		// Asegurarse de que la consultaCita no sea null antes de agregar la fila
		if (material != null) {
			Object[] fila = { material.getIdMaterial(), material.getNombre(),material.getNombreProveedor(),
					material.getDisponible(), material.getSolicitado(),material.getBajoPedido(),material.getPrecio() };
			modelMaterial.addRow(fila);
		}

		else {

			// Aquí puedes manejar el caso en que no se encuentra la consultaCita
			JOptionPane.showMessageDialog(this, "id no encontrado en la base de datos", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private static void abrirSolicitudes(JDesktopPane desktopPane) throws PropertyVetoException {

		JDialog_solicitud soli=new JDialog_solicitud();
		
		soli.setVisible(true);
		soli.setLocation(200, 200);
		soli.setModal(true);
		soli.setUndecorated(true);
		soli.dispose();
	}
	
	private static void abrirStock(JDesktopPane desktopPane) throws PropertyVetoException {

		material_stock stock = new material_stock();
		stock.setBorder(null);
		((BasicInternalFrameUI) stock.getUI()).setNorthPane(null);
		stock.setLocation(0, 0);
		stock.show();
		stock.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		stock.setVisible(true);
		desktopPane.add(stock); // Usar el parámetro en lugar de la variable local
		stock.setSelected(true);
	}
	  private void contruirTablaMaterial(ResultSet rs) {
	        try {
	            while (rs.next()) {
	                Object[] fila = new Object[7]; // Hay 2 columna que mostrar
	            
	                fila[0] = rs.getInt(1);
	                fila[1] = rs.getString(2);
	                fila[2] = rs.getString(3);
	                fila[3] = rs.getInt(4);
	                fila[4] = rs.getInt(5);
	                fila[5] = rs.getInt(6);
	                fila[6] = rs.getDouble(7);

	                modelMaterial.addRow(fila);
	            }

	            table.setModel(modelMaterial);


	          

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	  private void limpiarTabla() {
			modelMaterial.setRowCount(0);
		}
}
