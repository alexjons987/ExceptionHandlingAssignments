package exceptions;

public class MissingAtSymbolException extends Exception {
    public MissingAtSymbolException(String message) {
        super(message);
    }

    public MissingAtSymbolException(String message, Throwable cause) {
        super(message, cause);
    }
}
