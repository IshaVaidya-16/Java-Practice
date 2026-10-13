import java.util.*;
class Bankk
{
    private String accountHolder;
    private int accno;
    private double balance;

    public Bankk()
    {
        accountHolder="rahul";
        accno=123;
        balance=5000;
    }
    public void getter()
    {
        System.out.println("accountHolder:"+accountHolder+"\naccno:"+accno+"\nbalance:"+balance);
    }
    public void deposit(double amount)
{
        if(balance<=0)
        {
            System.out.println("no balance in account");
        }
        balance=balance+amount;
        System.out.println("Balance: "+balance);
    }

    public void withdraw(double amount)
    {
        if (amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Balance: "+balance);
        }
        else
        {
            System.out.println("insufficient balance");
        }
}
public double getBalance()
    {
        return balance;
    }
}

class encapsulation
{
    public static void main(String[] args)
    {
        Bankk obj=new Bankk();
        Scanner sc=new Scanner(System.in);
        System.out.println("Initial account details:");
        obj.getter();

        System.out.println("\nEnter amount to deposit:");
        double amount = sc.nextDouble();
        obj.deposit(amount);

        System.out.println("\nEnter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        obj.withdraw(withdrawAmount);

        System.out.println("\nFinal balance: " + obj.getBalance());

        sc.close();
    }
}