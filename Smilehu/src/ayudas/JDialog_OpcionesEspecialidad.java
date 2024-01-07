package ayudas;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialog_OpcionesEspecialidad  extends JDialog {
    private JDesktopPane desktopPane;

  
    //Declaramos en el constructor El frame padre y el JDesktopPane en el caul se añaden los JInternalFrames
    public JDialog_OpcionesEspecialidad(JFrame parentFrame, JDesktopPane desktopPane) {
        super(parentFrame, "Mi JDialog", true);
        this.desktopPane = desktopPane;
//Creamos el boton de crear Especialidad y llamamos al internalFrame, el cual se añade al desktopPane
        JButton button = new JButton("Crear Especialidad");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JInternalFrame internalFrame = new Panel_admin_CrearEspecialidad();
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);
                internalFrame.setBounds(0,0,954,351);
                ((javax.swing.plaf.basic.BasicInternalFrameUI)internalFrame.getUI()).setNorthPane(null);
                dispose();
            }
        });
   

        JPanel panel = new JPanel();
      //Creamos el boton de crear Especialidad y llamamos al internalFrame, el cual se añade al desktopPane
        
        JButton button_2 = new JButton("Modificar Espeialidad");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                JInternalFrame internalFrame = new Panel_admin_ModificarEspecialidad();
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
