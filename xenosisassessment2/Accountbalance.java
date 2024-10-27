class BankAccount 
{
    double balance=0.0;

    void deposit(double amount)
    {
        if(amount>0)
        {
            System.out.println(" deposit balance " + amount);
            balance += amount;
            
        }
    }

    void withdraw(double count)
    {
        if(count >0 && count <= balance)
        {
            System.out.println(" withdraw balance " + count);
            balance -= count;
            
        }
    }

    void display()
    {
        System.out.println(" current balance " + balance);
    }
}

public class Accountbalance 
{ 
    public static void main(String[] args)
    {
        BankAccount BA =new BankAccount();
        BA.deposit(10000);
        BA.withdraw(8000);
        BA.display();
    }
    
}
