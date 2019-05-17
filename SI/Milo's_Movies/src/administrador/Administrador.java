
package administrador;
import javax.swing.*;

public class Administrador extends JFrame{
    
    private JLabel label1;
    
    public Administrador(){
        
        setLayout(null);
        setTitle("Panel de Control");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
        //Atributos del JLabel
        label1 = new JLabel("Hola!!!");
        label1.setBounds(10,20,200,300);
        add(label1);
    }
    
    
}
