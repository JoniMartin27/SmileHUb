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

public class Panel_DoctorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_iddoctor;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	private JTextField tf_direccion;
	private JTextField tf_idespecialidad;
	private JTextField tf_idbuscar;

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
		setBounds(100, 100, 450, 300);

		setBounds(100, 100, 584, 389);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		
		
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
		
		ButtonGroup g2 = new ButtonGroup();
		g1.add(rdbtn_baja);
		g1.add(rdbtn_alta);
		
		JLabel lbl_direccion = new JLabel("Dirección");
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
