/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jocelyn
 */
public class PhanSo {
    private int ts, ms;

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public PhanSo() {
        this(0, 1);
    }
    
    public PhanSo cong(PhanSo ps){
        quyDong(ps);
        PhanSo kq = new PhanSo(ts + ps.ts, ms);
        toiGian(); ps.toiGian();
        return kq;
    }
    
    public PhanSo tru(PhanSo ps){
        quyDong(ps);
        PhanSo kq = new PhanSo(ts - ps.ts, ms);
        toiGian(); ps.toiGian();
        return kq;
    }
    
    public PhanSo nhan(PhanSo ps){
        PhanSo kq = new PhanSo(ts * ps.ts, ms * ps.ms);
        return kq.toiGian();
    }
    
    public PhanSo chia(PhanSo ps){
        return nhan(ps.nghicDao());
    }
    
    public PhanSo nghicDao(){
        int tmp = ts; ts = ms; ms = tmp;
        return new PhanSo(ts, ms);
    }
    
    public PhanSo toiGian(){
        int usc = ucln(ts, ms);
        ts /= usc; ms /= usc;
        return new PhanSo(ts, ms);
    }
    
    private int ucln(int a, int b){
        return b == 0 ? a : ucln(b, a % b);
    }
    
    private int bcnn(int a, int b){
        return a * b / ucln(a, b);
    }
    
    private void quyDong(PhanSo ps){
        int bsc = bcnn(ms, ps.ms);
        ts *= bsc / ms; ps.ts *= bsc / ps.ms;
        ms = ps.ms = bsc;
    }
    
    public boolean bangNhau(PhanSo ps){
        quyDong(ps);
        int t1 = ts, t2 = ps.ts;
        toiGian(); ps.toiGian();
        return t1 == t2;
    }
    
    public boolean lonHon(PhanSo ps){
        quyDong(ps);
        int t1 = ts, t2 = ps.ts;
        toiGian(); ps.toiGian();
        return t1 > t2;
    }
    
    public boolean nhoHon(PhanSo ps){
        return !bangNhau(ps) && !lonHon(ps);
    }
    
    public void hien(){
        System.out.println(ts + "/" + ms);
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer(input.next(), "/");
        ts = Integer.parseInt(tokenizer.nextToken());
        ms = Integer.parseInt(tokenizer.nextToken());
    }
}
