package Vista;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Boton_Personalizado.Boton_personalizado;
import Vista.Material.Panel_Admin_Material_Stock;
import Vista.Usuario.Panel_DoctorCreado;
import Vista.Usuario.Panel_DoctorCrear;
import Vista.Usuario.Panel_PacienteCreado;
import Vista.Usuario.Panel_PacienteCrear;
import Vista.Usuario.Panel_ProveedorCreado;
import Vista.Usuario.Panel_ProveedorCrear;
import Vista.Usuario.Panel_admin_usuario_paciente_consultarCita;
import Vista.gestionEconomica.JDialog_admin_gestionEconomica_tipoPago;
import Vista.gestionEconomica.Panel_admin_gestionEconomica_GenerarInforme;
import Vista.gestionMedica.Panel_admin_gestionMedica_Inicio;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Inicio_Panel_Administrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		miDesktopPane.setBounds(155, 0, 862, 531);
		miDesktopPane.setOpaque(false);
		
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 862, 531);
		miDesktopPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/fondoDientes.jpg")));

		ArrayList<Integer> combo;
		combo = new ArrayList<>();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("PRESED " + e.getKeyCode());
				combo.add(e.getKeyCode());

				System.out.println("El combo vale:" + combo.size());
				if (combo.size() > 1) {

					// Paciente
					if ((e.getKeyCode() == KeyEvent.VK_P) && combo.contains(17)) {
						System.out.print("Has entrado en crear Paciente");
						Panel_PacienteCrear pacienteCrear = new Panel_PacienteCrear();
						pacienteCrear.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
						miDesktopPane.add(pacienteCrear);
						((BasicInternalFrameUI) pacienteCrear.getUI()).setNorthPane(null);
						pacienteCrear.setLocation(0, 0);
						pacienteCrear.show();
						pacienteCrear.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
						contentPane.requestFocus();
						combo.clear();
					} else if ((e.getKeyCode() == KeyEvent.VK_C) && combo.contains(17)) {
						System.out.print("Has entrado en consultar Cita");
						Panel_admin_usuario_paciente_consultarCita consultarCita = new Panel_admin_usuario_paciente_consultarCita();
						consultarCita.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
						miDesktopPane.add(consultarCita);
						((BasicInternalFrameUI) consultarCita.getUI()).setNorthPane(null);
						consultarCita.setLocation(0, 0);
						consultarCita.show();
						consultarCita.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
						contentPane.requestFocus();
						combo.clear();
					} else if ((e.getKeyCode() == KeyEvent.VK_J) && combo.contains(17)) {
						System.out.print("Has entrado en ver paciente Perfil");
						Panel_PacienteCreado pacienteCreado = new Panel_PacienteCreado();
						pacienteCreado.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
						miDesktopPane.add(pacienteCreado);
						((BasicInternalFrameUI) pacienteCreado.getUI()).setNorthPane(null);
						pacienteCreado.setLocation(0, 0);
						pacienteCreado.show();
						pacienteCreado.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
						contentPane.requestFocus();
						combo.clear();
					}

					// Proveedores
					else if ((e.getKeyCode() == KeyEvent.VK_V) && combo.contains(17)) {
						System.out.print("Has entrado en ver Proveedor");
						Panel_ProveedorCreado verProveedor = new Panel_ProveedorCreado();
						verProveedor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
						miDesktopPane.add(verProveedor);
						((BasicInternalFrameUI) verProveedor.getUI()).setNorthPane(null);
						verProveedor.setLocation(0, 0);
						verProveedor.show();
						verProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
						contentPane.requestFocus();
						combo.clear();
					} else if ((e.getKeyCode() == KeyEvent.VK_Z) && combo.contains(17)) {
						System.out.print("Has entrado en crer Proveedor");
						Panel_ProveedorCrear crearProveedor = new Panel_ProveedorCrear();
						crearProveedor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
						miDesktopPane.add(crearProveedor);
						((BasicInternalFrameUI) crearProveedor.getUI()).setNorthPane(null);
						crearProveedor.setLocation(0, 0);
						crearProveedor.show();
						crearProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
						contentPane.requestFocus();
						combo.clear();
					}

					// Tipos de Pago
					if (combo.contains(KeyEvent.VK_T) && (combo.contains(KeyEvent.VK_P) && combo.contains(17))) {
						JDialog_admin_gestionEconomica_tipoPago tipoPago = new JDialog_admin_gestionEconomica_tipoPago();
						tipoPago.setVisible(true);
						tipoPago.setLocation(200, 200);
						tipoPago.setModal(true);
						contentPane.requestFocus();
						combo.clear();

					}

				}
			}

		});
