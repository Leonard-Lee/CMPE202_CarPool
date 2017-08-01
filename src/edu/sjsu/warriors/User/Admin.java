package edu.sjsu.warriors.User;


import java.lang.*;
import java.util.*;
import edu.sjsu.warriors.User.*;

public  class Admin  {
    private static Admin ourInstance = new Admin();

    private int state;

    public static Admin getInstance() {
        return ourInstance;
    }



    private List<User> observers = new ArrayList<User>();

    private Admin() {
    }

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