package assignment.storage;

import exceptions.InvalidAmountException;
import exceptions.OutOfStockException;

public class Product {
    String name;
    int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void sell(int amount) throws OutOfStockException, InvalidAmountException {
        if (amount > this.quantity) {
            throw new OutOfStockException(
                    String.format("Tried selling more than current stock (%d > %d)", amount, this.quantity)
            );
        } else if (amount < 1) {
            throw new InvalidAmountException(
                    String.format("You cannot sell 0 or negative amounts: %d", amount)
            );
        }

        this.quantity -= amount;

        System.out.printf("Sold %d, new stock: %d%n", amount, this.quantity);
    }
}
