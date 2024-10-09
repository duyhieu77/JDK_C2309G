import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        customers.add(new Customer(1, "C", Gender.F, 50));
        customers.add(new Customer(2, "B", Gender.M, 25));
        customers.add(new Customer(3, "D", Gender.F, 10));

        accounts.add(new Account(1, customers.get(0), 100.0));
        accounts.add(new Account(2, customers.get(1), 10.0));
        accounts.add(new Account(3, customers.get(2), 200.0));

        invoices.add(new Invoice(1, customers.get(0), 1000.0, LocalDateTime.now()));
        invoices.add(new Invoice(2, customers.get(1), 200.0, LocalDateTime.now()));
        invoices.add(new Invoice(3, customers.get(2), 2000.0, LocalDateTime.of(2024, Month.AUGUST, 3, 7, 7)));

        System.out.println("Search Customer by ID 2: " + searchById(customers, 2));
        System.out.println("Search Account by Name 'C': " + searchByName(accounts, "C"));

        customers.sort(Comparator.comparing(Customer::getName));
        System.out.println("Sort by name:");
        customers.forEach(System.out::println);

        accounts.sort(Comparator.comparing(Account::getId));
        System.out.println("Sort by ID:");
        accounts.forEach(System.out::println);

        invoices.sort(Comparator.comparing(Invoice::getAmount));
        System.out.println("Sort by amount:");
        invoices.forEach(System.out::println);
    }



    public static Optional<Customer> searchById(List<Customer> customers, int id) {
        return customers.stream()
                .filter(customer -> customer.getID() == id)
                .findFirst();
    }

    public static Optional<Account> searchByName(List<Account> accounts, String name) {
        return accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(name))
                .findFirst();
    }

}