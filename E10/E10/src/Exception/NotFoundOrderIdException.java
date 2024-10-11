package Exception;

public class NotFoundOrderIdException extends Exception {
    public NotFoundOrderIdException() {
        super("Order ID not found.");
    }
}