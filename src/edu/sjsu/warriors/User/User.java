package edu.sjsu.warriors.User;


import edu.sjsu.warriors.AAA.AAA;

public abstract class User {
    protected String _userID;
    protected String _email;
    protected String _phone;
    protected String _pwd;
    protected String _role;
    protected AAA _AAA;

    public abstract void signup();
    public abstract void login();


    User() {
        _AAA = AAA.getInstance();
    }

    public String getUserID() {
        return _userID;
    }

    public void setUserID(String userID) {
        this._userID = userID;
    }

    public String getUserEmail() {
        return _email;
    }

    public void setUserEmail(String userEmail) {
        this._email = userEmail;
    }

    public String getUserPhone() {
        return _phone;
    }

    public void setUserPhone(String userPhone) {
        this._phone = userPhone;
    }

    public String getPwd() {
        return _pwd;
    }

    public void setPwd(String pwd) {
        this._pwd = pwd;
    }

    public String getRole() {
        return _role;
    }

    public void setRole(String role) {
        this._role = role;
    }
}