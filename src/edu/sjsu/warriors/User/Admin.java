package edu.sjsu.warriors.User;


import java.lang.*;
import java.util.*;

import edu.sjsu.warriors.Order.Order;
import edu.sjsu.warriors.User.*;

public  class Admin  {
    private static Admin ourInstance;
    private List<Order> orders;
    private List<Driver> drivers;
    private int state;

    // Singleton Pattern
    // Double Lock
    public static Admin getInstance() {
        if(ourInstance == null) {
            synchronized (Admin.class) {
                if(ourInstance == null) {
                    ourInstance = new Admin();
                }
            }
        }
        return ourInstance;
    }

    private List<User> observers = new ArrayList<>();

    private Admin() {
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    // Create and cancel orders for passengers
    // Leonard
    public Order createOrder(Passenger passenger) {
        Order order = new Order(passenger.getUserID());
        int minDistance = Integer.MAX_VALUE;
        Driver minDriver = new Driver();

        for(Driver driver: drivers) {
            if(driver.isAvaiable()) {
                int dis = calculateDistance(passenger, driver);
                if(dis < minDistance) {
                    minDistance = dis;
                    minDriver = driver;
                }
            }
        }

        order.assignDriver(minDriver);
        minDriver.setAvaiable(false);
        System.out.println("Assign the closest driver => User ID: "
                + minDriver.getUserID()
                + ", User Name: " + minDriver.get_name());
        orders.add(order);
        System.out.println("User create a new order successfully");
        return order;
    }

    // Iterator Pattern
    public void cancelOrder(String userID) {
        boolean hasMatchOrder = false;
        Iterator<Order> orderIterator = orders.iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if(order.getUserID().equals(userID)) {
                orders.remove(order);
                Driver driver = order.getDriver();
                driver.setAvaiable(true);
                hasMatchOrder = true;
                System.out.println("Release the driver => User ID: "
                        + driver.getUserID()
                        + ", User Name: " + driver.get_name());
                System.out.println("The order is canceled or released successfully");
                break;
            }
        }

        if(!hasMatchOrder) {
            System.out.println("No match order");
        }
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
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