package edu.sjsu.warriors.Membership;



import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by preet on 7/29/17.
 */
public class Driver extends Member {
    private String _license;
    private String _insurance;

    //Constructor
    public Driver(String name, String phoneNumber, String email, String license, String insurance) {
        super();
        this._name = name;
        this._phoneNumber = phoneNumber;
        this._email = email;
        this._id = UUID.randomUUID().toString();
        this._license = license;
        this._insurance = insurance;
    }

    public String get_license() {
        return this._license;
    }

    public String get_insurance() {
        return this._insurance;
    }


    @Override
    public void update(Object args) {
        System.out.println("Updating driver");
    }
}
