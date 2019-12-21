package soft.pkg252.cw;

import java.util.ArrayList;

public class Secretary extends User {
    static ArrayList<String> Requests = new ArrayList<>();
    public Secretary(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, int idNumber){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "S" + idNumber;
    }
    
    static void AddRequest(String request){
        Requests.add(request);
    }

    public static ArrayList<String> getRequests() {
        return Requests;
    }
}
