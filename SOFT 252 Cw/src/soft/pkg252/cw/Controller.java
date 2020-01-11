package soft.pkg252.cw;

import java.awt.*;  
import java.util.ArrayList;
import javax.swing.*; 
import  java.time.LocalDateTime;
import java.util.Date;

public class Controller 
{  
    public ArrayList<User> users = new ArrayList<>(); //List of all users
    User current_user = null; //what user is currently logged in
    JFrame f;
    
    Controller()  
    {
        ShutdownHook.run(this);
        
        load(); //load stored data
        
        f = new Screen(this);            
        setScreen(new LoginScreen(this));
        
        
    }     

    public static void main(String args[])
    {  
        new Controller();  
    } 
    
    public void goHome()    //go to the home page for the current logged in user type
    {
        System.out.println("type = " + current_user.Type);
        if (current_user.getType() == 'a'){
            setScreen(new AdminPage(this));
        }
        else if (current_user.getType() == 'd'){
            setScreen(new DoctorPage(this, (Doctor)current_user));
        }
        else if (current_user.getType() == 'p'){
            setScreen(new PatientPage(this));
        }
        else if (current_user.getType() == 's'){
            setScreen(new SecretaryPage(this));
        }
    }
    
    private void makeSomeUsers()    //used for testing only
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
    
    public void setScreen(JPanel panel)     //change the frame to a predefined login panel
    {
        f.setContentPane(panel);
        f.invalidate();     //Refreshes the JFrame so the changes show up
        f.validate();       //
        f.setVisible(true);
    }
    
    public void logOut()    //go back to login screen
    {
        current_user = null;
        setScreen(new LoginScreen(this));
    }
    
    public void getLogin(String user, Integer pass)    //Used when the login button is clicked in the login screen
    {
        System.out.println(user + " " + pass);
        users.forEach(                          //For each user
            (u) -> {                                             
                if (u.checkLogin(user, pass)){  //If the login matches
                    current_user = u;           //login as that user
                } 
            }
        ); 
        if (current_user != null){
            goHome();
        }
    }
    
    public void addMedicine(String name){
        Perscription.addMedicine(name);
    }
    
    public void createAppointment(Doctor doc, Patient pat, LocalDateTime time)
    {
        Appointment app = new Appointment(time, doc, pat);
        doc.Appointments.add(app);
        pat.Appointments.add(app);
        pat.UpdateAppointments();
        doc.UpdateAppointments();
    }
    
    public void orderMed(String med, int quantity){ //add some medicine to the stock
        Perscription.orderMedicine(med, quantity);
    }
    
    public void createPerscription(Patient pat, String med, Date start, Date end, String notes)
    {
        pat.AddPerscriptions(new Perscription(med, start, end, notes));
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
    
    public void load_Admin(String username, int password, String firstname,   //load a administrator
            String surname, Boolean gender, String address, String ID){
        users.add(new Administrator(username, password, firstname, surname, 
                gender, address, ID));
    }
    
    public void load_Doctor(String username, int password, String firstname,  //load a doctor
            String surname, Boolean gender, String address, String ID, int rating,
            int NoOfRatings, ArrayList<String> feedback, 
            ArrayList<Appointment> appointments){
        users.add(new Doctor(username, password, firstname, surname, 
                gender, address, ID, rating, NoOfRatings, feedback, appointments));
    }
    
    public void load_Patient(String username, int password, String firstname, //load a patient
            String surname, Boolean gender, String address, String ID,
            ArrayList<Appointment> apps, ArrayList<Appointment> hist, 
            ArrayList<Perscription> pers){
        users.add(new Patient(username, password, firstname, surname, 
                gender, address, ID, apps, hist, pers));
    }
    
    public void load_Secretary(String username, int password, String firstname, //load a scretary
            String surname, Boolean gender, String address, String ID){
        users.add(new Secretary(username, password, firstname, surname, 
                gender, address, ID));
    }
    
    public void save(){
        JSONController.makeJSON(users, Perscription.getMedications(), Perscription.getMedStock(), Secretary.Requests);
    }
    
    public void load(){
        JSONController.readJSON(this);
    }

    
}  