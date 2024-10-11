package Exception;

public class InvalidOrderIdException extends Exception {
    public InvalidOrderIdException() {
        super("Invalid Order ID.");
    }
}