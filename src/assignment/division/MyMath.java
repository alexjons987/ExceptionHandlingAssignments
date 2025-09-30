package assignment.division;

import exceptions.DivisionByZeroException;

public class MyMath {
    public static void division(int x, int y) throws DivisionByZeroException {
        if (y == 0) {
            throw new DivisionByZeroException("Cannot divide by 0");
        }
        System.out.println((double) x / y);
    }

    public static void division(double x, double y) throws DivisionByZeroException {
        if (y == 0) {
            throw new DivisionByZeroException("Cannot divide by 0");
        }
        System.out.println(x / y);
    }
}
