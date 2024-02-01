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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBorder(null);
		setBounds(100, 100, 1018, 576);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	
		ButtonGroup g1 = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 546);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		
		
		
		
		JLabel lbl_ficha = new JLabel("FICHA CREAR DOCTOR");
		lbl_ficha.setBounds(30, 11, 173, 14);
		panel.add(lbl_ficha);
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 15));
		JLabel lbl_idDoctor = new JLabel("ID Doctor");
		lbl_idDoctor.setBounds(214, 108, 147, 14);
		panel.add(lbl_idDoctor);
		lbl_idDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_idDoctor.setForeground(new Color(0, 0, 0));
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setBounds(214, 133, 147, 14);
		panel.add(lbl_idespecialidad);
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tf_iddoctor = new JTextField();
		tf_iddoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_iddoctor.setBounds(365, 108, 147, 20);
		panel.add(tf_iddoctor);
		tf_iddoctor.setColumns(10);
		
		tf_idespecialidad = new JTextField();
		tf_idespecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_idespecialidad.setBounds(365, 131, 147, 20);
		panel.add(tf_idespecialidad);
		tf_idespecialidad.setColumns(10);
		
		tf_nombre = new JTextField();
		tf_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_nombre.setBounds(365, 156, 147, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(214, 158, 147, 14);
		panel.add(lbl_nombre);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		JLabel lbl_apellidos = new JLabel("Apellidos");
		lbl_apellidos.setBounds(214, 183, 147, 14);
		panel.add(lbl_apellidos);
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setBounds(214, 208, 147, 14);
		panel.add(lbl_direccion);
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setBounds(214, 246, 147, 14);
		panel.add(lbl_sexo);
		lbl_sexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setBounds(214, 293, 147, 14);
		panel.add(lbl_altabaja);
		lbl_altabaja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		
				JRadioButton rdbtn_alta = new JRadioButton("Alta");
				rdbtn_alta.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_alta.setBounds(365, 289, 147, 23);
				panel.add(rdbtn_alta);
				g1.add(rdbtn_alta);
				
				JRadioButton rdbtn_baja = new JRadioButton("Baja");
				rdbtn_baja.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_baja.setBounds(514, 289, 147, 23);
				panel.add(rdbtn_baja);
				g1.add(rdbtn_baja);
				
				
				JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
				rdbtn_femenino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_femenino.setBounds(514, 246, 147, 23);
				panel.add(rdbtn_femenino);
				g1.add(rdbtn_femenino);
				
				JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
				rdbtn_masculino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_masculino.setBounds(368, 246, 144, 23);
				panel.add(rdbtn_masculino);
				g1.add(rdbtn_masculino);
				
				tf_direccion = new JTextField();
				tf_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_direccion.setBounds(365, 206, 147, 20);
				panel.add(tf_direccion);
				tf_direccion.setColumns(10);
				
				tf_apellidos = new JTextField();
				tf_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_apellidos.setBounds(365, 181, 147, 20);
				panel.add(tf_apellidos);
				tf_apellidos.setColumns(10);
				
				JButton btn_crearDoctor = new JButton("Crear Doctor");
				btn_crearDoctor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btn_crearDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
				btn_crearDoctor.setBounds(339, 404, 147, 23);
				panel.add(btn_crearDoctor);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCrear.class.getResource("/img/fondoDientes.jpg")));
				lblNewLabel.setBounds(0, 0, 1018, 560);
				panel.add(lblNewLabel);
		
	}
}
