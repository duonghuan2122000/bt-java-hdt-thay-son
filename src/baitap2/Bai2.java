/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class Bai2 {
    static Scanner input = new Scanner(System.in);
    
    public static SinhVien nhapSV(){
        int maSV = Integer.parseInt(input.nextLine());
        String ten = input.nextLine();
        String lop = input.nextLine();
        String khoa = input.nextLine();
        SinhVien sv = new SinhVien(maSV, ten, lop, khoa);
        return sv;
    }
    
    public static List<SinhVien> nhapDsSV(int n){
        List<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien sv = nhapSV();
            ds.add(sv);
        }
        return ds;
    }
    
    public static void sapXepTheoTen(List<SinhVien> l){
        l.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.soSanhTen(o2);
            }
            
        });
    }
    
    public static void inDsSVTheoLop(List<SinhVien> l){
        l.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.soSanhLop(o2);
            }
            
        });
        
        for(SinhVien sv: l){
            System.out.println(sv.toString());
        }
    }
    
    public static void main(String[] args) {
        List<SinhVien> dsSV = nhapDsSV(Integer.parseInt(input.nextLine()));
        sapXepTheoTen(dsSV);
        inDsSVTheoLop(dsSV);
    }
}
