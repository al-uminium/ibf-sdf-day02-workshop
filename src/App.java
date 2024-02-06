public class App {
    public static void main(String[] args) throws Exception {
        BankAccount newBankAccount = new BankAccount("Alan", (float) 100.0);
        FixedDepositAccount fa1 = new FixedDepositAccount("Jaret", (float) 150, 4, 8);
        newBankAccount.deposit((float) 100);
        newBankAccount.withdraw((float) 150);
        System.out.println(newBankAccount.getAccountTransactions());
        fa1.deposit(0);
        fa1.withdraw(0);
        fa1.getBalance();
        newBankAccount.withdraw((float) 150);
    }
}
