// Define the Bank interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Implement the interface in the Account class
class Account implements Bank {
    private double balance;

    // Constructor to initialize balance
    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Override deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        displayBalance();
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        displayBalance();
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
        System.out.println("---------------------");
    }
}

// Main class to test the Account functionality
public class Exp7_InterfaceBank {
    public static void main(String[] args) {
        // Create an account with an initial balance of $1000
        Account myAccount = new Account(1000.0);

        // Perform transactions
        myAccount.deposit(500.0);   // Deposit $500
        myAccount.withdraw(200.0);  // Withdraw $200
        myAccount.withdraw(2000.0); // Attempt to withdraw more than balance
        myAccount.deposit(-50.0);   // Invalid deposit
        myAccount.withdraw(-100.0); // Invalid withdrawal
    }
}
