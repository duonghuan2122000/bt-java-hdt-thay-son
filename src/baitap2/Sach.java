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
public class Sach {

    private int maSach;
    private String tenSach, chuyenNganh;
    private double giaBan;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String chuyenNganh, double giaBan) throws Exception {
        if (cs(maSach) != 4) {
            throw new Exception("Ma sach phai co 4 chu so");
        }
        if (tenSach.isEmpty()) {
            throw new Exception("Ten sach khong duoc de trong");
        }
        if (giaBan <= 0) {
            throw new Exception("Gia ban phai lon hon 0");
        }
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.chuyenNganh = chuyenNganh;
        this.giaBan = giaBan;
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
        return maSach + " " + tenSach + " " + chuyenNganh + " " + giaBan;
    }

    public int soSanhGia(Sach s) {
        return giaBan > s.giaBan ? 1 : (giaBan == s.giaBan ? 0 : -1);
    }
    
    public int soSanhCN(Sach s){
        return chuyenNganh.compareTo(s.chuyenNganh);
    }
    
    public int soSanhTen(Sach s){
        return tenSach.compareTo(s.tenSach);
    }
}
