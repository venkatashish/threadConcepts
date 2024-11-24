package BankAccountProblem;

public class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public synchronized void deposit(double amount){
        if(amount>0.0){
            balance += amount;
            System.out.println("Rs.200 added to your account & your new balance is:- "+balance);
        }
    }

    public synchronized void withdraw(double amount){
    if(amount>0.0 && balance>=amount){
        balance -= amount;
        System.out.println("Rs.200 deducted from your account & your new balance is:- "+balance);
    }
    }

    public synchronized double getBalance(){
        return balance;
    }

}
