import assignment.age.AgeCheck;
import assignment.age.UnderAgeException;

import assignment.bank.BankAccount;
import assignment.bank.InsufficientFundsException;

import assignment.password.PasswordUtil;
import assignment.password.PasswordTooShortException;
import assignment.password.PasswordMissingNumberException;

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
        } catch (PasswordTooShortException e) {
            e.printStackTrace();
        } catch (PasswordMissingNumberException e) {
            e.printStackTrace();
        }

        if (isValidPass) {
            System.out.println("Password is valid!");
        }
    }


}