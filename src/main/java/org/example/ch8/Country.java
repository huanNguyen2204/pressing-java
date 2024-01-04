package org.example.ch8;

public enum Country {
    GERMANY, UK, CHINA;

    public static Country getDefault() { return GERMANY; }
    public static Country random() { return values() [(int) (Math.random() * 3)]; }

    {
        System.out.println("Object initializers");
    }

    static {
        System.out.println("Class initializers");
    }

    private Country() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println(GERMANY);
    }

    public String getISO3Country() {
        return switch (this) {
            case GERMANY -> "DEU";
            case UK -> "GBR";
            default -> "CHN";
        };
    }
}

