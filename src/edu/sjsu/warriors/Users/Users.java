package edu.sjsu.warriors.Users;
/**
 * Created by preethi on 7/29/17.
 */
public abstract class Users {

    protected String _username;
    protected String _phno;
    protected String _emailid;
    protected String _userID;
        public Users(){}

        public Users(String username,String phNo, String emailID){
            System.out.println("Employee details");
            this._username=username;
            this._phno=phNo;
            this._emailid=emailID;
        }
    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_phno() {
        return _phno;
    }

    public void set_phno(String _phno) {
        this._phno = _phno;
    }

    public String get_emailid() {
        return _emailid;
    }

    public void set_emailid(String _emailid) {
        this._emailid = _emailid;
    }

    public String get_userID() {
        return _userID;
    }

    public void set_userID(String _userID) {
        this._userID = _userID;
    }


    public abstract void signUp();
    public abstract void login();
}
