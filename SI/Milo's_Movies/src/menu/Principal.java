
package menu;

public class Principal {
    
    public static void main(String args[]){
        Login login1 = new Login();
        login1.setVisible(true);
        if(login1.validarCredenciales()==1){
            
            login1.setVisible(false);
        }
    }
    
}
