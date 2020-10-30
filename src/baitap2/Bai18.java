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
public class Bai18 {

    public static List<MonHoc> docFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        List<MonHoc> ds = new ArrayList<>();
        while (input.hasNextLine()) {
            try {
                int maMon = Integer.parseInt(input.nextLine());
                String tenMon = input.nextLine();
                String nhomMon = input.nextLine();
                int soTinChi = Integer.parseInt(input.nextLine());

                MonHoc mh = new MonHoc(maMon, tenMon, nhomMon, soTinChi);
                ds.add(mh);
            } catch (Exception ex) {

            }
        }
        return ds;
    }

    public static void inDs(List<MonHoc> l) {
        for (MonHoc mh : l) {
            System.out.println(mh.toString());
        }
    }

    public static void sapXepTheoTC(List<MonHoc> l) {
        l.sort(new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.soSanhTC(o2);
            }

        });
    }

    public static void ghiFile(List<MonHoc> l, String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(filename));
        for (MonHoc mh : l) {
            pw.println(mh.toString());
        }
        pw.flush();
        pw.close();
    }

    public static void sapXepTheoNhomMon(List<MonHoc> l) {
        l.sort(new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.soSanhTenMon(o2);
            }

        });
        l.sort(new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.soSanhNhomMon(o2);
            }

        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<MonHoc> ds = docFile("MH-BAI18.INP");
        inDs(ds);
        sapXepTheoTC(ds);
        ghiFile(ds, "SX-BAI18.OUT");
        sapXepTheoNhomMon(ds);
        ghiFile(ds, "NHOM-BAI18.OUT");
    }
}
