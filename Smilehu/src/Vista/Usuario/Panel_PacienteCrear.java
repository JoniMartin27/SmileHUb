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
import javax.swing.ImageIcon;

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
		setBorder(null);
		setBounds(100, 100, 1018, 576);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		

		
		
		/*Botones Sexo*/
		
		
		ButtonGroup g1 = new ButtonGroup();
		
		ButtonGroup g2 = new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 549);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_nombre_1 = new JLabel("Fecha nacimiento");
		lbl_nombre_1.setBounds(155, 194, 120, 14);
		panel.add(lbl_nombre_1);
		lbl_nombre_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_1.setForeground(Color.BLACK);
		lbl_nombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tf_fechaNacimiento = new JTextField();
		tf_fechaNacimiento.setBounds(155, 211, 225, 20);
		panel.add(tf_fechaNacimiento);
		tf_fechaNacimiento.setColumns(10);
		
		tf_direccion = new JTextField();
		tf_direccion.setBounds(155, 319, 225, 20);
		panel.add(tf_direccion);
		tf_direccion.setColumns(10);
		
		JLabel lbl_apellidos_1 = new JLabel("Direccion");
		lbl_apellidos_1.setBounds(155, 302, 66, 14);
		panel.add(lbl_apellidos_1);
		lbl_apellidos_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_apellidos_1.setForeground(Color.BLACK);
		lbl_apellidos_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_sexo_1 = new JLabel("Teléfono");
		lbl_sexo_1.setBounds(155, 242, 144, 14);
		panel.add(lbl_sexo_1);
		lbl_sexo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_sexo_1.setForeground(Color.BLACK);
		lbl_sexo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tf_telefono = new JTextField();
		tf_telefono.setBounds(157, 271, 225, 20);
		panel.add(tf_telefono);
		tf_telefono.setColumns(10);
		JLabel lbl_genero = new JLabel("Género");
		lbl_genero.setBounds(155, 350, 144, 21);
		panel.add(lbl_genero);
		lbl_genero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_genero.setForeground(new Color(0, 0, 0));
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(155, 400, 109, 23);
		panel.add(rdbtn_masculino);
		g1.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(310, 400, 109, 23);
		panel.add(rdbtn_femenino);
		g1.add(rdbtn_femenino);
		
		JButton btn_CrearPaciente = new JButton("Crear Paciente");
		btn_CrearPaciente.setBounds(413, 479, 126, 23);
		panel.add(btn_CrearPaciente);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(155, 141, 225, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(430, 141, 225, 20);
		panel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		JLabel lbl_nombre_2 = new JLabel("Apellidos");
		lbl_nombre_2.setBounds(430, 116, 66, 14);
		panel.add(lbl_nombre_2);
		lbl_nombre_2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre_2.setForeground(Color.BLACK);
		lbl_nombre_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_dni_1 = new JLabel("Nombre");
		lbl_dni_1.setBackground(new Color(131, 167, 197));
		lbl_dni_1.setBounds(155, 116, 120, 14);
		panel.add(lbl_dni_1);
		lbl_dni_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_dni_1.setForeground(Color.BLACK);
		lbl_dni_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_ficha = new JLabel("Ficha de Paciente");
		lbl_ficha.setBounds(25, 11, 173, 14);
		panel.add(lbl_ficha);
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_PacienteCrear.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 549);
		panel.add(lblNewLabel);
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
	}
}
