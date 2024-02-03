public class Account {
  private String name;
  private double balance;

  Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return this.name;
  }

  public double getBalance() {
    return this.balance;
  }

  public void withdraw(double value) {
    if (this.balance < value || value <= 0)
      return;
    else
      this.balance -= value;
  }

  public void deposit(double value) {
    if (value < 0)
      return;
    else
      this.balance += value;
  }
}
