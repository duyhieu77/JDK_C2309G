package Validate;

import java.util.regex.Pattern;

public class ValidateProduct {

    private static final Pattern ID_PATTERN = Pattern.compile("^(MS|NE|SE)[0-9]{6}$");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");

    public static void validate(String id, String name, int quantity) {
        try {
            if (!isValidId(id)) {
                throw new IllegalArgumentException("Invalid Product ID format.");
            }
            if (!isValidName(name)) {
                throw new IllegalArgumentException("Product name can only contain letters and spaces.");
            }
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity must be a non-negative integer.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }

    private static boolean isValidId(String id) {
        return ID_PATTERN.matcher(id).matches();
    }

    private static boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }
}