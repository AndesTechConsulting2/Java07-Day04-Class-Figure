package org.andestech.learning.rfb18.g2;

public class Rectangle extends Figure{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double b;

    @Override
    double square() {
        return a*b;
    }

    @Override
    double perimeter() {
        return 2*(a+b);
    }
}
