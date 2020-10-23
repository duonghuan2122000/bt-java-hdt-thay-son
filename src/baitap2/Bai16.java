/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class Bai16 {
    public static List<MatHang> docFile(String filename) throws FileNotFoundException{
        Scanner input = new Scanner(new File(filename));
        List<MatHang> ds = new ArrayList<>();
        while(input.hasNextLine()){
            int maHang = Integer.parseInt(input.nextLine());
            String ten = input.nextLine();
            String nhom = input.nextLine();
            double giaBan = Double.parseDouble(input.nextLine());
            try {
                MatHang mh = new MatHang(maHang, ten, nhom, giaBan);
                ds.add(mh);
            } catch (Exception ex) {
                
            }
            
        }
        return ds;
    }
    
    public static void inDsMH(List<MatHang> l){
        for(MatHang mh: l){
            System.out.println(mh.toString());
        }
    }
    
    public static void sapXepGiaBanGiam(List<MatHang> l){
        l.sort(new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.soSanhGia(o1);
            }
            
        });
    }
    
    public static void ghiFileSX(List<MatHang> l) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("SX-BAI16.OUT"));
        for(MatHang mh: l){
            pw.println(mh.toString());
        }
        pw.flush();
        pw.close();
    }
    
    public static void sapXepTheoNhom(List<MatHang> l){
        l.sort(new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.soSanhNhom(o2) & o1.soSanhTen(o2);
            }
            
        });
    }
    
    public static void ghiFileNHOM(List<MatHang> l) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("NHOM.OUT"));
        for(MatHang mh: l){
            pw.println(mh.toString());
        }
        pw.flush();
        pw.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        List<MatHang> ds = docFile("MH.INP");
        inDsMH(ds);
        sapXepGiaBanGiam(ds);
        ghiFileSX(ds);
        sapXepTheoNhom(ds);
        ghiFileNHOM(ds);
    }
}
