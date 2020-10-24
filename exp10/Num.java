package com.company.tonypsr;

public class Num {
    public<T extends Comparable> T max(T[] a){
        T max = a[0];
        for (int i=1; i<a.length; i++){
            if(a[i].compareTo(max) > 0){
                max = a[i];
            }
        }
        return max;
    }
}
