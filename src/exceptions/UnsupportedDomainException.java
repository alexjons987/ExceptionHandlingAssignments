package exceptions;

public class UnsupportedDomainException extends Exception {
    public UnsupportedDomainException(String message) {
        super(message);
    }

    public UnsupportedDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
