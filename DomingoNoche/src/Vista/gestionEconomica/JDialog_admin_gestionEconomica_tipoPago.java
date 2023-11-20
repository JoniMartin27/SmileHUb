package Vista.gestionEconomica;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Vista.Material.JDialog_admin_Material_nuevoMaterial;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialog_admin_gestionEconomica_tipoPago extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialog_admin_gestionEconomica_tipoPago dialog = new JDialog_admin_gestionEconomica_tipoPago();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialog_admin_gestionEconomica_tipoPago() {
		setBounds(100, 100, 296, 311);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(159, 232, 223));
		contentPanel.setBackground(new Color(159, 232, 223));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipos de pago");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(71, 37, 135, 14);
		contentPanel.add(lblNewLabel);
		
		JButton btn_unico = new JButton("Pago unico");
		btn_unico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
JDialog_admin_gestionEconomica_Mixto unico=new JDialog_admin_gestionEconomica_Mixto();
				
								unico.setVisible(true);
								unico.setLocation(200, 200);
								unico.setModal(true);
								unico.setUndecorated(true);
								dispose();
				
				
			}
		});
		btn_unico.setBounds(61, 74, 158, 23);
		contentPanel.add(btn_unico);
		
		JButton btn_mixto = new JButton("Pago Mixto");
		btn_mixto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_gestionEconomica_unico Fraccionado=new JDialog_admin_gestionEconomica_unico();
				
				Fraccionado.setVisible(true);
				Fraccionado.setLocation(200, 200);
				Fraccionado.setModal(true);
				Fraccionado.setUndecorated(true);
				dispose();
			}
		});
		btn_mixto.setBounds(61, 133, 158, 23);
		contentPanel.add(btn_mixto);
		
		JButton btnPagoFraccionado = new JButton("Pago Fraccionado");
		btnPagoFraccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_Admin_Gestion_Economica_Fraccionado Fraccionado=new JDialog_Admin_Gestion_Economica_Fraccionado();
				
				Fraccionado.setVisible(true);
				Fraccionado.setLocation(200, 200);
				Fraccionado.setModal(true);
				Fraccionado.setUndecorated(true);
				dispose();
			}
		});
		btnPagoFraccionado.setBounds(61, 193, 158, 23);
		contentPanel.add(btnPagoFraccionado);
	}
}
