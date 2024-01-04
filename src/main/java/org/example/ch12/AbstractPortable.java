package org.example.ch12;

interface Portable {
    double getWeight();
    void setWeight(double weight);
}

abstract class AbstractPortable implements Portable {
    private double weight;

    @Override
    public double getWeight() { return weight; }

    @Override
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() {
        return getClass().getName() + "[weight=" + weight + "]";
    }
}

class Pen extends AbstractPortable {}
class Cup extends AbstractPortable {}
