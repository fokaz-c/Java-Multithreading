
public class BankAccount
{

  private int _accountNumber; 
  private double _balance; 

  public BankAccount()
  {
    _accountNumber = 45436537;
    _balance = 1000;
  }

  /**
   * Deposits the specified amount into the bank account.
   * Ensures thread safety by synchronizing the method.
   *
   * @param amount The amount to deposit (must be greater than zero).
   */
  public synchronized void deposit(double amount)
  {
    if (amount > 0) {
      _balance += amount;
      System.out.println("Successfully Deposited by " + Thread.currentThread().getName());
      System.out.println("Current Balance: " + getBalance());
    }
  }

  /**
   * Withdraws the specified amount from the bank account, if sufficient funds are available.
   * Ensures thread safety by synchronizing the method.
   *
   * @param amount The amount to withdraw (must be greater than zero and less than or equal to current balance).
   */
  public synchronized void withdraw(double amount)
  {
    if (amount > 0 && amount <= _balance) {
      _balance -= amount;
      System.out.println("Successfully Withdrawn by " + Thread.currentThread().getName());
      System.out.println("Current Balance: " + getBalance());
    }
    else {
      System.out.println("Insufficient Balance.");
      System.out.println("Withdraw Unsuccessful in " + Thread.currentThread().getName());
    }
  }

  /**
   * Checks if the specified amount is valid for deposit or withdrawal (must be greater than zero).
   *
   * @param amount The amount to check.
   * @return {@code true} if the amount is greater than zero, otherwise {@code false}.
   */
  public static boolean checkValidAmount(double amount)
  {
    return amount > 0;
  }

  /**
   * Retrieves the current balance of the bank account.
   *
   * @return The current balance of the bank account.
   */
  private double getBalance()
  {
    return _balance;
  }
}
