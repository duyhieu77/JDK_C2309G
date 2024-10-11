package Exception;

public class InvalidProductNameException extends Exception {
    public InvalidProductNameException() {
        super("Invalid Product Name format.");
    }
}