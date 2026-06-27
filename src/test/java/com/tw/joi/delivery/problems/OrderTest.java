package com.tw.joi.delivery.problems;

import com.tw.joi.delivery.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

class OrderTest {

    @Test
    void shouldCalculateTotalCorrectly() {
        Item keyboard = new Item("1", "Keyboard", "", 50);
        Item mouse = new Item("2", "Mouse", "", 25);
        List<Item> items = new ArrayList<>();
        items.add(keyboard);
        items.add(mouse);
        Order order = new Order("ORD001", null, null, items);
        assertEquals(75.0f, order.calculateTotal());
    }

    @Test
    void shouldApplyDiscountWhenTotalIsAbove500() {
        Item monitor = new Item("4", "Monitor", "", 75);
        List<Item> items = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            items.add(monitor);
        }
        Order order = new Order("ORD002", null, null, items);
        assertEquals(540.0f, order.calculateTotal());
    }

    @Test
    void shouldAddDeliveryChargeToTotal() {
        Customer customer = new Customer("C1", "Yogaraj", "S");
        customer.setZone("ZoneA");
        Store store = new Store("3", "ZoneC", null);
        Item keyboard = new Item("2", "Keyboard", "", 50);
        Item mouse = new Item("3", "Mouse", "", 25);
        List<Item> items = new ArrayList<>();
        items.add(keyboard);
        items.add(mouse);
        Order order = new Order("ORD003", customer, store, items);
        assertEquals(135.0f, order.calculateTotal());
    }
}
