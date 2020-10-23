/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jocelyn
 */
public class Bai7 {
    public static int tinhtoan(int s1, int s2, char toanhang) {
        int kq = 0;
        switch (toanhang) {
            case '+':
                kq = s1 + s2;
                break;
            case '-':
                kq = s1 - s2; 
                break;
            case '*':
                kq = s1 * s2; 
                break;
            case '/':
                kq = s1 / s2;
                break;
            default:
                break;
        }
        return kq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bt = input.next();
        StackOfChars soc = new StackOfChars();
        Stack<Integer> s = new Stack();
        for (int i = 0; i < bt.length(); i++) {
            char c = bt.charAt(i);
            if (c == '(') {
                continue;
            } else if (c == ')') {
                int s2 = s.pop();
                char toanhang = soc.pop();
                int s1 = s.pop();
                s.push(tinhtoan(s1, s2, toanhang));
            } else if (c >= '0' && c <= '9') {
                s.push((int) c - '0');
            } else {
                soc.push(c);
            }
        }
        System.out.println(s.pop());
    }
}
