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
public class SoPhuc {

    private float a, b;

    public SoPhuc(float thuc, float ao) {
        this.a = thuc;
        this.b = ao;
    }

    public SoPhuc() {
        this(0, 0);
    }

    public SoPhuc cong(SoPhuc sp) {
        return new SoPhuc(a + sp.a, b + sp.b);
    }

    public SoPhuc tru(SoPhuc sp) {
        return new SoPhuc(a - sp.a, b - sp.b);
    }

    public SoPhuc nhan(SoPhuc sp) {
        return new SoPhuc(a * sp.a - b * sp.b, a * sp.b + sp.a * b);
    }

    public SoPhuc chia(SoPhuc sp) {
        return nhan(sp.nghichDao());
    }

    public SoPhuc nghichDao() {
        // (a^2 + b^2)^(1/2)
        float tmp = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return new SoPhuc(a / tmp, -b / tmp);
    }

    public boolean bangNhau(SoPhuc sp) {
        return a == sp.a && b == sp.b;
    }

    public boolean lonHon(SoPhuc sp) {
        return a > sp.a || (a == sp.a && b > sp.b);
    }

    public boolean nhoHon(SoPhuc sp) {
        return a < sp.a || (a == sp.a && b < sp.b);
    }

    public void hien() {
        System.out.println(a + " + j" + b);
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer(input.nextLine(), "+ j");
        a = Float.parseFloat(tokenizer.nextToken());
        b = Float.parseFloat(tokenizer.nextToken());
    }
}
