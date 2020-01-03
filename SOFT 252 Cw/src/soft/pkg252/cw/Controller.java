package soft.pkg252.cw;

import java.awt.*;  
import java.util.ArrayList;
import javax.swing.*;  

public class Controller {  
    ArrayList<User> users = new ArrayList<>(); //List of all users
    User current_user = null; //what user is currently loged in
    JFrame f;
    Controller()  
    {
        makeSomeUsers();    //populate the users list
        
        f = new Screen(this);            
        setScreen(new LoginScreen(this));
        
    }  

    public static void main(String args[])  
    {  
        new Controller();  
    } 
    
    public void goHome(){
        if current_user.
    }
    
    private void makeSomeUsers()
    { //For testing purposes the plaintext passwords are commented to the right
        users.add(new Administrator("ElizaS", -2033385883, "Elizabeth","Stevens", false, "875 Idontknow drive")); //ICouldntThinkOfAnyoneElse
        users.add(new Doctor("GuntherB", 2006038142,"Gunther","Bryce", true, "27 Central Perk ave")); //HiCanIGetYouAnything
        users.add(new Doctor("MikeH", -1289019404,"Mike","Hannigan", true, "123 SomewhereInNY st")); //IHaveASurname?
        users.add(new Doctor("MonicaB",1944951656,"Monica","Bing", false, "90 Bedford St")); //NotAGellerAnymore
        users.add(new Patient("JoeyT", 1879419231,"Joey","Tribbiani", true, "89 Bedford St")); //HowYouDoin
        users.add(new Patient("RachelG", 507089517,"Rachel","Green", false, "90 Bedford St")); //ICouldntThinkOfAnything
        users.add(new Patient("RossG",-1934577601,"Ross","Geller", true, "5 Morton Street")); //PIVOT!
        users.add(new Secretary("PheobeB",155148318,"Pheobe", "Boffay", false, "5 Morton Street")); //PForPheobe               
    }
    
    private void setScreen(JPanel panel)     //change the frame to a predefined login panel
    {
        f.setContentPane(panel);
        f.invalidate();     //Refreshes the JFrame so the changes show up
        f.validate();       //
        f.setVisible(true);
    }

    public void get_login(String user, Integer pass)    //Used when the login button is clicked in the login screen
    {
        System.out.println(user + " " + pass);
        users.forEach(                          //For each user
            (u) -> {                                             
                if (u.checkLogin(user, pass)){  //If the login matches
                    current_user = u;           //login as that user
                } 
            }
        ); 
        System.out.println(current_user.Forename + " " + current_user.Surname);
    }
    
    public void create_Admin(String username, int password, String firstname,   //Create a administrator
            String surname, Boolean gender, String address){
        users.add(new Administrator(username, password, firstname, surname, 
                gender, address));
    }
    
    public void create_Doctor(String username, int password, String firstname,  //Create a doctor
            String surname, Boolean gender, String address){
        users.add(new Doctor(username, password, firstname, surname, 
                gender, address));
    }
    
    public void create_Patient(String username, int password, String firstname, //Create a patient
            String surname, Boolean gender, String address){
        users.add(new Patient(username, password, firstname, surname, 
                gender, address));
    }
    
    public void create_Secretary(String username, int password, String firstname, //Create a scretary
            String surname, Boolean gender, String address){
        users.add(new Secretary(username, password, firstname, surname, 
                gender, address));
    }

}  