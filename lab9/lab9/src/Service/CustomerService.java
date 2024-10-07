package Service;

import Entity.Customer;
import Entity.Invoice;
import Generic.Generic;
import Global.Global;

import java.util.List;
import java.util.Optional;

public class CustomerService implements Generic<Customer>{
    private List<Customer> customers;

    public CustomerService(List<Customer>customers){
        this.customers = customers;
    }

    @Override
    public Customer getById(int id) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getID() == id)
                .findFirst();
        return customer.orElse(null);
    }

    @Override
    public List<Customer> getByName(String keyword) {
        return customers.stream()
                .filter(c -> Global.ignoreCase(c.getName(), keyword))
                .toList();
    }
}