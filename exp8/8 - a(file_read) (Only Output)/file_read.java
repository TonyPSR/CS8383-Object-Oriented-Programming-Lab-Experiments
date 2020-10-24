import java.util.Scanner;
import java.io.*;

public class file_read {
    public static void main(String[] args){       
        try{
            FileReader f1 = new FileReader("test.txt");
            System.out.println("The file exists!!!");
            System.out.println("\nThe contents of the file:\n");
            int temp;
            do{
                temp = f1.read();
				System.out.print((char)temp);
            }while(temp != -1);
			f1.close();

        }catch(IOException e){
            System.out.println("The file doesn't exists!!!");
            System.out.println(e);
        }
    }
}
