package edu.sjsu.warriors.User;

public class Driver extends User {
    private boolean _isAvaiable;

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
        if (_AAA.SignIn(this)) {
            System.out.println("SingIn Successfully for Driver:" + this.getUserID());
        } else {
            System.out.println("SingIn FAIL for Driver:" + this.getUserID());
        }
    }
}