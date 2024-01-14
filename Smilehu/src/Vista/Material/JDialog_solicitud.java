package Vista.Material;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class JDialog_solicitud extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	 private DefaultTableModel model;
	    private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_solicitud dialog = new JDialog_solicitud();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_solicitud() {
		setBounds(100, 100, 694, 605);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 678, 566);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btn_rechazar = new JButton("Rechazar");
		btn_rechazar.setBounds(472, 508, 89, 23);
		panel.add(btn_rechazar);
		
		JButton btn_aceptar = new JButton("Aceptar");
		btn_aceptar.setBounds(88, 508, 89, 23);
		panel.add(btn_aceptar);
		
		table = new JTable();
		table.setBounds(70, 38, 528, 438);
		panel.add(table);
		 JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(25,45,567,428);
	        panel.add(scrollPane);
	        String[] columnas = {"id_solicitud", "id_cita", "nombreMaterial","Cantidad","NombreProveedor" };

	        model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnas);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JDialog_solicitud.class.getResource("/img/fondoDientes.jpg")));
		lblNewLabel.setBounds(0, 0, 678, 566);
		panel.add(lblNewLabel);
	}
	private void limpiarTabla() {
		model.setRowCount(0);
	}
}
