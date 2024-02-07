package Vista.Usuario;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import Vista.gestionEconomica.JDialog_admin_gestionEconomica_tipoPago;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Panel_DoctorCreado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_iddoctor;
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
		setBorder(null);
		setBounds(100, 100, 1018, 576);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 546);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JComboBox cb_nombreDoctor = new JComboBox();
		cb_nombreDoctor.setBounds(529, 139, 116, 22);
		panel.add(cb_nombreDoctor);
		
		JLabel lbl_ficha = new JLabel("FICHA DOCTOR");
		lbl_ficha.setBackground(new Color(192, 192, 192));
		lbl_ficha.setForeground(new Color(0, 0, 0));
		lbl_ficha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lbl_ficha.setBounds(10, 11, 173, 14);
		panel.add(lbl_ficha);
		
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setForeground(Color.BLACK);
		lbl_altabaja.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_altabaja.setBounds(251, 320, 151, 14);
		panel.add(lbl_altabaja);
		
		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_alta.setBounds(529, 316, 116, 23);
		panel.add(rdbtn_alta);

		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_baja.setBounds(655, 316, 116, 23);
		panel.add(rdbtn_baja);
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_femenino.setBounds(655, 282, 116, 23);
		panel.add(rdbtn_femenino);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_masculino.setBounds(529, 282, 116, 23);
		panel.add(rdbtn_masculino);
		
		JLabel lbl_genero = new JLabel("Genero");
		lbl_genero.setForeground(Color.BLACK);
		lbl_genero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_genero.setBounds(251, 283, 151, 14);
		panel.add(lbl_genero);
		
		JLabel lbl_direccion = new JLabel("Direccion");
		lbl_direccion.setForeground(Color.BLACK);
		lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_direccion.setBounds(251, 255, 151, 14);
		panel.add(lbl_direccion);
		
		JLabel lbl_apellidos = new JLabel("Apellidos");
		lbl_apellidos.setForeground(Color.BLACK);
		lbl_apellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_apellidos.setBounds(251, 197, 151, 14);
		panel.add(lbl_apellidos);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setForeground(Color.BLACK);
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setBounds(250, 172, 152, 14);
		panel.add(lbl_nombre);
		
		JLabel lbl_idespecialidad = new JLabel("ID Especialidad");
		lbl_idespecialidad.setForeground(Color.BLACK);
		lbl_idespecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_idespecialidad.setBounds(250, 222, 151, 14);
		panel.add(lbl_idespecialidad);
		
		JLabel lbl_Buscardoctor = new JLabel("nombre doctor");
		lbl_Buscardoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Buscardoctor.setBounds(250, 110, 162, 14);
		panel.add(lbl_Buscardoctor);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(528, 111, 116, 20);
		panel.add(textField);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(654, 110, 89, 23);
		panel.add(btn_buscar);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(528, 228, 116, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(529, 172, 116, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(529, 197, 116, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(529, 255, 116, 20);
		panel.add(textField_5);
		
		
		JButton btn_realizarpago=new JButton();
		btn_realizarpago.setBounds(845, 22, 136, 23);
		btn_realizarpago.setText("Registrar Pago");
		btn_realizarpago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_gestionEconomica_tipoPago tipoPago=new JDialog_admin_gestionEconomica_tipoPago();
				
				tipoPago.setVisible(true);
				tipoPago.setLocation(200, 200);
				tipoPago.setModal(true);
				tipoPago.setUndecorated(true);
				dispose();
			}
		});
		panel.add(btn_realizarpago);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Panel_DoctorCreado.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 546);
		panel.add(lblNewLabel);
		
		
		ButtonGroup g1 = new ButtonGroup();

		
		JLabel lbl_ficha1 = new JLabel("Ficha de Doctor");
		lbl_ficha1.setForeground(new Color(0, 0, 0));
		lbl_ficha1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ficha1.setBounds(23, 11, 173, 14);
		contentPanel.add(lbl_ficha1);
		
		
		
		
		
		
		/*DNI*/
		JLabel lbl_iddoctor1 = new JLabel("DNI:");
		lbl_iddoctor1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_iddoctor1.setForeground(new Color(0, 0, 0));
		lbl_iddoctor1.setBounds(23, 89, 61, 14);
		contentPanel.add(lbl_iddoctor1);
		
		tf_iddoctor = new JTextField();
		tf_iddoctor.setBounds(235, 86, 116, 20);
		contentPanel.add(tf_iddoctor);
		tf_iddoctor.setColumns(10);
		
	


		
		
	}
}
