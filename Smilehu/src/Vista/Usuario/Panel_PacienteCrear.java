package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Conexion.ConexionMySQL;
import Modelo.Paciente;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Panel_PacienteCrear extends JInternalFrame {


	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JDesktopPane miDesktopPane_1;
	private JTextField tf_nombre;
	private JTextField tf_fechaNacimiento;
	private JTextField tf_apellidos;
	private JTextField tf_telefono;
	private JTextField tf_direccion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_PacienteCrear frame = new Panel_PacienteCrear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane_1 = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Panel_PacienteCrear() {
		setBounds(100, 100, 595, 398);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_ficha = new JLabel("Ficha de Paciente");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		

		
		
		/*Botones Sexo*/
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		lbl_sexo.setBounds(258, 194, 48, 21);
		contentPanel.add(lbl_sexo);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(161, 222, 109, 23);
		contentPanel.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(293, 222, 109, 23);
		contentPanel.add(rdbtn_femenino);
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_masculino);
		g1.add(rdbtn_femenino);
		
		ButtonGroup g2 = new ButtonGroup();
		
		JLabel lbl_dni_1 = new JLabel("Nombre");
		lbl_dni_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni_1.setForeground(Color.BLACK);
		lbl_dni_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_dni_1.setBounds(183, 22, 46, 14);
		contentPanel.add(lbl_dni_1);
		
		tf_nombre = new JTextField();
		tf_nombre.setColumns(10);
		tf_nombre.setBounds(144, 54, 126, 20);
		contentPanel.add(tf_nombre);
		
		tf_fechaNacimiento = new JTextField();
		tf_fechaNacimiento.setColumns(10);
		tf_fechaNacimiento.setBounds(144, 112, 126, 20);
		contentPanel.add(tf_fechaNacimiento);
		
		JLabel lbl_nombre_1 = new JLabel("Fecha nacimiento");
		lbl_nombre_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_1.setForeground(Color.BLACK);
		lbl_nombre_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre_1.setBounds(161, 97, 92, 14);
		contentPanel.add(lbl_nombre_1);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setColumns(10);
		tf_apellidos.setBounds(293, 54, 126, 20);
		contentPanel.add(tf_apellidos);
		
		JLabel lbl_nombre_2 = new JLabel("Apellidos");
		lbl_nombre_2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_2.setForeground(Color.BLACK);
		lbl_nombre_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre_2.setBounds(336, 22, 48, 14);
		contentPanel.add(lbl_nombre_2);
		
		JLabel lbl_apellidos_1 = new JLabel("Direccion");
		lbl_apellidos_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_apellidos_1.setForeground(Color.BLACK);
		lbl_apellidos_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos_1.setBounds(336, 97, 48, 14);
		contentPanel.add(lbl_apellidos_1);
		
		JLabel lbl_sexo_1 = new JLabel("Teléfono");
		lbl_sexo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_sexo_1.setForeground(Color.BLACK);
		lbl_sexo_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo_1.setBounds(258, 139, 48, 14);
		contentPanel.add(lbl_sexo_1);
		
		tf_telefono = new JTextField();
		tf_telefono.setColumns(10);
		tf_telefono.setBounds(221, 164, 126, 20);
		contentPanel.add(tf_telefono);
		
		tf_direccion = new JTextField();
		tf_direccion.setColumns(10);
		tf_direccion.setBounds(293, 112, 126, 20);
		contentPanel.add(tf_direccion);
		
		JButton btn_CrearPaciente = new JButton("Crear Paciente");
		btn_CrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String genero="";
				if(rdbtn_femenino.isSelected()) {
					genero="Mujer";
					
				}else if(rdbtn_masculino.isSelected()) {
					genero="Hombre";
					
				}else {
					
				}
				
				try {
					ConexionMySQL.conectar();
					Paciente paciente = new Paciente( tf_nombre.getText(), tf_apellidos.getText(),
							tf_direccion.getText(), genero, tf_telefono.getText(),
							tf_fechaNacimiento.getText());
					
					
					ConexionMySQL.insertarPaciente(paciente);
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		btn_CrearPaciente.setBounds(221, 276, 126, 23);
		contentPanel.add(btn_CrearPaciente);
	}
}
