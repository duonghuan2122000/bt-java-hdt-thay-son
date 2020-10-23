/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.StringTokenizer;

/**
 *
 * @author Jocelyn
 */
public class SinhVien2 {

    private int maSV;
    private String ten, lop;
    private double dtb;

    public SinhVien2(int maSV, String ten, String lop, double dtb) throws Exception {
        if (cs(maSV) != 4) {
            throw new Exception("Ma SV phai co 4 chu so");
        }
        if (ten.isEmpty()) {
            throw new Exception("Ten khong duoc de trong");
        }
        if (!tenDayDu(ten)) {
            throw new Exception("Ten phai gom ca ho va ten");
        }
        if (!lop.matches("^([A-Z]{1})([0-9]{2})([A-Z]{4})([0-9]{2})$")) {
            throw new Exception("Lop khong dung dinh dang");
        }
        if (dtb < 0 || dtb > 10) {
            throw new Exception("DTB phai la so trong khoang tu 0 den 10");
        }
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.dtb = dtb;
    }

    public SinhVien2() {
    }

    private int cs(int n) {
        int i = 0;
        while (n > 0) {
            n /= 10;
            i++;
        }
        return i;
    }

    private boolean tenDayDu(String ht) {
        StringTokenizer tokenizer = new StringTokenizer(ht);
        return tokenizer.countTokens() >= 2;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + dtb;
    }

    public void print() {
        System.out.println(maSV + " " + ten + " " + lop + " " + dtb);
    }

    public int soSanhLop(SinhVien2 sv) {
        return lop.compareTo(sv.lop);
    }

    public int soSanhDtb(SinhVien2 sv) {
        return dtb > sv.dtb ? 1 : (dtb == sv.dtb ? 0 : -1);
    }

    private String[] tachTen() {
        StringTokenizer tokenizer = new StringTokenizer(ten);
        String[] ht = new String[2];
        int i = 0;
        StringBuilder ho = new StringBuilder();
        while (i < tokenizer.countTokens() - 1) {
            ho.append(tokenizer.nextToken());
            i++;
        }
        ht[0] = ho.toString();
        ht[1] = tokenizer.nextToken();
        return ht;
    }

    public int soSanhTen(SinhVien2 sv) {
        String[] ht = tachTen();
        String[] ht2 = sv.tachTen();
        if (ht[1].equals(ht2[1])) {
            return ht[0].compareTo(ht2[0]);
        } else {
            return ht[1].compareTo(ht2[1]);
        }
    }

    private int phanLoaiDiem() {
        if (dtb < 5) {
            // Yeu
            return 0;
        } else if (dtb >= 5 && dtb < 7) {
            // Trung binh
            return 1;
        } else if (dtb >= 7 && dtb < 8) {
            // Kha
            return 2;
        } else {
            // Gioi
            return 3;
        }
    }

    public int soSanhPL(SinhVien2 sv) {
        int pl = phanLoaiDiem();
        int pl2 = sv.phanLoaiDiem();
        return pl > pl2 ? 1 : (pl == pl2 ? 0 : -1);
    }

}
