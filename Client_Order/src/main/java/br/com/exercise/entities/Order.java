package br.com.exercise.entities;

import br.com.exercise.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itemsList = new ArrayList<>();
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order() {
    }

    public Order(LocalDate moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        itemsList.add(item);
    }

    public void removeItem(OrderItem item) {
        itemsList.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem item : itemsList) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(dtf.format(moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(status);
        sb.append("\n");
        sb.append("Client: ");
        sb.append(client);
        sb.append("\n");
        sb.append("Order Items: ");
        for (OrderItem it : itemsList) {
            sb.append(it);
        }
        sb.append("Total price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
