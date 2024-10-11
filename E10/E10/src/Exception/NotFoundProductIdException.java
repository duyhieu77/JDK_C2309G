package Exception;

public class NotFoundProductIdException extends Exception {
    public NotFoundProductIdException() {
        super("Product ID not found.");
    }
}