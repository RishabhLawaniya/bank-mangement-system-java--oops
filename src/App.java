import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        int choice = 0;
        while(choice != 6) {    
            
            System.out.println("================================");
            System.out.println("Welcome to the Banking System");
            System.out.println("================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");     
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                
                case 1: {

                System.out.println("Enter Account Number: ");
                int accountNumber = scanner.nextInt();

                System.out.println("Enter owner name: ");
                String ownerName = scanner.next();

                System.out.println("Enter Initial Balance:");
                double balance = scanner.nextDouble();

                bank.createAccount(accountNumber, ownerName, balance);

                break;

                }
    
                case 2: {

                System.out.print("Enter Account Number: "); 
                int accountNumber = scanner.nextInt(); 
    
                System.out.print("Enter amount to be deposited: "); 
                double amount = scanner.nextDouble(); 
    
                bank.depositMoney(accountNumber, amount); 

                break;
                
                }

                case 3: {
                
                System.out.println("Enter Account Number: ");
                int accountNumber = scanner.nextInt();

                System.out.print("Enter amount to be withdrawn: "); 
                double amount = scanner.nextDouble(); 

                bank.withdrawMoney(accountNumber, amount);

                break; }

                case 4: {

                System.out.println("Enter Account Number: ");
                int accountNumber = scanner.nextInt();

                bank.checkBalance(accountNumber);
                
                break; }

                case 5: {

                System.out.println("Enter Account Number: ");
                int accountNumber = scanner.nextInt();

                bank.viewAccountDetails(accountNumber);


                break; }

                case 6: 
                System.out.println("Exiting: ");
                break;

                default: 
                System.out.println("Invalid choice!");
                break;

            }

            System.out.println();

        }
        System.out.println("Thankyou for using our banking system!");
    }
}
