import Controller.CustomerController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Staff;
import Service.AccountService;
import Service.CustomerService;
import Service.StaffService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(cs);

        customers.add(new Customer(1, "B", "VCT001", Gender.MALE));
        customers.add(new Customer(2, "K", "VCC002", Gender.FEMALE));
        customers.add(new Customer(3, "O", "VVL003", Gender.FEMALE));
        customers.add(new Customer(4, "D", "TTT004", Gender.MALE));

        Customer cus = customerController.getById(1);
        if(cus != null) {
            System.out.println(cus);
        }
        else {
            System.out.println("Error");
        }

        List<Staff> staffs = new ArrayList<>();
        StaffService ss = new StaffService(staffs);

        staffs.add(new Staff(1, LocalDate.of(2005, 3, 3), "hieu", "CCC002"));
        staffs.add(new Staff(2, LocalDate.of(2000, 12, 31), "hoang", "PS5"));

        Staff staff = ss.getById(1);
        if(staff != null) {
            System.out.println(staff);
        }
        else {
            System.out.println("Error");
        }

        Staff staffsByCode = ss.getByCode("CCC002");
        if(staffsByCode != null) {
            System.out.println(staffsByCode);
        }
        else {
            System.out.println("Error found staff by code");
        }

        List<Staff> staffsName = ss.getByName("hoang");
        System.out.println("Staffs with name 'hoang': " + staffsName);

        List<Account> accounts = new ArrayList<>();
        AccountService as = new AccountService(accounts);

        accounts.add(new Account(1, customers.get(0), LocalDateTime.now(), 1000000.0, "VCC01"));
        accounts.add(new Account(2, customers.get(1), LocalDateTime.now(), 200000.0, "VCC02"));
        accounts.add(new Account(3, customers.get(2), LocalDateTime.now(), 700000.0, "VCC03"));


        Account accByCode = as.getAccountByCustomerCode("VCC02");
        if(accByCode != null) {
            System.out.println(accByCode);
        }
        else {
            System.out.println("Error account not found customer by code");
        }

        List<Account> AccountByName = as.getAccountByCustomerName("K");
        System.out.println("Accounts with customer name 'K': " + AccountByName);

        List<Account> MAccounts = as.getAccountCustomerMaleMoreThan1M(1000000.0);
        System.out.println("Male Accounts with balance > 1,000,000: " + MAccounts);

        long FemaleCount = as.countAccountCustomerFemaleMoreThan100k(100000.0);
        System.out.println("Number of Female Customers with balance > 100,000: " + FemaleCount);

    }
}