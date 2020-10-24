package com.company.tonypsr;

public interface IStack {
    void push(int a);
    int pop();
    boolean isFull();
    boolean isEmpty();
    int peak();
    void printStack();
}
