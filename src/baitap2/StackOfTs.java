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
public class StackOfTs<T> {
    private T [] elements;
    private int size;
    
    public StackOfTs(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }
    
    public StackOfTs(){
        this(16);
    }
    
    public boolean isEmpty(){
        return this.size <= 0;
    }
    
    public boolean isFull(){
        return this.size >= this.elements.length;
    }
    
    public T peak(){
        return this.elements[this.size - 1];
    }
    
    public void push(T value){
        if(!isFull()){
            this.elements[size] = value;
            this.size++;
        }
    }
    
    public T pop(){
        T value = peak();
        this.elements[--size] = null;
        return value;
    }
    
    public int getSize(){
        return this.size;
    }
}
