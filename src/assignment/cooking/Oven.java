package assignment.cooking;

import exceptions.InvalidTimeException;
import exceptions.TooColdException;
import exceptions.TooHotException;

public class Oven {
    public static void bake(int minutes, int temperature) throws InvalidTimeException, TooColdException, TooHotException {
        if (minutes < 1) {
            throw new InvalidTimeException("Time cannot be 0 or negative");
        } else if (temperature <= 50) {
            throw new TooColdException("Temperature is too low (food will not cook) in time");
        } else if (temperature > 300) {
            throw new TooHotException("Temperature is too hot (food will combust)");
        }

        System.out.printf("The food is ready in %d minutes at %d°C%n", minutes, temperature);
    }
}
