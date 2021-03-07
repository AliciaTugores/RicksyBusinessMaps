package edu.pingpong;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher{

    private int stock = 100;
    private final double price = 10d;
    private final List<String> orders = new ArrayList<>();

    @Override
    public void dispatch(CreditCard card) {
        if (this.stock > 0 && card.pay(this.price)) {
            this.stock -= 1;
            this.orders.add(card.getOwner());
        }
    }

    @Override
    public String toString() {
        return "stock: " + this.stock +
                "\n" + this.orders.toString();
    }
}
