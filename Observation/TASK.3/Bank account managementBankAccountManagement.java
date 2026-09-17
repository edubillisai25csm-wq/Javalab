class Account
{
    int accno;
    String name;
    double bal;
    String type;

    Account(int accno,String name, double bal,String type)
    {
        this.accno=accno;
        this.name=name;
        this.bal=bal;
        this.type=type;
        
    }
    void deposit(double amount)
    {
        bal=bal+amount;
        System.out.println("Deposited amount is: "+amount);
        System.out.println("Available balance: "+bal);
    }
    void withdraw(double amount)
    {
        if(bal<amount)
        {
            System.out.println("Insuffient balance");
        }
        if(amount<=bal)
        {
            bal=bal-amount;
            System.out.println("Amount withdraw is : "+amount);
            System.out.println("Remaining balance is: "+bal);
        }
    }
    void transfer(Account a,double amount)
    {
        if(amount<=bal)
        {
            bal=bal-amount;
            a.bal=a.bal+amount;
            System.out.println("Transferred amount is : "+amount);
        }
        else
        {
            System.out.println("Insufficient account balance");
        }
    }
    void display()
    {
        System.out.println("Account Number: "+accno);
        System.out.println("Account holders name: "+name);
        System.out.println("Account type: "+type);
        System.err.println("Account balance: "+bal);
    }
}
class SavingsAccount extends Account
{
    double intrestrate;
    
    SavingsAccount(int accno,String name, double bal,double intrestrate)
    {
        super(accno,name,bal,"savings");
        this.intrestrate=intrestrate;
    }
    void calculateInterestrate()
    {
        double interest;
        interest=bal*intrestrate/100;
        System.out.println("Intrest is: "+interest);    

    }
}
class CurrentAccount extends Account
{
    double overdraftlimit;
    CurrentAccount(int accNo, String name, double balance,double overdraftLimit)
    {
        super(accNo, name, balance, "Current");
        this.overdraftlimit=overdraftLimit;
    }
    @Override 
    void withdraw(double amount)
    {
        if(amount<=bal+overdraftlimit)
        {
            bal=bal-amount;
            System.out.println("Withdraw= "+amount);
        }
        else
        {
            System.out.println("Over Limit Exceeded");
        }
    }
}
public class BankAccountManagement {

    public static void main(String[] args) {
        
        SavingsAccount s=new SavingsAccount(1018, "sai", 50000, 5);

        CurrentAccount c=new CurrentAccount(1019, "Riya", 10000, 3000);
        System.out.println("Before transition\n");

        s.display();
        System.out.println(" ");
        c.display();
        System.out.println(" ");

        System.out.println("Transitions are: ");

        s.deposit(50000);
        s.withdraw(20000);
        s.calculateInterestrate();

        c.deposit(40000);
        c.withdraw(20000);

        s.transfer(c, 20000);

         System.out.println("\nAfter Transactions\n");

        s.display();
        System.out.println();
        c.display();

        System.out.println("\nFinal Balance\n");
        System.out.println("Savings: " + s.bal);
        System.out.println("Current: " + c.bal);
    }
}
