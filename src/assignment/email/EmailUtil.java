package assignment.email;

import exceptions.MissingAtSymbolException;
import exceptions.UnsupportedDomainException;

public class EmailUtil {
    public static void checkEmail(String email) throws MissingAtSymbolException, UnsupportedDomainException {
        if (!email.contains("@")) {
            throw new MissingAtSymbolException("Email address is missing @ symbol");
        }

        if (!email.contains(".com") || !email.contains(".se")) {
            throw new UnsupportedDomainException("Unsupported email address domain");
        }

        System.out.println("Email address approved");
    }
}
