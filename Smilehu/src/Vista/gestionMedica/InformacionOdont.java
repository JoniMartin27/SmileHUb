package Vista.gestionMedica;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class InformacionOdont extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionOdont frame = new InformacionOdont();
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
	public InformacionOdont() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 815, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(47, 35, 184, 153);
		panel.add(calendar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(286, 35, 137, 20);
		panel.add(dateChooser);
		
		JButton btnNewButton = new JButton("Pinchame pelon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
				String fechaComoCadena = fecha.format(dateChooser.getDate());
				System.out.println(fechaComoCadena);
			}
		});
		btnNewButton.setBounds(286, 114, 137, 23);
		panel.add(btnNewButton);
	}
}
