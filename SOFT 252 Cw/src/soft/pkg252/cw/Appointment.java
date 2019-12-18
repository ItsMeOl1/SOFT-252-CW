package soft.pkg252.cw;
import  java.time.LocalDateTime;

public class Appointment {
    LocalDateTime Time;
    Doctor Doctor;
    Patient Patient;
    String Notes;
    public Appointment(LocalDateTime time, Doctor doc, Patient pat, String notes){
        Time = time;
        Doctor = doc;
        Patient = pat;
        Notes = notes;
    }

    public LocalDateTime getTime() {
        return Time;
    }

    public Doctor getDoc() {
        return Doctor;
    }

    public Patient getPat() {
        return Patient;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        Appointment.Notes = Notes;
    }
    
    
}
