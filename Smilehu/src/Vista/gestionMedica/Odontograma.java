package Vista.gestionMedica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Usuario.Panel_PacienteCreado;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Odontograma extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField tf_nombre;
    private JTextField tf_estado;
    private ButtonGroup btn = new ButtonGroup();
	private static JDesktopPane miDesktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Odontograma frame = new Odontograma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setDesktopPane(JDesktopPane desktopPane) {
		this.miDesktopPane = desktopPane;
	}
	/**
	 * Create the frame.
	 */
	public Odontograma() {
		setBorder(null);
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 476);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1018, 476);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		JButton btn_guardarOdon = new JButton("Guardar");
		btn_guardarOdon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_guardarOdon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_guardarOdon.setBounds(730, 380, 106, 23);
		panel.add(btn_guardarOdon);
		
		
		
		
		
		
		JLabel lbl_back = new JLabel("");
		lbl_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					setDesktopPane(getDesktopPane());
					volver();
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		
		
			
			}
		});
		lbl_back.setIcon(new ImageIcon(Odontograma.class.getResource("/img/boton-de-retorno.png")));
		lbl_back.setBounds(20, 11, 39, 32);
		panel.add(lbl_back);
		
		
		
		JLabel lbl_imagen = new JLabel("New label");
		lbl_imagen.setIcon(new ImageIcon(Odontograma.class.getResource("/img/Dientes.png")));
		lbl_imagen.setBounds(20, 55, 467, 357);
		panel.add(lbl_imagen);
		
		
		
		JButton btn_diente1 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente1.setOpaque(true);
				btn_diente1.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente1.setOpaque(false);
				
			}
		});
		btn_diente1.setOpaque(false);
		btn_diente1.setBounds(106, 137, 39, 71);
		panel.add(btn_diente1);
		
		
		
		
		
		
		JButton btn_diente2 = new JButton();
		btn_diente2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente2.setOpaque(true);
				btn_diente2.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente2.setOpaque(false);
				
			}
		});
		btn_diente2.setOpaque(false);
		btn_diente2.setBounds(155, 130, 48, 84);
		panel.add(btn_diente2);
		
		
		
		
		
		
		JButton btn_diente3 = new JButton();
		btn_diente3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente3.setOpaque(true);
				btn_diente3.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente3.setOpaque(false);
				
			}
		});
		btn_diente3.setOpaque(false);
		btn_diente3.setBounds(213, 130, 60, 84);
		panel.add(btn_diente3);
		


		
		
		
		JButton btn_diente4 = new JButton();
		btn_diente4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente4.setOpaque(true);
				btn_diente4.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente4.setOpaque(false);
				
			}
		});
		btn_diente4.setOpaque(false);
		btn_diente4.setBounds(284, 130, 51, 84);
		panel.add(btn_diente4);
		
		
		
		
		
		
		JButton btn_diente5 = new JButton();
		btn_diente5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente5.setOpaque(true);
				btn_diente5.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente5.setOpaque(false);
				
			}
		});
		btn_diente5.setOpaque(false);
		btn_diente5.setBounds(345, 130, 55, 84);
		panel.add(btn_diente5);

		
		
		
		
		
		JButton btn_diente6 = new JButton();
		btn_diente6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente6.setOpaque(true);
				btn_diente6.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente6.setOpaque(false);
				
			}
		});
		btn_diente6.setOpaque(false);
		btn_diente6.setBounds(401, 141, 48, 62);
		panel.add(btn_diente6);
		
		
		
		
		
		
		JButton btn_diente7 = new JButton();
		btn_diente7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente7.setOpaque(true);
				btn_diente7.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente7.setOpaque(false);
				
			}
		});
		btn_diente7.setOpaque(false);
		btn_diente7.setBounds(106, 268, 24, 49);
		panel.add(btn_diente7);
		
		
		
		
		
		
		JButton btn_diente8 = new JButton();
		btn_diente8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente8.setOpaque(true);
				btn_diente8.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente8.setOpaque(false);
				
			}
		});
		btn_diente8.setOpaque(false);
		btn_diente8.setBounds(128, 268, 39, 62);
		panel.add(btn_diente8);
		
		
		
		
		
		
		JButton btn_diente9 = new JButton();
		btn_diente9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente9.setOpaque(true);
				btn_diente9.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente9.setOpaque(false);
				
			}
		});
		btn_diente9.setOpaque(false);
		btn_diente9.setBounds(177, 279, 48, 62);
		panel.add(btn_diente9);
		
		
		
		
		
		
		JButton btn_diente10 = new JButton();
		btn_diente10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente10.setOpaque(true);
				btn_diente10.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente10.setOpaque(false);
				
			}
		});
		btn_diente10.setOpaque(false);
		btn_diente10.setBounds(224, 279, 48, 72);
		panel.add(btn_diente10);
		
		
		
		
		
		
		JButton btn_diente11 = new JButton();
		btn_diente11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente11.setOpaque(true);
				btn_diente11.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente11.setOpaque(false);
				
			}
		});
		btn_diente11.setOpaque(false);
		btn_diente11.setBounds(284, 279, 39, 72);
		panel.add(btn_diente11);
		
		
		
		
		
		
		JButton btn_diente12 = new JButton();
		btn_diente12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente12.setOpaque(true);
				btn_diente12.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente12.setOpaque(false);
				
			}
		});
		btn_diente12.setOpaque(false);
		btn_diente12.setBounds(333, 279, 48, 62);
		panel.add(btn_diente12);
		
		
		
		
		
		
		JButton btn_diente13 = new JButton();
		btn_diente13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente13.setOpaque(true);
				btn_diente13.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente13.setOpaque(false);
				
			}
		});
		btn_diente13.setOpaque(false);
		btn_diente13.setBounds(391, 268, 31, 62);
		panel.add(btn_diente13);
		
		
		
		
		
		
		JButton btn_diente14 = new JButton();
		btn_diente14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn_diente14.setOpaque(true);
				btn_diente14.setBackground(new Color(159,232,223));
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btn_diente14.setOpaque(false);
				
			}
		});
		btn_diente14.setOpaque(false);
		btn_diente14.setBounds(418, 255, 31, 62);
		panel.add(btn_diente14);
		
		
		
		
		
		
		
		JTextField tf_nombre  = new JTextField();
		tf_nombre.setBounds(609, 55, 106, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		JTextArea ta_observaciones = new JTextArea();
		ta_observaciones.setBounds(609, 221, 325, 131);
		panel.add(ta_observaciones);
		
		JLabel lbl_nombre = new JLabel("Nombre Diente");
		lbl_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_nombre.setBounds(609, 36, 137, 14);
		panel.add(lbl_nombre);
		
		JTextField tf_estado = new JTextField();
		tf_estado.setBounds(753, 55, 106, 20);
		panel.add(tf_estado);
		tf_estado.setColumns(10);
		
		JLabel lbl_estado = new JLabel("Estado");
		lbl_estado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_estado.setBounds(751, 36, 72, 14);
		panel.add(lbl_estado);
		
		JLabel lbl_protesis = new JLabel("Prótesis");
		lbl_protesis.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_protesis.setBounds(609, 102, 91, 14);
		panel.add(lbl_protesis);
		
		
		
		
		JRadioButton rdbtn_si = new JRadioButton("Si");
		rdbtn_si.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_si.setBounds(700, 98, 39, 23);
		panel.add(rdbtn_si);
		
		JRadioButton rdbtn_no = new JRadioButton("No");
		rdbtn_no.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtn_no.setBounds(753, 98, 48, 23);
		panel.add(rdbtn_no);
		
        btn.add(rdbtn_si);
        btn.add(rdbtn_no);
        
        JLabel lbl_observaciones = new JLabel("Observaciones");
        lbl_observaciones.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_observaciones.setBounds(609, 200, 137, 14);
        panel.add(lbl_observaciones);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Odontograma.class.getResource("/img/fondoDientes.jpg")));
        lblNewLabel.setBounds(0, 0, 1018, 476);
        panel.add(lblNewLabel);
		
		
		
	}
	private static void volver() throws PropertyVetoException {
		
		
		
		JInternalFrame[] frames = miDesktopPane.getAllFrames();

		// Verifica si hay al menos una ventana interna
		if (frames.length > 0) {
		    // Recupera la última ventana interna
		    JInternalFrame ultimaVentana = frames[frames.length - 1];

		    // Restaura la ventana si está minimizada
		    if (ultimaVentana.isIcon()) {
		        try {
		            ultimaVentana.setIcon(false);
		        } catch (PropertyVetoException e) {
		            e.printStackTrace();
		        }
		    }

		    // Activa la última ventana
		    miDesktopPane.getDesktopManager().activateFrame(ultimaVentana);
	}
		}
}
