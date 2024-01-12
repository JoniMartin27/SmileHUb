package Vista.gestionMedica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Conexion.ConexionMySQL;
import Vista.Usuario.Panel_PacienteCreado;

import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Panel_admin_gestionMedica_Inicio extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTable table,table_1;
    private JDesktopPane miDesktopPane;
    private DefaultTableModel modelTratamiento, modelEspecialidad;
    private JScrollPane scrollPane,specialityScrollPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Panel_admin_gestionMedica_Inicio frame = new Panel_admin_gestionMedica_Inicio();
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

    public Panel_admin_gestionMedica_Inicio() {
        setBorder(null);
        setBounds(219, 44, 799, 562);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(159, 232, 223));
        panel.setBounds(0, 0, 799, 532);
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btn_BorrarEspecialidad = new JButton("Borrar");
        btn_BorrarEspecialidad.setBounds(106, 391, 125, 23);
        panel.add(btn_BorrarEspecialidad);

        table = new JTable();
        table.setBounds(30, 58, 300, 178);
        table.setAutoCreateRowSorter(true); // Esto permite ordenar las filas haciendo clic en los encabezados
        table.getTableHeader().setReorderingAllowed(false); // Esto evita que las columnas se reorganicen mediante arrastrar y soltar
        panel.add(table);

        table_1 = new JTable();
        table_1.setBounds(468, 58, 300, 183);
        table_1.setAutoCreateRowSorter(true); // Esto permite ordenar las filas haciendo clic en los encabezados
        table_1.getTableHeader().setReorderingAllowed(false); // Esto evita que las columnas se reorganicen mediante arrastrar y soltar
     
        panel.add(table_1);

      
        

        
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(25,33,300,200);
        JScrollPane specialityScrollPane = new JScrollPane(table_1);
        specialityScrollPane.setBounds(467,33,300,200);
        panel.add(specialityScrollPane);
        panel.add(scrollPane);

        String[] columnasTratamiento = {"tratamiento", "precio", "especialidad" };

        modelTratamiento = new DefaultTableModel();
        modelTratamiento.setColumnIdentifiers(columnasTratamiento);

        String[] columnasEspecialidad = { "nombre especialidad","Doctor" };

        modelEspecialidad = new DefaultTableModel();
        modelEspecialidad.setColumnIdentifiers(columnasEspecialidad);

        try {
            ConexionMySQL.conectar();
            
           
            
            contruirTablaTratamiento(ConexionMySQL.ejecutarSelect("SELECT tratamiento.Nombre,tratamiento.precio, especialidad.nombre_especialidad\r\n"
            		+ "FROM tratamiento\r\n"
            		+ "JOIN especialidad ON tratamiento.id_especialidad  = especialidad.id_especialidad;"));
            
            contruirTablaEspecialidad(ConexionMySQL.ejecutarSelect("SELECT nombre_especialidad , doctor_administrador.nombre  FROM especialidad\r\n"
            		+ "JOIN doctor_administrador ON doctor_administrador.id_especialidad  = especialidad.id_especialidad;"));
        } catch (SQLException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        
        
        JButton btn_ModificarEspecialidad = new JButton("Modificar");
        btn_ModificarEspecialidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel_admin_gestionMedica_ModEspecialidad ModEspecialidad = new Panel_admin_gestionMedica_ModEspecialidad();
                ModEspecialidad.setBorder(null);
                ModEspecialidad.setDesktopPane(miDesktopPane);
                miDesktopPane.removeAll();
                miDesktopPane.add(ModEspecialidad);
                ((BasicInternalFrameUI) ModEspecialidad.getUI()).setNorthPane(null);
                ModEspecialidad.setLocation(0, 0);
                ModEspecialidad.show();
                ModEspecialidad.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
            }
        });
        btn_ModificarEspecialidad.setBounds(106, 326, 125, 23);
        panel.add(btn_ModificarEspecialidad);

        JButton btn_Borrar = new JButton("Borrar");
        btn_Borrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btn_Borrar.setBounds(565, 391, 125, 23);
        panel.add(btn_Borrar);

        JButton btn_CrearEspecialidad = new JButton("Crear");
        btn_CrearEspecialidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel_admin_gestionMedica_CrearEspecialidad CrearEspecialidad = new Panel_admin_gestionMedica_CrearEspecialidad();
                CrearEspecialidad.setBorder(null);
                CrearEspecialidad.setDesktopPane(miDesktopPane);
                miDesktopPane.removeAll();
                miDesktopPane.add(CrearEspecialidad);
                ((BasicInternalFrameUI) CrearEspecialidad.getUI()).setNorthPane(null);
                CrearEspecialidad.setLocation(0, 0);
                CrearEspecialidad.show();
                CrearEspecialidad.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
            }
        });
        btn_CrearEspecialidad.setBounds(106, 258, 125, 23);
        panel.add(btn_CrearEspecialidad);

        JButton btn_Crear = new JButton("Crear");
        btn_Crear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel_admin_gestionMedica_CrearTratamiento CrearTratamiento = new Panel_admin_gestionMedica_CrearTratamiento();
                CrearTratamiento.setBorder(null);
                CrearTratamiento.setDesktopPane(miDesktopPane);
                miDesktopPane.removeAll();
                miDesktopPane.add(CrearTratamiento);
                ((BasicInternalFrameUI) CrearTratamiento.getUI()).setNorthPane(null);
                CrearTratamiento.setLocation(0, 0);
                CrearTratamiento.show();
                CrearTratamiento.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());

            }
        });

        btn_Crear.setBounds(565, 258, 125, 23);
        panel.add(btn_Crear);

        JButton btn_Modificar = new JButton("Modificar");
        btn_Modificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel_admin_gestionMedica_ModTratamiento ModTratamiento = new Panel_admin_gestionMedica_ModTratamiento();
                ModTratamiento.setBorder(null);
                ModTratamiento.setDesktopPane(miDesktopPane);
                miDesktopPane.removeAll();
                miDesktopPane.add(ModTratamiento);
                ((BasicInternalFrameUI) ModTratamiento.getUI()).setNorthPane(null);
                ModTratamiento.setLocation(0, 0);
                ModTratamiento.show();
                ModTratamiento.setSize(miDesktopPane.getWidth(), miDesktopPane.getWidth());
            }
        });
        btn_Modificar.setBounds(565, 326, 125, 23);
        panel.add(btn_Modificar);
        // Configurar la tabla para ajustar automáticamente el tamaño de las celdas
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.getColumnModel().getColumn(0).setPreferredWidth(100); // Ajustar el ancho de la primera columna
        table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_1.getColumnModel().getColumn(0).setPreferredWidth(150); // Ajustar el ancho de la primera columna

        // Centrar el texto en todas las celdas de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table_1.setDefaultRenderer(Object.class, centerRenderer);
        

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Panel_admin_gestionMedica_Inicio.class.getResource("/img/fondoDientes.jpg")));
        lblNewLabel.setBounds(0, 0, 803, 532);
        panel.add(lblNewLabel);
    }
    
    
    private void contruirTablaEspecialidad(ResultSet rs) {
        try {
            while (rs.next()) {
                Object[] fila = new Object[2]; // Hay 2 columna que mostrar
            
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);

                modelEspecialidad.addRow(fila);
            }

            table.setModel(modelEspecialidad);


          

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
    
    private void contruirTablaTratamiento(ResultSet rs) {
        try {
            while (rs.next()) {
                Object[] fila = new Object[4]; // Hay 3 que mostrar
               
                fila[0] = rs.getString(1);
                fila[1] = rs.getDouble(2); 
                fila[2] = rs.getString(3); 

                modelTratamiento.addRow(fila);
            }

            table_1.setModel(modelTratamiento);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}