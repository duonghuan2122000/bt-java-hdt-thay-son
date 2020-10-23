/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author Jocelyn
 */
public class Matrix {

    private float[][] a;

    public Matrix(int rows, int cols) {
        this.a = new float[rows][cols];
    }

    public Matrix() {
        this(3, 3);
    }

    public Matrix add(Matrix m) throws Exception {
        if (a.length != m.a.length) {
            throw new Exception("Khong hop le ve so hang");
        }
        if (a[0].length != m.a[0].length) {
            throw new Exception("Khong hop le ve so cot");
        }

        Matrix kq = new Matrix(a.length, a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                kq.a[i][j] = a[i][j] + m.a[i][j];
            }
        }
        return kq;
    }

    public Matrix sub(Matrix m) throws Exception {
        if (a.length != m.a.length) {
            throw new Exception("Khong hop le ve so hang");
        }
        if (a[0].length != m.a[0].length) {
            throw new Exception("Khong hop le ve so cot");
        }

        Matrix kq = new Matrix(a.length, a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                kq.a[i][j] = a[i][j] - m.a[i][j];
            }
        }
        return kq;
    }

    public Matrix neg() {
        Matrix kq = new Matrix(a.length, a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                kq.a[i][j] = a[i][j] * (-1);
            }
        }
        return kq;
    }
    
    public Matrix transpose(){
        Matrix kq = new Matrix(a[0].length, a.length);
        for(int i = 0; i < a[0].length; i++){
            for(int j = 0; j < a.length; j++){
                kq.a[i][j] = a[j][i];
            }
        }
        return kq;
    }
    
    public Matrix mul(Matrix m) throws Exception{
        if(a[0].length != m.a.length){
            throw new Exception("Khong hop le ve so hang va cot");
        }
        Matrix kq = new Matrix(a.length, m.a[0].length);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < m.a[0].length; j++){
                float tmp = 0;
                for(int k = 0; k < a[0].length; k++){
                    tmp += a[i][k]*m.a[k][j];
                }
                kq.a[i][j] = tmp;
            }
        }
        return kq;
    }
    
    public void print(){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = input.nextFloat();
            }
        }
    }
}
