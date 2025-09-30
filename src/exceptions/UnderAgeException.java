package exceptions;

public class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }

    public UnderAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
