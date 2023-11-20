package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Material.Panel_Admin_Material_Inicio;
import Vista.Usuario.JDialog_Admin_Usuario_inicio;
import Vista.Usuario.Jdialog_Ficha_Crear_Doctor;
import Vista.Usuario.Jdialog_Ficha_Crear_Proveedor;
import Vista.Usuario.Panel_Admin_Usuario_Doctor;
import Vista.Usuario.Panel_Admin_Usuario_Proveedores;
import Vista.Usuario.Panel_PacienteCreado;
import Vista.Usuario.Panel_PacienteCrear;
import Vista.Usuario.Panel_admin_usuario_generarInforme;
import Vista.Usuario.Panel_admin_usuario_paciente_consultarCita;
import Vista.gestionEconomica.Panel_admin_gestionEconomica;
import Vista.gestionMedica.Panel_admin_gestionMedica_Inicio;
import ayudas.Panel_Admin_Usuario_Paciente;
import ayudas.Panel_admin_GestEconomica;
import ayudas.Panel_admin_Material;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Inicio_Panel_Administrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSmilehub;
	private static JDesktopPane miDesktopPane_1;
	private JFrame Frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_Panel_Administrador PaginaInicio_Administrador = new Inicio_Panel_Administrador();
					PaginaInicio_Administrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane_1 = desktopPane;
	}

	public void agregarInternalFrame(JInternalFrame internalFrame) {
		miDesktopPane_1.add(internalFrame);
		internalFrame.setVisible(true);
		internalFrame.setLocation(0, 0);
		((BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
	}

	/**
	 * Create the frame.
	 */
	public Inicio_Panel_Administrador() {
		JDesktopPane miDesktopPane = new JDesktopPane();
		miDesktopPane.setBounds(219, 44, 799, 487);
		
		// Atributos Frame Principal
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 129, 170));
		contentPane.setForeground(new Color(4, 20, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFocusable(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(miDesktopPane);
		miDesktopPane.setBackground(new Color(4, 20, 36));
		
		ArrayList<Integer> combo;
		combo = new ArrayList<>();
		contentPane.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		combo.add(e.getKeyCode());
        		if(combo.size()>1) {
        			
        			if(combo.contains(KeyEvent.VK_P)&&combo.contains(17)) {
        				System.out.print("Has entrado en crear Paciente");
        				Panel_PacienteCrear pacienteCrear=new Panel_PacienteCrear();
        				pacienteCrear.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        			
        				miDesktopPane.add(pacienteCrear);
        				((BasicInternalFrameUI) pacienteCrear.getUI()).setNorthPane(null);
        				pacienteCrear.setLocation(0, 0);
        				pacienteCrear.show();
        				pacienteCrear.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
        			}
        			
        			
        			
        			else if(combo.contains(KeyEvent.VK_M)&&combo.contains(17)) {
        				Jdialog_Ficha_Crear_Proveedor proveedorCrear=new Jdialog_Ficha_Crear_Proveedor();
        				proveedorCrear.setVisible(true);
        			}
        			
        			if(combo.contains(KeyEvent.VK_P)&&combo.contains(17)) {
        				System.out.print("Has entrado en crear Paciente");
        				Panel_admin_usuario_paciente_consultarCita citaConsultarr=new Panel_admin_usuario_paciente_consultarCita();
        				citaConsultarr.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        			
        				miDesktopPane.add(citaConsultarr);
        				((BasicInternalFrameUI) citaConsultarr.getUI()).setNorthPane(null);
        				citaConsultarr.setLocation(0, 0);
        				citaConsultarr.show();
        				citaConsultarr.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
        			}
        			
        			
        		}}});
		
		
		

//Titulo del Frame

		txtSmilehub = new JTextField();
		txtSmilehub.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSmilehub.setBackground(new Color(205, 234, 251));
		txtSmilehub.setEditable(false);
		txtSmilehub.setHorizontalAlignment(SwingConstants.CENTER);
		txtSmilehub.setText("SmileHub\r\n");
		txtSmilehub.setBounds(379, 11, 277, 31);
		contentPane.add(txtSmilehub);
		txtSmilehub.setColumns(10);
//Menu DNI		
		JMenuBar BarraMenu_DNI = new JMenuBar();
		BarraMenu_DNI.setBounds(907, 11, 101, 22);
		contentPane.add(BarraMenu_DNI);

		JMenu Menu_DNI = new JMenu("DNI");
		Menu_DNI.setBounds(907, 11, 101, 22);
		;
		BarraMenu_DNI.add(Menu_DNI);

		JMenuItem Item_perfil = new JMenuItem("Editar Perfil");
		Menu_DNI.add(Item_perfil);

		JMenuItem Item_ayuda = new JMenuItem("Ayuda");
		Menu_DNI.add(Item_ayuda);

		JMenuItem Item_cerrar = new JMenuItem("Cerrar Perfil");
		Menu_DNI.add(Item_cerrar);

//DesktopPane el cual cambia por internalFrames

		

		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 129, 170));
		panel.setBounds(0, 46, 220, 485);
		contentPane.add(panel);
		panel.setLayout(null);

	
		
		// Boton Gestion Medica

		JButton btn_GestionMedica = new JButton("Gestion Medica");
		btn_GestionMedica.setBounds(23, 153, 164, 23);
		panel.add(btn_GestionMedica);
		// Boton Materiales
		JButton btn_Material = new JButton("Material");
		btn_Material.setBounds(23, 261, 164, 23);
		panel.add(btn_Material);
		// Boton Gestion Economica
		JButton btn_GestionEconomica = new JButton("Gestion Economica");
		btn_GestionEconomica.setBounds(23, 385, 164, 23);
		panel.add(btn_GestionEconomica);

		JButton btn_proveedor = new JButton("proveedores");
		btn_proveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Usuario_Proveedores usuario_proveedores = new Panel_Admin_Usuario_Proveedores();
				usuario_proveedores.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(usuario_proveedores);
				((BasicInternalFrameUI) usuario_proveedores.getUI()).setNorthPane(null);
				usuario_proveedores.setLocation(0, 0);
				usuario_proveedores.show();
				usuario_proveedores.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());

			}
		});
		btn_proveedor.setBounds(33, 67, 119, 23);
		panel.add(btn_proveedor);

		JButton btn_paciente = new JButton("Pacientes");
		btn_paciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarMenuPaciente(btn_paciente, miDesktopPane);

			}
		});

		btn_paciente.setBounds(33, 48, 119, 23);
		panel.add(btn_paciente);

		JButton btn_Doctores = new JButton("Doctores");
		btn_Doctores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Panel_Admin_Usuario_Doctor usuario_doctor = new Panel_Admin_Usuario_Doctor();
				usuario_doctor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(usuario_doctor);
				((BasicInternalFrameUI) usuario_doctor.getUI()).setNorthPane(null);
				usuario_doctor.setLocation(0, 0);
				usuario_doctor.show();
				usuario_doctor.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
			}
		});

		btn_Doctores.setBounds(33, 90, 119, 23);
		panel.add(btn_Doctores);

		btn_GestionEconomica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionEconomica gestion_economica = new Panel_admin_gestionEconomica();
				gestion_economica.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(gestion_economica);
				gestion_economica.setBorder(null);
				((BasicInternalFrameUI) gestion_economica.getUI()).setNorthPane(null);
				gestion_economica.setLocation(0, 0);
				gestion_economica.show();
				gestion_economica.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());

			}
		});
		btn_Material.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Panel_Admin_Material_Inicio pag_Material = new Panel_Admin_Material_Inicio();
				miDesktopPane.removeAll();
				miDesktopPane.add(pag_Material);
				pag_Material.setBorder(null);
				((BasicInternalFrameUI) pag_Material.getUI()).setNorthPane(null);

				pag_Material.setLocation(0, 0);
				pag_Material.setVisible(true);

			}
		});
		btn_GestionMedica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionMedica_Inicio gestion_medica = new Panel_admin_gestionMedica_Inicio();
				gestion_medica.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(gestion_medica);
				gestion_medica.setBorder(null);
				((BasicInternalFrameUI) gestion_medica.getUI()).setNorthPane(null);
				gestion_medica.setLocation(0, 0);
				gestion_medica.show();
				gestion_medica.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());

			}
		});

	}

	private static void mostrarMenuPaciente(Component invoker, JDesktopPane desktopPane) {
		JPopupMenu menu = new JPopupMenu();

		// Agregar elementos al menú desplegable
		JMenuItem ConsultaCita = new JMenuItem("Consultar Cita");
		ConsultaCita.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					abrirPanelCita(desktopPane);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		JMenuItem CrearPaciente = new JMenuItem("Crear Paciente");
		CrearPaciente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				abrirPanelCrearPaciente(desktopPane);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	});
		JMenuItem verPerfil = new JMenuItem("Ver Perfil Paciente");
		verPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					abrirPanelVerPaciente(desktopPane);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		

		menu.add(ConsultaCita);
		menu.add(CrearPaciente);
		menu.add(verPerfil);

		// Mostrar el menú desplegable en la posición del componente invocador
		menu.show(invoker, 0, invoker.getHeight());
	}
	private static void mostrarMenuProveedor(Component invoker, JDesktopPane desktopPane) {
		JPopupMenu menu = new JPopupMenu();

		// Agregar elementos al menú desplegable
		JMenuItem VerProveedor = new JMenuItem("Ver Proveedor");
		VerProveedor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					abrirPanelVerProveedor(desktopPane);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			

		});
		JMenuItem CrearProveedor = new JMenuItem("Crear Proveedor");
		CrearProveedor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				abrirPanelCrearProveedor(desktopPane);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		
	});
		

		menu.add(VerProveedor);
		menu.add(CrearProveedor);
		

		// Mostrar el menú desplegable en la posición del componente invocador
		menu.show(invoker, 0, invoker.getHeight());
	}
	
	private static void abrirPanelCrearProveedor(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_PacienteCrear PacienteCrear = new Panel_PacienteCrear();

		PacienteCrear.setBorder(null);
		((BasicInternalFrameUI) PacienteCrear.getUI()).setNorthPane(null);
		PacienteCrear.setLocation(0, 0);
		PacienteCrear.show();
		PacienteCrear.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		PacienteCrear.setVisible(true);
		desktopPane.add(PacienteCrear); // Usar el parámetro en lugar de la variable local
		PacienteCrear.setSelected(true);
		
	}
	
	private static void abrirPanelVerProveedor(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_PacienteCrear PacienteCrear = new Panel_PacienteCrear();

		PacienteCrear.setBorder(null);
		((BasicInternalFrameUI) PacienteCrear.getUI()).setNorthPane(null);
		PacienteCrear.setLocation(0, 0);
		PacienteCrear.show();
		PacienteCrear.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		PacienteCrear.setVisible(true);
		desktopPane.add(PacienteCrear); // Usar el parámetro en lugar de la variable local
		PacienteCrear.setSelected(true);
		
		
	}	
	protected static void abrirPanelCrearPaciente(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_PacienteCrear PacienteCrear = new Panel_PacienteCrear();

		PacienteCrear.setBorder(null);
		((BasicInternalFrameUI) PacienteCrear.getUI()).setNorthPane(null);
		PacienteCrear.setLocation(0, 0);
		PacienteCrear.show();
		PacienteCrear.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		PacienteCrear.setVisible(true);
		desktopPane.add(PacienteCrear); // Usar el parámetro en lugar de la variable local
		PacienteCrear.setSelected(true);
		
		
		
		
	}
	private static void abrirPanelCita(JDesktopPane desktopPane) throws PropertyVetoException {

		Panel_admin_usuario_paciente_consultarCita cita = new Panel_admin_usuario_paciente_consultarCita();

		cita.setBorder(null);
		((BasicInternalFrameUI) cita.getUI()).setNorthPane(null);
		cita.setLocation(0, 0);
		cita.show();
		cita.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		cita.setVisible(true);
		desktopPane.add(cita); // Usar el parámetro en lugar de la variable local
		cita.setSelected(true);
		

			

	
	}
	private static void abrirPanelVerPaciente(JDesktopPane desktopPane) throws PropertyVetoException {

		Panel_PacienteCreado pacienteCreado = new Panel_PacienteCreado();

		pacienteCreado.setBorder(null);
		((BasicInternalFrameUI) pacienteCreado.getUI()).setNorthPane(null);
		pacienteCreado.setLocation(0, 0);
		pacienteCreado.show();
		pacienteCreado.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		pacienteCreado.setVisible(true);
		desktopPane.add(pacienteCreado); // Usar el parámetro en lugar de la variable local
		pacienteCreado.setSelected(true);
		

			

	
	}
	
	

}
