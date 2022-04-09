import java.util.Random; 

public class BankAccount {
    //CREATE THE ATTRIBUTES
    private double checkingBalance; 
    private double savingsBalance;
    private String accountNumber; 
    public static int numberOfAccounts; 
    public static double totalMonies;

    //CONSTRUCTOR FUNCTION
    public BankAccount (double checkingBalancePassed, double savingsBalancePassed) {
       this.checkingBalance = checkingBalancePassed; 
       this.savingsBalance = savingsBalancePassed;
       numberOfAccounts++;
       totalMonies += checkingBalancePassed + savingsBalancePassed;
    }
    //GETTERS 
    public double getCheckingAccount() {
        return checkingBalance;
    }
    public double getSavingsAccount() {
        return savingsBalance;
    }

    //DEPOSIT MONEY(i.e. Setter)
    public void setAccountBalance(double newBalance, String desiredAccount) {
        if(desiredAccount == "checkingAccount") { 
            this.checkingBalance += newBalance;
            totalMonies += newBalance;
            System.out.printf("New Checking account balance set! Added $%s \n", newBalance);
        }
        else if (desiredAccount == "savingsAccount") {
            this.savingsBalance += newBalance;
            totalMonies += newBalance;
            System.out.printf("New Savings account balance set! Added $%s \n", newBalance);
        }
        else{
            System.out.println("Invalid balance type again.");
        }
    } 

    //WITHDRAW MONEY FROM ONE BALANCE. SETTER THAT SUBTRACTS
    // if (Balance <= 0){}
    public void setWithdrawBalance(double newBalance, String desiredAccount) {
        if(desiredAccount == "checkingAccount") { 
            if(this.checkingBalance != 0) {
                this.checkingBalance -= newBalance;
                totalMonies -= newBalance;
                System.out.printf("New Checking account balance set! Withdrew $%s \n", newBalance);
            }
        }
        else if (desiredAccount == "savingsAccount") {
            if(this.savingsBalance !=0) {
                this.savingsBalance -= newBalance;
                totalMonies -= newBalance;
                System.out.printf("New Savings account balance set! Withdrew $%s \n", newBalance);
            }
        }
        else{
            System.out.println("Invalid balance type again.");
        }
    } 
    //CHECKING AND SAVINGS TOTAL 
    public double getBalanceTotal(){
        double balanceTotal = checkingBalance + savingsBalance; 
        return balanceTotal;
    }
    //RANDOM ACCOUNT NUMBER 10 digit random number generated once and then saved. 
    public createAccountNumber() {
         Random accountString = new Random(10); 
    }
       
        
    //

}