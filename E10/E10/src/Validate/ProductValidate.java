package Validate;

import Exception.InvalidProductIdException;
import Exception.InvalidProductNameException;

public class ProductValidate {

    public static void validateProductId(String id) throws InvalidProductIdException {
        if (!isValidProductId(id)) {
            throw new InvalidProductIdException();
        }
    }

    private static boolean isValidProductId(String id) {
        return id.matches("^(MS|NE|SE)[0-9]{6}$");
    }

    public static void validateProductName(String name) throws InvalidProductNameException {
        if (!isValidProductName(name)) {
            throw new InvalidProductNameException();
        }
    }

    private static boolean isValidProductName(String name) {
        return name.matches("^[a-zA-Z ]+$");
    }

    public static boolean isValidProductQuantity(int quantity) {
        return quantity >= 0;
    }

}