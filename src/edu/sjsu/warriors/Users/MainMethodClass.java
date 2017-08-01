package edu.sjsu.warriors.Users;
import java.util.Scanner;
import java.util.ArrayList;
public class MainMethodClass {

    public static void main(String[] args) {
        /* ArrayList<Driver> DriverList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Driver's Name:");
        String dName = input.nextLine();
        System.out.println("Please enter Phone Number:");
        String dPhone = input.nextLine();
        System.out.println("Please enter email:");
        String dEmail = input.nextLine();
        System.out.println("Please enter license#:");
        String licence = input.nextLine();
        System.out.println("Please enter insurance#:");
        String insurance = input.nextLine();
        Driver mainDriver=new Driver(dName,dPhone,dEmail,licence,insurance);
        DriverList.add(mainDriver); */

        //mainDriver.signUpfile("preethi","preethi@gmail.com","root","12345");
        //System.out.println("Registration Successful");


        Passenger mainPassenger=new Passenger();
        mainPassenger.loginfile("preethi","root");
  System.out.println("Login Successful");


    }
}
