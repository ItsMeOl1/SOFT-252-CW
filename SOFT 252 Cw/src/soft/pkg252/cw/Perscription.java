package soft.pkg252.cw;
import  java.time.LocalDateTime;

public class Perscription {
    String Medication, Notes;
    LocalDateTime Start, End;
    public Perscription(String med, LocalDateTime start, LocalDateTime end,
            String notes){
        Medication = med;
        Start = start;
        End = end;
        Notes = notes;
    }

    public String getMedication() {
        return Medication;
    }

    public String getNotes() {
        return Notes;
    }

    public LocalDateTime getStart() {
        return Start;
    }

    public LocalDateTime getEnd() {
        return End;
    }
    
    
}
