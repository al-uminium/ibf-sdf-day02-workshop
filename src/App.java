public class App {
    public static void main(String[] args) throws Exception {
        BankAccount newBankAccount = new BankAccount("Alan", (float) 100.0);
        newBankAccount.deposit((float) 100);
        newBankAccount.withdraw((float) 150);
        newBankAccount.withdraw((float) 150);
    }
}
