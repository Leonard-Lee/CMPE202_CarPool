package edu.sjsu.warriors.User;


import java.lang.*;
import java.util.*;

import edu.sjsu.warriors.Order.Order;
import edu.sjsu.warriors.User.*;

public  class Admin  {
    private static Admin ourInstance = new Admin();
    private List<Order> orders;
    private List<Driver> drivers;
    private int state;

    public static Admin getInstance() {
        return ourInstance;
    }



    private List<User> observers = new ArrayList<User>();

    private Admin() {
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    // Create and cancel orders for passengers
    // Leonard
    public void createOrder(Passenger passenger) {
        Order order = new Order(passenger.getUserID());
        int minDistance = Integer.MAX_VALUE;
        Driver minDriver = new Driver();

        for(Driver driver: drivers) {
            int dis = calculateDistance(passenger, driver);
            if(dis < minDistance) {
                minDriver = driver;
            }
        }

        order.assignDriver(minDriver.getUserID());
        orders.add(order);
        System.out.println("User create a new order successfully");
    }

    public void cancelOrder(String userID) {
        boolean hasMatchOrder = false;
        Iterator<Order> orderIterator = orders.iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if(order.getUserID().equals(userID)) {
                orders.remove(order);
                hasMatchOrder = true;
                System.out.println("User cancel a new order successfully");
                break;
            }
        }

        if(!hasMatchOrder) {
            System.out.println("No match order");
        }
    }


//    From documentation of Math.hypot:
//    Returns: sqrt(x²+ y²) without intermediate overflow or underflow.
    private int calculateDistance(User pass, User driver) {
        return (int)Math.hypot(pass.getLongitude() - driver.getLongitude(),
                pass.getLatitude() - driver.getLatitude());
    }

    // Rajesh
    public void modifyDriverdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Change the Details of the " + uname);


    }

    public void deletepassengerdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Delete the Details of the " + uname);
    }


    public void modifyPassengerdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Change the Details of the " + uname);


    }

    public void deletedriverdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Delete the Details of the " + uname);
    }



    public int getState() {
        return state;
    }

    public void notifyerrors(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(User observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (User observer : observers) {
            observer.notifyusers();
        }
    }


}