//Menu DNI		
		JMenuBar BarraMenu_DNI = new JMenuBar();
		BarraMenu_DNI.setBackground(new Color(205, 234, 251));
		BarraMenu_DNI.setBounds(0, 0, 40, 30);
		contentPane.add(BarraMenu_DNI);

		JMenu Menu_DNI = new JMenu("");
		Menu_DNI.setIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/ayuda.png")));
		Menu_DNI.setBounds(907, 11, 101, 22);

		BarraMenu_DNI.add(Menu_DNI);

		JMenuItem Item_perfil = new JMenuItem("Editar Perfil");
		Menu_DNI.add(Item_perfil);

		JMenuItem Item_ayuda = new JMenuItem("Ayuda");
		Menu_DNI.add(Item_ayuda);

		JMenuItem Item_cerrar = new JMenuItem("Cerrar Perfil");
		Item_cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				Inicio_Panel_Administrador.this.setVisible(false);

			}
		});
		Menu_DNI.add(Item_cerrar);

		// DesktopPane el cual cambia por internalFrames

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 156, 531);
		contentPane.add(panel);
		panel.paintComponents(getGraphics());
		panel.setBackground(new Color(205, 234, 251));
		Boton_personalizado btn_realizarinformes = new Boton_personalizado();
		btn_realizarinformes.setBounds(3, 453, 148, 49);
		btn_realizarinformes.setForeground(new Color(0, 0, 0));
		btn_realizarinformes.setBackground(new Color(148, 213, 248));
		btn_realizarinformes.setText("Informe Economico");
		btn_realizarinformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_admin_gestionEconomica_GenerarInforme generarInforme = new Panel_admin_gestionEconomica_GenerarInforme();
				generarInforme.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(generarInforme);
				generarInforme.setBorder(null);
				((BasicInternalFrameUI) generarInforme.getUI()).setNorthPane(null);
				generarInforme.setLocation(0, 0);
				generarInforme.show();
				generarInforme.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				contentPane.requestFocus();
			}

		});
		panel.setLayout(null);
		panel.add(btn_realizarinformes);
		Boton_personalizado btn_realizarpago = new Boton_personalizado();
		btn_realizarpago.setBounds(3, 408, 148, 49);
		btn_realizarpago.setForeground(new Color(0, 0, 0));
		btn_realizarpago.setBackground(new Color(148, 213, 248));
		btn_realizarpago.setText("Registrar Pago");
		btn_realizarpago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_gestionEconomica_tipoPago tipoPago = new JDialog_admin_gestionEconomica_tipoPago();

				tipoPago.setVisible(true);
				tipoPago.setLocation(200, 200);
				tipoPago.setModal(true);
				tipoPago.setUndecorated(true);
				dispose();
				contentPane.requestFocus();
			}
		});
		panel.add(btn_realizarpago);
		// Boton Gestion Medica

		Boton_personalizado btn_GestionMedica = new Boton_personalizado();
		btn_GestionMedica.setBounds(3, 270, 148, 49);
		btn_GestionMedica.setForeground(new Color(0, 0, 0));
		btn_GestionMedica.setText("Gestion Medica");
		btn_GestionMedica.setBackground(new Color(148, 213, 248));
		panel.add(btn_GestionMedica);
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
				contentPane.requestFocus();
			}
		});

		Boton_personalizado btn_paciente = new Boton_personalizado();
		btn_paciente.setBounds(3, 130, 148, 49);
		btn_paciente.setForeground(new Color(0, 0, 0));
		btn_paciente.setText("Pacientes");
		btn_paciente.setBackground(new Color(148, 213, 248));
		btn_paciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarMenuPaciente(btn_paciente, miDesktopPane);
				contentPane.requestFocus();
			}
		});

		Boton_personalizado btn_proveedor = new Boton_personalizado();
		btn_proveedor.setBounds(3, 223, 148, 49);
		btn_proveedor.setForeground(new Color(0, 0, 0));
		btn_proveedor.setText("Proveedores");
		btn_proveedor.setBackground(new Color(148, 213, 248));
		btn_proveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMenuProveedor(btn_proveedor, miDesktopPane);
				contentPane.requestFocus();
			}
		});
		panel.add(btn_proveedor);
		panel.add(btn_paciente);

		Boton_personalizado btn_Doctores = new Boton_personalizado();
		btn_Doctores.setBounds(3, 177, 148, 49);
		btn_Doctores.setForeground(new Color(0, 0, 0));
		btn_Doctores.setText("Doctores");
		btn_Doctores.setBackground(new Color(148, 213, 248));
		btn_Doctores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarMenuDoctor(btn_Doctores, miDesktopPane);
				contentPane.requestFocus();
			}
		});
		panel.add(btn_Doctores);

		Boton_personalizado btn_material = new Boton_personalizado();
		btn_material.setBounds(3, 316, 148, 49);
		btn_material.setForeground(new Color(0, 0, 0));
		btn_material.setText("Material");
		btn_material.setBackground(new Color(148, 213, 248));
		btn_material.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Admin_Material_Stock material = new Panel_Admin_Material_Stock();
				material.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
				miDesktopPane.removeAll();
				miDesktopPane.add(material);
				material.setBorder(null);
				((BasicInternalFrameUI) material.getUI()).setNorthPane(null);
				material.setLocation(0, 0);
				material.show();
				material.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
				contentPane.requestFocus();

			}
		});

		Boton_personalizado btn_pedidos = new Boton_personalizado();
		btn_pedidos.setBounds(3, 361, 148, 49);
		btn_pedidos.setForeground(new Color(0, 0, 0));
		btn_pedidos.setText("Pedidos");
		btn_pedidos.setBackground(new Color(148, 213, 248));
		btn_pedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.requestFocus();

			}
		});
		panel.add(btn_pedidos);
		panel.add(btn_material);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(3, 26, 146, 99);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/SmileHubIcon.jpg")));
		contentPane.requestFocus();

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
