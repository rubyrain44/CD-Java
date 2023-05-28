public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static int totalMoneyInAccounts = 0;

    public BankAccount(){};
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void depositToChecking(double moneyToDeposit) {
        this.checkingBalance += moneyToDeposit;
    }

    public void withdrawFromChecking(double moneyToWithdraw) {
        if (this.checkingBalance > moneyToWithdraw) {
            this.checkingBalance -= moneyToWithdraw;
        } else {
            System.out.println("Insufficent funds!");
        }
    }

    public void getTotalAccountBalance() {
        System.out.println(this.checkingBalance + this.savingsBalance);
    }

}