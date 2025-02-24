import java.util.*;
abstract class BankAccount
{
    private int accountNumber;
    private double balance;
    static double interestRate=5,interest=0;
    abstract double calculateInterest();
    public BankAccount()
    {
        Scanner in =new Scanner(System.in);
        this.accountNumber=in.nextInt();
        this.balance=in.nextDouble();
    }
    
    public double get_balance()
    {
        return balance;
    }
    public double get_interestrate()
    {
        return interestRate;
    }
    void display()
    {
        System.out.println("\nAccount Number :"+accountNumber+"\nBalance :"+balance+"\nInterest :"+interest);
    }
    
}

class SavingsAccount extends BankAccount
{
    SavingsAccount()
    {
        super();
    }
    double calculateInterest()
    {
        interest = (double)((super.get_balance()*super.get_interestrate()*10)/100);
        return interest;
    }
}
class CurrentAccount extends BankAccount
{
    CurrentAccount()
    {
        super();
    }

    
    double calculateInterest()
    {
       interest = (double)((super.get_balance()*super.get_interestrate()*5)/100);
        return interest;
    }
}
public class Abstraction_Bank
{
	public static void main(String[] args) {
	    SavingsAccount sobj=new SavingsAccount();
	    sobj.calculateInterest();
	    sobj.display();
	    
	    CurrentAccount cobj=new CurrentAccount();
	    cobj.calculateInterest();
	    cobj.display();
	}
}
/*
456
456789

Account Number :456
Balance :456789.0
Interest :228394.5
4567
456789

Account Number :4567
Balance :456789.0
Interest :114197.25

*/