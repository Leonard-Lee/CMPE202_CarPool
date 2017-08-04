package edu.sjsu.warriors;

public class Passenger extends User {
    private NormalBookProxy normalBookProxy;

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
    // Proxy Pattern
    // Book a car
    public void bookOrder(Admin admin) {
        normalBookProxy = new NormalBookProxy();
        normalBookProxy.createOrder(this);
    }
    // Cancel the book from Admin
    public void cancelOrder(Admin admin) {
        normalBookProxy = new NormalBookProxy();
        normalBookProxy.cancelOrder(this._userID);
    }
}