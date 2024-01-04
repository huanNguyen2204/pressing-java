package org.example.ch11;

public class Player implements Cloneable {
    public String name;
    public int age;

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
