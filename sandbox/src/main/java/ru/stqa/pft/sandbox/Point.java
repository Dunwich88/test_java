package ru.stqa.pft.sandbox;

public class Point {
    public double x1;
    public double x2;


    public Point (double x1, double x2) {

        this.x1 = x1;
        this.x2 = x2;
    }

    public double distance(Point otherPoint) {

        return Math.sqrt((Math.pow((this.x2 - this.x1), 2) + Math.pow((otherPoint.x2 - otherPoint.x1), 2)));

    }
}
