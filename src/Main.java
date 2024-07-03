// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
  public static void main(String[] args)
  {
    BankAccount bankAccount = new BankAccount();

    new Thread(new Account(bankAccount, 200, true)).start();
    new Thread(new Account(bankAccount, 300, true)).start();
    new Thread(new Account(bankAccount, 400, true)).start();
    new Thread(new Account(bankAccount, 500, true)).start();
    new Thread(new Account(bankAccount, 150, false)).start();
    new Thread(new Account(bankAccount, 250, false)).start();
    new Thread(new Account(bankAccount, 350, false)).start();
    new Thread(new Account(bankAccount, 450, false)).start();
    new Thread(new Account(bankAccount, 600, true)).start();
    new Thread(new Account(bankAccount, 550, false)).start();
    new Thread(new Account(bankAccount, 650, false)).start();
    new Thread(new Account(bankAccount, 750, false)).start();
    new Thread(new Account(bankAccount, 700, true)).start();
    new Thread(new Account(bankAccount, 800, true)).start();
    new Thread(new Account(bankAccount, 900, true)).start();
    new Thread(new Account(bankAccount, 1000, true)).start();
    new Thread(new Account(bankAccount, 550, false)).start();
    new Thread(new Account(bankAccount, 650, false)).start();
    new Thread(new Account(bankAccount, 750, false)).start();
    new Thread(new Account(bankAccount, 850, false)).start();
    new Thread(new Account(bankAccount, 950, false)).start();
    new Thread(new Account(bankAccount, 1050, false)).start();
    new Thread(new Account(bankAccount, 1100, true)).start();

  }
}
