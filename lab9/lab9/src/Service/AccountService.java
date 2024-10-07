package Service;

import Entity.Account;
import Entity.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountService {
    private List<Account> accounts = new ArrayList<>();

    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccountByCustomerName(String keyword) {
        return accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());
    }


    public List<Account> getAccountCustomerMaleMoreThan1M(double v) {
        return accounts.stream()
                .filter(account ->
                        account.getCustomer().getGender() == Gender.M &&
                                account.getBalance() > 1000000.0)
                .collect(Collectors.toList());
    }

    public long countAccountCustomerFemaleMoreThan100k(double v) {
        return accounts.stream()
                .filter(account ->
                        account.getCustomer().getGender() == Gender.F &&
                                account.getBalance() > 100000.0)
                .count();
    }

}