package org.andestech.learning.rfb18.g2;

public class Circle extends Figure{

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    private double r;

    @Override
    double square() {
        return Math.PI*r*r;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*r;
    }
}
