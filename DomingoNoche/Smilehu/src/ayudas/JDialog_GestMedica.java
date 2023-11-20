package ayudas;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialog_GestMedica extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
		
    private JDesktopPane desktopPane;
    private JFrame Frame;
	/**
	 * Create the dialog.
	 */
//Añadimos dos variables al constructor para llamar a JInternalFrames y poder añadirlos en el Frame Principal
	public JDialog_GestMedica(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;
		setBounds(100, 100, 350, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
//Creamos el botón especialidades y llamamos al JDialog de Opciones de Especialidad
		
		JButton btn_Especialidades = new JButton("Especialidades");
		btn_Especialidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_OpcionesEspecialidad dia_opcEsp =new JDialog_OpcionesEspecialidad(Frame, desktopPane); 
				dia_opcEsp.setVisible(true);
				dispose();
			}
		});
		btn_Especialidades.setBounds(10, 82, 110, 100);
		contentPanel.add(btn_Especialidades);
//Creamos el boton de tratamientos y llamamos al JDialog de Opciones de Tratamiento		
		JButton btn_Tratamientos = new JButton("Tratamientos");
		btn_Tratamientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_OpcionesTratamiento dia_opcTrat =new JDialog_OpcionesTratamiento(Frame, desktopPane);
				
				dia_opcTrat.setVisible(true);
				dispose();
			}
		});
		btn_Tratamientos.setBounds(214, 82, 110, 100);
		contentPanel.add(btn_Tratamientos);
	}

}
