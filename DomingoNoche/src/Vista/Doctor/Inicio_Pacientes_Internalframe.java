package Vista.Doctor;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Material.Panel_admin_Material_CrearPedido;
import Vista.Usuario.Panel_admin_usuario_generarInforme;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio_Pacientes_Internalframe extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_Pacientes_Internalframe frame = new Inicio_Pacientes_Internalframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JDesktopPane miDesktopPane;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Inicio_Pacientes_Internalframe() {
		getContentPane().setBackground(new Color(60, 129, 170));
		setBounds(100, 100, 688, 351);
		getContentPane().setLayout(null);
		
		JButton btn_buscarpaciente = new JButton("Buscar Paciente");
		btn_buscarpaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		btn_buscarpaciente.setBounds(20, 50, 131, 23);
		getContentPane().add(btn_buscarpaciente);
		
		JButton btn_añadirtratamiento = new JButton("Añadir Tratamiento");
		btn_añadirtratamiento.setBounds(20, 248, 131, 23);
		getContentPane().add(btn_añadirtratamiento);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(4, 20, 36));
		desktopPane.setBounds(173, 0, 499, 321);
		getContentPane().add(desktopPane);
		desktopPane.setLayout(null);
		
		
		


	}
}