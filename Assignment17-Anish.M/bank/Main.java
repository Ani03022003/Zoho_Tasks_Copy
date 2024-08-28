package Assignment_15.bank;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Bank bank = new Bank();
        bank.deposit(account, 1000);
        bank.withDrawl(account, 1000);
        bank.withDrawl(account, 2000);
    }
}
