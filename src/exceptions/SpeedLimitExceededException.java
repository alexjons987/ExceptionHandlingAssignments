package exceptions;

public class SpeedLimitExceededException extends Exception {
    public SpeedLimitExceededException(String message) {
        super(message);
    }

    public SpeedLimitExceededException(String message, Throwable cause) {
        super(message, cause);
    }
}
