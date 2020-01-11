package soft.pkg252.cw;

import java.util.ArrayList;

public class Secretary extends User {
    static int currentID = 1;
    static ArrayList<String> Requests = new ArrayList<>(); //list is used so new requests can be added easily
    public Secretary(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "S" + String.format("%04d", currentID); //format the int to 4 digits
        Type = 's';
        currentID++;
    }
    
    public Secretary(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, String Id){    //used to load existing secretarys
        super(uname, passhash, fname, sname, gender, addr);
        ID = Id; //format the int to 4 digits
        Type = 's';
    }
    
    static void AddRequest(String request){
        Requests.add(request);
    }

    public static ArrayList<String> getRequests() {
        return Requests;
    }
}
