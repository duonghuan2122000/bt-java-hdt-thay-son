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
public class Bai15 {

    public static List<SinhVien2> docFile(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        List<SinhVien2> ds = new ArrayList<>();
        while (input.hasNextLine()) {
            try {
                int maSV = Integer.parseInt(input.nextLine());
                String ten = input.nextLine();
                String lop = input.nextLine();
                double dtb = Double.parseDouble(input.nextLine());

                SinhVien2 sv = new SinhVien2(maSV, ten, lop, dtb);
                ds.add(sv);
            } catch (Exception ex) {
//                Logger.getLogger(Bai15.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ds;
    }

    public static void inSV(List<SinhVien2> l) {
        for (SinhVien2 sv : l) {
            sv.print();
        }
    }

    public static void sapXepLopVaDiem(List<SinhVien2> l) {
        l.sort(new Comparator<SinhVien2>() {
            @Override
            public int compare(SinhVien2 o1, SinhVien2 o2) {
                return o2.soSanhDtb(o1);
            }

        });

        l.sort(new Comparator<SinhVien2>() {
            @Override
            public int compare(SinhVien2 o1, SinhVien2 o2) {
                return o1.soSanhLop(o2);
            }

        });
    }

    public static void ghiFileSX(List<SinhVien2> l) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("SX.OUT"));
        for (SinhVien2 sv : l) {
            pw.println(sv.toString());
        }
        pw.flush();
        pw.close();
    }

    public static void sapXepTheoDiemPL(List<SinhVien2> l) {
        l.sort(new Comparator<SinhVien2>() {
            @Override
            public int compare(SinhVien2 o1, SinhVien2 o2) {
                return o2.soSanhPL(o1);
            }

        });
    }

    public static void sapXepTheoTen(List<SinhVien2> l) {
        l.sort(new Comparator<SinhVien2>() {
            @Override
            public int compare(SinhVien2 o1, SinhVien2 o2) {
                return o1.soSanhTen(o2);
            }

        });
    }

    public static void ghiFileXL(List<SinhVien2> l) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("XEPLOAI.OUT"));
        for (SinhVien2 sv : l) {
            pw.write(sv.toString() + "\n");
        }
        pw.flush();
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<SinhVien2> ds = docFile("SV.INP");
        inSV(ds);
        sapXepLopVaDiem(ds);
        ghiFileSX(ds);
        sapXepTheoTen(ds);
        sapXepTheoDiemPL(ds);

        ghiFileXL(ds);
    }
}
