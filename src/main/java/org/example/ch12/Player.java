package org.example.ch12;

public class Player {
    public String name;
    public Rocket rightRocket;
    public Rocket leftRocket;

    public Player() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rocket getRightRocket() {
        return rightRocket;
    }

    public void setRightRocket(Rocket rightRocket) {
        this.rightRocket = rightRocket;
    }

    public Rocket getLeftRocket() {
        return leftRocket;
    }

    public void setLeftRocket(Rocket leftRocket) {
        this.leftRocket = leftRocket;
    }
}
