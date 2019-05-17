
package menu;

import administrador.Administrador;
import administrador.Administrador1;
import controladora.Conectar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.Border;

public class Login extends JFrame implements ActionListener{
    
    //PRUEBA DE CAMBIOS EN GITHUB
    //Elementos del Login
    private JPanel panel = new JPanel();
    private JLabel background = new JLabel();
    private JLabel icon = new JLabel();
    private JLabel labelSig = new JLabel("Sig In");
    private JLabel labelUser = new JLabel("Username: ");
    private JLabel labelPass = new JLabel("Password: ");
    private JTextField user = new JTextField();
    private JPasswordField pass = new JPasswordField();
    private JButton buttonAccess = new JButton("LOGIN");
    private JButton buttonForgot = new JButton("Forgot Password?");
    private JButton buttonExit = new JButton("Salir");
    
    //Variables de conexion
    Conectar con=new Conectar();
    Connection conect=con.conexion();
    Statement st=null;
    ResultSet rs=null;
    
    public Login(){
        
        iniciarComponentes();
        setTitle("Milo's Movies");
        setSize(500,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    public void iniciarComponentes(){
        
        //Atributos del JPanel
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(new Color(38,38,38));
        
        background.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background.jpg")));
        background.setBounds(0,0, 500,600);
        panel.add(background);
        
        //Atributos de las Imagenes
        icon.setIcon(new ImageIcon(getClass().getResource("/imagenes/Icon.png")));
        icon.setBounds(165,30, 170,160);
        background.add(icon);
        
        //Atributos de los JLabel
        labelSig.setBounds(212,198, 76,31);
        labelSig.setFont(new Font("Segoe UI",Font.BOLD,23));
        labelSig.setForeground(new Color(255, 255, 255));
        background.add(labelSig);
        
        labelUser.setBounds(100,255, 97,27);
        labelUser.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelUser.setForeground(new Color(255, 255, 255));
        background.add(labelUser);
        
        labelPass.setBounds(100,355, 95,27);
        labelPass.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPass.setForeground(new Color(255, 255, 255));
        background.add(labelPass);
        
        //Atributos del JTextField y JPasswordField
        user.setBounds(100,294, 300,31);
       background.add(user);
        
        pass.setBounds(100,394, 300,31);
        background.add(pass);
        
        //Atributos de los JButton
        buttonAccess.setBounds(100,463, 300,49);
        buttonAccess.setBackground(new Color(168,0,0));
        buttonAccess.setForeground(new Color(255,255,255));
        buttonAccess.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonAccess.setBorderPainted(false);
        background.add(buttonAccess);
        buttonAccess.addActionListener(this);

        buttonForgot.setBounds(100,490, 100,50);
        buttonForgot.setBackground(null);
        buttonForgot.setBorderPainted(false);
        buttonForgot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonForgot);
        buttonForgot.addActionListener(this);
        
        buttonExit.setBounds(390,25, 85,40);
        buttonExit.setBackground(new Color(51,51,51));
        buttonExit.setFont(new Font("Tahoma", 1, 12));
        buttonExit.setForeground(new Color(255, 255, 255));
        buttonExit.setBorderPainted(false);
        buttonExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonExit);
        buttonExit.addActionListener(this);
        
    }
    
    public void limpiar(){
        user.setText("");
        pass.setText("");
    }
    
    public int validarCredenciales(){
        
        int resultado=0;
        
        try{
            String usuario=user.getText();
            String clave=String.valueOf(pass.getPassword());
            String sql= "SELECT * FROM Usuarios WHERE Id='"+usuario+"' AND contraseña=('"+clave+"')";
            
            st=conect.createStatement();
            rs=st.executeQuery(sql);
            
            if(rs.next()){
                
                resultado=1;
                
                if(resultado==1){
                    Administrador1 user = new Administrador1();
                    user.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Acceso Denegado");
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage());
        }
        return resultado;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonAccess){
            validarCredenciales();
        }
        if(e.getSource() == buttonExit){
            System.exit(0);
        }
    }
}
