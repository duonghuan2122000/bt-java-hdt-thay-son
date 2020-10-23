/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Jocelyn
 */
public class MyPoint {

    private double x, y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public MyPoint(MyPoint p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt(
                Math.pow(x - secondPoint.x, 2)
                + Math.pow(y - secondPoint.y, 2)
        );
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(
                Math.pow(p1.x - p2.x, 2)
                + Math.pow(p1.y - p2.y, 2)
        );
    }
}
