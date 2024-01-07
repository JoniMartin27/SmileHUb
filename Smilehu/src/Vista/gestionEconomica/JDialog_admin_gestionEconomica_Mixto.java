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

public class JDialog_admin_gestionEconomica_Mixto extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tf_duracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_gestionEconomica_Mixto dialog = new JDialog_admin_gestionEconomica_Mixto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_admin_gestionEconomica_Mixto() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(100, 100, 573, 316);
		getContentPane().setLayout(null);
		
		JLabel lbl_buscarpaciente = new JLabel("Buscar Paciente");
		lbl_buscarpaciente.setForeground(new Color(4, 20, 36));
		lbl_buscarpaciente.setBounds(10, 39, 117, 14);
		getContentPane().add(lbl_buscarpaciente);
		
		JLabel lbl_tratamiento = new JLabel("Tratamiento");
		lbl_tratamiento.setForeground(new Color(4, 20, 36));
		lbl_tratamiento.setBounds(341, 11, 86, 14);
		getContentPane().add(lbl_tratamiento);
		
		JLabel lbl_total = new JLabel("Total");
		lbl_total.setForeground(new Color(4, 20, 36));
		lbl_total.setBounds(272, 98, 46, 14);
		getContentPane().add(lbl_total);
		
		JLabel lbl_duracion = new JLabel("Duracion");
		lbl_duracion.setForeground(new Color(4, 20, 36));
		lbl_duracion.setBounds(10, 198, 86, 14);
		getContentPane().add(lbl_duracion);
		
		JLabel lblprimerpago = new JLabel("Primer Pago");
		lblprimerpago.setForeground(new Color(4, 20, 36));
		lblprimerpago.setBounds(10, 146, 86, 14);
		getContentPane().add(lblprimerpago);
		
		JLabel lbl_restante = new JLabel("Restante");
		lbl_restante.setForeground(new Color(4, 20, 36));
		lbl_restante.setBounds(272, 146, 67, 14);
		getContentPane().add(lbl_restante);
		
		JLabel lbl_nombrepaciente = new JLabel("Nombre Paciente");
		lbl_nombrepaciente.setForeground(new Color(4, 20, 36));
		lbl_nombrepaciente.setBounds(137, 11, 114, 14);
		getContentPane().add(lbl_nombrepaciente);
		
		JLabel lbl_mensualidad = new JLabel("Mensualidad");
		lbl_mensualidad.setForeground(new Color(4, 20, 36));
		lbl_mensualidad.setBounds(10, 98, 86, 14);
		getContentPane().add(lbl_mensualidad);
		
		JLabel lbl_cantidadabonar = new JLabel("Cantidad Abonar");
		lbl_cantidadabonar.setBackground(new Color(4, 20, 36));
		lbl_cantidadabonar.setForeground(new Color(4, 20, 36));
		lbl_cantidadabonar.setBounds(452, 170, 105, 14);
		getContentPane().add(lbl_cantidadabonar);
		
		JTextField tf_nombrepaciente = new JTextField();
		tf_nombrepaciente.setBounds(137, 36, 86, 20);
		getContentPane().add(tf_nombrepaciente);
		tf_nombrepaciente.setColumns(10);
		
		JTextField tf_mensualidad = new JTextField();
		tf_mensualidad.setColumns(10);
		tf_mensualidad.setBounds(137, 95, 86, 20);
		getContentPane().add(tf_mensualidad);
		
		JTextField tf_tratamiento = new JTextField();
		tf_tratamiento.setColumns(10);
		tf_tratamiento.setBounds(341, 36, 86, 20);
		getContentPane().add(tf_tratamiento);
		
		JTextField tf_total = new JTextField();
		tf_total.setColumns(10);
		tf_total.setBounds(341, 95, 86, 20);
		getContentPane().add(tf_total);
		
		JTextField tf_restante = new JTextField();
		tf_restante.setColumns(10);
		tf_restante.setBounds(341, 143, 86, 20);
		getContentPane().add(tf_restante);
		
		JTextField tf_primerpago = new JTextField();
		tf_primerpago.setColumns(10);
		tf_primerpago.setBounds(137, 143, 86, 20);
		getContentPane().add(tf_primerpago);
		
		tf_duracion = new JTextField();
		tf_duracion.setColumns(10);
		tf_duracion.setBounds(137, 195, 86, 20);
		getContentPane().add(tf_duracion);
		
		JTextField tf_cantidadabonar = new JTextField();
		tf_cantidadabonar.setColumns(10);
		tf_cantidadabonar.setBounds(452, 195, 86, 20);
		getContentPane().add(tf_cantidadabonar);
		
		
		
		
		
		
		JRadioButton rdbtn_tarjeta = new JRadioButton("Tarjeta");
		rdbtn_tarjeta.setBounds(272, 194, 86, 23);
		getContentPane().add(rdbtn_tarjeta);
		
		JRadioButton rdbtn_efectivo = new JRadioButton("Efectivo");
		rdbtn_efectivo.setBounds(360, 194, 86, 23);
		getContentPane().add(rdbtn_efectivo);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add (rdbtn_tarjeta);
		g1.add(rdbtn_efectivo);
		
		JButton btn_realizarpago = new JButton("Realizar Pago");
		btn_realizarpago.setBounds(212, 243, 114, 23);
		getContentPane().add(btn_realizarpago);

	}

}
