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

    

}