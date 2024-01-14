package Inicio;

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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;

public class Inicio_Panel_Administrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane miDesktopPane_1;


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
		
		// Atributos Frame Principal
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 350, 1034, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 129, 170));
		contentPane.setForeground(new Color(4, 20, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFocusable(true);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				//DesktopPane el cual cambia por internalFrames
						
				
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 1018, 55);
						contentPane.add(panel);
						panel.setBackground(new Color(0, 0, 0));
						panel.setLayout(null);
						JDesktopPane miDesktopPane = new JDesktopPane();
						miDesktopPane.setBounds(0, 55, 1018, 476);
						contentPane.add(miDesktopPane);
						miDesktopPane.setBackground(new Color(4, 20, 36));
						
						JLabel lblNewLabel = new JLabel("New label");
						lblNewLabel.setIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/fondoDientes.jpg")));
						lblNewLabel.setBounds(0, 0, 1018, 476);
						miDesktopPane.add(lblNewLabel);
								
								JLabel lblNewLabel_1 = new JLabel("");
								lblNewLabel_1.setIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/SmileHub_mini.png")));
								lblNewLabel_1.setBounds(954, 0, 64, 55);
								panel.add(lblNewLabel_1);

								JButton btn_paciente = new JButton("Pacientes");
								btn_paciente.setBounds(0, 0, 159, 55);
								panel.add(btn_paciente);
								btn_paciente.setFont(new Font("Tahoma", Font.BOLD, 11));
								btn_paciente.setForeground(new Color(255, 255, 255));
								btn_paciente.setBackground(new Color(0, 64, 128));
								btn_paciente.setSelectedIcon(new ImageIcon(Inicio_Panel_Administrador.class.getResource("/img/boton.png")));
								btn_paciente.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {

										mostrarMenuPaciente(btn_paciente, miDesktopPane);

									}
								});
								
								
								
								
								JButton btn_material = new JButton("Material");
								btn_material.setBounds(159, 0, 159, 55);
								panel.add(btn_material);
								btn_material.setForeground(new Color(255, 255, 255));
								btn_material.setFont(new Font("Tahoma", Font.BOLD, 11));
								btn_material.setBackground(new Color(0, 64, 128));
								
	
								
										JButton btn_proveedor = new JButton("Proveedores");
										btn_proveedor.setBounds(477, 0, 159, 55);
										panel.add(btn_proveedor);
										btn_proveedor.setFont(new Font("Tahoma", Font.BOLD, 11));
										btn_proveedor.setForeground(new Color(255, 255, 255));
										btn_proveedor.setBackground(new Color(0, 64, 128));
										

												JButton btn_Doctores = new JButton("Doctores");
												btn_Doctores.setBounds(636, 0, 159, 55);
												panel.add(btn_Doctores);
												btn_Doctores.setFont(new Font("Tahoma", Font.BOLD, 11));
												btn_Doctores.setForeground(new Color(255, 255, 255));
												btn_Doctores.setBackground(new Color(0, 64, 128));
												
												
												// Boton Gestion Medica

												JButton btn_GestionMedica = new JButton("Gestión Medica");
												btn_GestionMedica.setBounds(318, 0, 159, 55);
												panel.add(btn_GestionMedica);
												btn_GestionMedica.setForeground(new Color(255, 255, 255));
												btn_GestionMedica.setFont(new Font("Tahoma", Font.BOLD, 11));
												btn_GestionMedica.setBackground(new Color(0, 64, 128));
												

												// Boton Gestion Economica
												JButton btn_Citas = new JButton("Citas");
												btn_Citas.setBounds(795, 0, 159, 55);
												panel.add(btn_Citas);
												btn_Citas.setForeground(new Color(255, 255, 255));
												btn_Citas.setFont(new Font("Tahoma", Font.BOLD, 11));
												btn_Citas.setBackground(new Color(0, 64, 128));
												
												JButton btn_perfil = new JButton("");
												btn_perfil.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														mostrarPerfil(btn_perfil,miDesktopPane);
													}
												});
												btn_perfil.setOpaque(false);
												btn_perfil.setBounds(954, 0, 64, 55);
												panel.add(btn_perfil);
												
														btn_Citas.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																	if(miDesktopPane.isVisible()==false) {
																		miDesktopPane.setVisible(true);
																	}
																Panel_admin_usuario_paciente_consultarCita Citas = new Panel_admin_usuario_paciente_consultarCita();
																Citas.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
																miDesktopPane.removeAll();
																miDesktopPane.add(Citas);
																Citas.setBorder(null);
																((BasicInternalFrameUI) Citas.getUI()).setNorthPane(null);
																Citas.setLocation(0, 0);
																Citas.show();
																Citas.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
												
															}
														});
														btn_GestionMedica.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(miDesktopPane.isVisible()==false) {
																	miDesktopPane.setVisible(true);
																}
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
														btn_Doctores.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {

																mostrarMenuDoctor(btn_Doctores, miDesktopPane);
															}
														});
														btn_proveedor.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																mostrarMenuProveedor(btn_proveedor,miDesktopPane);
																
															}
														});
														btn_material.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
															}
														});
		
		ArrayList<Integer> combo;
		combo = new ArrayList<>();
		contentPane.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		System.out.println("PRESED " + e.getKeyCode());
        		combo.add(e.getKeyCode());
        		
        		System.out.println("El combo vale:" + combo.size());
        		if(combo.size()>1) {
        			
        			
        		//PacienteCrear
        			if((e.getKeyCode()==KeyEvent.VK_P)&&combo.contains(17)) {
        				System.out.print("Has entrado en crear Paciente");
        				Panel_PacienteCrear pacienteCrear=new Panel_PacienteCrear();
        				pacienteCrear.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(pacienteCrear);
        				((BasicInternalFrameUI) pacienteCrear.getUI()).setNorthPane(null);
        				pacienteCrear.setLocation(0, 0);
        				pacienteCrear.show();
        				pacienteCrear.setSize(miDesktopPane.getWidth(), miDesktopPane.getHeight());
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			
        			//PacienteCreado
        			else if((e.getKeyCode()==KeyEvent.VK_J)&&combo.contains(17)) {
        				System.out.print("Has entrado en ver paciente Perfil");
        				Panel_PacienteCreado pacienteCreado=new Panel_PacienteCreado();
        				pacienteCreado.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(pacienteCreado);
        				((BasicInternalFrameUI) pacienteCreado.getUI()).setNorthPane(null);
        				pacienteCreado.setLocation(0, 0);
        				pacienteCreado.show();
        				pacienteCreado.setSize(miDesktopPane.getWidth(), miDesktopPane.getHeight());
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
        				verProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getHeight()); 
        				contentPane.requestFocus();
        				combo.clear();
        			}
        			else if((e.getKeyCode()==KeyEvent.VK_Z)&&combo.contains(17)) {
        				System.out.print("Has entrado en crear Proveedor");
        				Panel_ProveedorCrear crearProveedor=new Panel_ProveedorCrear();
        				crearProveedor.setDesktopPane(miDesktopPane); // Asigna la referencia del DesktopPane
        				miDesktopPane.add(crearProveedor);
        				((BasicInternalFrameUI) crearProveedor.getUI()).setNorthPane(null);
        				crearProveedor.setLocation(0, 0);
        				crearProveedor.show();
        				crearProveedor.setSize(miDesktopPane.getWidth(), miDesktopPane.getHeight()); 
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
		;
	}
	
	private static void mostrarPerfil(Component invoker, JDesktopPane desktopPane) {
		JPopupMenu menu = new JPopupMenu();

		// Agregar elementos al menú desplegable
		

		JMenuItem ayuda = new JMenuItem("Ayuda");
		ayuda.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				abrirPanelCrearPaciente(desktopPane);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	});
		JMenuItem cerrarPerfil = new JMenuItem("Cerrar Sesión");
		cerrarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Inicio_Panel_Administrador.hacerInvisible();

			
			}
		});
		

	
		menu.add(ayuda);
		menu.add(cerrarPerfil);

		// Mostrar el menú desplegable en la posición del componente invocador
		menu.show(invoker, 0, invoker.getHeight());
	}
	
	private static void mostrarMenuPaciente(Component invoker, JDesktopPane desktopPane) {
		JPopupMenu menu = new JPopupMenu();

		// Agregar elementos al menú desplegable
		

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
	
	public static  void hacerInvisible() {
		 Inicio_Panel_Administrador instancia = new Inicio_Panel_Administrador();
		    instancia.setVisible(false);
		    instancia.dispose();  // Liberar recursos
	}
	
}
