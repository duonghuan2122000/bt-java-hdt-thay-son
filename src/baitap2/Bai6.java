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
public class Bai6 {
    public static void chuyenSoNhiPhan(int n, StackOfIntegers soi){
        while(n > 0){
            soi.push(n % 2);
            n /= 2;
        }
    }
    
    public static void inStack(StackOfIntegers soi) {
        while(!soi.isEmpty()){
            System.out.print(soi.pop());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StackOfIntegers soi = new StackOfIntegers();
        chuyenSoNhiPhan(n, soi); 
        inStack(soi);
    }
}
