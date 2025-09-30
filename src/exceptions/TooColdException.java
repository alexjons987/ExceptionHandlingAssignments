package exceptions;

public class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }

    public TooColdException(String message, Throwable cause) {
        super(message, cause);
    }
}
