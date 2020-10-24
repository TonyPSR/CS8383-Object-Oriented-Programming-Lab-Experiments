package com.company.tonypsr;
import java.util.Scanner;


class Student {
    private String name;
    private long rollno;
    private int mark;
    void getDetails() throws MarkException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Roll no:");
        rollno=sc.nextLong();
        System.out.println("Enter Mark:");
        mark=sc.nextInt();
        if(mark<0 || mark>100) {
            throw new MarkException(mark);
        }
    }
    void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Mark: "+mark);
    }

}
