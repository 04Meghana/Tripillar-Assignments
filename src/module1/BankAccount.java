package module1;

public class BankAccount {
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 101;
        b.balance = 1000;
        b.deposit(500);
        b.withdraw(300);
        b.display();
    }
}
