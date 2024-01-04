package org.example.ch8;

public enum GameCurrency {
    EURO() {
        @Override
        public double convertTo(GameCurrency targetCurrency, double value) {
            return targetCurrency == EURO ? value : value / 2;
        }
    },

    PONODOLLAR() {
        @Override
        public double convertTo(GameCurrency targetCurrency, double value) {
            return targetCurrency == PONODOLLAR ? value : value / 2;
        }
    };

    public abstract double convertTo(GameCurrency targetCurrency, double value);

    public static void main(String[] args) {
        System.out.println(EURO.convertTo(EURO, 12));
        System.out.println(EURO.convertTo(PONODOLLAR, 12));
        System.out.println(PONODOLLAR.convertTo(EURO, 12));
        System.out.println(PONODOLLAR.convertTo(PONODOLLAR, 12));
    }
}
