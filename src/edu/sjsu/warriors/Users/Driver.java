package edu.sjsu.warriors.Users;

public class Driver {
    protected String _username;
    protected String _phno;
    protected String _emailid;
   // protected String _userID;
private StandardUserfile stdDriver= new StandardUserfile();
    public String signUpfile(String username,String emailId,String password,String phNo)

    {
        return null;
        //return stdDriver.signUp(username, emailId, password, phNo);
    }
    private String _licencenum;
    private String _insurance;
    private String _carnameplate;

    public Driver(String name, String phnoneNumber, String email,String licence,String insurance) {
        super();
        this._username = name;
        this._phno = phnoneNumber;
        this._emailid = email;
        //this._userID = userId;
        this._licencenum = licence;
        this._insurance = insurance;


    }


        public String get_licencenum() {
        return _licencenum;
    }

        public void set_licencenum(String _licencenum) {
        this._licencenum = _licencenum;
    }

        public String get_insurance() {
        return _insurance;
    }

        public void set_insurance(String _insurance) {
        this._insurance = _insurance;
    }

        public String get_carnameplate() {
        return _carnameplate;
    }

        public void set_carnameplate(String _carnameplate) {
        this._carnameplate = _carnameplate;
    }



}
