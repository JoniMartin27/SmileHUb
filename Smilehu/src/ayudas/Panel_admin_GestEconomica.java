package ayudas;
import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Panel_admin_GestEconomica extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_admin_GestEconomica frame = new Panel_admin_GestEconomica();
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
	public Panel_admin_GestEconomica() {
		setBounds(100, 100, 974, 373);
		getContentPane().setLayout(null);
		
		
		JButton btn_mod_usuario = new JButton("Crear/modificar usuario");
		btn_mod_usuario.setBounds(10, 11, 145, 23);
		getContentPane().add(btn_mod_usuario);
		
		JButton btn_asigCita = new JButton("Asignar Cita");
		btn_asigCita.setBounds(182, 11, 108, 23);
		getContentPane().add(btn_asigCita);
		
		JButton btn_modCita = new JButton("Modificar Cita");
		btn_modCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_modCita.setBounds(329, 11, 108, 23);
		getContentPane().add(btn_modCita);
		
		JButton brn_buscHistorial = new JButton("Buscar Historial");
		brn_buscHistorial.setBounds(95, 60, 89, 23);
		getContentPane().add(brn_buscHistorial);
		
		textField = new JTextField();
		textField.setBounds(195, 61, 115, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(617, 256, 89, 23);
		getContentPane().add(btnNewButton_4);
		
		table = new JTable();
		table.setBounds(10, 90, 609, 155);
		getContentPane().add(table);
		

	}
}
