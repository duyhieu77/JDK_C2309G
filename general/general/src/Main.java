import Controller.CustomerController;
import  Entity.Customer;
import Service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Customer> customers = new ArrayList<Customer>();
       CustomerService cs = new CustomerService(customers);
       CustomerController customerController = new CustomerController(customers , cs);
       customers.add(new Customer(2,"TCB001", "haha"));
       customers.add(new Customer(2,"TCB001", "haha"));
       Customer cus = customerController.getById(3);

    }
}