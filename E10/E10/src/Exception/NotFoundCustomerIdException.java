package Exception;

public class NotFoundCustomerIdException extends Exception {
    public NotFoundCustomerIdException() {
        super("Customer ID not found.");
    }
}