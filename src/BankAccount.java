public class BankAccount{
    //hiding variables
    private double balance;
    private final String accountHolder;

    //defining counstructor with parameters
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        //guarding against negative
        if (initialBalance > 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
        }
    }

    public void deposit(double amount){
        //guarding amount from negativity
        if(amount <= 0){
            System.err.println("Deposit must be greater that 0!");
            return;
        }
        this.balance += amount;
        System.out.printf("Successully deposited $%.2f.%n", amount);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.err.println("Amount must be greater than 0!");
            return;
        }
    }

}