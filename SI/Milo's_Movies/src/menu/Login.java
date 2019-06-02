
package menu;

import administrador.Administrador;
import controladora.Conectar;
import controladora.Operaciones;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Login extends JFrame implements ActionListener {
    
    //Paneles del Login
    private JPanel panelUser = new JPanel();
    private JPanel panelAdmin = new JPanel();
    private JPanel panelRegister = new JPanel();
    private JPanel panelRestore = new JPanel();
    private JPanel panelUpdate = new JPanel();
    
    //Componentes del Panel de Usuario
    private JLabel background = new JLabel();
    private JLabel icon = new JLabel();
    private JLabel labelUser = new JLabel();
    private JTextField user = new JTextField();
    private JLabel labelPass = new JLabel();
    private JPasswordField pass = new JPasswordField();
    private JButton buttonAccess = new JButton();
    private JButton buttonAdmin = new JButton();
    private JButton buttonForgot = new JButton();
    private JLabel labelRegister = new JLabel();
    private JButton buttonRegister = new JButton();
    private JButton buttonExit = new JButton();
    
    //Componentes del Panel del Administrador
    private JLabel backgroundAdmin = new JLabel();
    private JLabel iconAdmin = new JLabel();
    private JButton buttonBackAdmin = new JButton();
    private JLabel labelCargoAdmin = new JLabel();
    private JComboBox cargoAdmin = new JComboBox();
    private JLabel labelUserAdmin = new JLabel();
    private JTextField userAdmin = new JTextField();
    private JLabel labelPassAdmin = new JLabel();
    private JPasswordField passAdmin = new JPasswordField();
    private JButton buttonAccessAdmin = new JButton();
    private JButton buttonForgotAdmin = new JButton();
    private JButton buttonExitAdmin = new JButton();
    
    //Componentes del Panel de Registro
    private JLabel backgroundReg = new JLabel();
    private JButton buttonLogReg = new JButton();
    private JLabel labelUserReg = new JLabel();
    private JTextField userReg = new JTextField();
    private JLabel labelCorreoReg = new JLabel();
    private JTextField correoReg = new JTextField();
    private JLabel labelPassReg = new JLabel();
    private JPasswordField passReg = new JPasswordField();
    private JButton buttonSaveUser = new JButton();
    private JButton buttonExitReg = new JButton();
    
    //Componentes del Panel de Restauracion
    private JLabel backgroundRes = new JLabel();
    private JButton buttonLogRes = new JButton();
    private JLabel labelCorreoRes = new JLabel();
    private JTextField correoRes = new JTextField();
    private JButton buttonRestore = new JButton();
    private JLabel labelCodigo = new JLabel();
    private JTextField codigo = new JTextField();
    private JButton buttonVerificar = new JButton();
    private JButton buttonExitRes = new JButton();
    
    //Componentes del Panel de Actualizacion
    private JLabel backgroundAct = new JLabel();
    private JButton buttonLogAct = new JButton();
    private JLabel labelCorreoAct = new JLabel();
    private JTextField correoAct = new JTextField();
    private JLabel labelPassAct = new JLabel();
    private JPasswordField passAct = new JPasswordField();
    private JLabel labelPass2Act = new JLabel();
    private JPasswordField pass2Act = new JPasswordField();
    private JButton buttonUpdate = new JButton();
    private JButton buttonExitAct = new JButton();
    
    //Variables de conexion
    Conectar con=new Conectar();
    Connection conect=con.conexion();
    Statement st=null;
    ResultSet rs=null;
    
    String codigo1 = ""; //Codigo de restauracion
    String tablaUser = ""; //Tabla de usuario
    
    public Login(){
        
        iniciarComponentesUser();
        iniciarComponentesAdmin();
        iniciarComponentesRegister();
        iniciarComponentesRestore();
        iniciarComponentesUpdate();
        
        setTitle("Milo's Movies");
        setSize(500,630);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    //Metodos de inicializacion
    public void iniciarComponentesUser(){
        
        panelUser.setLayout(null);
        this.getContentPane().add(panelUser);
        panelUser.setBackground(new Color(38,38,38));
        
        background.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background1.jpg")));
        background.setBounds(0,0, 500,600);
        panelUser.add(background);
        
        icon.setOpaque(true);
        icon.setBackground(Color.WHITE);
        icon.setHorizontalAlignment(JLabel.CENTER);
        icon.setVerticalAlignment(JLabel.CENTER);
        icon.setBounds(165,30, 170,160);
        icon.setIcon(new ImageIcon(getClass().getResource("/imagenes/Icon.png")));
        background.add(icon);
        
        labelUser.setText("Usuario: ");
        labelUser.setBounds(100,230, 97,27);
        labelUser.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelUser.setForeground(new Color(255, 255, 255));
        background.add(labelUser);
        
        user.setBounds(100,269, 300,31);
        background.add(user);
        
        labelPass.setText("Contraseña: ");
        labelPass.setBounds(100,330, 110,27);
        labelPass.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPass.setForeground(new Color(255, 255, 255));
        background.add(labelPass);
        
        pass.setBounds(100,369, 300,31);
        background.add(pass);
        
        buttonAccess.setText("ACCEDER");
        buttonAccess.setBounds(100,438, 300,49);
        buttonAccess.setBackground(new Color(168,0,0));
        buttonAccess.setForeground(new Color(255,255,255));
        buttonAccess.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonAccess.setBorderPainted(false);
        buttonAccess.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonAccess);
        buttonAccess.addActionListener(this);
        
        buttonAdmin.setText("¿Eres Administrador?");
        buttonAdmin.setBounds(60,508, 175,19);
        buttonAdmin.setForeground(new Color(255,235,57));
        buttonAdmin.setFont(new Font("Segoe UI",Font.BOLD,14));
        buttonAdmin.setOpaque(false);
        buttonAdmin.setContentAreaFilled(false);
        buttonAdmin.setBorderPainted(false);
        buttonAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonAdmin);
        buttonAdmin.addActionListener(this);
        
        buttonForgot.setText("¿Olvidaste tu contraseña?");
        buttonForgot.setBounds(252,508, 205,19);
        buttonForgot.setForeground(new Color(255,235,57));
        buttonForgot.setFont(new Font("Segoe UI",Font.BOLD,14));
        buttonForgot.setOpaque(false);
        buttonForgot.setContentAreaFilled(false);
        buttonForgot.setBorderPainted(false);
        buttonForgot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonForgot);
        buttonForgot.addActionListener(this);
        
        labelRegister.setText("¿Aún no tienes una cuenta?");
        labelRegister.setBounds(108,539, 184,19);
        labelRegister.setFont(new Font("Segoe UI",Font.ITALIC,14));
        labelRegister.setForeground(new Color(255, 255, 255));
        background.add(labelRegister);
        
        buttonRegister.setText("Registrate ahora!");
        buttonRegister.setBounds(271,539, 150,19);
        buttonRegister.setForeground(new Color(72,255,38));
        buttonRegister.setFont(new Font("Segoe UI",Font.BOLD,14));
        buttonRegister.setOpaque(false);
        buttonRegister.setContentAreaFilled(false);
        buttonRegister.setBorderPainted(false);
        buttonRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonRegister);
        buttonRegister.addActionListener(this);
        
        buttonExit.setText("Salir");
        buttonExit.setBounds(390,25, 85,40);
        buttonExit.setBackground(new Color(51,51,51));
        buttonExit.setFont(new Font("Tahoma", 1, 12));
        buttonExit.setForeground(new Color(255, 255, 255));
        buttonExit.setBorderPainted(false);
        buttonExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background.add(buttonExit);
        buttonExit.addActionListener(this);
    }
    public void iniciarComponentesAdmin(){
        
        panelAdmin.setLayout(null);
        panelAdmin.setBackground(new Color(38,38,38));
        panelAdmin.setVisible(false);
        
        backgroundAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background1.jpg")));
        backgroundAdmin.setBounds(0,0, 500,600);
        panelAdmin.add(backgroundAdmin);
        
        iconAdmin.setOpaque(true);
        iconAdmin.setBackground(Color.WHITE);
        iconAdmin.setHorizontalAlignment(JLabel.CENTER);
        iconAdmin.setVerticalAlignment(JLabel.CENTER);
        iconAdmin.setBounds(165,30, 170,160);
        iconAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/Admin.png")));
        backgroundAdmin.add(iconAdmin);
        
        buttonBackAdmin.setBounds(25,25, 50,45);
        buttonBackAdmin.setOpaque(false);
        buttonBackAdmin.setContentAreaFilled(false);
        buttonBackAdmin.setBorderPainted(false);
        buttonBackAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonBackAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/Logout2.png")));
        backgroundAdmin.add(buttonBackAdmin);
        buttonBackAdmin.addActionListener(this);
        
        labelCargoAdmin.setText("Cargo: ");
        labelCargoAdmin.setBounds(360, 150, 80, 19);
        labelCargoAdmin.setFont(new Font("Segoe UI",Font.BOLD,14));
        labelCargoAdmin.setForeground(new Color(255, 255, 255));
        backgroundAdmin.add(labelCargoAdmin);
        
        cargoAdmin.setBounds(360,180, 110, 30);
        cargoAdmin.addItem("Administrador");
        cargoAdmin.addItem("Privilegiado");
        backgroundAdmin.add(cargoAdmin);
        
        labelUserAdmin.setText("Usuario: ");
        labelUserAdmin.setBounds(100,230, 97,27);
        labelUserAdmin.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelUserAdmin.setForeground(new Color(255, 255, 255));
        backgroundAdmin.add(labelUserAdmin);
        
        userAdmin.setBounds(100,269, 300,31);
        backgroundAdmin.add(userAdmin);
        
        labelPassAdmin.setText("Contraseña: ");
        labelPassAdmin.setBounds(100,330, 110,27);
        labelPassAdmin.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPassAdmin.setForeground(new Color(255, 255, 255));
        backgroundAdmin.add(labelPassAdmin);
        
        passAdmin.setBounds(100,369, 300,31);
        backgroundAdmin.add(passAdmin);
        
        buttonAccessAdmin.setText("ACCEDER");
        buttonAccessAdmin.setBounds(100,438, 300,49);
        buttonAccessAdmin.setBackground(new Color(0,92,154));
        buttonAccessAdmin.setForeground(new Color(255,255,255));
        buttonAccessAdmin.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonAccessAdmin.setBorderPainted(false);
        buttonAccessAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAdmin.add(buttonAccessAdmin);
        buttonAccessAdmin.addActionListener(this);
        
        buttonForgotAdmin.setText("¿Olvidaste tu contraseña?");
        buttonForgotAdmin.setBounds(252,508, 205,19);
        buttonForgotAdmin.setForeground(new Color(255,235,57));
        buttonForgotAdmin.setFont(new Font("Segoe UI",Font.BOLD,14));
        buttonForgotAdmin.setOpaque(false);
        buttonForgotAdmin.setContentAreaFilled(false);
        buttonForgotAdmin.setBorderPainted(false);
        buttonForgotAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAdmin.add(buttonForgotAdmin);
        buttonForgotAdmin.addActionListener(this);
        
        buttonExitAdmin.setText("Salir");
        buttonExitAdmin.setBounds(390,25, 85,40);
        buttonExitAdmin.setBackground(new Color(51,51,51));
        buttonExitAdmin.setFont(new Font("Tahoma", 1, 12));
        buttonExitAdmin.setForeground(new Color(255, 255, 255));
        buttonExitAdmin.setBorderPainted(false);
        buttonExitAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAdmin.add(buttonExitAdmin);
        buttonExitAdmin.addActionListener(this);
    }
    public void iniciarComponentesRegister(){
        
        panelRegister.setLayout(null);
        panelRegister.setBackground(new Color(38,38,38));
        panelRegister.setVisible(false);
        
        backgroundReg.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background1.jpg")));
        backgroundReg.setBounds(0,0, 500,600);
        panelRegister.add(backgroundReg);
        
        buttonLogReg.setText("Iniciar Sesión");
        buttonLogReg.setBounds(25,25, 120,40);
        buttonLogReg.setBackground(new Color(0,105,176));
        buttonLogReg.setFont(new Font("Tahoma", Font.BOLD, 12));
        buttonLogReg.setForeground(new Color(255, 255, 255));
        buttonLogReg.setBorderPainted(false);
        buttonLogReg.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundReg.add(buttonLogReg);
        buttonLogReg.addActionListener(this);
        
        labelUserReg.setText("Usuario: ");
        labelUserReg.setBounds(100,130, 97,27);
        labelUserReg.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelUserReg.setForeground(new Color(255, 255, 255));
        backgroundReg.add(labelUserReg);
        
        userReg.setBounds(100,169, 300,31);
        backgroundReg.add(userReg);
        
        labelCorreoReg.setText("Correo: ");
        labelCorreoReg.setBounds(100,230, 97,27);
        labelCorreoReg.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelCorreoReg.setForeground(new Color(255, 255, 255));
        backgroundReg.add(labelCorreoReg);
        
        correoReg.setBounds(100,269, 300,31);
        backgroundReg.add(correoReg);
        
        labelPassReg.setText("Contraseña: ");
        labelPassReg.setBounds(100,330, 110,27);
        labelPassReg.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPassReg.setForeground(new Color(255, 255, 255));
        backgroundReg.add(labelPassReg);
        
        passReg.setBounds(100,369, 300,31);
        backgroundReg.add(passReg);
        
        buttonSaveUser.setText("REGISTRAR");
        buttonSaveUser.setBounds(100,438, 300,49);
        buttonSaveUser.setBackground(new Color(29,176,0));
        buttonSaveUser.setForeground(new Color(255,255,255));
        buttonSaveUser.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonSaveUser.setBorderPainted(false);
        buttonSaveUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundReg.add(buttonSaveUser);
        buttonSaveUser.addActionListener(this);
        
        buttonExitReg.setText("Salir");
        buttonExitReg.setBounds(390,25, 85,40);
        buttonExitReg.setBackground(new Color(51,51,51));
        buttonExitReg.setFont(new Font("Tahoma", 1, 12));
        buttonExitReg.setForeground(new Color(255, 255, 255));
        buttonExitReg.setBorderPainted(false);
        buttonExitReg.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundReg.add(buttonExitReg);
        buttonExitReg.addActionListener(this);
    }
    public void iniciarComponentesRestore(){
        
        panelRestore.setLayout(null);
        panelRestore.setBackground(new Color(38,38,38));
        panelRestore.setVisible(false);
        
        backgroundRes.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background1.jpg")));
        backgroundRes.setBounds(0,0, 500,600);
        panelRestore.add(backgroundRes);
        
        buttonLogRes.setText("Iniciar Sesión");
        buttonLogRes.setBounds(25,25, 120,40);
        buttonLogRes.setBackground(new Color(0,105,176));
        buttonLogRes.setFont(new Font("Tahoma", Font.BOLD, 12));
        buttonLogRes.setForeground(new Color(255, 255, 255));
        buttonLogRes.setBorderPainted(false);
        buttonLogRes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundRes.add(buttonLogRes);
        buttonLogRes.addActionListener(this);
        
        labelCorreoRes.setText("Correo: ");
        labelCorreoRes.setBounds(100,230, 97,27);
        labelCorreoRes.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelCorreoRes.setForeground(new Color(255, 255, 255));
        backgroundRes.add(labelCorreoRes);
        
        correoRes.setBounds(100,269, 300,31);
        backgroundRes.add(correoRes);
        
        buttonRestore.setText("RESTAURAR");
        buttonRestore.setBounds(100,338, 300,49);
        buttonRestore.setBackground(new Color(112,48,160));
        buttonRestore.setForeground(new Color(255,255,255));
        buttonRestore.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonRestore.setBorderPainted(false);
        buttonRestore.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundRes.add(buttonRestore);
        buttonRestore.addActionListener(this);
        
        labelCodigo.setText("Codigo: ");
        labelCodigo.setBounds(100,230, 97,27);
        labelCodigo.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelCodigo.setForeground(new Color(255, 255, 255));
        backgroundRes.add(labelCodigo);
        labelCodigo.setVisible(false);
        
        codigo.setBounds(100,269, 300,31);
        backgroundRes.add(codigo);
        codigo.setVisible(false);
        
        buttonVerificar.setText("VERIFICAR");
        buttonVerificar.setBounds(100,338, 300,49);
        buttonVerificar.setBackground(new Color(112,48,160));
        buttonVerificar.setForeground(new Color(255,255,255));
        buttonVerificar.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonVerificar.setBorderPainted(false);
        buttonVerificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundRes.add(buttonVerificar);
        buttonVerificar.addActionListener(this);
        buttonVerificar.setVisible(false);
        
        buttonExitRes.setText("Salir");
        buttonExitRes.setBounds(390,25, 85,40);
        buttonExitRes.setBackground(new Color(51,51,51));
        buttonExitRes.setFont(new Font("Tahoma", 1, 12));
        buttonExitRes.setForeground(new Color(255, 255, 255));
        buttonExitRes.setBorderPainted(false);
        buttonExitRes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundRes.add(buttonExitRes);
        buttonExitRes.addActionListener(this);
    }
    public void iniciarComponentesUpdate(){
        
        panelUpdate.setLayout(null);
        panelUpdate.setBackground(new Color(38,38,38));
        panelUpdate.setVisible(false);
        
        backgroundAct.setIcon(new ImageIcon(getClass().getResource("/imagenes/Background1.jpg")));
        backgroundAct.setBounds(0,0, 500,600);
        panelUpdate.add(backgroundAct);
        
        buttonLogAct.setText("Iniciar Sesión");
        buttonLogAct.setBounds(25,25, 120,40);
        buttonLogAct.setBackground(new Color(0,105,176));
        buttonLogAct.setFont(new Font("Tahoma", Font.BOLD, 12));
        buttonLogAct.setForeground(new Color(255, 255, 255));
        buttonLogAct.setBorderPainted(false);
        buttonLogAct.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAct.add(buttonLogAct);
        buttonLogAct.addActionListener(this);
        
        labelCorreoAct.setText("Correo: ");
        labelCorreoAct.setBounds(100,130, 97,27);
        labelCorreoAct.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelCorreoAct.setForeground(new Color(255, 255, 255));
        backgroundAct.add(labelCorreoAct);
        
        correoAct.setBounds(100,169, 300,31);
        correoAct.setEditable(false);
        backgroundAct.add(correoAct);
        
        labelPassAct.setText("Nueva contraseña: ");
        labelPassAct.setBounds(100,230, 180,27);
        labelPassAct.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPassAct.setForeground(new Color(255, 255, 255));
        backgroundAct.add(labelPassAct);
        
        passAct.setBounds(100,269, 300,31);
        backgroundAct.add(passAct);
        
        labelPass2Act.setText("Confirmar contraseña: ");
        labelPass2Act.setBounds(100,330, 210,27);
        labelPass2Act.setFont(new Font("Segoe UI",Font.PLAIN,20));
        labelPass2Act.setForeground(new Color(255, 255, 255));
        backgroundAct.add(labelPass2Act);
        
        pass2Act.setBounds(100,369, 300,31);
        backgroundAct.add(pass2Act);
        
        buttonUpdate.setText("CAMBIAR CONTRASEÑA");
        buttonUpdate.setBounds(100,438, 300,49);
        buttonUpdate.setBackground(new Color(29,176,0));
        buttonUpdate.setForeground(new Color(255,255,255));
        buttonUpdate.setFont(new Font("Segoe UI",Font.BOLD,23));
        buttonUpdate.setBorderPainted(false);
        buttonUpdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAct.add(buttonUpdate);
        buttonUpdate.addActionListener(this);
        
        buttonExitAct.setText("Salir");
        buttonExitAct.setBounds(390,25, 85,40);
        buttonExitAct.setBackground(new Color(51,51,51));
        buttonExitAct.setFont(new Font("Tahoma", 1, 12));
        buttonExitAct.setForeground(new Color(255, 255, 255));
        buttonExitAct.setBorderPainted(false);
        buttonExitAct.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backgroundAct.add(buttonExitAct);
        buttonExitAct.addActionListener(this);
    }
    
    //Metodo para agregar usuario a la BD
    public void guardarUsuario(){
        
        String vUser,vCorreo,vPass,campos,valores;
        int n;
        
        vUser=userReg.getText();
        vCorreo=correoReg.getText();
        vPass=String.valueOf(passReg.getPassword());
        
        if(validarVacio(vUser,vCorreo,vPass)==false){
            campos="Id,Correo,contraseña";
            valores="'"+vUser+"','"+vCorreo+"','"+vPass+"'";
        
            Operaciones o=new Operaciones();
            n=o.guardar("Usuarios", campos, valores);
            if(n>0){
                limpiarRegistro();
            }
        }
    }
    
    //Metodos para validar campos de texto vacios
    public boolean validarVacio(String vUser, String vCorreo, String vPass){
        
        boolean vacio = true;
        
        if(vUser.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de ingresar un nombre de usuario");
        }
        else if(vCorreo.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de ingresar un correo electronico");
        }
        else if(vPass.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de ingresar una contraseña");
        }
        else{
            vacio = false;
        }
        
        return vacio;
    }
    public boolean validarVacio2(String vUser, String vPass){
        
        boolean vacio = true;
        
        if(vUser.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de ingresar un nombre de usuario");
        }
        else if(vPass.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de ingresar una contraseña");
        }
        else{
            vacio = false;
        }
        
        return vacio;
    }
    
    //Metodos para validar datos de los usuarios
    public void validarUsuario(){
        
        try{
            String usuario=user.getText();
            String clave=String.valueOf(pass.getPassword());
            
            if(validarVacio2(usuario,clave)==false){
                
                String sql= "SELECT * FROM Usuarios WHERE Id='"+usuario+"' AND contraseña=('"+clave+"')";
            
                st=conect.createStatement();
                rs=st.executeQuery(sql);
            
                if(rs.next()){
                            
                    //Aqui se instancia un objeto de la clase Usuario
                    System.out.println("Usuario");    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Acceso Denegado");
                    user.selectAll();
                    pass.selectAll();
                    user.requestFocus();
                    pass.requestFocus();
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage());
        }
    }
    public void validarAdmin(){
        
        try{
            String vCargo = String.valueOf(cargoAdmin.getSelectedItem());
            String usuario=userAdmin.getText();
            String clave=String.valueOf(passAdmin.getPassword());
            
            if(validarVacio2(usuario,clave)==false){
                
                String sql= "SELECT * FROM Administracion WHERE cargo='"+vCargo+"' AND usuario='"+usuario+"' AND contraseña=('"+clave+"')";
            
                st=conect.createStatement();
                rs=st.executeQuery(sql);
            
                if(rs.next()){
                                           
                    if(vCargo.equalsIgnoreCase("Administrador")){
                        //Aqui se instancia un objeto de la clase Administrador
                        Administrador user = new Administrador();
                        user.setVisible(true);
                        this.dispose();
                    }
                    if(vCargo.equalsIgnoreCase("Privilegiado")){
                        //Aqui se instancia un objeto de la clase Privilegiado
                        System.out.println("Usuario Privilegiado");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Acceso Denegado");
                    userAdmin.selectAll();
                    passAdmin.selectAll();
                    userAdmin.requestFocus();
                    passAdmin.requestFocus();
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage());
        }
    }
    
    //Metodos para restauracion de contraseña
    public void correoVisible(){
        
        labelCodigo.setVisible(false);
        codigo.setVisible(false);
        buttonVerificar.setVisible(false);
        
        labelCorreoRes.setVisible(true);
        correoRes.setVisible(true);
        buttonRestore.setVisible(true);
    }
    public String restaurarPass(){
        
        String vCorreo = correoRes.getText();
        String vPassword = validarExistencia(vCorreo);
            
        Email correo = new Email();
        String codigo = correo.enviarCorreo(vCorreo, vPassword); //Devuelve el codigo de restauracion enviado
        
        return codigo;
    }
    public String validarExistencia(String vCorreo){
        
        String vPassword = null;
        
        try{
            
            if(vCorreo.trim().isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Favor de ingresar un correo");
            }
            else{
                
                String sql= "SELECT contraseña FROM Usuarios WHERE Correo='"+vCorreo+"'";
            
                st=conect.createStatement();
                rs=st.executeQuery(sql);
            
                if(rs.next()){
                            
                    vPassword = rs.getString("contraseña");
                    tablaUser = "Usuarios";
                }
                else{
                    
                    sql= "SELECT contraseña FROM Administracion WHERE correo='"+vCorreo+"'";
                    
                    st=conect.createStatement();
                    rs=st.executeQuery(sql);
                    
                    if(rs.next()){
                        
                        vPassword = rs.getString("contraseña");
                        tablaUser = "Administracion";
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null,"Correo invalido");
                        correoRes.selectAll();
                        correoRes.requestFocus();
                    }
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage());
        }
        
        return vPassword;
    }
    public void verificarCodigo(String vCodigo){
        
        String vCodigoUser = codigo.getText();
        
        if(vCodigoUser.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Favor de ingresar un codigo");
        }
        else if(vCodigo.equals(vCodigoUser)){
            
            panelUser.setVisible(false);
            panelAdmin.setVisible(false);
            panelRestore.setVisible(false);
            
            correoAct.setText(correoRes.getText());
            passAct.setText("");
            pass2Act.setText("");
            
            panelUpdate.setVisible(true);
            this.getContentPane().add(panelUpdate);
        }
        else{
            
            JOptionPane.showMessageDialog(null,"Codigo invalido");
            codigo.selectAll();
            codigo.requestFocus();
        }
    }
    public void actualizarPass(){
        
        String vPass,vPass2,campo,valor,correo;
        int n;
        
        correo = correoAct.getText();
        vPass = String.valueOf(passAct.getPassword());
        vPass2 = String.valueOf(pass2Act.getPassword());
        
        if(vPass.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Favor de ingresar una contraseña");
        }
        else if(vPass2.trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Favor de confirmar contraseña");
        }
        else{
            
            if(vPass.equals(vPass2)){
                
                campo = "contraseña";
                valor = "'"+vPass+"'";
        
                Operaciones o = new Operaciones();
                n = o.actualizar(tablaUser, campo, valor, correo);
                if(n>0){
                    
                    correoAct.setText("");
                    passAct.setText("");
                    pass2Act.setText("");
                    
                    usuarioVisible();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseñas no coinciden");
            }
        }
    }
    public void codigoVisible(){
        
        labelCorreoRes.setVisible(false);
        correoRes.setVisible(false);
        buttonRestore.setVisible(false);
        
        labelCodigo.setVisible(true);
        codigo.setVisible(true);
        buttonVerificar.setVisible(true);
    }
    
    //Metodos de limpieza de datos
    public void limpiarRegistro(){
        userReg.setText("");
        correoReg.setText("");
        passReg.setText("");
    }
    public void limpiarUsuario(){
        user.setText("");
        pass.setText("");
    }
    public void limpiarAdmin(){
        userAdmin.setText("");
        passAdmin.setText("");
    }
    
    //Metodos de cambio de paneles
    public void usuarioVisible(){
        
        panelAdmin.setVisible(false);
        panelRegister.setVisible(false);
        panelRestore.setVisible(false);
        panelUpdate.setVisible(false);
        
        panelUser.setVisible(true);
        this.getContentPane().add(panelUser); 
    }
    public void restaurarVisible(){
        
        correoVisible();
        
        correoRes.setText("");
        
        panelUser.setVisible(false);
        panelAdmin.setVisible(false);
        
        panelRestore.setVisible(true); 
        this.getContentPane().add(panelRestore);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == buttonAccess){
            
            validarUsuario();
        }
        
        if(e.getSource() == buttonForgot){
            
            restaurarVisible();
        }
        
        if(e.getSource() == buttonRestore){
            
            codigo1 = restaurarPass();
            codigoVisible();
        }
        
        if(e.getSource() == buttonVerificar){
            
            verificarCodigo(codigo1);
        }
        
        if(e.getSource() == buttonUpdate){
            
            actualizarPass();
        }
        
        if(e.getSource() == buttonAdmin){
            
            panelUser.setVisible(false);
            panelAdmin.setVisible(true);
            
            this.getContentPane().add(panelAdmin);
            limpiarUsuario();
        }
        
        if(e.getSource() == buttonAccessAdmin){
            
            validarAdmin();
        }
        
        if(e.getSource() == buttonForgotAdmin){
            
            restaurarVisible();
        }
        
        if(e.getSource() == buttonBackAdmin){
            
            usuarioVisible();
            limpiarAdmin();
        }
        
        if(e.getSource() == buttonRegister){
            
            panelUser.setVisible(false);
            panelRegister.setVisible(true);

            this.getContentPane().add(panelRegister);
        }
        
        if(e.getSource() == buttonSaveUser){
            
            guardarUsuario();
        }
        
        if(e.getSource() == buttonLogReg){
            
            usuarioVisible();
            limpiarRegistro();
        }
        
        if(e.getSource() == buttonLogRes){
            
            usuarioVisible();
            correoRes.setText("");
        }
        
        if(e.getSource() == buttonLogAct){
            
            usuarioVisible();
            codigo.setText("");
        }

        if(e.getSource() == buttonExit || e.getSource() == buttonExitAdmin || e.getSource() == buttonExitReg || e.getSource() == buttonExitRes || e.getSource() == buttonExitAct){
            
            System.exit(0);
        }        
    }
}
