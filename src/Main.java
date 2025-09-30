import assignment.age.AgeCheck;
import assignment.age.UnderAgeException;
import assignment.bank.BankAccount;
import assignment.bank.InsufficientFundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assignment 1 - Age check
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

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
            bankAccount.withdraw(scanner.nextInt());
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}