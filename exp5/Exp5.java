package exp7;

import java.util.Scanner;

public class Exp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList:");
        int size = sc.nextInt();
        ArrayListOperation myList = new ArrayListOperation(size);
        while(true){
            System.out.println("\n1.Append\n2.Insert\n3.Search\n4.Strings starting with a letter\n5.Print ArrayList\n6.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the String to append:");
                    myList.append(sc.next());
                    break;
                case 2:
                    System.out.println("Enter the String to insert:");
                    String temp = sc.next();
                    System.out.println("Enter the index to insert in:");
                    int index = sc.nextInt();
                    myList.addAtIndex(temp, index);
                    break;
                case 3:
                    System.out.println("Enter the String to search:");
                    myList.search(sc.next());;
                    break;
                case 4:
                    System.out.println("Enter the character to check for:");
                    String a = sc.next();
                    char l = a.charAt(0);
                    myList.startWithLetter(l);
                    break;
                case 5:
                    myList.printArrayList();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invaild Choice!");
                    
            }
        }
    }
    
}
