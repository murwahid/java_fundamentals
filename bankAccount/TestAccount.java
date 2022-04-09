public class TestAccount {
    public static void main(String[] args) {
        BankAccount boa = new BankAccount(550,425);
        BankAccount capitalOne = new BankAccount(5450,4425);
        //TEST CHECKING ACCOUNT BALANCE
        System.out.printf("The Checking Account Balance is: $%s \n", boa.getCheckingAccount());
        //TEST SAVINGS ACCOUNT BALANCE
        System.out.printf("The Savings Account Balance is: $%s \n ", boa.getSavingsAccount());
        //testing static functions
        System.out.printf("Number of accounts created: %s \n", BankAccount.numberOfAccounts);
        //TEST STATIC TOTAL MONIES
        System.out.printf("Total Monies in the bank $%s \n", BankAccount.totalMonies);
        //testing static functions
        // System.out.printf("Total Amount of Money %s $", BankAccount.totalMoney);
        boa.setAccountBalance(500,"checkingAccount");
         // System.out.printf("Total Amount of Money %s $", BankAccount.totalMoney);
        boa.setAccountBalance(1545,"savingsAccount");
         //TEST CHECKING ACCOUNT BALANCE
        System.out.printf("The Checking Account Balance is: $%s \n ", boa.getCheckingAccount());
        //TEST SAVINGS ACCOUNT BALANCE
        System.out.printf("The Savings Account Balance is: $%s \n", boa.getSavingsAccount());
        //TEST STATIC TOTAL MONIES
        System.out.printf("Total Monies in the bank $%s \n", BankAccount.totalMonies);
         // System.out.printf("Total Amount of Money %s $", BankAccount.totalMoney);
        boa.setWithdrawBalance(200,"checkingAccount");
         // System.out.printf("Total Amount of Money %s $", BankAccount.totalMoney);
        boa.setWithdrawBalance(200,"savingsAccount");
         //TEST CHECKING ACCOUNT BALANCE
        System.out.printf("The Checking Account Balance is: $%s \n ", boa.getCheckingAccount());
        //TEST SAVINGS ACCOUNT BALANCE
        System.out.printf("The Savings Account Balance is: $%s \n", boa.getSavingsAccount());
        //TEST STATIC TOTAL MONIES
        System.out.printf("Total Monies in the bank $%s \n", BankAccount.totalMonies);
        //TOTAL
        System.out.printf("Total Monies in bank accounts $%s \n", boa.getBalanceTotal());
    }
}