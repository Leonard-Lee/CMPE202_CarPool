package edu.sjsu.warriors.AAA;
import edu.sjsu.warriors.User.User;

import java.util.HashMap;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by schen on 7/30/17.
 */
public class AAA {
    // Singleton pattern
    private AAA() {

    }

    private static AAA _AAA;
    private Map<String, User> _accountMap = new HashMap<>();


    public static AAA getInstance() {
        if(_AAA == null) {
            synchronized (AAA.class) {
                if(_AAA == null) {
                    _AAA = new AAA();
                }
            }
        }

        return _AAA;
    }

    public boolean SignUp(User newUser) {
        _accountMap.put(newUser.getUserID(), newUser);
        return true;
    }

    public boolean SignIn(User newUser) {
        return (_accountMap.containsKey(newUser.getUserID()) && _accountMap.get(newUser.getUserID()).getPwd().equals(newUser.getPwd()));
    }
}
