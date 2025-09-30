package exceptions;

public class NotNumericException extends Exception {
    public NotNumericException(String message) {
        super(message);
    }

    public NotNumericException(String message, Throwable cause) {
        super(message, cause);
    }
}
