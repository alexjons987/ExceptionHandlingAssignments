package assignment.age;

import exceptions.UnderAgeException;

public class AgeCheck {
    public static boolean isAdult(int age) throws UnderAgeException {
        if (age >= 18) {
            return true;
        } else {
            throw new UnderAgeException("You are too young to register.");
        }
    }
}
