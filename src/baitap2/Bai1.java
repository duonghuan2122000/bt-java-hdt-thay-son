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
public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maSV = Integer.parseInt(input.nextLine());
        String ten = input.nextLine();
        String lop = input.nextLine();
        String khoa = input.nextLine();
        SinhVien sv = new SinhVien(maSV, ten, lop, khoa);
        System.out.println(sv.toString());
    }
}
