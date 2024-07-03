/**
 * Represents a task to deposit or withdraw money from a {@link BankAccount} object.
 * Implements {@link Runnable} to be executed in a separate thread.
 */
public class Account implements Runnable
{

  private final BankAccount bankAccount; // The bank account to deposit into or withdraw from
  private final double amount; // The amount of money to deposit or withdraw
  private final boolean deposit; // Flag indicating whether to deposit (true) or withdraw (false)

  /**
   * Constructs an {@code Account} object with the specified parameters.
   *
   * @param bankAccount The {@link BankAccount} to interact with.
   * @param amount      The amount of money to deposit or withdraw.
   * @param deposit     {@code true} to deposit money, {@code false} to withdraw money.
   */
  public Account(BankAccount bankAccount, double amount, boolean deposit)
  {
    this.bankAccount = bankAccount;
    this.amount = amount;
    this.deposit = deposit;
  }

  /**
   * Executes the deposit or withdrawal operation on the {@link #bankAccount} object.
   * Uses synchronization to ensure thread safety.
   * Prints "Invalid Balance" if the amount is not valid.
   */
  @Override
  public void run()
  {
    synchronized (this) {
      if (BankAccount.checkValidAmount(amount)) {
        if (deposit) {
          bankAccount.deposit(amount);
        } else {
          bankAccount.withdraw(amount);
        }
      } else {
        System.out.println("Invalid Balance");
      }
    }
  }
}
