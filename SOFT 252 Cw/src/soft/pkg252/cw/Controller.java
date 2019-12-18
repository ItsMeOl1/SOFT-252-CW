package soft.pkg252.cw;

import java.awt.*;  
import javax.swing.*;  
public class Controller {  
     Controller()  
        {
            JFrame f = new Screen(this);    
            JPanel panel = new LoginScreen(this);  
            f.setContentPane(panel);
            f.invalidate();
            f.validate();   
            f.setVisible(true);
        }  
     
        public static void main(String args[])  
        {  
            new Controller();  
        } 
        
        public void get_login(String user, Integer pass)
        {
            System.out.println(user + " " + pass);
        }
        
    }  