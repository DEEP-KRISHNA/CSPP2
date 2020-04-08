/**
 * @author Sandeep Kolli
 */

class CheckingAccount extends BankAccount{
    private double limit;
    CheckingAccount(String s, double d, double e){
        super(s,d);
        limit=e;
    }
    
    public void setLimit(double d){
        limit=d;
    }
    
    public double getLimit(){
        return limit;
    }

    public void withdrawl(double d){
        if(getBalance()-d > limit){
        setBalance(getBalance()-d);
        System.out.println("The balance after withdrawl is : "+getBalance());
        }
        else{
            System.out.println("Cant possible limit exceeded");
        }
    }
}