/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        StackOfChars kq= new StackOfChars();
        System.out.println("Nhap so t: ");
        int t=in.nextInt();
        System.out.println("Nhap co so: ");
        int b=in.nextInt();
        while(t>0){
            int mo=t%b;
            char y = 48;
            char x= 65;
            if(mo>10){
                x+=mo%10;
                kq.push(x);
            }
            else{
             y+=mo;
             kq.push(y);   
            }
            t/=b;
        }
        while(!kq.isEmpty()){
            System.out.print(kq.pop());
        }
    }
}