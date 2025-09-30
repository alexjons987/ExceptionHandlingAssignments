package assignment.bank;

public class BankAccount {
    int balance = 0;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException(
                    String.format("Tried withdrawing more than current balance (%d > %d)", amount, this.balance)
            );
        }

        this.balance = balance - amount;
        return amount;
    }
}
