package Vista.Material;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JTable;

public class material_Solicitudes extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					material_Solicitudes frame = new material_Solicitudes();
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
	public material_Solicitudes() {
		setBounds(100, 100, 1018, 476);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 476);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(material_Solicitudes.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 1018, 476);
		panel.add(lblNewLabel);

	}

}
