import java.util.ArrayList;

public class Bank {
    
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(int accountNumber, String ownerName, double balance) {
        
        Account existingAccount = findAccount(accountNumber);

        if(existingAccount != null){
            System.out.print("This Account already exists.");
            return;
        }

        if(balance >= 0 ){
            Account account = new Account(accountNumber, ownerName, balance);
             accounts.add(account);
             System.out.println("Account created for " + ownerName + " with account number: " + accountNumber + " and initial balance: " + balance   );
        } else {
            System.out.println("Enter Valid and Positve amount.");
        }
        
    }


    public Account findAccount(int accountNumber) {
        for(Account account : accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            } 
        }
        return null;
    }

    public void depositMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if(account != null){
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
        
    }

    public void withdrawMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if(account != null){
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
        
    }

    public void checkBalance(int accountNumber) {

        Account account = findAccount(accountNumber);

        if(account!= null){
            System.out.println("Balance for account number " + accountNumber + " is: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    } 

    public void viewAccountDetails(int accountNumber) {

        Account account = findAccount(accountNumber);

        if(account != null){
            System.out.println();
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner Name: " + account.getOwnerName());
            System.out.println("Available Balance: " + account.getBalance());
        } else {
            System.out.println("Account Not Found! ");
        }
    }


    
}
