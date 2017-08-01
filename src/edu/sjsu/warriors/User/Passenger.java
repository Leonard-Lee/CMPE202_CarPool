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

    // Book a car
//    public void bookCar(Administrator admin) {
//        this._userId = "";
//        // Administrator admin = Administrator.getInstance();
//        // Order order = new Order(this.userID);
//        // admin.addNewOrder(order);
//    }
//    // Cancel the book from Admin
//    public void cancelOrder(Administrator admin) {
//        // Administrator admin = Administrator.getInstance();
//
//        // for(Order order: admin.orders) {
////            if(order.getUserID == userID)
////                remove; should use iterator;
//        //}
//    }
}