package Vista.Material;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Admin_Material_Stock extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_material;
	private JTextField tf_preciounitario;
	private JTextField tf_cantidadmaterial;
	private JTextField tf_preciototal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Admin_Material_Stock frame = new Panel_Admin_Material_Stock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JDesktopPane miDesktopPane;
	public void setDesktopPane(JDesktopPane desktopPane) {
	    this.miDesktopPane = desktopPane;
	}

	/**
	 * Create the frame.
	 */
	public Panel_Admin_Material_Stock() {
		getContentPane().setBackground(new Color(159, 232, 223));
		setBounds(190, 43, 593, 414);
		getContentPane().setLayout(null);
		
		JLabel lbl_actualizarstock = new JLabel("Control de Stock");
		lbl_actualizarstock.setForeground(new Color(0, 0, 0));
		lbl_actualizarstock.setBounds(10, 11, 165, 14);
		getContentPane().add(lbl_actualizarstock);
		
		JLabel lbl_material = new JLabel("Material");
		lbl_material.setForeground(new Color(0, 0, 0));
		lbl_material.setBounds(10, 47, 86, 14);
		getContentPane().add(lbl_material);
		
		tf_material = new JTextField();
		tf_material.setBounds(10, 72, 86, 20);
		getContentPane().add(tf_material);
		tf_material.setColumns(10);
		
		JLabel lbl_preciounitario = new JLabel("Precio Unitario");
		lbl_preciounitario.setForeground(new Color(0, 0, 0));
		lbl_preciounitario.setBounds(177, 47, 139, 14);
		getContentPane().add(lbl_preciounitario);
		
		tf_preciounitario = new JTextField();
		tf_preciounitario.setBounds(177, 72, 86, 20);
		getContentPane().add(tf_preciounitario);
		tf_preciounitario.setColumns(10);
		
		JLabel lbl_cantidadmaterial = new JLabel("Cantidad Material");
		lbl_cantidadmaterial.setForeground(new Color(0, 0, 0));
		lbl_cantidadmaterial.setBounds(177, 114, 150, 14);
		getContentPane().add(lbl_cantidadmaterial);
		
		JLabel lbl_preciototal = new JLabel("Precio Total");
		lbl_preciototal.setForeground(new Color(0, 0, 0));
		lbl_preciototal.setBounds(10, 114, 95, 14);
		getContentPane().add(lbl_preciototal);
		
		tf_cantidadmaterial = new JTextField();
		tf_cantidadmaterial.setColumns(10);
		tf_cantidadmaterial.setBounds(177, 139, 86, 20);
		getContentPane().add(tf_cantidadmaterial);
		
		tf_preciototal = new JTextField();
		tf_preciototal.setColumns(10);
		tf_preciototal.setBounds(10, 139, 86, 20);
		getContentPane().add(tf_preciototal);
		
		table = new JTable();
		table.setBounds(47, 231, 257, 92);
		getContentPane().add(table);
		
		JButton btn_nuevomaterial = new JButton("Nuevo Material");
		btn_nuevomaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_admin_Material_nuevoMaterial nuevoMaterial=new JDialog_admin_Material_nuevoMaterial();
				
				nuevoMaterial.setVisible(true);
				nuevoMaterial.setLocation(200, 200);
				nuevoMaterial.setModal(true);
				nuevoMaterial.setUndecorated(true);
				dispose();
				
			}
		});
		btn_nuevomaterial.setBounds(10, 183, 134, 23);
		getContentPane().add(btn_nuevomaterial);
		
		JButton btn_bajamaterial = new JButton("Baja Material");
		btn_bajamaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog_Admin_Material_Baja BajaMaterial=new JDialog_Admin_Material_Baja();
				
				BajaMaterial.setVisible(true);
				BajaMaterial.setLocation(200, 200);
				BajaMaterial.setModal(true);
				BajaMaterial.setUndecorated(true);
				dispose();
				
				
				
			}
		});
		btn_bajamaterial.setBounds(154, 183, 139, 23);
		getContentPane().add(btn_bajamaterial);
		
		JButton btn_actualizarmaterial = new JButton("Actualizar Material");
		btn_actualizarmaterial.setBounds(99, 334, 150, 23);
		getContentPane().add(btn_actualizarmaterial);

	}

}
