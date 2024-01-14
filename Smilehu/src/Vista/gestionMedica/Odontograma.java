package Vista.gestionMedica;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Odontograma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_nombre;
	private JTextField tf_estado;
	private ButtonGroup btn = new ButtonGroup();

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

	/**
	 * Create the frame.
	 */
	public Odontograma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1002, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
		btn_diente1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		
		btn_diente1.setOpaque(false);
		btn_diente1.setBounds(106, 137, 39, 71);
		panel.add(btn_diente1);
		
		
		
		
		
		
		JButton btn_diente2 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);
			
			}
		});
		btn_diente2.setOpaque(false);
		btn_diente2.setBounds(155, 130, 48, 84);
		panel.add(btn_diente2);
		
		
		
		
		
		
		JButton btn_diente3 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);
				
			}
		});
		btn_diente3.setOpaque(false);
		btn_diente3.setBounds(213, 130, 60, 84);
		panel.add(btn_diente3);
		


		
		
		
		JButton btn_diente4 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
							
			}
		});
		btn_diente4.setOpaque(false);
		btn_diente4.setBounds(284, 130, 51, 84);
		panel.add(btn_diente4);
		
		
		
		
		
		
		JButton btn_diente5 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente5.setOpaque(false);
		btn_diente5.setBounds(345, 130, 55, 84);
		panel.add(btn_diente5);

		
		
		
		
		
		JButton btn_diente6 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente6.setOpaque(false);
		btn_diente6.setBounds(401, 141, 48, 62);
		panel.add(btn_diente6);
		
		
		
		
		
		
		JButton btn_diente7 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente7.setOpaque(false);
		btn_diente7.setBounds(106, 268, 24, 49);
		panel.add(btn_diente7);
		
		
		
		
		
		
		JButton btn_diente8 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente8.setOpaque(false);
		btn_diente8.setBounds(128, 268, 39, 62);
		panel.add(btn_diente8);
		
		
		
		
		
		
		JButton btn_diente9 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente9.setOpaque(false);
		btn_diente9.setBounds(177, 279, 48, 62);
		panel.add(btn_diente9);
		
		
		
		
		
		
		JButton btn_diente10 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente10.setOpaque(false);
		btn_diente10.setBounds(224, 279, 48, 72);
		panel.add(btn_diente10);
		
		
		
		
		
		
		JButton btn_diente11 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente11.setOpaque(false);
		btn_diente11.setBounds(284, 279, 39, 72);
		panel.add(btn_diente11);
		
		
		
		
		
		
		JButton btn_diente12 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente12.setOpaque(false);
		btn_diente12.setBounds(333, 279, 48, 62);
		panel.add(btn_diente12);
		
		
		
		
		
		
		JButton btn_diente13 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente13.setOpaque(false);
		btn_diente13.setBounds(391, 268, 31, 62);
		panel.add(btn_diente13);
		
		
		
		
		
		
		JButton btn_diente14 = new JButton();
		btn_diente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				
				
			}
		});
		btn_diente14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente14.setOpaque(false);
		btn_diente14.setBounds(418, 255, 31, 62);
		panel.add(btn_diente14);
		
		
		
		
		
		
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(609, 55, 106, 20);
		panel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		JTextArea ta_observaciones = new JTextArea();
		ta_observaciones.setBounds(609, 221, 325, 131);
		panel.add(ta_observaciones);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(609, 36, 86, 14);
		panel.add(lbl_nombre);
		
		tf_estado = new JTextField();
		tf_estado.setBounds(753, 55, 106, 20);
		panel.add(tf_estado);
		tf_estado.setColumns(10);
		
		JLabel lbl_estado = new JLabel("Estado");
		lbl_estado.setBounds(751, 36, 72, 14);
		panel.add(lbl_estado);
		
		JLabel lbl_protesis = new JLabel("Prótesis");
		lbl_protesis.setBounds(609, 102, 46, 14);
		panel.add(lbl_protesis);
		
		
		
		
		JRadioButton rdbtn_si = new JRadioButton("Si");
		rdbtn_si.setBounds(669, 98, 60, 23);
		panel.add(rdbtn_si);
		
		JRadioButton rdbtn_no = new JRadioButton("No");
		rdbtn_no.setBounds(713, 98, 72, 23);
		panel.add(rdbtn_no);
		
        btn.add(rdbtn_si);
        btn.add(rdbtn_no);
        
        JLabel lbl_observaciones = new JLabel("Observaciones");
        lbl_observaciones.setBounds(609, 200, 132, 14);
        panel.add(lbl_observaciones);
		
		
		
	}
}
