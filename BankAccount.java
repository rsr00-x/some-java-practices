public class BankAccount {

    // Fields for encapsulation
    private String ownersName;
    private int accountNumber;
    private float balance;

    // Default constructor
    public BankAccount() {
        this.ownersName = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0f;
    }

    // Constructor with account number
    public BankAccount(int anAccountNumber) {
        this.accountNumber = anAccountNumber;
        this.ownersName = "Unknown";
        this.balance = 0.0f;
    }

    // Constructor with account number and owner's name
    public BankAccount(int anAccountNumber, String aName) {
        this.accountNumber = anAccountNumber;
        this.ownersName = aName;
        this.balance = 0.0f;
    }

    // Getter for owner's name
    public String getOwnersName() {
        return ownersName;
    }

    // Setter for owner's name
    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public float getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner's Name: " + ownersName);
        System.out.println("Balance: " + balance);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating accounts
        BankAccount anAccount = new BankAccount();
        BankAccount anotherAccount = new BankAccount(12345);
        BankAccount myAccount = new BankAccount(33423, "Craig");

        // Displaying initial details
        anAccount.displayAccountDetails();
        anotherAccount.displayAccountDetails();
        myAccount.displayAccountDetails();

        // Operations on accounts
        myAccount.deposit(500.0f);
        myAccount.withdraw(100.0f);
        myAccount.displayAccountDetails();
    }
}
