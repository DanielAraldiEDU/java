public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account("Daniel", 100);

        System.out.println(account.getName());

        account.deposit(150);
        account.withdraw(100);

        System.out.println(account.getBalance());
    }
}
