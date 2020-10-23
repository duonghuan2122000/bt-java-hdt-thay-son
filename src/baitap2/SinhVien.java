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
public class SinhVien {
    private int maSV;
    private String ten;
    private String lop;
    private String khoa;
    
    public SinhVien(){
        
    }

    public SinhVien(int maSV, String ten, String lop, String khoa) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", ten=" + ten + ", lop=" + lop + ", khoa=" + khoa + '}';
    }

    public int soSanhTen(SinhVien sv){
        return ten.compareTo(sv.ten);
    }
    
    public int soSanhLop(SinhVien sv){
        return lop.compareTo(sv.lop);
    }
}
