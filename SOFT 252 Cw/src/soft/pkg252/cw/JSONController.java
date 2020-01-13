package soft.pkg252.cw;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;

public class JSONController {
    public static void makeJSON(ArrayList<User> users, String[] perscriptions, int[] medStock, ArrayList<String> requests) {
        
        try {
            GsonBuilder builder = new GsonBuilder(); 
            Gson gson = builder.create(); 
            FileWriter writer = new FileWriter("users.json");      //write the users json
            writer.write(gson.toJson(users));   
            writer.close();
            
            writer = new FileWriter("perscriptions.json");  //write the perscriptions json
            String[] medicationInfo = new String[perscriptions.length * 2];
            for (int i = 0; i < perscriptions.length*2; i += 2){    //new list is formatted [medicine, stock, ...]
                medicationInfo[i] = perscriptions[i/2];
                
                medicationInfo[i+1] = String.valueOf(medStock[i/2]);
            }
            writer.write(gson.toJson(medicationInfo));
            writer.close();
            
            writer = new FileWriter("requests.json");   //write requests json  
            writer.write(gson.toJson(requests));
             
            writer.close();

        } 
        catch(FileNotFoundException e) { 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace();
        } 
        
    }
    
    public static void readJSON(Controller control) 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try 
        {
            FileReader reader = new FileReader("users.json");   //read user json
            
            Object obj = jsonParser.parse(reader);
            reader.close();
 
            JSONArray data = (JSONArray) obj;            
            for (Object o : data){  //for each user
                
                JSONObject j = (JSONObject) o;
                if (j.get("Type").equals("a")){ //if they're an admin
                    
                    control.load_Admin(j.get("Username").toString(), Math.toIntExact((long) j.get("Password")), 
                        j.get("Forename").toString(), j.get("Surname").toString(), 
                        (Boolean)j.get("Gender"), j.get("Address").toString(), j.get("ID").toString());
                }
                else if (j.get("Type").equals("d")){//if they're an doctor
                    control.load_Doctor(j.get("Username").toString(), Math.toIntExact((long) j.get("Password")), 
                        j.get("Forename").toString(), j.get("Surname").toString(), 
                        (Boolean)j.get("Gender"), j.get("Address").toString(), j.get("ID").toString(),
                        Math.toIntExact((long) j.get("Rating")),Math.toIntExact((long) j.get("NoOfRatings")),(ArrayList) j.get("Feedback"),(ArrayList) j.get("Appointments"));
                }
                else if (j.get("Type").equals("p")){//if they're an patient
                    control.load_Patient(j.get("Username").toString(), Math.toIntExact((long) j.get("Password")), 
                        j.get("Forename").toString(), j.get("Surname").toString(), 
                        (Boolean)j.get("Gender"), j.get("Address").toString(), j.get("ID").toString(),
                        (ArrayList) j.get("Appointments"),(ArrayList) j.get("History"),(ArrayList) j.get("Perscriptions"));
                }
                if (j.get("Type").equals("s")){//if they're an secretary
                    control.load_Secretary(j.get("Username").toString(), Math.toIntExact((long) j.get("Password")), 
                        j.get("Forename").toString(), j.get("Surname").toString(), 
                        (Boolean)j.get("Gender"), j.get("Address").toString(), j.get("ID").toString());
                }
                
            }
            
            reader = new FileReader("perscriptions.json");  //read perscriptions json
            
            obj = jsonParser.parse(reader);
            reader.close();
 
            data = (JSONArray) obj;
            String[] perscriptions = new String[data.size()/2];
            int[] medStock = new int[data.size()/2];
            int i = 0;
            Boolean name = true;
            for (Object o : data){  //re format the medicine and stock back into seperate lists
                if(name){
                    perscriptions[i] = o.toString();
                    name = false;
                }
                else{
                    medStock[i] = Integer.parseInt((String) o);
                    i++;
                    name = true;
                }
            }
            for (String s : perscriptions){
                System.out.println(s);
            }
            
            Perscription.loadMedicine(perscriptions, medStock); //save the results into their variables
            
            
            reader = new FileReader("requests.json");   //read the request json
            obj = jsonParser.parse(reader);
            reader.close();
            data = (JSONArray) obj;
            Secretary.Requests.clear(); //get rid of default requests
            for (Object o : data){
                Secretary.AddRequest(o.toString()); //add loaded requests
            }   
        }
        catch(IOException e){
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
}

