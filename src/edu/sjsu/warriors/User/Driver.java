package edu.sjsu.warriors.User;

public class Driver extends User {
    private boolean _isAvaiable;

    Driver(String userID, String email, String phone, String pwd) {
        _userID = userID;
        _email = email;
        _phone = phone;
        _pwd = pwd;
    }

    public boolean isAvaiable() {
        return _isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this._isAvaiable = avaiable;
    }

    public void signup() {
        _AAA.SignUp(this);
        System.out.println("Singup complete for Driver:" + this.getUserID());
    }

    public void login() {
        if (_AAA.SignIn(this._userID, this._pwd)) {
            System.out.println("SingIn Successfully for Driver:" + this.getUserID());
        } else {
            System.out.println("SingIn FAIL for Driver:" + this.getUserID());
        }
    }
}