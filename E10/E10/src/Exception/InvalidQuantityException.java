package Exception;

public class InvalidQuantityException extends Exception {
    public InvalidQuantityException() {
        super("Quantity must be a positive integer.");
    }
}