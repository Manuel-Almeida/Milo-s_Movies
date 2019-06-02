
package controladora;

import administrador.Administrador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Operaciones {
    Conectar con=new Conectar();
    
    //Variables de conexion
    Connection conect=null;
    Statement st=null;
    ResultSet rs=null;
    String query;
    
    //Metodo para guardar datos en la BD
    public int guardar(String tabla, String campos, String valores){
        
        int n=0;
        //insert into tabla (campos) values (Valores)
        try{
            query="insert into "+tabla+" ("+campos+") values ("+valores+")";
            conect=con.conexion();
            st=conect.createStatement();
            n=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Registro exitoso!!");
            st.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR al insertar el registro..."+ex);
        }
        return n;
    }
    
    //Metodo para actualizar datos de la BD
    public int actualizar(String tabla, String campo, String valor, String correo){
        
        int n=0;
        //update tabla set (campo) = (valor)
        try{
            query="update "+tabla+" set ("+campo+") = ("+valor+") where correo='"+correo+"'";
            conect=con.conexion();
            st=conect.createStatement();
            n=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Contraseña restablecida!!");
            st.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR al actualizar el campo..."+ex);
        }
        return n;
    }
    
    //Metodo para obtener datos de la BD
    public String[][] seleccionar(String tabla,String consulta,int ncol,String[] regs){
        String[][] vTabla2=null;
        int n=0,j=0,i=0;
        
        try{
            conect = con.conexion();
            st=conect.createStatement();
            rs=st.executeQuery(consulta);
            while(rs.next()){
                n++;
            }
            rs.close();
            rs=st.executeQuery(consulta);
            if(n>0){
                vTabla2=new String[n][ncol];
                while(rs.next()){
                    for(j=0;j<ncol;j++){
                        vTabla2[i][j]=rs.getString(regs[j]);
                    }
                    i++;
                }
            }
            JOptionPane.showMessageDialog(null,"Acceso Permitido");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR sql crear matriz"+ex);
        }
        return vTabla2;
    }
    public String[][] seleccionar2(String consulta){
      
        int resultado=0;
        
        try{
            st=conect.createStatement();
            rs=st.executeQuery(consulta);
            
            if(rs.next()){
                resultado=1;
                
                if(resultado==1){
                    Administrador user=new Administrador();
                    user.setVisible(true);

                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Error de Acceso");
                System.out.println("nelpa");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR "+e.getMessage());
        }
        return null;
    }
    
    //Metodo para eliminar datos de la BD
    public int eliminar(String tabla){
        
        int n=0;
        //delete * from tabla
        try{
            query="DELETE * FROM "+tabla+"";
            conect=con.conexion();
            st=conect.createStatement();
            n=st.executeUpdate(query);
            st.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR al eliminar el registro..."+ex);
        }
        return n;
    }   
}
