import Entity.Account;
import Entity.Customer;
import Entity.Invoice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        customers.add(new Customer(1, "C", 'F', 50));
        customers.add(new Customer(2, "B", 'M', 25));
        customers.add(new Customer(3, "D", 'F', 10));

        accounts.add(new Account(1, customers.get(0), 100.0));
        accounts.add(new Account(2, customers.get(1), 10.0));
        accounts.add(new Account(3, customers.get(2), 200.0));

        invoices.add(new Invoice(1, customers.get(0), 1000.0, LocalDateTime.now()));
        invoices.add(new Invoice(2, customers.get(1), 200.0, LocalDateTime.now()));
        invoices.add(new Invoice(3, customers.get(2), 2000.0, LocalDateTime.of(2024, 8, 3, 7, 7)));

        customers.sort(Comparator.comparing(Customer::getName));
        System.out.println("Sorted by customer name:");
        customers.forEach(System.out::println);

        accounts.sort(Comparator.comparing(Account::getId));
        System.out.println("Sorted by account ID:");
        accounts.forEach(System.out::println);

        invoices.stream()
                .filter(invoice -> invoice.getCustomer().getGender() == 'F' &&
                        invoice.getDateTime().getMonthValue() == 8)
                .forEach(invoice -> invoice.setAmount(invoice.getAmount() * 0.90));

        System.out.println("Invoices after discount in August:");
        invoices.stream()
                .filter(invoice -> invoice.getDateTime().getMonthValue() == 8)
                .forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID or customer name to search: ");
        String input = scanner.nextLine();

        accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(input) ||
                        String.valueOf(account.getId()).equals(input))
                .forEach(System.out::println);

        invoices.stream()
                .filter(invoice -> invoice.getCustomer().getName().equalsIgnoreCase(input) ||
                        String.valueOf(invoice.getId()).equals(input))
                .forEach(System.out::println);
    }
}