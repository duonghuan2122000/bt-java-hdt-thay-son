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
public class Bai12 {

    static Scanner input = new Scanner(System.in);
    static Matrix m1, m2;

    public static void nhap2Matran() {
        m1 = new Matrix(input.nextInt(), input.nextInt());
        m1.input();
        m2 = new Matrix(input.nextInt(), input.nextInt());
        m2.input();
    }

    public static void main(String[] args) throws Exception {

        int c;

        for (;;) {
            do {
                c = input.nextInt();
            } while (c < 1 || c > 4);
            switch (c) {
                case 1:
                    nhap2Matran();
                    m1.add(m2).print();
                    m1.sub(m2).print();
                    break;
                case 2:
                    nhap2Matran();
                    m1.mul(m2).print();
                    break;
                case 3:
                    nhap2Matran();
                    m1.transpose().print();
                    m2.transpose().print();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
