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
public class MonHoc {

    private int maMon;
    private String tenMon, nhomMon;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(int maMon, String tenMon, String nhomMon, int soTinChi) throws Exception {
        if (cs(maMon) != 4) {
            throw new Exception("Ma mon phai co 4 chu so");
        }
        if (tenMon.isEmpty()) {
            throw new Exception("Ten mon khong duoc de trong");
        }
        if (!nhomMon.equalsIgnoreCase("co ban") && !nhomMon.equalsIgnoreCase("co so nganh") && !nhomMon.equalsIgnoreCase("chuyen nganh") && !nhomMon.equalsIgnoreCase("ky nang mem")) {
            throw new Exception("Nhom mon khong hop le");
        }
        if (soTinChi < 1 || soTinChi > 7) {
            throw new Exception("So tin chi phai lon hon 0 va nho hon 7");
        }
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhomMon = nhomMon;
        this.soTinChi = soTinChi;
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
        return maMon + " " + tenMon + " " + nhomMon + " " + soTinChi;
    }

    public int soSanhTC(MonHoc mh) {
        return soTinChi > mh.soTinChi ? 1 : (soTinChi == mh.soTinChi ? 0 : -1);
    }

    public int soSanhNhomMon(MonHoc mh) {
        return nhomMon.compareTo(mh.nhomMon);
    }

    public int soSanhTenMon(MonHoc mh) {
        return tenMon.compareTo(mh.tenMon);
    }

}
