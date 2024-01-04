package org.example.ch6;

public class Chapter6 {
    public static void main(String[] args) {
        Candy lollipop = new Candy();
        lollipop.setPrice(12);
        System.out.println(lollipop.getPrice() * lollipop.getQuantity());
    }
}
