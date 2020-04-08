
/**
 * @author Sandeep Kolli
 */

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

class COD extends BankAccount{
    final long not=-100000000;
    final double intrest=.12;
    private String expiry;
    COD(String s, double d, String e){
        super(s,d);
        expiry=e;
    }
    
    public void setExpiry(String d){
        expiry=d;
    }
    
    public String getExpiry(){
        return expiry;
    }

    public void CalculateIntrest(){
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        Date ConvertExpire;
        long days;
        try {
        ConvertExpire = ft.parse(expiry); 
         Date date = new Date();
         days=-TimeUnit.DAYS.convert(ConvertExpire.getTime()-date.getTime(), TimeUnit.MILLISECONDS); 
        } catch (ParseException e) { 
         days=not; 
        }
        if(days != not){
            if(days<=0) System.out.println("Term not yet done");
            else 
            {
                double finalValue;
                finalValue=getBalance() + (getBalance()*days*intrest/100);
                System.out.println("The Final intrest Value is : "+ finalValue);
            }
        }
        else System.out.println("Date Format is wrong");
    }
}