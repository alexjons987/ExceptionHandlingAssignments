package assignment.password;

import exceptions.PasswordMissingNumberException;
import exceptions.PasswordTooShortException;

public class PasswordUtil {
    public static boolean isPasswordValid(String p) throws PasswordTooShortException, PasswordMissingNumberException {
        if (p.length() < 8) {
            throw new PasswordTooShortException("Passwords cannot be less than 8 characters");
        }

        boolean hasDigit = false;
        for (char c : p.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new PasswordMissingNumberException("Passwords need to contain at least one digit");
        }

        return true;
    }
}
