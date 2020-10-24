package com.company.tonypsr;

public class Main {

    public static void main(String[] args) {
        Num n = new Num();
        Integer[] i = {23, 20, 30, 33, 30, 36, 37, 27, 28, 38};
        Double[] d = {3.2, 4.5, 4.4, 6.5, 6.7, 9.6, 5.3};
        Character[] c = {'c', 's', 'x', 'e', 'p'};
        String[] s = {"Wick", "Mills", "Hunt", "Drake", "Mario"};
        System.out.println("The maximum Integer: " +n.max(i));
        System.out.println("The maximum Double: " +n.max(d));
        System.out.println("The maximum Character: " +n.max(c));
        System.out.println("The maximum String: " +n.max(s));
    }

}