package soft.pkg252.cw;

import java.util.ArrayList;
import  java.time.LocalDateTime;

public class Patient extends User{
    ArrayList<Appointment> History = new ArrayList<>();
    ArrayList<Appointment> Appointments = new ArrayList<>();
    ArrayList<Perscription> Perscriptions = new ArrayList<>();
    public Patient(String uname, int passhash, String fname, String sname, Boolean gender, String addr, int idNumber){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "P" + idNumber;
    }

    public Object[] getHistory() {
        UpdateAppointments();
        return History.toArray();
    }

    public ArrayList<Appointment> getAppointments() {
        UpdateAppointments();
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
    
    public void UpdateAppointments(){   
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
