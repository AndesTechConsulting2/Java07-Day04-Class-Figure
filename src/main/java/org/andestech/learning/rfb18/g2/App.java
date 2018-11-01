package org.andestech.learning.rfb18.g2;

/**
 * Hello world!
 *
 */
public class App

{
    private static void testFigure(Figure f)
    {
        System.out.println("-----------------------------------------------");
        System.out.println(f.getSP());
    }


    private static void testFigure2(Object o)
    {
        System.out.println("-----------------------------------------------");
        System.out.println(((Figure)o).getSP());
    }

    public static void main( String[] args )
    {

        Figure f1 = new Circle(100);
        ((Circle)f1).setR(1);
        System.out.println(f1.getSP());


        f1 = new Rectangle(1,2);
        System.out.println(f1.getSP());


        testFigure2(new Circle(100));
        testFigure2(new Rectangle(1,5));

        //Circle c3 = (Circle)"ssss";

        //testFigure("kjasdkj");



    }
}
