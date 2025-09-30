import assignment.age.AgeCheck;
import assignment.age.UnderAgeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assignment 1 - Age Check
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        try {
            AgeCheck.isAdult(userAge);
            System.out.println("Successfully registered!");
        } catch (UnderAgeException e) {
            System.out.println("You are too young to register!");
            e.printStackTrace();
        }
    }
}