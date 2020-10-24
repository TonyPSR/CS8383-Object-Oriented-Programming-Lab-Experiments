import java.util.Scanner;
import java.io.*;

public class file_reverse {
	public static void main(String[] args){
		char[] character;

		try{
			File f1 = new File("file1.txt");
			File f2 = new File("file2.txt");
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			
			int f1_length = (int)f1.length();
			character = new char[f1_length];


			fr.read(character);
			
			for(int i=0; i<f1.length(); i++){
				System.out.print(character[i]);
			}

			for(int j=f1_length-3;j>=0; j--){
				fw.write(character[j]);	
			}
			fw.close();
			fr.close();
		}catch(IOException e){
			System.out.println("The file doesn't exists!!!");
			System.out.println(e);
		}
	}
}
