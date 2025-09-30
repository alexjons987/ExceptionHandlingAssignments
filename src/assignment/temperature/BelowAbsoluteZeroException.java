package assignment.temperature;

public class BelowAbsoluteZeroException extends Exception {
    public BelowAbsoluteZeroException(String message) {
        super(message);
    }
}
