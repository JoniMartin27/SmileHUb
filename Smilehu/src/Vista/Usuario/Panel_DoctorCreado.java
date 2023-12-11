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

public class Panel_DoctorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
<<<<<<< Updated upstream
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
=======
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_iddoctor;
	private JTextField tf_direccion;
	private JTextField tf_idespecialidad;
	private JTextField tf_idbuscar;
>>>>>>> Stashed changes

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_DoctorCreado frame = new Panel_DoctorCreado();
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
	public Panel_DoctorCreado() {
		setBounds(100, 100, 862, 531);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 846, 501);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setForeground(Color.BLACK);
		lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_altabaja.setBounds(120, 304, 173, 14);
		panel.add(lbl_altabaja);
		
		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(398, 303, 68, 23);
		panel.add(rdbtn_alta);
		
<<<<<<< Updated upstream
		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(495, 303, 68, 23);
		panel.add(rdbtn_baja);
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(495, 266, 109, 23);
		panel.add(rdbtn_femenino);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(398, 266, 109, 23);
		panel.add(rdbtn_masculino);
		
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setForeground(Color.BLACK);
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setBounds(120, 267, 48, 14);
		panel.add(lbl_sexo);
		
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setForeground(Color.BLACK);
		lbl_direccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_direccion.setBounds(120, 239, 173, 14);
		panel.add(lbl_direccion);
		
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setForeground(Color.BLACK);
		lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos.setBounds(120, 211, 102, 14);
		panel.add(lbl_apellidos);
		
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setForeground(Color.BLACK);
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setBounds(119, 186, 90, 14);
		panel.add(lbl_nombre);
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_idespecialidad.setBounds(120, 155, 173, 14);
		panel.add(lbl_idespecialidad);
		
		JLabel lbl_iddoctor = new JLabel("DNI:");
		lbl_iddoctor.setForeground(Color.BLACK);
		lbl_iddoctor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_iddoctor.setBounds(120, 130, 61, 14);
		panel.add(lbl_iddoctor);
		
		JLabel lbl_BuscarId = new JLabel("Ponga el ID del doctor:");
		lbl_BuscarId.setBounds(120, 43, 142, 14);
		panel.add(lbl_BuscarId);
		
		JLabel lbl_ficha = new JLabel("Ficha de Doctor");
		lbl_ficha.setForeground(Color.BLACK);
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_ficha.setBounds(10, 11, 173, 14);
		panel.add(lbl_ficha);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(272, 40, 116, 20);
		panel.add(textField);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(398, 39, 89, 23);
		panel.add(btn_buscar);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(398, 130, 116, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(398, 161, 116, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(398, 186, 116, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(398, 211, 116, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(398, 239, 116, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCreado.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 846, 501);
		panel.add(lblNewLabel);
		
		
		ButtonGroup g1 = new ButtonGroup();
=======
		
		JLabel lbl_ficha = new JLabel("Ficha de Doctor");
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha);
		
		
		
		
		
		
		/*DNI*/
		JLabel lbl_iddoctor = new JLabel("DNI:");
		lbl_iddoctor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_iddoctor.setForeground(new Color(0, 0, 0));
		lbl_iddoctor.setBounds(23, 89, 61, 14);
		contentPanel.add(lbl_iddoctor);
		
		tf_iddoctor = new JTextField();
		tf_iddoctor.setBounds(235, 86, 116, 20);
		contentPanel.add(tf_iddoctor);
		tf_iddoctor.setColumns(10);
		
	


		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(22, 145, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(235, 142, 116, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		
		
		
		/*Apellidos*/
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		lbl_apellidos.setBounds(23, 170, 102, 14);
		contentPanel.add(lbl_apellidos);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(235, 167, 116, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		/*Botones Sexo*/
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		lbl_sexo.setBounds(23, 243, 48, 14);
		contentPanel.add(lbl_sexo);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(235, 239, 109, 23);
		contentPanel.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(370, 239, 109, 23);
		contentPanel.add(rdbtn_femenino);
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_masculino);
		g1.add(rdbtn_femenino);
		
		
		
		
		/*Botones Alta/Baja*/
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		lbl_altabaja.setBounds(23, 280, 173, 14);
		contentPanel.add(lbl_altabaja);

		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(235, 276, 68, 23);
		contentPanel.add(rdbtn_alta);
		
		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(332, 276, 68, 23);
		contentPanel.add(rdbtn_baja);
>>>>>>> Stashed changes
		
		ButtonGroup g2 = new ButtonGroup();
		
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setForeground(Color.BLACK);
		lbl_direccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_direccion.setBounds(23, 198, 173, 14);
		contentPanel.add(lbl_direccion);
		
		tf_direccion = new JTextField();
		tf_direccion.setColumns(10);
		tf_direccion.setBounds(235, 195, 116, 20);
		contentPanel.add(tf_direccion);
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_idespecialidad.setBounds(23, 114, 173, 14);
		contentPanel.add(lbl_idespecialidad);
		
		tf_idespecialidad = new JTextField();
		tf_idespecialidad.setColumns(10);
		tf_idespecialidad.setBounds(235, 117, 116, 20);
		contentPanel.add(tf_idespecialidad);
		
		tf_idbuscar = new JTextField();
		tf_idbuscar.setBounds(175, 36, 116, 20);
		contentPanel.add(tf_idbuscar);
		tf_idbuscar.setColumns(10);
		
		JLabel lbl_BuscarId = new JLabel("Ponga el ID del doctor:");
		lbl_BuscarId.setBounds(23, 39, 142, 14);
		contentPanel.add(lbl_BuscarId);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(319, 35, 89, 23);
		contentPanel.add(btn_buscar);
		
	}
}
