package edu.sjsu.warriors;

import edu.sjsu.warriors.AAA.AAA;
import edu.sjsu.warriors.User.Driver;
import edu.sjsu.warriors.Report.DriverReport;
import edu.sjsu.warriors.Report.Report;
import edu.sjsu.warriors.Report.VehicleReport;
import edu.sjsu.warriors.User.Creator;
import edu.sjsu.warriors.User.DriverFactory;
import edu.sjsu.warriors.User.PassengerFactory;
import edu.sjsu.warriors.Vehicle.*;
import edu.sjsu.warriors.User.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarPoolSystem {
//    public static void main(String[] args) {
//        System.out.println("Hi Car Pool System");
//    }

    public static void main(String[] args) {
        ArrayList<Driver> DriverList = new ArrayList<>();
        ArrayList<Vehicle> vehiclesList = new ArrayList<>();
        AAA authModule = AAA.getInstance();
        Scanner input = new Scanner(System.in);

//        while (true) {
//            System.out.println("Welcome to the CMPE202");
//            System.out.println("Enter 1-Signup, 2- Login");
//            int enter_type = Integer.parseInt(input.nextLine());
//            if (enter_type == 1) {
//                System.out.println("Please enter your username:");
//                String username = input.nextLine();
//                System.out.println("Please enter your email_id");
//                String emailID = input.nextLine();
//                System.out.println("Please enter your phone number");
//                String phNum = input.nextLine();
//                System.out.println("Please enter your password");
//                String password = input.nextLine();
//
//                System.out.println("Please Select Your Role: 1-Driver, 2-Passenger");
//                int role_type = Integer.parseInt(input.nextLine());
//                if (role_type == 1) {
//                    // driver
//                    Creator driverCreator = new DriverFactory();
//                    if (authModule.SignUp(driverCreator.createUser(username, emailID, phNum, password))) {
//                        System.out.println("Successful Registration\n\n");
//                        System.out.println("Welcome to Carpooling app, Please Login");
//                        System.out.println("Please enter your username");
//                        String loginUsername = input.nextLine();
//                        System.out.println("Please enter your password");
//                        String loginPw = input.nextLine();
//
//                        if (authModule.SignIn(loginUsername, loginPw)) {
//                            System.out.println("Successfully Logged in");
//                            break;
//                        } else {
//                            System.out.println("Logged in Fail");
//                        }
//                    } else {
//                        System.out.println("Register Fail!");
//                    }
//                } else if (role_type == 2) {
//                    //passenger
//                    Creator passengerCreator = new PassengerFactory();
//                    if (authModule.SignUp(passengerCreator.createUser(username, emailID, phNum, password))) {
//                        System.out.println("Successful Registration\n\n");
//                        System.out.println("Welcome to Carpooling app, Please Login");
//                        System.out.println("Please enter your username");
//                        String loginUsername = input.nextLine();
//                        System.out.println("Please enter your password");
//                        String loginPw = input.nextLine();
//
//                        if (authModule.SignIn(loginUsername, loginPw)) {
//                            System.out.println("Successfully Logged in");
//                            break;
//                        } else {
//                            System.out.println("Logged in Fail");
//                        }
//                    } else {
//                        System.out.println("Register Fail!");
//                    }
//                }
//            }
//            else {
//                System.out.println("Please enter your username:");
//                String username = input.nextLine();
//                System.out.println("Please enter your password:");
//                String password = input.nextLine();
//                if (authModule.SignIn(username, password)) {
//                    System.out.println("Successfully Logged in");
//                    break;
//                } else {
//                    System.out.println("Logged in Fail. Try Again!!");
//                }
//            }
//
//        }
//        System.out.println("Enter your Role: 1-Driver, 2-Passenger 3-admin");
//        int role_type = Integer.parseInt(input.nextLine());
//        if(role_type==1) {
//            System.out.println("Please enter Driver's Name:");
//            String dName = input.nextLine();
//            System.out.println("Please enter Phone Number:");
//            String dPhone = input.nextLine();
//            System.out.println("Please enter email:");
//            String dEmail = input.nextLine();
//            System.out.println("Please enter license#:");
//            String license = input.nextLine();
//            System.out.println("Please enter insurance#:");
//            String insurance = input.nextLine();
//            Driver driver = new Driver(dName, dPhone, dEmail, license, insurance);
//            DriverList.add(driver);
//            System.out.println("-------------------------------------------------------------");
//            printOverallReport(DriverList, vehiclesList);
//
//            // create vehicle
//            System.out.println("\n\n\n Enter 1 - personal owned, 2 - company owned");
//            int owner_type = Integer.parseInt(input.nextLine());
//            System.out.println("Vehicle Type: 1 - Compact, 2- Van");
//            int vehicle_type = Integer.parseInt(input.nextLine());
//            System.out.println("Enter Van number");
//            String vin = input.nextLine();
//            System.out.println("What is the Vehicle Make?");
//            String make = input.nextLine();
//            System.out.println("What is the Vehicle Model?");
//            String model = input.nextLine();
//            System.out.println("What year the Vehicle is made?");
//            int year = Integer.parseInt(input.nextLine());
//            VehicleOwnership ownership;
//            if (owner_type == 1) { //company owned
//                if (DriverList.size() == 0) {
//                    System.out.println("No driver to assign vehicle. Back to main menu");
//
//                }
//                String[] dList = new String[DriverList.size()];
//                for (int i = 0; i < DriverList.size(); i++) {
//                    dList[i] = DriverList.get(i).get_name();
//                }
//                int dIndex = getOption("Which Driver will make this request?", dList);
//                ownership = new PersonalOwnedVehicle(DriverList.get(dIndex).get_name());
//            } else {
//                ownership = new CompanyOwnedVehicle("CMPE202");
//            }
//            Random rand = new Random();
//            Vehicle v;
//            if (vehicle_type == 1) { //Compact car
//                v = new CompactVehicle(vin, make, model, year, ownership);
//            } else { //Van car
//                v = new VanVehicle(vin, make, model, year, ownership);
//            }
//            //v.setLocation((new Point(rand.nextInt(100), rand.nextInt(100))));
//            vehiclesList.add(v);
//            //Printing Vehicle Report
//            System.out.println("-------------------------------------------------------------");
//            printOverallReport(DriverList, vehiclesList);
//        }
//        else if(role_type == 3)
//        {
//            Admin admin = Admin.getInstance();
//            admin.notifyAllObservers();
//        }
//
//        else
//        {
//             /* #######################Sandesh#############################*/
/*            while (true) {
        System.out.println("Please choose options: 1-Book a Ride,2-Add a Payment method, 3-Cancel Booking, 4- Provide Feedback");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {//Book a ride
            }
            case 2://Feedback
            {
                System.out.println("Payment type: 1 - Cash, 2 - Card");
                int type = Integer.parseInt(input.nextLine());
                if (type == 1) {
                    System.out.println("Payer Name:");
                    String pn = input.nextLine();
                    System.out.println("Payer Amount");
                    double pa = Double.parseDouble(input.nextLine());
                    CashPayment cash = new CashPayment(pn, pa);
                    cash.setupPayment();
                    cash.processPayment();
                    cash.printReceipt();
                    continue;
                    //  feedbackArrayList.add(fb);
                } else if (type == 2) {
                    System.out.println("Payer Name:");
                    String pn = input.nextLine();
                    System.out.println("Payer Amount");
                    double pa = Double.parseDouble(input.nextLine());
                    System.out.println("CC Number:");
                    String ccno = input.nextLine();
                    System.out.println("CC Secure code:");
                    String ccsc = input.nextLine();
                    CreditCardPayment cc = new CreditCardPayment(pn, pa, ccno, ccsc);
                    cc.setupPayment();
                    cc.processPayment();
                    cc.printReceipt();
                    continue;
                    //  feedbackArrayList.add(fb);
                }
            }
            case 3://Cancel booking
            {

            }
            case 4://Feedback
            {
                System.out.println("Feedback type: 1 - For Driver, 2 - For Pricing, 3 - For overall service");
                int type = Integer.parseInt(input.nextLine());
                System.out.println("Feedback Content:");
                String content = input.nextLine();
                System.out.println("Feedback Rating:");
                int rating = Integer.parseInt(input.nextLine());
                if (type == 1) {
                    DriverFeedback fb = new DriverFeedback(content, rating);
                    fb.provideFeedback();
                    // feedbackArrayList.add(fb);
                    continue;
                } else if (type == 2) {
                    PricingFeedback fb = new PricingFeedback(content, rating);
                    fb.provideFeedback();
                    // feedbackArrayList.add(fb);
                    continue;
                } else if (type == 3) {
                    ServiceFeedback fb = new ServiceFeedback(content, rating);
                    fb.provideFeedback();
                    // feedbackArrayList.add(fb);
                    continue;
                } else {
                    System.out.println("Invalid Input");
                    break;
                }
            }

        }
    } */    /* ################Sandesh####################*/
//        }

       /* Driver mainDriver=new Driver();
        mainDriver.signUpfile("preethi","preethi@gmail.com","root","12345");
        System.out.println("Registration Successful");
        Passenger mainPassenger=new Passenger();
        mainPassenger.loginfile("preethi","root");
        System.out.println("Login Successful"); */

//      Leonard
//      Test for creating an oder and cancel the order
        Creator driverCreator = new DriverFactory();
        User driver1 = driverCreator.createUser("driver1", "driver1@gmail.com", "408-333-456", "123");
        driver1.set_name("John");
        driver1.setLongitude(33.33);
        driver1.setLongitude(35.34);

        User driver2 = driverCreator.createUser("driver2", "driver2@gmail.com", "408-333-222", "1234");
        driver2.set_name("Jack");
        driver2.setLongitude(42.32);
        driver2.setLongitude(66.32);

        User driver3 = driverCreator.createUser("driver3", "driver3@gmail.com", "408-333-444", "1235");
        driver3.set_name("Jason");
        driver3.setLongitude(87.22);
        driver3.setLongitude(103.32);

        Admin admin = Admin.getInstance();

        Creator passengerCreater = new PassengerFactory();
        User passenger = passengerCreater.createUser("passenger1", "passenger1@gmail.com", "333-333-456", "1234");

        passenger.setLongitude(42.22);
        passenger.setLongitude(66.32);

        // Proxy Pattern
        // book a car
        NormalBookProxy normalBookProxy = new NormalBookProxy();
        normalBookProxy.createOrder((Passenger)passenger);

        // Cancel or Release Order
        normalBookProxy.cancelOrder(passenger.getUserID());

        // Book some specific driver by his name
        String specificDriverName = "Jack";
        SpecificBookProxy specificBookProxy = new SpecificBookProxy(specificDriverName);
        specificBookProxy.createOrder((Passenger)passenger);
        specificBookProxy.cancelOrder(passenger.getUserID());

        // Show no match driver
        specificDriverName = "Jacky";
        specificBookProxy = new SpecificBookProxy(specificDriverName);
        specificBookProxy.createOrder((Passenger)passenger);
        specificBookProxy.cancelOrder(passenger.getUserID());
    }
    private static void printOverallReport(ArrayList<Driver> DriversList,ArrayList<Vehicle> VehicleList) {
        Report report;
        if (DriversList.size() > 0) {
            System.out.println("***************************************************************\n");
            for (Driver driver : DriversList) {
                report = new DriverReport(driver);
                report.printReport();
            }
            System.out.println("***************************************************************\n");
            System.out.println();
        }
        if (VehicleList.size() > 0) {
            System.out.println("***************************************************************\n");
            for (Vehicle vehicle : VehicleList) {
                report = new VehicleReport(vehicle);
                report.printReport();
            }
            System.out.println("***************************************************************\n");
            System.out.println();
        }
    }
    private static void inValidateRequest() {
        System.out.println("Not a valid choice, please choose again");
        System.out.println("---------------------------------------------------");

    }

    private static int getOption(String text, String[] options) {
        System.out.println("\n" + text);
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ") " + options[i]);
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.next());
        return choice;
    }
}
