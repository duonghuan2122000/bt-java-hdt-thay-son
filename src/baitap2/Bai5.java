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
public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StackOfIntegers soi = new StackOfIntegers();
        int i = 2;
        while(n > 1){
            if(n % i == 0){
                soi.push(i);
                n /= i;
            } else {
                i++;
            }
        }
        while(!soi.isEmpty()){
            System.out.print(soi.pop() + " ");
        }
    }
}
