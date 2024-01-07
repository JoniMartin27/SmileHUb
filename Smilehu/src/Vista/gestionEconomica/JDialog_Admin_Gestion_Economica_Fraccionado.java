package Vista.gestionEconomica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDialog_Admin_Gestion_Economica_Fraccionado extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_total;
	private Component tf_tratamiento;
	private JTextField tf_nombrepaciente;
	private JTextField tf_plazo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_Admin_Gestion_Economica_Fraccionado dialog = new JDialog_Admin_Gestion_Economica_Fraccionado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_Admin_Gestion_Economica_Fraccionado() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 462, 337);
		getContentPane().setLayout(null);
		
		JLabel lbl_buscarpaciente = new JLabel("Buscar Paciente");
		lbl_buscarpaciente.setForeground(new Color(0, 0, 0));
		lbl_buscarpaciente.setBounds(10, 47, 96, 14);
		getContentPane().add(lbl_buscarpaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(new Color(0, 0, 0));
		lbl_tratamiento.setBounds(276, 11, 86, 14);
		getContentPane().add(lbl_tratamiento);
		
		JLabel lbl_total = new JLabel("Total");
		lbl_total.setForeground(new Color(0, 0, 0));
		lbl_total.setBounds(10, 104, 46, 14);
		getContentPane().add(lbl_total);
		
		JLabel lbl_cantidadapagar = new JLabel("Cantidad a Pagar");
		lbl_cantidadapagar.setForeground(new Color(0, 0, 0));
		lbl_cantidadapagar.setBounds(239, 155, 114, 14);
		getContentPane().add(lbl_cantidadapagar);
		
		JLabel lbl_plazomeses = new JLabel("Plazo/Meses");
		lbl_plazomeses.setForeground(new Color(0, 0, 0));
		lbl_plazomeses.setBounds(239, 104, 86, 14);
		getContentPane().add(lbl_plazomeses);
		
		JLabel lbl_dineropagado = new JLabel("Dinero Pagado");
		lbl_dineropagado.setForeground(new Color(0, 0, 0));
		lbl_dineropagado.setBounds(10, 155, 86, 14);
		getContentPane().add(lbl_dineropagado);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(new Color(0, 0, 0));
		lbl_nombrepaciente.setBounds(106, 11, 114, 14);
		getContentPane().add(lbl_nombrepaciente);
		
		JLabel lbl_Abonar = new JLabel("Abonar");
		lbl_Abonar.setForeground(new Color(0, 0, 0));
		lbl_Abonar.setBounds(229, 189, 86, 14);
		getContentPane().add(lbl_Abonar);
		
		tf_nombrepaciente = new JTextField();
		tf_nombrepaciente.setBounds(116, 44, 86, 20);
		getContentPane().add(tf_nombrepaciente);
		tf_nombrepaciente.setColumns(10);
		
		JTextField tf_tratamiento = new JTextField();
		tf_tratamiento.setColumns(10);
		tf_tratamiento.setBounds(276, 44, 86, 20);
		getContentPane().add(tf_tratamiento);
		
		tf_total = new JTextField();
		tf_total.setColumns(10);
		tf_total.setBounds(116, 101, 86, 20);
		getContentPane().add(tf_total);
		
		JTextField tf_dineropagado = new JTextField();
		tf_dineropagado.setColumns(10);
		tf_dineropagado.setBounds(116, 152, 86, 20);
		getContentPane().add(tf_dineropagado);
		
		JTextField tf_cantidadapagar = new JTextField();
		tf_cantidadapagar.setColumns(10);
		tf_cantidadapagar.setBounds(335, 152, 86, 20);
		getContentPane().add(tf_cantidadapagar);
		
		JTextField tf_Abonar = new JTextField();
		tf_Abonar.setColumns(10);
		tf_Abonar.setBounds(229, 209, 86, 20);
		getContentPane().add(tf_Abonar);
		
		
		
		
		
		
		JRadioButton rdbtn_tarjeta = new JRadioButton("Tarjeta");
		rdbtn_tarjeta.setBounds(10, 208, 86, 23);
		getContentPane().add(rdbtn_tarjeta);
		
		JRadioButton rdbtn_efectivo = new JRadioButton("Efectivo");
		rdbtn_efectivo.setBounds(106, 208, 86, 23);
		getContentPane().add(rdbtn_efectivo);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add (rdbtn_tarjeta);
		g1.add(rdbtn_efectivo);
		
		
		
		
		
		
		JButton btn_realizarpago = new JButton("Realizar Pago");
		btn_realizarpago.setBounds(181, 261, 114, 23);
		getContentPane().add(btn_realizarpago);
		
		tf_plazo = new JTextField();
		tf_plazo.setColumns(10);
		tf_plazo.setBounds(335, 101, 86, 20);
		getContentPane().add(tf_plazo);
		
		ButtonGroup g2 = new ButtonGroup();

	}
}
