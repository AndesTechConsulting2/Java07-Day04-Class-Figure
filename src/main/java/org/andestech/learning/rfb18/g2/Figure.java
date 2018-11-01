package org.andestech.learning.rfb18.g2;

public abstract class Figure {

    //..
    //..
    abstract double square();
    abstract double perimeter();

    public String getSP(){

        return "P=" + perimeter() +
                ", S=" + square();
    }

}
