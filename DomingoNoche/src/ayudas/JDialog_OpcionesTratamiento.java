package ayudas;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialog_OpcionesTratamiento  extends JDialog {
    private JDesktopPane desktopPane;

    
    
    

    
    public JDialog_OpcionesTratamiento(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;
//Creamos el boton de Crear Tratamiento y llamamos al internalFrame, el cual se añade al desktopPane

        JButton button = new JButton("Modificar Tratamiento");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Botón presionado"); 
                JInternalFrame internalFrame = new Panel_admin_CrearTratamiento();
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);
                internalFrame.setBounds(0,0,954,351);
                ((javax.swing.plaf.basic.BasicInternalFrameUI)internalFrame.getUI()).setNorthPane(null);
                dispose();
            }
        });
   

        JPanel panel = new JPanel();
        //Creamos el boton de modificar tratamiento y llamamos al internalFrame, el cual se añade al desktopPane
        
        JButton button_2 = new JButton("Crear Tratamiento");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Botón presionado"); 
                JInternalFrame internalFrame = new Panel_admin_ModificarTratamiento();
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);
                internalFrame.setBounds(0,0,954,351);
                ((javax.swing.plaf.basic.BasicInternalFrameUI)internalFrame.getUI()).setNorthPane(null);
                dispose();
                
            }
        });
        
        
        
        
        
        
        
        
        
        panel.add(button_2);
        panel.add(button);
        getContentPane().add(panel);

        setSize(200, 200);
        setLocationRelativeTo(parentFrame);
    }
}
