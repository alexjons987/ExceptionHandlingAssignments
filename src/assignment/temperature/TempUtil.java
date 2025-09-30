package assignment.temperature;

public class TempUtil {
    public static boolean isAcceptableTemp(int temperature) throws BelowAbsoluteZeroException, TooHotException {
        if (temperature <= -273) {
            throw new BelowAbsoluteZeroException("Thats too cold man!");
        } else if (temperature >= 1000) {
            throw new TooHotException("That's too hot man!");
        }

        return true;
    }
}
