package Exception;

public class InvalidProductIdException extends Exception {
    public InvalidProductIdException() {
        super("Invalid Product ID format.");
    }
}