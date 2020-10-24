import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fname = sc.next();
		String extension;
		File file;
        FileInputStream fReader;

        try{
            file = new File(fname);
            fReader = new FileInputStream(file);

            System.out.println("The file exists!!!");
            if(file.canRead()){
                System.out.println("The file is readable");
            }else{
				System.out.println("The file is not readable");
			}
 
			if(file.canWrite()){
                System.out.println("The file is writeable");
            }else{
				System.out.println("The file is not writeable");
			}
			
			extension = getFileExtension(file);
			System.out.println("The File Type: "+ extension);

            long counter = 0;
            while(fReader.read()!= -1){
                counter +=1;
            }
            System.out.println("The length of the file in bytes: " + counter);
			fReader.close();
			
        }catch(IOException e){
            System.out.println("The file doesn't exists!!!");
            System.out.println(e);
        }
    }

    private static String getFileExtension(File file) {
        String extension = "";
 
        try {
            String name = file.getName();
            extension = name.substring(name.lastIndexOf("."));
        } catch (Exception e) {
            extension = "";
        }
 
        return extension;
 
    }
}
