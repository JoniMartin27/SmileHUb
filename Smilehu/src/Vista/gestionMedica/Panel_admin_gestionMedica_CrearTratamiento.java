package Vista.gestionMedica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Conexion.ConexionMySQL;
import Modelo.Especialidad;
import Modelo.Tratamiento;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;

public class Panel_admin_gestionMedica_CrearTratamiento extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tf_NombreTratamiento;
	private JTextField tf_PrecioTratamiento;
	private JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_gestionMedica_CrearTratamiento frame = new Panel_admin_gestionMedica_CrearTratamiento();
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
	public Panel_admin_gestionMedica_CrearTratamiento() {
		setBorder(null);
	setBounds(219, 44, 1018,576);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 232, 223));
		panel.setBounds(0, 0, 1018, 546);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox<String> cb_especialidad = new JComboBox<>();
		cb_especialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb_especialidad.setBounds(225, 262, 160, 20);
		panel.add(cb_especialidad);
		
		
		//Llenamos el comboBox de especialidad con las especialidades
		cargarEspecialidad(cb_especialidad);
		
		
		
		
		table = new JTable();
		table.setBounds(694, 132, 244, 275);
		panel.add(table);
		
		JLabel lbl_NombreTratamiento = new JLabel("Nombre Tratamiento");
		lbl_NombreTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_NombreTratamiento.setBounds(53, 124, 162, 14);
		panel.add(lbl_NombreTratamiento);
		
		tf_NombreTratamiento = new JTextField();
		tf_NombreTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_NombreTratamiento.setBounds(225, 121, 160, 20);
		panel.add(tf_NombreTratamiento);
		tf_NombreTratamiento.setColumns(10);
		
		JLabel lbl_PrecioTratamiento = new JLabel("Precio Tratamiento");
		lbl_PrecioTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_PrecioTratamiento.setBounds(55, 195, 160, 14);
		panel.add(lbl_PrecioTratamiento);
		
		tf_PrecioTratamiento = new JTextField();
		tf_PrecioTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_PrecioTratamiento.setBounds(225, 192, 160, 20);
		panel.add(tf_PrecioTratamiento);
		tf_PrecioTratamiento.setColumns(10);
		
		JLabel lbl_Especialidad = new JLabel("Especialidad");
		lbl_Especialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Especialidad.setBounds(55, 266, 160, 14);
		panel.add(lbl_Especialidad);
		
		JButton btn_CrearTratamiento = new JButton("Crear Tratamiento");
		btn_CrearTratamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_CrearTratamiento.setBounds(276, 362, 197, 23);
		btn_CrearTratamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Creamos un objeto de especialidad para pasarle los valores nombre e id, para des`pues insetrtarlos en la tabla tratamiento
				Especialidad esp=new Especialidad();
				//Conversión String a int de tratamiento
				double precio=Double.parseDouble(tf_PrecioTratamiento.getText());
				
				//Buscamos la especialidad elegida en la base de datos
				try {
					esp=ConexionMySQL.buscarEspecialidad(cb_especialidad.getSelectedItem().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Creamos el objeto de tratamiento para insertarlo
				Tratamiento tratamiento =new Tratamiento(esp.getIdEspecialidad(),precio,tf_NombreTratamiento.getText());
				try {
					ConexionMySQL.conectar();//Conectamos a la base de datos
					ConexionMySQL.insertarTratamiento(tratamiento);//Insertamos en la base de datos
					JOptionPane.showMessageDialog(btn_CrearTratamiento, "Tratamiento correctamente creado", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(btn_CrearTratamiento, "Tratamiento no insertado", "Error",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				
			}
		});
		panel.add(btn_CrearTratamiento);
		
		JLabel lblNewLabel_1 = new JLabel("Listado Tratamientos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(733, 107, 205, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1018, 546);
		lblNewLabel.setIcon(new ImageIcon(Panel_admin_gestionMedica_CrearTratamiento.class.getResource("/img/fondoDientes.jpg")));
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
