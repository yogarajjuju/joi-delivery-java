package com.tw.joi.delivery.model;

import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private Store store;
    private List<Item> items;
    private float totalAmount;
    private OrderStatus status;

    public Order() {}

    public Order(String orderId, Customer customer, Store store, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.store = store;
        this.items = items;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public Store getStore() { return store; }
    public void setStore(Store store) { this.store = store; }
    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }

    public float calculateTotal() {
        float total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        if(total > 500) {
            total = total - (total * 10 / 100);
        }
        return total;
    }
}
