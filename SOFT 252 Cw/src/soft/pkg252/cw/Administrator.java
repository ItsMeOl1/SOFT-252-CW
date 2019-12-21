package soft.pkg252.cw;

public class Administrator extends User {
    public Administrator(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, int idNumber){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "A" + idNumber;
    }
}
