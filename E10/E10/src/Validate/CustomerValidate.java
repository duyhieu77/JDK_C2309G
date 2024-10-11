package Validate;

import Exception.InvalidCustomerNameIdException;

public class CustomerValidate {

    public static void validateCustomerName(String name) throws InvalidCustomerNameIdException {
        if (!isValidCustomerName(name)) {
            throw new InvalidCustomerNameIdException();
        }
    }

    private static boolean isValidCustomerName(String name) {
        return name.matches("^[a-zA-Z ]{3,50}$");
    }

    public static void validateCustomerId(int id) throws InvalidCustomerNameIdException {
        if (!isValidCustomerId(id)) {
            throw new InvalidCustomerNameIdException();
        }
    }

    private static boolean isValidCustomerId(int id) {
        return id > 0;
    }
}