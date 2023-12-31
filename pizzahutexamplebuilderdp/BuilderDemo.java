package org.example.pizzahutexamplebuilderdp;

import java.io.IOException;

public class BuilderDemo {
//    https://www.javatpoint.com/builder-design-pattern
    public static void main(String[] args) throws IOException {
        OrderBuilder builder=new OrderBuilder();

        OrderedItems orderedItems=builder.preparePizza();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
    }
}
