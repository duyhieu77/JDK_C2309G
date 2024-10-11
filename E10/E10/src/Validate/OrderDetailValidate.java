package Validate;

import Exception.InvalidQuantityException;

public class OrderDetailValidate {

    public static void validateOrderDetailQuantity(int quantity) throws InvalidQuantityException {
        if (!isValidOrderDetailQuantity(quantity)) {
            throw new InvalidQuantityException();
        }
    }

    private static boolean isValidOrderDetailQuantity(int quantity) {
        return quantity >= 0;
    }
}