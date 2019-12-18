package soft.pkg252.cw;
import java.util.ArrayList;

public class Doctor extends User{
    int Rating = 0, NoOfRatings = 0;
    ArrayList<String> Feedback = new ArrayList<>();
    ArrayList<Appointment> Appointments = new ArrayList<>();
    
    public Doctor(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, int idNumber){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "D" + idNumber;
    }
    
    public void Rate(int rating){
        Rating *= NoOfRatings;
        Rating += rating;
        NoOfRatings ++;
        Rating /= NoOfRatings;
    }
    
    public void GiveFeedback(String feedback){
        Feedback.add(feedback);
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
