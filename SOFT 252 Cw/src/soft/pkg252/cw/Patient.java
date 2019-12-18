package soft.pkg252.cw;

import java.util.ArrayList;

public class Patient extends User{
    ArrayList<Appointment> History = new ArrayList<>();
    ArrayList<Appointment> Appointments = new ArrayList<>();
    ArrayList<Perscription> Perscriptions = new ArrayList<>();
    public Patient(String uname, int passhash, String fname, String sname, Boolean gender, String addr, int idNumber){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "P" + idNumber;
    }

    public Object[] getHistory() {
        return History.toArray();
    }

    public ArrayList<Appointment> getAppointments() {
        return Appointments;
    }

    public ArrayList<Perscription> getPerscriptions() {
        return Perscriptions;
    }


    
    
}
