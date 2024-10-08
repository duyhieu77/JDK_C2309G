package Entity;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String accountNumber;
    private Customer customer;
    private double balance;
    private LocalDateTime createAt;


    public Account(int id, Customer customer, LocalDateTime createdAt, double balance, String accountNumber) {
        this.id = id;
        this.customer = customer;
        this.createAt = createdAt;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", customer=" + customer +
                ", balance=" + balance +
                ", createAt=" + createAt +
                '}';
    }
}