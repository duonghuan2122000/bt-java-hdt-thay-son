/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Jocelyn
 */
public class MatHang {

    private int maHang;
    private String ten;
    private String nhom;
    private double giaBan;

    public MatHang(int maHang, String ten, String nhom, double giaBan) throws Exception {
        if (cs(maHang) != 4) {
            throw new Exception("Ma hang phai co 4 chu so");
        }
        if (ten.isEmpty()) {
            throw new Exception("Ten hang khong duoc de trong");
        }
        if (!nhom.equalsIgnoreCase("hang tieu dung") && !nhom.equalsIgnoreCase("hang thoi trang") && !nhom.equalsIgnoreCase("dien tu - dien lanh")) {
            throw new Exception("Nhom mat hang khong hop le");
        }
        if (giaBan <= 0) {
            throw new Exception("Gia ban phai lon hon 0");
        }
        this.maHang = maHang;
        this.ten = ten;
        this.nhom = nhom;
        this.giaBan = giaBan;
    }

    public MatHang() {
    }

    private int cs(int n) {
        int i = 0;
        while (n > 0) {
            n /= 10;
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        return maHang + " " + ten + " " + nhom + " " + giaBan;
    }

    public int soSanhGia(MatHang mh) {
        return giaBan > mh.giaBan ? 1 : (giaBan == mh.giaBan ? 0 : -1);
    }
    
    public int soSanhNhom(MatHang mh){
        return nhom.compareTo(mh.nhom);
    }
    
    public int soSanhTen(MatHang mh){
        return ten.compareTo(mh.ten);
    }

}
