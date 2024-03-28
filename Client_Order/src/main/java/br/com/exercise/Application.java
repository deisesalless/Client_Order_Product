package br.com.exercise;

import br.com.exercise.entities.Client;
import br.com.exercise.entities.Order;
import br.com.exercise.entities.OrderItem;
import br.com.exercise.entities.Product;
import br.com.exercise.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product product1 = new Product("TV", 1000.0);
        OrderItem order1 = new OrderItem(2, 1000.0, product1);
        System.out.println(order1);

        LocalDate data = LocalDate.of(2024, 3, 27);
        Client client1 = new Client("Deise", "deise@gmail.com", data);
        System.out.println(client1);

        OrderStatus status = OrderStatus.valueOf("PROCESSING");
        LocalDate data2 = LocalDate.of(2024,3,30);
        Order order = new Order(data2, status, client1);
        System.out.println(order);
    }
}
