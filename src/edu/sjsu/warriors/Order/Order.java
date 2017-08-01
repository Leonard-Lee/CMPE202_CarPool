package edu.sjsu.warriors.Order;

// Administrator class could have one property:
// ArrayList<Order> orders;
public class Order {
    String userID;
    String driverID;

    public String getUserID() {
        return userID;
    }

    // When a passenger want a carpool, it means he/she has a new order
    public Order(String userID) {
        this.userID = userID;
    }

    // System admin should assign a driver to this order;
    public void assignDriver(String driverID) {
        this.driverID = driverID;
    }
}