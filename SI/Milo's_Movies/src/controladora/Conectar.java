
package controladora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {
    
    private Connection conect;
    private String controlador = "";
    private String nombreBD = "";
    private final String usuarioBD = "";
    private final String passwordBD = "";
    
    public Conectar(){
        
        this.controlador = "sun.jdbc.odbc.JbdcOdbcDriver";
        this.nombreBD = "Netflix.accdb";
    }
    
    public Connection conexion(){
        try{
            conect=DriverManager.getConnection("jdbc:ucanaccess://" + this.nombreBD + this.usuarioBD);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error con la BD..." + ex);
        }
        return conect;
    }
    
}
