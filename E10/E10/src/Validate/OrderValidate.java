package Validate;

import Exception.InvalidOrderIdException;

public class OrderValidate {

    public static void validateOrderId(String id) throws InvalidOrderIdException {
        if (!isValidOrderId(id)) {
            throw new InvalidOrderIdException();
        }
    }

    private static boolean isValidOrderId(String id) {
        return id.matches("^(ORDPM)[0-9]{8}$");
    }
}