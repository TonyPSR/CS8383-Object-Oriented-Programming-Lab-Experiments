package com.company.tonypsr;

public class Stack implements IStack{
    private int[] array;
    private int top;
    private int maxSize;
    
    public Stack(int size){
        maxSize = size;
        array = new int[size];
        top = -1;
    }
    
    public void push(int a){
        try{
            top += 1;
            array[top] = a;
        }catch (Exception e){
            System.out.println("Stack Overflow!");
            top--;
        }
    }
    
    public int pop(){
        int temp = -95456154;
        try{
            temp = array[top];
            top--;
        }catch (Exception e){
            System.out.println("Stack Underflow");
            top++;
        }
        return temp;
    }
    
    public boolean isFull(){
        return (top > (maxSize-1));
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public int peak(){
        return array[top];
    }
    
    public void printStack(){
        System.out.println();
        for(int i=top; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
