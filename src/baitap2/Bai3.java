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
public class Bai3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        String color = input.next();
        Rectangle hcn = new Rectangle(width, height, color);
        System.out.println(hcn.getWidth() + " " + hcn.getHeight() + " " + hcn.getColor() + " " + hcn.findArea() + " " + hcn.findPerimeter());
    }
}
