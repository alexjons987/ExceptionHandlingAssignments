import assignment.age.AgeCheck;
import exceptions.UnderAgeException;

import assignment.bank.BankAccount;
import exceptions.InsufficientFundsException;

import assignment.password.PasswordUtil;
import exceptions.PasswordTooShortException;
import exceptions.PasswordMissingNumberException;

import assignment.storage.Product;
import exceptions.InvalidAmountException;
import exceptions.OutOfStockException;

import assignment.temperature.TempUtil;
import exceptions.BelowAbsoluteZeroException;
import exceptions.TooHotException;

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
            genericProduct.sell(10); // Will throw exception
        } catch (InvalidAmountException | OutOfStockException e) {
            e.printStackTrace();
        }
    }
}
