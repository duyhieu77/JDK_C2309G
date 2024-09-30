package Entity;


public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance()+amount);
        System.out.println("Deposit of $"+amount+"Successful.Current balance: $"+getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " Successful.Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds.Withdrawal failed");
        }
    }
}