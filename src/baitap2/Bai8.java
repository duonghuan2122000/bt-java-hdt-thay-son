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
public class Bai8 {
    private static int priority(char toanhang) {
        if (toanhang == '*' || toanhang == '/') {
            return 2;
        } else if(toanhang == '+' || toanhang == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bt = input.next();
        StackOfChars soc = new StackOfChars();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bt.length(); i++) {
            char c = bt.charAt(i);
            if (c == '(') {
                soc.push(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while(!soc.isEmpty() && priority(c) <= priority(soc.peak())){
                    builder.append(soc.pop());
                }
                soc.push(c);
            } else if(c == ')'){
                while(soc.peak() != '('){
                    char th = soc.pop();
                    builder.append(th);
                }
                soc.pop();
            } else {
                builder.append(c);
            }
        }
        while(!soc.isEmpty()){
            builder.append(soc.pop());
        }
        System.out.println(builder.toString());
    }
}
