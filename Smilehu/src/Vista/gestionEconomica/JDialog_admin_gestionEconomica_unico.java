package Vista.gestionEconomica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDialog_admin_gestionEconomica_unico extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_gestionEconomica_unico dialog = new JDialog_admin_gestionEconomica_unico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_admin_gestionEconomica_unico() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 447, 281);
		getContentPane().setLayout(null);
		
		JLabel lbl_buscarpaciente = new JLabel("Buscar Paciente");
		lbl_buscarpaciente.setForeground(new Color(0, 0, 0));
		lbl_buscarpaciente.setBounds(21, 41, 108, 14);
		getContentPane().add(lbl_buscarpaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(new Color(0, 0, 0));
		lbl_tratamiento.setBounds(280, 11, 86, 14);
		getContentPane().add(lbl_tratamiento);
		
		JLabel lbl_total = new JLabel("Total");
		lbl_total.setForeground(new Color(0, 0, 0));
		lbl_total.setBounds(124, 146, 46, 14);
		getContentPane().add(lbl_total);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(new Color(0, 0, 0));
		lbl_nombrepaciente.setBounds(139, 11, 100, 14);
		getContentPane().add(lbl_nombrepaciente);
		
		JTextField tf_nombrepaciente = new JTextField();
		tf_nombrepaciente.setBounds(139, 38, 86, 20);
		getContentPane().add(tf_nombrepaciente);
		tf_nombrepaciente.setColumns(10);
		
		JTextField tf_tratamiento = new JTextField();
		tf_tratamiento.setColumns(10);
		tf_tratamiento.setBounds(280, 38, 86, 20);
		getContentPane().add(tf_tratamiento);
		
		JTextField tf_total = new JTextField();
		tf_total.setColumns(10);
		tf_total.setBounds(179, 143, 86, 20);
		getContentPane().add(tf_total);
		
		
		
		
		
		
		JRadioButton rdbtn_tarjeta = new JRadioButton("Tarjeta");
		rdbtn_tarjeta.setBounds(139, 98, 86, 23);
		getContentPane().add(rdbtn_tarjeta);
		
		JRadioButton rdbtn_efectivo = new JRadioButton("Efectivo");
		rdbtn_efectivo.setBounds(246, 98, 86, 23);
		getContentPane().add(rdbtn_efectivo);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add (rdbtn_tarjeta);
		g1.add(rdbtn_efectivo);
		
		JButton btn_realizarpago = new JButton("Realizar Pago");
		btn_realizarpago.setBounds(167, 174, 114, 23);
		getContentPane().add(btn_realizarpago);
		
		JLabel lbl_pago = new JLabel("Realizar pago");
		lbl_pago.setBounds(21, 102, 86, 14);
		getContentPane().add(lbl_pago);

	}	
}

