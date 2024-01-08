package Inicio;

import javax.swing.*;

import Conexion.ConexionMySQL;
import Modelo.Paciente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class sdf extends JFrame {


    private JTextField nombreTextField;

    public sdf() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Buscar Pacientes");

        // Crear ComboBox
        JComboBox comboBox = new JComboBox<>();
        add(comboBox, BorderLayout.CENTER);

        // Campo de texto para ingresar el nombre del paciente a buscar
        nombreTextField = new JTextField();
        add(nombreTextField, BorderLayout.NORTH);

        // Botón para cargar datos al ComboBox
        JButton cargarButton = new JButton("Buscar Pacientes");
        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarPacientesAlComboBox(nombreTextField.getText(),comboBox);
            }
        });
        add(cargarButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void cargarPacientesAlComboBox(String nombre,JComboBox<String> comboBox) {
        // Limpiar ComboBox antes de cargar nuevos datos
        comboBox.removeAllItems();

        try {
            // Obtener pacientes desde la base de datos
            ConexionMySQL.conectar();

            // Supongamos que tienes un método para obtener pacientes por nombre
            List<Paciente> pacientes = ConexionMySQL.buscarPacientes(nombre);

            // Agregar nombre y apellidos de cada paciente al ComboBox
            for (Paciente paciente : pacientes) {
                String nombreCompleto = paciente.getNombre() + " " + paciente.getApellidos();
                comboBox.addItem(nombreCompleto);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar pacientes", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ConexionMySQL.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new sdf());
    }
}