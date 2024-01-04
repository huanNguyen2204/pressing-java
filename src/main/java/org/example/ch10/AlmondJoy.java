package org.example.ch10;

class AlmondJoy {
    String name = "Huan Nguyen";
    private int introduced = 1946;

    class Coconut {
        void print() {
            System.out.println(name);
            System.out.println(introduced);
        }
    }

    public static void main(String[] args) {
        AlmondJoy almondJoy = new AlmondJoy();
        Coconut coconut = almondJoy.new Coconut();
        Coconut coconut1 = new AlmondJoy().new Coconut();
    }
}
