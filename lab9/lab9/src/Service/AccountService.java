package Service;

import iGeneric.Generic;
import Entity.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountService implements Generic<Account> {
    private List<Account> accounts = new ArrayList<>();
    @Override
    public void update(Account account) {

    }


    @Override
    public Account getById(int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Account> getByName(String name) {
        return accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(name))
                .toList();
    }
}