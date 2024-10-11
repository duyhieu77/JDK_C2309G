package Exception;

public class NotEnoughInventoryNumberException extends Exception {
    public NotEnoughInventoryNumberException() {
        super("Not enough inventory number.");
    }
}