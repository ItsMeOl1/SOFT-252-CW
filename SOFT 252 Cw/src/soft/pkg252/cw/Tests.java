package soft.pkg252.cw;
import org.junit.Test;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.Month;

public class Tests {

    @Test
    public void UserTest() {    //As user is abstract admin is used as it is roughly the same
        Administrator test = new Administrator("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        assertEquals(true, test.checkLogin("Username", "Password".hashCode()));
        assertEquals(false, test.checkLogin("Username", "Password1".hashCode()));
        assertEquals(false, test.checkLogin("Username1", "Password".hashCode()));
        
        assertEquals("Address", test.getAddress());
        assertEquals("First", test.getForename());
        assertEquals("Secccond", test.getSurname());
        assertEquals(true, test.getGender());        
    }
    
    @Test
    public void AdminTest() { 
        Administrator test = new Administrator("Username", "Password".hashCode(), "First", "Seccond", true, "Address", "A1010");
        assertEquals("A1010", test.getID());
    }
    
    @Test
    public void DoctorTest() {   
        Doctor test = new Doctor("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Patient pat = new Patient("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Appointment app = new Appointment(LocalDateTime.now(), test, pat, "Notes");
        test.AddAppointment(app);
        assertEquals(app, test.Appointments.get(0));
        test.Rate(3);
        assertEquals(3, test.getRating());
        assertEquals(1, test.getNoOfRatings());
        test.GiveFeedback("Feedback");
        assertEquals("Feedback", test.getFeedback().get(0));
    }
    
    @Test
    public void PatientTest() {   
        Doctor doc = new Doctor("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Patient test = new Patient("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Appointment app = new Appointment(LocalDateTime.of(2021, Month.MARCH, 0, 0, 0), doc, test, "Notes");
        Perscription per = new Perscription("Medicine", new Date(2020,1,12), new Date(2021,12,12), "Notes");
        test.AddAppointment(app);
        assertEquals(app, test.getAppointments().get(0));
        test.AddPerscriptions(per);
        assertEquals(per, test.getPerscriptions().get(0));
    }
    
    @Test
    public void SecretaryTest(){
        Secretary.AddRequest("Test");
        assertEquals(true, Secretary.getRequests().contains("Test"));
    }
    
    @Test
    public void AppointmentTest(){
        Doctor doc = new Doctor("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Patient pat = new Patient("Username", "Password".hashCode(), "First", "Seccond", true, "Address");
        Appointment test = new Appointment(LocalDateTime.now(), doc, pat, "Notes");
        test.setNotes("New Notes");
        assertEquals("New Notes", test.getNotes());
    }
    
    @Test
    public void PerscripotionTest(){
        Perscription pers = new Perscription("Medication", new Date(2020,1,12), new Date(2020,2,12), "Notes");
        assertEquals(new Date(2020,1,12), pers.getStart());
    }
}