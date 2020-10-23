/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class Bai10 {
    static Scanner input = new Scanner(System.in);
    
    public static MyPoint nhapDiem(){
        return new MyPoint(input.nextDouble(), input.nextDouble());
    }
    
    public static List<MyPoint> nhapDsDiem(int n){
        List<MyPoint> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ds.add(nhapDiem());
        }
        return ds;
    }
    
    public static void main(String[] args) {
        List<MyPoint> ds = nhapDsDiem(input.nextInt());
        double max = 0;
        MyPoint p1 = new MyPoint(), p2 = new MyPoint();
        for(int i = 0; i < ds.size() - 1; i++){
            for(int j = i + 1; j < ds.size(); j++){
                double tmp = MyPoint.distance(ds.get(i), ds.get(j));
                if(tmp > max){
                    max = tmp;
                    p1 = ds.get(i);
                    p2 = ds.get(j);
                }
            }
        }
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(max);
    }
}
