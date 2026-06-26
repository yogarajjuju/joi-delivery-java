package com.tw.joi.delivery.problems;

import com.tw.joi.delivery.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

class OrderTest {

    @Test
    void shouldCalculateTotalCorrectly() {
        // create items
        Item keyboard = new Item("1" , "Keyboard", "" , 50);
         Item mouse = new Item("2", "Mouse", "", 25);
        List<Item> items = new ArrayList<>();
        items.add(keyboard);
        items.add(mouse);

        
        Order order = new Order("ORD001", null, null, items);


        assertEquals(75.0f ,order.calculateTotal());

        }


        // assertEquals(expected, actual)
    }

