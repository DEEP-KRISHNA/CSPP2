/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 * @author Sandeep Kolli
 */

//  Your code goes here... For Contact class
public class Contact {
    public String name;
    public String email;
    public String phoneNumber;

    Contact(String setname, String setemail, String setphone)
    {
        this.name=setname;
        this.email=setemail;
        this.phoneNumber=setphone;
    }

    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setName(String setnamee){
        this.name=setnamee;
    }

    public void setPhoneNumber(String setphonee){
        this.phoneNumber=setphonee;
    }

    public void setEmail(String setemaill){
        this.email=setemaill;
    }

    public String toString(){
        String finalStr = ("{ "+"Name = "+name+", Email = "+email+", Phone Number = "+phoneNumber+" }");
        return finalStr;
    }

}


