package Vista.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Jdialog_Ficha_Administrador extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_apellidos;
	private JTextField tf_nombre;
	private JTextField tf_dni;
	private JTextField tf_fnacimiento;
	private JFrame Frame;
	private JDesktopPane desktopPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Jdialog_Ficha_Administrador dialog = new Jdialog_Ficha_Administrador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Jdialog_Ficha_Administrador(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;}

	/**
	 * Create the dialog.
	 */
	public Jdialog_Ficha_Administrador() {
	setBounds(100, 100, 550, 353);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBackground(new Color(159, 232, 223));
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(null);
	
	
	
	
	
	JLabel lbl_ficha = new JLabel("Ficha de Administrador");
	lbl_ficha.setForeground(new Color(0, 0, 0));
	lbl_ficha.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbl_ficha.setBounds(23, 11, 188, 14);
	contentPanel.add(lbl_ficha);
	
	
	
	
	
	
	/*Botones*/
	JButton btn_modificardatos = new JButton("Modificar Datos");
	btn_modificardatos.setBounds(167, 249, 173, 23);
	contentPanel.add(btn_modificardatos);
	
	
	
	
	
	
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
	lbl_nombre.setBounds(23, 67, 90, 14);
	contentPanel.add(lbl_nombre);
	
	tf_nombre = new JTextField();
	tf_nombre.setBounds(242, 66, 126, 20);
	contentPanel.add(tf_nombre);
	tf_nombre.setColumns(10);
	
	
	
	
	/*Apellidos*/
	JLabel lbl_apellidos = new JLabel("Apellidos:");
	lbl_apellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbl_apellidos.setForeground(new Color(0, 0, 0));
	lbl_apellidos.setBounds(23, 98, 102, 14);
	contentPanel.add(lbl_apellidos);
	
	tf_apellidos = new JTextField();
	tf_apellidos.setBounds(242, 97, 126, 20);
	contentPanel.add(tf_apellidos);
	tf_apellidos.setColumns(10);
	
	
	
	
	/*Fecha de nacimiento*/
	JLabel lbl_fechanacimiento = new JLabel("Fecha de nacimiento:");
	lbl_fechanacimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbl_fechanacimiento.setForeground(new Color(0, 0, 0));
	lbl_fechanacimiento.setBounds(23, 134, 173, 14);
	contentPanel.add(lbl_fechanacimiento);
	
	tf_fnacimiento = new JTextField();
	tf_fnacimiento.setBounds(242, 128, 126, 20);
	contentPanel.add(tf_fnacimiento);
	tf_fnacimiento.setColumns(10);
	
	
	
	
	
	
	
	
	
	
	
	/*Botones Sexo*/
	JLabel lbl_sexo = new JLabel("Sexo");
	lbl_sexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbl_sexo.setForeground(new Color(0, 0, 0));
	lbl_sexo.setBounds(23, 168, 48, 14);
	contentPanel.add(lbl_sexo);
	
	JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
	rdbtn_masculino.setBounds(242, 166, 109, 23);
	contentPanel.add(rdbtn_masculino);
	
	
	JRadioButton rdbtn_femenino = new JRadioButton("Femenino");
	rdbtn_femenino.setBounds(381, 166, 109, 23);
	contentPanel.add(rdbtn_femenino);
	
	
	ButtonGroup g1 = new ButtonGroup();
	g1.add(rdbtn_masculino);
	g1.add(rdbtn_femenino);
	
	
	
	
	/*Botones Alta/Baja*/
	
	JLabel lbl_altabaja = new JLabel("Dar de alta o baja");
	lbl_altabaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbl_altabaja.setForeground(new Color(0, 0, 0));
	lbl_altabaja.setBounds(23, 206, 173, 14);
	contentPanel.add(lbl_altabaja);

	JRadioButton rdbtn_alta = new JRadioButton("Alta");
	rdbtn_alta.setBounds(242, 204, 68, 23);
	contentPanel.add(rdbtn_alta);
	
	JRadioButton rdbtn_baja = new JRadioButton("Baja");
	rdbtn_baja.setBounds(336, 204, 68, 23);
	contentPanel.add(rdbtn_baja);
	
	ButtonGroup g2 = new ButtonGroup();
	g1.add(rdbtn_baja);
	g1.add(rdbtn_alta);
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	/*Bonotes abajo del JDialog*/
	{
		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(new Color(159, 232, 223));
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{
			JButton okButton = new JButton("OK");
			okButton.setActionCommand("OK");
			buttonPane.add(okButton);
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
	}
}
}