package Vista.Doctor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Usuario.Panel_admin_usuario_generarInforme;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pagina_Inicio_Doctores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagina_Inicio_Doctores frame = new Pagina_Inicio_Doctores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JDesktopPane miDesktopPane;
	private JTextField textField;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Pagina_Inicio_Doctores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(60, 129, 170));
		contentPanel.setBounds(0, 0, 702, 369);
		contentPane.add(contentPanel);
		
		JMenuBar BarraMenu_DNI = new JMenuBar();
		BarraMenu_DNI.setBounds(588, 19, 101, 22);
		contentPanel.add(BarraMenu_DNI);
		
		JMenu Menu_DNI = new JMenu("DNI");
		BarraMenu_DNI.add(Menu_DNI);
		
		JMenuItem Item_perfil = new JMenuItem("Editar Perfil");
		Menu_DNI.add(Item_perfil);
		
		JMenuItem Item_ayuda = new JMenuItem("Ayuda");
		Menu_DNI.add(Item_ayuda);
		
		JMenuItem Item_cerrar = new JMenuItem("Cerrar Perfil");
		Menu_DNI.add(Item_cerrar);
		
		JDesktopPane miDesktopPane = new JDesktopPane();
		miDesktopPane.setBackground(new Color(4, 20, 36));
		miDesktopPane.setBounds(128, 52, 574, 317);
		contentPanel.add(miDesktopPane);
		
		JButton btn_pacientes = new JButton("Pacientes");
		btn_pacientes.setBounds(10, 109, 108, 23);
		contentPanel.add(btn_pacientes);
		
		JButton btn_materiales = new JButton("Materiales");
		btn_materiales.setBounds(10, 279, 108, 23);
		contentPanel.add(btn_materiales);
		
		textField = new JTextField();
		textField.setText("SmileHub\r\n");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(205, 234, 251));
		textField.setBounds(207, 11, 277, 31);
		contentPanel.add(textField);
		btn_materiales.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				
				
				
			}
		});
		btn_pacientes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Inicio_Pacientes_Internalframe pacientes=new Inicio_Pacientes_Internalframe(); 
				
				miDesktopPane.removeAll();
				miDesktopPane.add(pacientes);
				((BasicInternalFrameUI) pacientes.getUI()).setNorthPane(null);
				pacientes.setLocation(0,0);
				pacientes.setVisible(true);
				pacientes.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				
				
				
			}
		});
	}
}

