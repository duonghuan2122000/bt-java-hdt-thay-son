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
public class Bai13 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        ps1.nhap(); ps2.nhap();
        ps1.cong(ps2).hien();
        ps1.tru(ps2).hien();
        ps1.nhan(ps2).hien();
        ps1.chia(ps2).hien();
        ps1.toiGian().hien();
        ps2.toiGian().hien();
        if(ps1.lonHon(ps2)){
            System.out.println("PS1 > PS2");
        } else if(ps1.bangNhau(ps2)){
            System.out.println("PS1 = PS2");
        } else {
            System.out.println("PS1 < PS2");
        }
    }
}
