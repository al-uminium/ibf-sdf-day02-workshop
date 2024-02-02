public class FixedDepositAccount extends BankAccount{
  private float interest;
  private int duration;
  private boolean isInterestChanged;



  public FixedDepositAccount(String accountHolderName, float accountBalance, float interest, int duration) {
    super(accountHolderName, accountBalance);
    this.interest = (float) 3;
    this.duration = 6;
    this.isInterestChanged = false;
  }

  public float getInterest() {
    return interest;
  }

  public void setInterest(float interest) {
    this.interest = interest;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public boolean isInterestChanged() {
    return isInterestChanged;
  }

  public void setInterestChanged(boolean isInterestChanged) {
    this.isInterestChanged = isInterestChanged;
  }

  @Override
  public void deposit(float cash) {
    System.out.println("Nope");
  }    

  @Override
  public void withdraw(float cash) {
    System.out.println("Nope");
  }

  public void getBalance() {
    System.out.println(getAccountBalance()*(1+interest/100));
  }
}
