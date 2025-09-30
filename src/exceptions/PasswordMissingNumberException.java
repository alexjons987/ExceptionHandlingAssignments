package exceptions;

public class PasswordMissingNumberException extends Exception {
    public PasswordMissingNumberException(String message) {
        super(message);
    }

    public PasswordMissingNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
