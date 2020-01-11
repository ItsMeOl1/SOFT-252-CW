package soft.pkg252.cw;

public class Administrator extends User {
    static int currentID = 1;   //used when creating new admins
    public Administrator(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr){
        super(uname, passhash, fname, sname, gender, addr);
        ID = "A" + String.format("%04d", currentID); //making the int 4 digits long
        Type = 'a';
        currentID++;
    }
    
    public Administrator(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr, String Id){    //used for loading admins
        super(uname, passhash, fname, sname, gender, addr);
        ID = Id;
        Type = 'a';
    }
}
