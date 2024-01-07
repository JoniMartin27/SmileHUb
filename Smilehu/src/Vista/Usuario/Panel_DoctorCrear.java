package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Panel_DoctorCrear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_iddoctor;
	private JTextField tf_direccion;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_idespecialidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_DoctorCrear frame = new Panel_DoctorCrear();
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
	public Panel_DoctorCrear() {
		setBounds(100, 100, 862, 562);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		
		
		JLabel lbl_ficha = new JLabel("Ficha crear Doctor");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		
		/*DNI*/
		JLabel lbl_idDoctor = new JLabel("ID Doctor:");
		lbl_idDoctor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_idDoctor.setForeground(new Color(0, 0, 0));
		lbl_idDoctor.setBounds(207, 108, 61, 14);
		contentPanel.add(lbl_idDoctor);
		
		tf_iddoctor = new JTextField();
		tf_iddoctor.setBounds(358, 108, 116, 20);
		contentPanel.add(tf_iddoctor);
		tf_iddoctor.setColumns(10);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(207, 158, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(358, 156, 116, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		lbl_apellidos.setBounds(207, 183, 102, 14);
		contentPanel.add(lbl_apellidos);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(358, 181, 116, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(207, 208, 173, 14);
		contentPanel.add(lbl_direccion);
		
		tf_direccion = new JTextField();
		tf_direccion.setBounds(358, 206, 116, 20);
		contentPanel.add(tf_direccion);
		tf_direccion.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		/*Botones Sexo*/
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		lbl_sexo.setBounds(207, 246, 48, 14);
		contentPanel.add(lbl_sexo);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(361, 246, 109, 23);
		contentPanel.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(493, 246, 109, 23);
		contentPanel.add(rdbtn_femenino);
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_masculino);
		g1.add(rdbtn_femenino);
		
		
		
		
		/*Botones Alta/Baja*/
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		lbl_altabaja.setBounds(207, 293, 173, 14);
		contentPanel.add(lbl_altabaja);

		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(358, 293, 68, 23);
		contentPanel.add(rdbtn_alta);
		
		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(453, 293, 68, 23);
		contentPanel.add(rdbtn_baja);
		
		ButtonGroup g2 = new ButtonGroup();
		g1.add(rdbtn_baja);
		g1.add(rdbtn_alta);
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_idespecialidad.setBounds(207, 133, 173, 14);
		contentPanel.add(lbl_idespecialidad);
		
		tf_idespecialidad = new JTextField();
		tf_idespecialidad.setBounds(358, 131, 116, 20);
		contentPanel.add(tf_idespecialidad);
		tf_idespecialidad.setColumns(10);
		
		JButton btn_crearDoctor = new JButton("Crear Doctor");
		btn_crearDoctor.setBounds(332, 404, 147, 23);
		contentPanel.add(btn_crearDoctor);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCrear.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 846, 532);
		contentPanel.add(lblNewLabel);
		
	}
}
