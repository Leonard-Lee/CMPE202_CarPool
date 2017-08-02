package edu.sjsu.warriors.User;

public class Passenger extends User {


    public void signup() {
        _AAA.SignUp(this);
        System.out.println("Singup complete for PASSENGER:" + this.getUserID());
    }
    public void login() {
        if (_AAA.SignIn(this._userID, this._pwd)) {
            System.out.println("SingIn Successfully for PASSENGER:" + this.getUserID());
        } else {
            System.out.println("SingIn FAIL for PASSENGER:" + this.getUserID());
        }
    }


    public void notifyusers()
    {
        System.out.println("SingIn for Driver:" );
    }

    // Leonard
    // Book a car
    public void bookOrder(Admin admin) {
        admin.createOrder(this);
    }
    // Cancel the book from Admin
    public void cancelOrder(Admin admin) {
       admin.cancelOrder(this._userID);
    }
}