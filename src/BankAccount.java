import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class BankAccount {
  private final String accountHolderName;
  private final String accountNo;
  private float accountBalance;
  private List<String> accountTransactions;
  private boolean isAccountClosed; 
  private Date accountCreationDate;
  private Date accountClosingDate;

  private String generateAccountNo() {
    // Generate random account number
    return UUID.randomUUID().toString();
  }

  public BankAccount(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    this.accountBalance = 0;
    this.accountNo = generateAccountNo();
    this.accountTransactions = new ArrayList<String>();
  }

  public BankAccount(String accountHolderName, float accountBalance) {
    
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
    this.accountNo = generateAccountNo();
    this.accountTransactions = new ArrayList<String>();
  }

  public float getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(float accountBalance) {
    this.accountBalance = accountBalance;
  }

  public List<String> getAccountTransactions() {
    System.out.println("Listing your transactions...");
    for (String transactions : accountTransactions) {
      System.out.println("> "+transactions);
    }
    return accountTransactions;
  }

  public void setAccountTransactions(List<String> accountTransactions) {
    this.accountTransactions = accountTransactions;
  }

  public boolean isAccountClosed() {
    return isAccountClosed;
  }

  public void setAccountClosed(boolean isAccountClosed) {
    this.isAccountClosed = isAccountClosed;
  }

  public Date getAccountCreationDate() {
    return accountCreationDate;
  }

  public void setAccountCreationDate(Date accountCreationDate) {
    this.accountCreationDate = accountCreationDate;
  }

  public Date getAccountClosingDate() {
    return accountClosingDate;
  }

  public void setAccountClosingDate(Date accountClosingDate) {
    this.accountClosingDate = accountClosingDate;
  } 

  // Methods
  private String getCurrentDateTime() {
    // LocalDate currentDate = LocalDate.now();
    String currentDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    return currentDate;
  }

  public void deposit(float cash) {
    if (cash < 0 || this.isAccountClosed) {
      throw new IllegalArgumentException("Your account is closed or the value you are trying to deposit is invalid.");
    } else {
      this.accountBalance += cash;
      String currentDate = getCurrentDateTime();
      String msg = "Deposited $" + cash + " at " + currentDate;
      accountTransactions.add(msg);
      System.out.println(msg);
    }
  }

  public void withdraw(float cash) {
    if (cash > getAccountBalance() || isAccountClosed()) {
      throw new IllegalArgumentException("Your account is closed or the value you are trying to withdraw is more than your deposit.");
    } else {
      this.accountBalance -= cash;
      String currentDate = getCurrentDateTime();
      String msg = "Withdraw $" + cash + " at " + currentDate;
      accountTransactions.add(msg);
      System.out.println(msg);
    }
  }
}
