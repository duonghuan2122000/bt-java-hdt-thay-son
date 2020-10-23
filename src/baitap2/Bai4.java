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
public class Bai4 {
    public static boolean nt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StackOfIntegers soi = new StackOfIntegers();
        for(int i = 2; i <= n; i++){
            if(nt(i)){
                soi.push(i);
            }
        }
        while(!soi.isEmpty()){
            System.out.println(soi.pop());
        }
    }
}
