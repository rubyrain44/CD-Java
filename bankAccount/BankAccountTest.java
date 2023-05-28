public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 100);
        account1.depositToChecking(45);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawFromChecking(50);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawFromChecking(100);
        System.out.println(account1.getCheckingBalance());
        account1.getTotalAccountBalance();
    }
}