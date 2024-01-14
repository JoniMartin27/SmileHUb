package Vista.gestionMedica;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Odontograma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 905, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 889, 480);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_imagen = new JLabel("New label");
		lbl_imagen.setIcon(new ImageIcon(Odontograma.class.getResource("/img/Dientes.png")));
		lbl_imagen.setBounds(172, 52, 517, 357);
		panel.add(lbl_imagen);
		
		JButton btn_diente1 = new JButton("New button");
		btn_diente1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		
		btn_diente1.setOpaque(false);
		btn_diente1.setBounds(256, 137, 39, 62);
		panel.add(btn_diente1);
		
		
		
		
		
		JButton btn_diente2 = new JButton("New button");
		btn_diente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);
			
			}
		});
		btn_diente2.setOpaque(false);
		btn_diente2.setBounds(308, 124, 48, 84);
		panel.add(btn_diente2);
		
		
		
		
		
		JButton btn_diente3 = new JButton("New button");
		btn_diente3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);
				
			}
		});
		btn_diente3.setOpaque(false);
		btn_diente3.setBounds(366, 124, 60, 84);
		panel.add(btn_diente3);
		
		
		
		
		
		JButton btn_diente4 = new JButton("New button");
		btn_diente4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
							
			}
		});
		btn_diente4.setOpaque(false);
		btn_diente4.setBounds(436, 124, 51, 84);
		panel.add(btn_diente4);
		
		
		
		
		
		JButton btn_diente5 = new JButton("New button");
		btn_diente5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente5.setOpaque(false);
		btn_diente5.setBounds(497, 124, 55, 84);
		panel.add(btn_diente5);

		
		
		
		
		JButton btn_diente6 = new JButton("New button");
		btn_diente6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente6.setOpaque(false);
		btn_diente6.setBounds(553, 137, 48, 62);
		panel.add(btn_diente6);
		
		
		
		
		
		JButton btn_diente7 = new JButton("New button");
		btn_diente7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente7.setOpaque(false);
		btn_diente7.setBounds(252, 261, 24, 49);
		panel.add(btn_diente7);
		
		
		
		
		
		JButton btn_diente8 = new JButton("New button");
		btn_diente8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente8.setOpaque(false);
		btn_diente8.setBounds(283, 261, 39, 62);
		panel.add(btn_diente8);
		
		
		
		
		
		JButton btn_diente9 = new JButton("New button");
		btn_diente9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente9.setOpaque(false);
		btn_diente9.setBounds(320, 274, 48, 62);
		panel.add(btn_diente9);
		
		
		
		
		
		JButton btn_diente10 = new JButton("New button");
		btn_diente10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente10.setOpaque(false);
		btn_diente10.setBounds(377, 274, 48, 72);
		panel.add(btn_diente10);
		
		
		
		
		
		JButton btn_diente11 = new JButton("New button");
		btn_diente11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente11.setOpaque(false);
		btn_diente11.setBounds(436, 274, 39, 72);
		panel.add(btn_diente11);
		
		
		
		
		
		JButton btn_diente12 = new JButton("New button");
		btn_diente12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente12.setOpaque(false);
		btn_diente12.setBounds(485, 274, 48, 62);
		panel.add(btn_diente12);
		
		
		
		
		
		JButton btn_diente13 = new JButton("New button");
		btn_diente13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente13.setOpaque(false);
		btn_diente13.setBounds(541, 261, 31, 62);
		panel.add(btn_diente13);
		
		
		
		
		
		JButton btn_diente14 = new JButton("New button");
		btn_diente14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			InformacionOdont informacionOdont = new InformacionOdont();
			informacionOdont.setVisible(true);	
				
			}
		});
		btn_diente14.setOpaque(false);
		btn_diente14.setBounds(579, 261, 31, 49);
		panel.add(btn_diente14);
	}
}
