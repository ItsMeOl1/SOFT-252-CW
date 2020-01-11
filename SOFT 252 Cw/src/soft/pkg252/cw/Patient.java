package soft.pkg252.cw;

import java.util.ArrayList;
import  java.time.LocalDateTime;

public class Patient extends User{
    static int currentID = 1; //used to create new patient ids
    ArrayList<Appointment> History = new ArrayList<>(); //list is used so more appointments can be added easily
    ArrayList<Appointment> Appointments = new ArrayList<>();//list is used so appointments can be added or removed easily
    ArrayList<Perscription> Perscriptions = new ArrayList<>();//list is used so more perscriptions can be added easily
    public Patient(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "P" + String.format("%04d", currentID); //making the int 4 digits long
        Type = 'p';
        currentID++;
    }
    
    public Patient(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, String Id, ArrayList<Appointment> apps,
            ArrayList<Appointment> hist, ArrayList<Perscription> pers){//used to load existing patients
        super(uname, passhash, fname, sname, gender, addr);
        ID = Id; //making the int 4 digits long
        Type = 'p';
        History = hist;
        Appointments = apps;
        Perscriptions = pers;
    }

    public Object[] getHistory() {
        UpdateAppointments(); //so the info is correct before returning it
        return History.toArray();
    }

    public ArrayList<Appointment> getAppointments() {
        UpdateAppointments(); //so the info is correct before returning it
        return Appointments;
    }

    public ArrayList<Perscription> getPerscriptions() {
        return Perscriptions;
    }
    
    public void AddPerscriptions(Perscription per){
        Perscriptions.add(per);
    }
    
    public void AddAppointment(Appointment app){
        Appointments.add(app);
    }
    
    public void UpdateAppointments(){   //makes sure all appointments are in the correct list
        Appointments.forEach(                                       //For each item in Appointments
            (a) -> {                                                //call it a
                    if (a.getTime().isBefore(LocalDateTime.now())){ //if a is in the past
                        History.add(a);
                        Appointments.remove(a);
                    } 
            }
        );            
    }


    
    
}
