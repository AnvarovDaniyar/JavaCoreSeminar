package org.example.hw4.ex2;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        Customer customer1 = new Customer("Roma");
        Customer customer2 = new Customer("Petya");
        customers.add(customer1);
        customers.add(customer2);

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);
        products.add(product1);
        products.add(product2);

        try {
            Order order1 = Order.createOrder(customer1, product1, 2);
            orders.add(order1);
            System.out.println("Покупка 1: " + order1);

            Order order2 = Order.createOrder(customer2, product2, -1); // Ошибка: отрицательное количество товара
            System.out.println("Покупка 2: " + order2); // Не достигнется из-за исключения
        } catch (InvalidCustomerException | InvalidProductException | NegativeQuantityException e) {
            System.out.println("Ошибка при создании заказа: " + e.getMessage());
        }

        int totalPurchases = orders.size();
        System.out.println("Итоговое количество совершенных покупок: " + totalPurchases);
    }
}