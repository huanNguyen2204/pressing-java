package org.example.ch6;

public class Joystick {
    int numberOfButtons = 6;

    Joystick() {}

    Joystick(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    Joystick(String producer) {
        numberOfButtons = 6;
    }
}
