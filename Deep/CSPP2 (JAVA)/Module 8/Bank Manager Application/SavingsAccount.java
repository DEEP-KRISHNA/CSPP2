
/**
 * @author Sandeep Kolli
 */

class SavingsAccount extends BankAccount{
    private int transfers;
    SavingsAccount(String s, double d, int e){
        super(s,d);
        transfers=e;
    }
    
    public void setTransfer(int d){
        transfers=d;
    }
    
    public double getTransfer(){
        return transfers;
    }
    
    public void withdrawl(double d){
        if(getBalance()-d >= 0){
        setBalance(getBalance()-d);
        System.out.println("The balance after withdrawl is : "+getBalance());
        }
        else{
            System.out.println("Cant possible limit exceeded");
        }
    }
}