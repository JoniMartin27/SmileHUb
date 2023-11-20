package Vista.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Panel_PacienteCrear extends JInternalFrame {


	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_dni;
	private JTextField tf_fnacimiento;
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
		

		
		JButton btn_modificardatos = new JButton("Modificar Datos");
		btn_modificardatos.setBounds(23, 199, 173, 23);
		contentPanel.add(btn_modificardatos);
		
		JButton btn_consultarpagos = new JButton("Consultar Pagos");
		btn_consultarpagos.setBounds(23, 221, 173, 23);
		contentPanel.add(btn_consultarpagos);
		
		JButton btn_odontograma = new JButton("Odontograma");
		btn_odontograma.setBounds(23, 244, 173, 23);
		contentPanel.add(btn_odontograma);

		
		/*DNI*/
		JLabel lbl_dni = new JLabel("DNI:");
		lbl_dni.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_dni.setForeground(new Color(0, 0, 0));
		lbl_dni.setBounds(23, 36, 61, 14);
		contentPanel.add(lbl_dni);
		
		tf_dni = new JTextField();
		tf_dni.setBounds(242, 35, 126, 20);
		contentPanel.add(tf_dni);
		tf_dni.setColumns(10);

		
		/*Nombre*/
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_nombre.setForeground(new Color(0, 0, 0));
		lbl_nombre.setBounds(23, 61, 90, 14);
		contentPanel.add(lbl_nombre);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(242, 60, 126, 20);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		

		
		/*Apellidos*/
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_apellidos.setForeground(new Color(0, 0, 0));
		lbl_apellidos.setBounds(23, 86, 102, 14);
		contentPanel.add(lbl_apellidos);
		
		tf_apellidos = new JTextField();
		tf_apellidos.setBounds(242, 85, 126, 20);
		contentPanel.add(tf_apellidos);
		tf_apellidos.setColumns(10);
		
		
		
		
		/*Fecha de nacimiento*/
		JLabel lbl_fechanacimiento = new JLabel("Fecha de nacimiento:");
		lbl_fechanacimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_fechanacimiento.setForeground(new Color(0, 0, 0));
		lbl_fechanacimiento.setBounds(23, 111, 173, 14);
		contentPanel.add(lbl_fechanacimiento);
		
		tf_fnacimiento = new JTextField();
		tf_fnacimiento.setBounds(242, 110, 126, 20);
		contentPanel.add(tf_fnacimiento);
		tf_fnacimiento.setColumns(10);
		

		
		
		/*Botones Sexo*/
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_sexo.setForeground(new Color(0, 0, 0));
		lbl_sexo.setBounds(23, 139, 48, 21);
		contentPanel.add(lbl_sexo);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		rdbtn_masculino.setBounds(241, 140, 109, 23);
		contentPanel.add(rdbtn_masculino);
		
		
		JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
		rdbtn_femenino.setBounds(379, 140, 109, 23);
		contentPanel.add(rdbtn_femenino);
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn_masculino);
		g1.add(rdbtn_femenino);
		

		/*Botones Alta/Baja*/
		JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
		lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_altabaja.setForeground(new Color(0, 0, 0));
		lbl_altabaja.setBounds(23, 174, 173, 14);
		contentPanel.add(lbl_altabaja);
		
		JRadioButton rdbtn_alta = new JRadioButton("Alta");
		rdbtn_alta.setBounds(242, 172, 68, 23);
		contentPanel.add(rdbtn_alta);
		
		JRadioButton rdbtn_baja = new JRadioButton("Baja");
		rdbtn_baja.setBounds(342, 172, 68, 23);
		contentPanel.add(rdbtn_baja);
		
		ButtonGroup g2 = new ButtonGroup();
		g1.add(rdbtn_baja);
		g1.add(rdbtn_alta);
	}



}
