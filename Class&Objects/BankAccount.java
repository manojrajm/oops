public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountType;

    public BankAccount(String accountNumber, String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) { 
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void displayAccountDetails() {
        System.out.printf("Account Number: %s%nAccount Type: %s%nBalance: %.2f%n", 
                           accountNumber, accountType, balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "Savings", 1000.00);
        myAccount.displayAccountDetails();
        
        myAccount.setAccountType("Checking");
        myAccount.setBalance(1200.50);

        System.out.println("\nUpdated Account Details:");
        myAccount.displayAccountDetails();
    }
}

