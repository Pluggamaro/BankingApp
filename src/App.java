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
            }
        }
    }
}
