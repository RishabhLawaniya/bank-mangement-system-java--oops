public class Account{
    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName, double balance ){

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("Amount successfully deposited. Available Balance: " + balance);
        } else {
            System.out.println("Enter Valid and Positve amount.");
        }        
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount successfully withdrawn. Available Balance: " + balance);
        } else {
            System.out.println("Either Invalid amount or Insufficient balance!");
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
}