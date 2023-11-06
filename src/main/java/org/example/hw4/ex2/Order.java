package org.example.hw4.ex2;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    private Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public static Order createOrder(Customer customer, Product product, int quantity)
            throws InvalidCustomerException, InvalidProductException, NegativeQuantityException {
        if (customer == null) {
            throw new InvalidCustomerException("Несуществующий покупатель");
        }

        if (product == null) {
            throw new InvalidProductException("Несуществующий товар");
        }

        if (quantity <= 0) {
            throw new NegativeQuantityException("Отрицательное количество товара");
        }

        return new Order(customer, product, quantity);
    }

    @Override
    public String toString() {
        return "Заказ: " + customer.getName() + " купил " + quantity + " " + product.getName() + " за $" + (quantity * product.getPrice());
    }
}
class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String message) {
        super(message);
    }
}

class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}

class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message) {
        super(message);
    }
}
