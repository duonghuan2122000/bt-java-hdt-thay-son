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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jocelyn
 */
public class Bai17 {

    public static List<Sach> docFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        List<Sach> ds = new ArrayList<>();
        while (input.hasNextLine()) {
            try {
                int maSach = Integer.parseInt(input.nextLine());
                String tenSach = input.nextLine();
                String chuyenNganh = input.nextLine();
                double giaBan = Double.parseDouble(input.nextLine());

                Sach s = new Sach(maSach, tenSach, chuyenNganh, giaBan);
                ds.add(s);
            } catch (Exception ex) {

            }
        }
        return ds;
    }

    public static void inDs(List<Sach> l) {
        for (Sach s : l) {
            System.out.println(s.toString());
        }
    }

    public static void ghiFile(List<Sach> l, String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(filename));
        for (Sach s : l) {
            pw.println(s.toString());
        }
        pw.flush();
        pw.close();
    }

    public static void sapXepTheoGia(List<Sach> l) {
        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o2.soSanhGia(o1);
            }

        });
    }

    public static void sapXepTheoCN(List<Sach> l) {
        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.soSanhTen(o2);
            }

        });

        l.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.soSanhCN(o2);
            }

        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Sach> ds = docFile("SACH.INP");
        inDs(ds);
        sapXepTheoGia(ds);
        ghiFile(ds, "SX-BAI17.OUT");
        sapXepTheoCN(ds);
        ghiFile(ds, "CN.OUT");
    }
}
