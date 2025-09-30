package assignment.telephone;

import exceptions.InvalidPhoneNumberException;
import exceptions.NotNumericException;

public class PhoneUtil {
    public static void validatePhoneNumber(String number) throws InvalidPhoneNumberException, NotNumericException {
        if (number.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number is not 10 digits");
        }

        boolean hasChar = false;
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                hasChar = true;
                break;
            }
        }
        if (hasChar) {
            throw new NotNumericException("Phone number cannot contain letters");
        }

        System.out.println("Phone number accepted");
    }
}
