package soft.pkg252.cw;

public abstract class User {
    int Password; 
    String ID, Username, Forename, Surname, Address;
    Boolean Gender;
    public User(String uname, int passhash, String fname, String sname,
            Boolean gender, String addr){
        Username = uname;
        Password = passhash;
        Forename = fname;
        Surname = sname;
        Gender = gender;
        Address = addr;
    }
    
    public Boolean checkLogin(String username, int password){
        if (Username.equals(username) && Password == password){
            return true;
        }
        return false;
    }
    
    public String getID(){
        return ID;
    }
    
    public String getForename(){
        return Forename;
    }

    public String getSurname() {
        return Surname;
    }

    public String getAddress() {
        return Address;
    }

    public Boolean getGender() {
        return Gender;
    }
}
