import Entity.Customer;
import Entity.Product;
import Entity.Order;
import Entity.OrderDetail;
import Enum.OrderStatus;
import Validate.CustomerValidate;
import Validate.ProductValidate;
import Validate.OrderDetailValidate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            String customerName = "Ellen Joe";
            int customerId = 1;

            CustomerValidate.validateCustomerName(customerName);
            CustomerValidate.validateCustomerId(customerId);

            Customer customer = new Customer(customerId, customerName);
            System.out.println("Customer created: " + customer.getName());

        } catch (Exception e) {
            System.out.println("Customer validation failed: " + e.getMessage());
        }

        try {
            String productId = "MS123456";
            String productName = "LOL";
            int productQuantity = 7;

            ProductValidate.validateProductId(productId);
            ProductValidate.validateProductName(productName);

            Product product = new Product(productId, productName, productQuantity);
            System.out.println("Product created: " + product.getName());

        } catch (Exception e) {
            System.out.println("Product validation failed: " + e.getMessage());
        }

        try {
            String orderId = "SE002";
            int customerId = 1;
            Order order = new Order(orderId, customerId, LocalDate.now());
            System.out.println("Order created with ID: " + order.getId());

        } catch (Exception e) {
            System.out.println("Order validation failed: " + e.getMessage());
        }

        try {
            String orderId = "NE999";
            int productId = 1;
            int quantity = 5;

            OrderDetailValidate.validateOrderDetailQuantity(quantity);

            OrderDetail orderDetail = new OrderDetail(0,orderId, productId, quantity, OrderStatus.PENDING);
            System.out.println("OrderDetail created with quantity: " + orderDetail.getQuantity());

        } catch (Exception e) {
            System.out.println("OrderDetail validation failed: " + e.getMessage());
        }
    }
}