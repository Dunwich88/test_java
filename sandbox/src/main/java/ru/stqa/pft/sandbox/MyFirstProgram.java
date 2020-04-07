package ru.stqa.pft.sandbox;

import java.util.concurrent.RecursiveAction;

public class MyFirstProgram {
    public static void main(String[] args) {

        hello("PIDARASINA");
        Square s = new Square(5);
        System.out.println("Square area with side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 10);
        System.out.println("Rectangle area with sides " + r.a + " and " + r.b + " = " + r.area());

        Point p1 = new Point(1,4);
        Point p2 = new Point(3,7);
        System.out.println("Distance between two points = " + distance(p1,p2));

    }

    public static void hello(String somebody) {
        System.out.println("Howdy, " + somebody + "!");
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((Math.pow((p1.x2 - p1.x1), 2) + Math.pow((p2.x2 - p2.x1), 2)));
    }

        }




