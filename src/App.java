import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //creating mock account
        BankAccount userAccount = new BankAccount("Bongani Zuma",14000.00);

        //using try-with resources to auto-close scanner resources

        try(Scanner scanner = new Scanner(System.in)){
            boolean isRunning = true;

            while(isRunning){
                printMenu();

                System.out.print("Make choice by number: ");

                try {
                    int choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            System.out.print("Enter amount to withdraw: ");
                            int withdrawalAmount = scanner.nextInt();
                            userAccount.withdraw(withdrawalAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            int depositAmount = scanner.nextInt();
                            userAccount.deposit(depositAmount);
                            break;
                        case 3:
                            userAccount.checkBalance();
                            break;
                        case 4:
                            isRunning = false;
                            System.out.println("Ejecting Card...Thank you!");
                            break;
                            
                        default:
                            System.out.println("Invalid. Enter an option 1-4");    
                    }
                }catch(InputMismatchException e){
                    System.out.println("Invalid. Enter a NUMBER!");
                    scanner.next();
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("========SIMPLE BANKING APP========");
        System.out.println("         1. Withdraw");
        System.out.println("         2. Deposit ");
        System.out.println("         3. Check Balance");
        System.out.println("         4. Give Back Card (EXIT)");
        System.out.println("----------------------------------");
    }

}
