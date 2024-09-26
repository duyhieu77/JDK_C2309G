import entity.Customer;
import entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        customers.add(new Customer(1, "jen", 30));
        customers.add(new Customer(2, "sam", 20));
        customers.add(new Customer(3, "firefly", 50));

        invoices.add(new Invoice(101, customers.get(0), 2500));
        invoices.add(new Invoice(102, customers.get(0), 1500));
        invoices.add(new Invoice(103, customers.get(1), 3000));
        invoices.add(new Invoice(104, customers.get(1), 3500));
        invoices.add(new Invoice(105, customers.get(2), 4000));
        invoices.add(new Invoice(106, customers.get(2), 4500));

        int customerIdToDisplay = 1;
        System.out.println("Invoices for Customer ID " + customerIdToDisplay + ":");
        for (Invoice invoice : invoices) {
            if (invoice.getCustomer().getId() == customerIdToDisplay) {
                System.out.println(invoice);
            }
        }

        double maxAmount = 0;
        Customer maxCustomer = null;

        for (Customer customer : customers) {
            double totalAmount = invoices.stream()
                    .filter(inv -> inv.getCustomer().getId() == customer.getId())
                    .mapToDouble(Invoice::getAmount)
                    .sum();
            if (totalAmount > maxAmount) {
                maxAmount = totalAmount;
                maxCustomer = customer;
            }
        }
        System.out.println("Customer with MAX total amount: " + maxCustomer);

        Customer minDiscountCustomer = customers.stream()
                .min((c1, c2) -> Integer.compare(c1.getDiscount(), c2.getDiscount()))
                .orElse(null);
        System.out.println("Customer with MIN discount: " + minDiscountCustomer);
    }
}