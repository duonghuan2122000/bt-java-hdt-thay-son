/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class Bai11 {
    private static boolean tamGiac(double x, double y, double z) {
        return x + y > z && x - y < z;
    }

    private static boolean tamGiacVuong(double x, double y, double z) {
        if (x > z) {
            return tamGiacVuong(z, y, x);
        }
        if (y > z) {
            return tamGiacVuong(x, z, y);
        }

        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
            return true;
        }
        return false;
    }

    private static boolean tamGiacVuongCan(double x, double y, double z) {
        if (tamGiacVuong(x, y, z)) {
            if (tamGiacCan(x, y, z)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tamGiacCan(double x, double y, double z) {
        return x == y || y == z || z == x;
    }

    private static boolean tamGiacDeu(double x, double y, double z) {
        return x == y && y == z;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyPoint p1 = new MyPoint(input.nextDouble(), input.nextDouble());
        MyPoint p2 = new MyPoint(input.nextDouble(), input.nextDouble());
        MyPoint p3 = new MyPoint(input.nextDouble(), input.nextDouble());

        double distance12 = MyPoint.distance(p1, p2);
        double distance13 = MyPoint.distance(p1, p3);
        double distance23 = MyPoint.distance(p2, p3);

        if (tamGiac(distance12, distance13, distance23)) {
            System.out.println("Khong phai tam giac");
        } else {
            if (tamGiacVuong(distance12, distance13, distance23)) {
                if (tamGiacVuongCan(distance12, distance13, distance23)) {
                    System.out.println("La tam giac vuong can");
                } else {
                    System.out.println("La tam giac vuong");
                }
            } else {
                if (tamGiacDeu(distance12, distance13, distance23)) {
                    System.out.println("La tam giac deu");
                } else if (tamGiacCan(distance12, distance13, distance23)) {
                    System.out.println("La tam giac can");
                } else {
                    System.out.println("La tam giac");
                }
            }
        }
    }
}
