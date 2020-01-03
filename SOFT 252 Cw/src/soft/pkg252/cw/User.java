package soft.pkg252.cw;

public abstract class User { //abstract becuase this should never be needed
    int Password; //int as it is a hash
    String ID, Username, Forename, Surname, Address;
    char Type;
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
    
    public Boolean checkLogin(String username, int password){ //do the inputted login details match this user
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
    
    public char getType(){
        return Type;
    }

    public Boolean getGender() {
        return Gender;
    }
}
