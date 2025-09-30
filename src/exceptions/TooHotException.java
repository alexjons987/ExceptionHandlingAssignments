package exceptions;

public class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }

    public TooHotException(String message, Throwable cause) {
        super(message, cause);
    }
}
