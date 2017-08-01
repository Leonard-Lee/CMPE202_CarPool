package edu.sjsu.warriors.Order;

// Administrator class could have one property:
// ArrayList<Order> orders;
public class Order {
    int userID;
    int driverID;

    public int getUserID() {
        return userID;
    }

    // When a passenger want a carpool, it means he/she has a new order
    public Order(int userID) {
        this.userID = userID;
    }

    // System admin should assign a driver to this order;
    public void assignDriver(int driverID) {
        this.driverID = driverID;
    }
}