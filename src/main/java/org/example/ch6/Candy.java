package org.example.ch6;

public class Candy {
    private String name;
    private int price;
    private int quantity = 1;

    public Candy() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 1) {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return this.quantity;
    }
}
