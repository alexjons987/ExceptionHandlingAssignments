import assignment.age.AgeCheck;
import assignment.car.Car;
import assignment.division.MyMath;
import assignment.email.EmailUtil;
import assignment.telephone.PhoneUtil;
import exceptions.*;

import assignment.bank.BankAccount;

import assignment.password.PasswordUtil;

import assignment.storage.Product;

import assignment.temperature.TempUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assignment 1 - Age check
        System.out.print("Enter your age: ");
        int userAge = Integer.parseInt(scanner.next());

        try {
            AgeCheck.isAdult(userAge);
            System.out.println("Successfully registered!");
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }

        // Assignment 2 - Bank account
        BankAccount bankAccount = new BankAccount(100);
        System.out.printf("Account balance: %d%nEnter how much you'd like to withdraw: ", bankAccount.getBalance());

        try {
            bankAccount.withdraw(Integer.parseInt(scanner.next()));
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

        // Assignment 3 - Password check
        System.out.print("Enter your password: ");
        String password = scanner.next();

        boolean isValidPass = false;
        try {
            isValidPass = PasswordUtil.isPasswordValid(password);
        } catch (PasswordTooShortException | PasswordMissingNumberException e) {
            e.printStackTrace();
        }

        if (isValidPass) {
            System.out.println("Password is valid!");
        }

        // Assignment 4 - Temperature check
        System.out.print("Enter temperature (°C): ");
        int temperature = Integer.parseInt(scanner.next());

        try {
            TempUtil.isAcceptableTemp(temperature);
            System.out.println("Normal temps!");
        } catch (BelowAbsoluteZeroException | TooHotException e) {
            e.printStackTrace();
        }

        // Assignment 5 - Storage facility
        Product genericProduct = new Product("Some product", 10);
        try {
            genericProduct.sell(5); // OK
            genericProduct.sell(10); // Exception
        } catch (InvalidAmountException | OutOfStockException e) {
            e.printStackTrace();
        }

        // Assignment 6 - Division
        try {
            MyMath.division(1, 2); // OK
            MyMath.division(1, 0); // Exception
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }

        // Assignment 7 - Car speed
        Car car = new Car();
        try {
            car.setSpeed(300);
            car.setSpeed(305);
        } catch (SpeedLimitExceededException e) {
            e.printStackTrace();
        }

        // Assignment 8 - Telephone number
        try {
            PhoneUtil.validatePhoneNumber("1234567890");
            PhoneUtil.validatePhoneNumber("123");
        } catch (InvalidPhoneNumberException | NotNumericException e) {
            e.printStackTrace();
        }

        // Assignment 9 - E-mail address
        try {
            EmailUtil.checkEmail("alexjons987@gmail.com");
            EmailUtil.checkEmail("alexjons987@exception.xyz");
        } catch (UnsupportedDomainException | MissingAtSymbolException e) {
            e.printStackTrace();
        }

        // Assignment 10 - Cooking
    }
}
