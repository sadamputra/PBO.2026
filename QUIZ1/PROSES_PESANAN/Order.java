package QUIZ1.PROSES_PESANAN;

import java.util.Date;

public class Order {
    private int orderId;
    private float amount;
    private Date orderDate;
    private Customer customer; // Relasi Aggregation/Association ke Customer

    public Order(int orderId, float amount, Date orderDate, Customer customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public void createOrder() {
        System.out.println("Method createOrder() dijalankan.");
    }
    public void editOrder(int orderId) {
        System.out.println("Method editOrder() untuk Order ID " + orderId + " dijalankan.");
    }
}