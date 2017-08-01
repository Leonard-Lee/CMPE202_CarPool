package edu.sjsu.warriors.User;


import edu.sjsu.warriors.AAA.AAA;

public abstract class User {
    protected String _userID;
    protected String _userFirstName;
    protected String _userLastName;
    protected String _pwd;
    protected AAA _AAA;

    public abstract void signup();
    public abstract void login();

    public User() {
        _AAA = AAA.getInstance();
    }

    public String getUserID() {
        return _userID;
    }

    public void setUserID(String userID) {
        this._userID = userID;
    }

    public String getUserFirstName() {
        return _userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this._userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return _userLastName;
    }

    public void setUserLastName(String userLastName) {
        this._userLastName = userLastName;
    }

    public String getPwd() {
        return _pwd;
    }

    public void setPwd(String pwd) {
        this._pwd = pwd;
    }
}