package Entity;

public abstract class BankAccount {
    private String accountNumber;
    public double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

}
