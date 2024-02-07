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
import javax.swing.JComboBox;

public class Panel_DoctorCrear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_direccion;
	private JFrame Frame;
	private JDesktopPane desktopPane;

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
		
		JComboBox cb_especialidad = new JComboBox();
		cb_especialidad.setBounds(371, 152, 141, 22);
		panel.add(cb_especialidad);
		
		
		
		
		
		JLabel lbl_ficha = new JLabel("FICHA CREAR DOCTOR");
		lbl_ficha.setBounds(30, 11, 173, 14);
		panel.add(lbl_ficha);
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lbl_especialidad = new JLabel("Especialidad");
		lbl_especialidad.setBounds(214, 154, 147, 14);
		panel.add(lbl_especialidad);
		lbl_especialidad.setForeground(Color.BLACK);
		lbl_especialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tf_nombre = new JTextField();
		tf_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_nombre.setBounds(365, 79, 147, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(214, 81, 147, 14);
		panel.add(lbl_nombre);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		JLabel lbl_apellidos = new JLabel("Apellidos");
		lbl_apellidos.setBounds(214, 112, 147, 14);
		panel.add(lbl_apellidos);
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setBounds(214, 208, 147, 14);
		panel.add(lbl_direccion);
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setForeground(new Color(0, 0, 0));
		JLabel lbl_sexo = new JLabel("Genero");
		lbl_sexo.setBounds(214, 289, 147, 14);
		panel.add(lbl_sexo);
		lbl_sexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sexo.setForeground(new Color(0, 0, 0));
				
				
				JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
				rdbtn_femenino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_femenino.setBounds(514, 289, 147, 23);
				panel.add(rdbtn_femenino);
				g1.add(rdbtn_femenino);
				
				JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
				rdbtn_masculino.setFont(new Font("Tahoma", Font.BOLD, 14));
				rdbtn_masculino.setBounds(368, 289, 144, 23);
				panel.add(rdbtn_masculino);
				g1.add(rdbtn_masculino);
				
				tf_direccion = new JTextField();
				tf_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_direccion.setBounds(365, 206, 147, 20);
				panel.add(tf_direccion);
				tf_direccion.setColumns(10);
				
				tf_apellidos = new JTextField();
				tf_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
				tf_apellidos.setBounds(365, 110, 147, 20);
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
				lblNewLabel.setBounds(0, 0, 1018, 569);
				panel.add(lblNewLabel);
		
	}
}
