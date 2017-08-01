package edu.sjsu.warriors.User;


import edu.sjsu.warriors.AAA.AAA;

public abstract class User {
    //preethi
    protected String _name;
    protected String _phoneNumber;
    protected String _email;
    protected String _id;
    //stephen
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

    //preethi
    public String get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public String get_email() {
        return _email;
    }

    public void set_name(String _firstName) {
        this._name = _firstName;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}