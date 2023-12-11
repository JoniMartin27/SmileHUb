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
import Vista.Usuario.Panel_Admin_Usuario_Doctor;
import Vista.Usuario.Panel_Admin_Usuario_Proveedores;
import Vista.Usuario.Panel_DoctorCreado;
import Vista.Usuario.Panel_DoctorCrear;
import Vista.Usuario.Panel_PacienteCreado;
import Vista.Usuario.Panel_PacienteCrear;
import Vista.Usuario.Panel_ProveedorCreado;
import Vista.Usuario.Panel_ProveedorCrear;
import Vista.Usuario.Panel_admin_usuario_generarInforme;
import Vista.Usuario.Panel_admin_usuario_paciente_consultarCita;
import Vista.gestionEconomica.JDialog_Admin_Gestion_Economica_Fraccionado;
import Vista.gestionEconomica.JDialog_admin_gestionEconomica_tipoPago;
import Vista.gestionEconomica.Panel_admin_gestionEconomica;
import Vista.gestionEconomica.Panel_admin_gestionEconomica_GenerarInforme;
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
import javax.swing.ImageIcon;
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
	private JDesktopPane miDesktopPane_1;
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



	/**
	 * Create the frame.
	 */
	public Inicio_Panel_Administrador() {
		setIconImage(new ImageIcon(getClass().getResource("/img/SmileHub.png")).getImage());
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
        		System.out.println("PRESED " + e.getKeyCode());
        		combo.add(e.getKeyCode());
        		
        		System.out.println("El combo vale:" + combo.size());
        		if(combo.size()>1) {
        			
        			
        		//Paciente
        			if((e.getKeyCode()==KeyEvent.VK_P)&&combo.contains(17)) {
        				System.out.print("Has entrado en crear Paciente");
        				Panel_PacienteCrear pacienteCrear=new Panel_PacienteCrear();
        				pacienteCrear.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(pacienteCrear);
        				((BasicInternalFrameUI) pacienteCrear.getUI()).setNorthPane(null);
        				pacienteCrear.setLocation(0, 0);
        				pacienteCrear.show();
        				pacienteCrear.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			else if((e.getKeyCode()==KeyEvent.VK_C)&&combo.contains(17)) {
        				System.out.print("Has entrado en consultar Cita");
        				Panel_admin_usuario_paciente_consultarCita consultarCita=new Panel_admin_usuario_paciente_consultarCita();
        				consultarCita.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(consultarCita);
        				((BasicInternalFrameUI) consultarCita.getUI()).setNorthPane(null);
        				consultarCita.setLocation(0, 0);
        				consultarCita.show();
        				consultarCita.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			else if((e.getKeyCode()==KeyEvent.VK_J)&&combo.contains(17)) {
        				System.out.print("Has entrado en ver paciente Perfil");
        				Panel_PacienteCreado pacienteCreado=new Panel_PacienteCreado();
        				pacienteCreado.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(pacienteCreado);
        				((BasicInternalFrameUI) pacienteCreado.getUI()).setNorthPane(null);
        				pacienteCreado.setLocation(0, 0);
        				pacienteCreado.show();
        				pacienteCreado.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			
        			
        			
        			//Proveedores
        			else if((e.getKeyCode()==KeyEvent.VK_V)&&combo.contains(17)) {
        				System.out.print("Has entrado en ver Proveedor");
        				Panel_ProveedorCreado verProveedor=new Panel_ProveedorCreado();
        				verProveedor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(verProveedor);
        				((BasicInternalFrameUI) verProveedor.getUI()).setNorthPane(null);
        				verProveedor.setLocation(0, 0);
        				verProveedor.show();
        				verProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth()); 
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			else if((e.getKeyCode()==KeyEvent.VK_Z)&&combo.contains(17)) {
        				System.out.print("Has entrado en crer Proveedor");
        				Panel_ProveedorCrear crearProveedor=new Panel_ProveedorCrear();
        				crearProveedor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(crearProveedor);
        				((BasicInternalFrameUI) crearProveedor.getUI()).setNorthPane(null);
        				crearProveedor.setLocation(0, 0);
        				crearProveedor.show();
        				crearProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth()); 
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			
        			//Tipos de Pago
        			if(combo.contains(KeyEvent.VK_T)&&(combo.contains(KeyEvent.VK_P)&&combo.contains(17))) {
        				JDialog_admin_gestionEconomica_tipoPago tipoPago=new JDialog_admin_gestionEconomica_tipoPago();
        				tipoPago.setVisible(true);
        				tipoPago.setLocation(200, 200);
        				tipoPago.setModal(true);
        				contentPane.requestFocus();
        				combo.clear();
        				
        			}
        			
        		}}			
        		
});
		
		
		

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
		JButton btn_realizarpago=new JButton();
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
		JButton btn_realizarinformes=new JButton();
		btn_realizarinformes.setText("Realizar informe Economico");
		btn_realizarinformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionEconomica_GenerarInforme generarInforme = new Panel_admin_gestionEconomica_GenerarInforme(); 
				generarInforme.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(generarInforme);
				generarInforme.setBorder(null);
				((BasicInternalFrameUI) generarInforme.getUI()).setNorthPane(null);
				generarInforme.setLocation(0,0);
				generarInforme.show();
				generarInforme.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				
			}
			
		});
		panel.add(btn_realizarinformes);
		btn_realizarinformes.setBounds(23,289,164,23);
		panel.add(btn_realizarpago);
		btn_realizarpago.setBounds(23, 255, 164, 23);
		// Boton Gestion Medica

		JButton btn_GestionMedica = new JButton("Gestion Medica");
		btn_GestionMedica.setBounds(23, 153, 164, 23);
		panel.add(btn_GestionMedica);
		// Boton Gestion Economica
		JButton btn_GestionEconomica = new JButton("Gestion Economica");
		btn_GestionEconomica.setBounds(23, 385, 164, 23);
		panel.add(btn_GestionEconomica);

		JButton btn_proveedor = new JButton("Proveedores");
		btn_proveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMenuProveedor(btn_proveedor,miDesktopPane);
				
			}
		});
		btn_proveedor.setBounds(23, 85, 164, 23);
		panel.add(btn_proveedor);

		JButton btn_paciente = new JButton("Pacientes");
		btn_paciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarMenuPaciente(btn_paciente, miDesktopPane);

			}
		});

		btn_paciente.setBounds(23, 51, 164, 23);
		panel.add(btn_paciente);

		JButton btn_Doctores = new JButton("Doctores");
		btn_Doctores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarMenuDoctor(btn_Doctores, miDesktopPane);
			}
		});

		btn_Doctores.setBounds(23, 119, 164, 23);
		panel.add(btn_Doctores);
		
		JButton btn_pedidos = new JButton("Pedidos");
		btn_pedidos.setBounds(23, 187, 164, 23);
		panel.add(btn_pedidos);
		
		JButton btn_material = new JButton("Material");
		btn_material.setBounds(23, 221, 164, 23);
		panel.add(btn_material);

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
	
	private static void mostrarMenuDoctor(Component invoker, JDesktopPane desktopPane) {
		JPopupMenu menu = new JPopupMenu();

		// Agregar elementos al menú desplegable
		JMenuItem perfilDoctor = new JMenuItem("Ver perfil doctor");
		perfilDoctor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					try {
						abrirPanelVerDoctor(desktopPane);
					} catch (PropertyVetoException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}

		

		});
		JMenuItem CrearDoctor = new JMenuItem("Crear perfil Doctor");
		CrearDoctor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				abrirPanelCrearDoctor(desktopPane);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	});
		
		

		menu.add(perfilDoctor);
		menu.add(CrearDoctor);
	

		// Mostrar el menú desplegable en la posición del componente invocador
		menu.show(invoker, 0, invoker.getHeight());
	}
	
	private static void abrirPanelCrearDoctor(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_DoctorCrear DoctorCrear = new Panel_DoctorCrear();

		DoctorCrear.setBorder(null);
		((BasicInternalFrameUI) DoctorCrear.getUI()).setNorthPane(null);
		DoctorCrear.setLocation(0, 0);
		DoctorCrear.show();
		DoctorCrear.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		DoctorCrear.setVisible(true);
		desktopPane.add(DoctorCrear); // Usar el parámetro en lugar de la variable local
		DoctorCrear.setSelected(true);
		
		
	}
	private static void abrirPanelVerDoctor(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_DoctorCreado DoctorCreado = new Panel_DoctorCreado();

		DoctorCreado.setBorder(null);
		((BasicInternalFrameUI) DoctorCreado.getUI()).setNorthPane(null);
		DoctorCreado.setLocation(0, 0);
		DoctorCreado.show();
		DoctorCreado.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		DoctorCreado.setVisible(true);
		desktopPane.add(DoctorCreado); // Usar el parámetro en lugar de la variable local
		DoctorCreado.setSelected(true);
		
		
	}
	
	private static void abrirPanelCrearProveedor(JDesktopPane desktopPane) throws PropertyVetoException {
		Panel_ProveedorCrear PacienteCrear = new Panel_ProveedorCrear();

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
		Panel_ProveedorCreado PacienteCreado = new Panel_ProveedorCreado();

		PacienteCreado.setBorder(null);
		((BasicInternalFrameUI) PacienteCreado.getUI()).setNorthPane(null);
		PacienteCreado.setLocation(0, 0);
		PacienteCreado.show();
		PacienteCreado.setSize(desktopPane.getWidth(), desktopPane.getWidth());
		PacienteCreado.setVisible(true);
		desktopPane.add(PacienteCreado); // Usar el parámetro en lugar de la variable local
		PacienteCreado.setSelected(true);
		
		
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
