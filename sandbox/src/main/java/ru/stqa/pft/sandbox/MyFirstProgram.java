package ru.stqa.pft.sandbox;

import java.util.concurrent.RecursiveAction;

/*
AHAHAHA MEMASIKI PODKATILI
 */
public class MyFirstProgram {
    public static void main(String[] args) {

        hello("ПИДАРАСИНА");
        hello("Moherfucker");

        Square s = new Square(5);
        System.out.println("Square area with side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 10);
        System.out.println("Rectangle area with sides " + r.a + " and " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Howdy, " + somebody + "!");
    }

   /* public static double distance(Point p1, Point p2) {
        return Math.sqrt((Math.pow(2, (p2 - p1)) + Math.pow(2, (p2 - p1)));
    } */
}

