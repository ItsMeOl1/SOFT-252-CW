package soft.pkg252.cw;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Doctor extends User{
    static int currentID = 1; //used when creating new doctor ids
    int Rating = 0, NoOfRatings = 0; //need the number of ratings to find a new average when a new rating is submited
    ArrayList<String> Feedback = new ArrayList<>(); //list is used so more feedback can be added easily
    ArrayList<Appointment> Appointments = new ArrayList<>(); //list is used so more appointemtns can be added easily
    
    public Doctor(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "D" + String.format("%04d", currentID); //making the int 4 digits long
        Type = 'd';
        currentID++;
    }
    
    public Doctor(String uname, int passhash, String fname, String sname,   //used in loading
            Boolean gender, String addr, String Id, int rating, int noofratings, 
            ArrayList<String> feedback, ArrayList<Appointment> apps){
        super(uname, passhash, fname, sname, gender, addr);
        ID = Id; //making the int 4 digits long
        Type = 'd';
        Rating = rating;
        NoOfRatings = noofratings;
        Feedback = feedback;
        Appointments = apps;
    }
    
    public void Rate(int rating){ //works out the new average
        Rating *= NoOfRatings;
        Rating += rating;
        NoOfRatings ++;         //so the next rating will be calculated correctly
        Rating /= NoOfRatings;
    }
    
    public void GiveFeedback(String feedback){ //like a setter but adds to the list instead
        Feedback.add(feedback);
    }
    
    public void AddAppointment(Appointment app){//like a setter but adds to the list instead
        Appointments.add(app);
    }
    
    public void UpdateAppointments(){   //makes sure all appointments are in the correct list
        Appointments.forEach(                                       //For each item in Appointments
            (a) -> {                                                //call it a
                    if (a.getTime().isBefore(LocalDateTime.now())){ //if a is in the past
                        Appointments.remove(a);
                    } 
            }
        );            
    }

    public int getRating() {
        return Rating;
    }

    public int getNoOfRatings() {
        return NoOfRatings;
    }

    public ArrayList<String> getFeedback() {
        return Feedback;
    }

    public ArrayList<Appointment> getAppointments() {
        return Appointments;
    }
    
    
}
