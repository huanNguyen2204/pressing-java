package org.example.ch15;

import javax.swing.*;

public class Chapter15 {

    public static void main(String[] args) {
        System.out.println(YummyTester.testYumminess("Chris"));
        JOptionPane.showMessageDialog(null, YummyTester.testYumminess("Meiji"));
    }
}
