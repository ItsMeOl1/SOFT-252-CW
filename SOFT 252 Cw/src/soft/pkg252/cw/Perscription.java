package soft.pkg252.cw;
import java.util.Date;

public class Perscription {
    String Medication, Notes;
    Date Start, End;
    boolean Given;
    private static String[] medications = {"a","b","c","d","e","f","g","h","i","j"};    //Default gets overwritten on load
    private static int[] medStock = {4,2,67,1,2,7,5,3,5,2};                             //Default gets overwritten on load
    
    public Perscription(String med, Date start, Date end, String notes){
        Medication = med;
        Start = start;
        End = end;
        Notes = notes;
        Given = false;
    }

    public static void orderMedicine(String name, int quantity){    //add medicine to stock
        int i = -1;
        for (String n : medications){
            i++;
            if (n == name){
                medStock[i] += quantity;
                return;
            }
        }
    }
    
    public static void giveMedicine(int Index){ //remove medicine from stock
        medStock[Index] -= 1;
    }
    
    public static void addMedicine(String name){    //create a new medicine
        String[] temp = new String[medications.length+1];
        for (int i = 0; i < medications.length; i++){   //make an array but 1 item larger and copy the old meds across
            temp[i] = medications[i];
        }
        temp[temp.length-1] = name; //add the new med
        medications = temp;
        
        int[] temp2 = new int[medStock.length+1];   //do the same with the stocks
        for (int i = 0; i < medStock.length; i++){
            temp2[i] = medStock[i];
        }
        temp2[temp2.length-1] = 0;
        medStock = temp2;
    }
    
    public String getMedication() {
        return Medication;
    }

    public static int[] getMedStock() {
        return medStock;
    }

    public String getNotes() {
        return Notes;
    }

    public Date getStart() {
        return Start;
    }

    public Date getEnd() {
        return End;
    }

    public static String[] getMedications() {
        return medications;
    }

    public boolean isGiven() {
        return Given;
    }
    
    public static void loadMedicine(String[] meds, int[] stock){
        medications = meds;
        medStock = stock;
    }
    
    
}
