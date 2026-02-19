package main;

import java.util.ArrayList;

public class Order {


    private ArrayList<MenuItem> orderItems;

    public Order() {


        orderItems = new ArrayList<>();

    }


    public int getNumberOfItems() {

        return orderItems.size();

    }


    public void addItem(MenuItem mi) {

        orderItems.add(mi);

    }

    public double getSubtotal() {

        double sum = 0;

        for(MenuItem m : orderItems) {
            sum += m.getPrice();
        }

        return sum;
    }

}
