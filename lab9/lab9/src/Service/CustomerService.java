package Service;

import iGeneric.Generic;
import Entity.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements Generic<Customer> {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void update(Customer customer) {
    }

    @Override
    public Customer getById(int id) {
        return customers.stream()
                .filter(customer -> customer.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Customer> getByName(String name) {
        return customers.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .toList();
    }


}