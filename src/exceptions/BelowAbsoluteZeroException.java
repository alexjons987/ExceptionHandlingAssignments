package exceptions;

public class BelowAbsoluteZeroException extends Exception {
    public BelowAbsoluteZeroException(String message) {
        super(message);
    }

    public BelowAbsoluteZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
