package ru.stqa.pft.sandbox;

/*
AHAHAHA MEMASIKI PODKATILI
 */
public class MyFirstProgram {
    public static void main(String[] args) {

        hello("ПИДАРАСИНА");
        hello("Moherfucker");


        double l = 5;
        System.out.println("Square's area with side " + l + " = " + area(l));

        double a = 4;
        double b = 10;

        System.out.println("Area with sides " + a + " and " + b + " = " + area(a, b));

    }

    public static void hello(String somebody) {

        System.out.println("Howdy, " + somebody + "!");

    }

    public static double area(double len) {

        return len * len;

    }

    public static double area(double a, double b) {

        return a * b;
    }
}

