package com.company.tonypsr;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Stack myStack;
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of slots:");
        myStack = new Stack(sc.nextInt());
        
        while(true){
            System.out.println("\n1.Push to Stack\n2.Pop from Stack\n3.Peak from Stack\n4.Print Stack\n"
                    + "5.Is the Stack full\n6.Is the Stack empty\n7.Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the number:");
                    num = sc.nextInt();
                    myStack.push(num);
                    break;
                case 2:
                    num = myStack.pop();
                    if(num == -95456154) {
                        System.out.println("Stack UnderFlow!");
                    }else{
                        System.out.println("Popped " + num + "from the Stack");
                    }
                    break;
                case 3:
                    num = myStack.peak();
                    System.out.println("Peak "+ num + "from the Stack");
                    break;
                case 4:
                    myStack.printStack();
                    break;
                case 5:
                    if(myStack.isFull()){
                        System.out.println("The Stack full");
                    }else{
                        System.out.println("The Stack is not full");
                    }
                    break;                
                case 6:
                    if(myStack.isEmpty()){
                        System.out.println("The Stack is empty");
                    }else{
                        System.out.println("The Stack is not empty");
                    }
                    break;
                case 7:
                    return;
            }
        }
    }
    
}
