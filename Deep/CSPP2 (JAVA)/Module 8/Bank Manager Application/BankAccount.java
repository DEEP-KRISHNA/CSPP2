/**
 * @author Sandeep Kolli
 */

class BankAccount{
    private String accountNumber;
    private double balance;

BankAccount(String s, double d)
{
    accountNumber=s;
    balance=d;
}

public void setAcctNumber(String s){
    accountNumber=s;
}
public void setBalance(double d){
    balance=d;
}

public String getAcctNumber(){
    return accountNumber;
}
public double getBalance(){
    return balance;
}
}