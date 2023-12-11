package Vista.Usuario;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonPersonalizado extends JButton {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public BotonPersonalizado(String texto) {
        super(texto);

        // Personaliza la apariencia del botón
        setForeground(Color.BLACK);
        setBackground(new Color(52, 152, 219)); // Puedes cambiar el color de fondo según tus preferencias
        setFocusPainted(false);

        // Añade un ActionListener para manejar eventos de clic
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Maneja el evento de clic aquí
                System.out.println("Botón clicado");
            }
        });
    }

    // Sobrescribe el método paintComponent para redondear los bordes del botón
    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setPaint(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Ajusta el radio según tus preferencias
            g2.dispose();
        }
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Botón Redondeado");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                // Crea un botón redondeado y agrégalo al marco
                BotonPersonalizado boton = new BotonPersonalizado("Mi Botón");
                frame.add(boton);

                frame.setVisible(true);
            }
        });
    }}