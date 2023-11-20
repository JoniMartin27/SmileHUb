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
		setBounds(100, 100, 450, 300);
		setBounds(100, 100, 584, 389);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		
		
		JLabel lbl_ficha = new JLabel("Ficha crear Doctor");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		
		/*DNI*/
		JLabel lbl_id = new JLabel("ID:");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_id.setForeground(new Color(0, 0, 0));
		lbl_id.setBounds(23, 36, 61, 14);
		contentPanel.add(lbl_id);
		
		tf_iddoctor = new JTextField();
		tf_iddoctor.setBounds(235, 35, 116, 20);
		contentPanel.add(tf_iddoctor);
		tf_iddoctor.setColumns(10);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(23, 86, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(235, 83, 116, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		lbl_apellidos.setBounds(23, 111, 102, 14);
		contentPanel.add(lbl_apellidos);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(235, 108, 116, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_direccion = new JLabel("Dirección");
		lbl_direccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		lbl_direccion.setBounds(23, 136, 173, 14);
		contentPanel.add(lbl_direccion);
		
		tf_direccion = new JTextField();
		tf_direccion.setBounds(235, 133, 116, 20);
		contentPanel.add(tf_direccion);
		tf_direccion.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		/*Botones Sexo*/
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		lbl_sexo.setBounds(23, 174, 48, 14);
		contentPanel.add(lbl_sexo);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(235, 170, 109, 23);
		contentPanel.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(367, 170, 109, 23);
		contentPanel.add(rdbtn_femenino);
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_masculino);
		g1.add(rdbtn_femenino);
		
		
		
		
		/*Botones Alta/Baja*/
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		lbl_altabaja.setBounds(23, 221, 173, 14);
		contentPanel.add(lbl_altabaja);

		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(240, 217, 68, 23);
		contentPanel.add(rdbtn_alta);
		
		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(335, 217, 68, 23);
		contentPanel.add(rdbtn_baja);
		
		ButtonGroup g2 = new ButtonGroup();
		g1.add(rdbtn_baja);
		g1.add(rdbtn_alta);
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_idespecialidad.setBounds(23, 61, 173, 14);
		contentPanel.add(lbl_idespecialidad);
		
		tf_idespecialidad = new JTextField();
		tf_idespecialidad.setBounds(235, 58, 116, 20);
		contentPanel.add(tf_idespecialidad);
		tf_idespecialidad.setColumns(10);
		
		JButton btn_crearDoctor = new JButton("Crear Doctor");
		btn_crearDoctor.setBounds(119, 277, 147, 23);
		contentPanel.add(btn_crearDoctor);
		
	}
}
