package converter;
import java.util.Scanner;

public class CurrencyConverter {
    
    private float oldValue, newValue = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public CurrencyConverter(float value){
        this.oldValue = value;
    }
    
    public void convertCurrency(){
        int choice;
        
        float perDollar = 68.79f;
        float perEuro = 80.82f;
        float perYen = 0.62f;
        
        
        
        while(true){
            System.out.println("\nChoose:\n1.Dollar to Rupees\n2.Euro to Rupees\n3.Yen to Rupees\n"
                + "4.Rupees to Dollar\n5.Rupees to Euro\n6.Rupees to Yen\n7.Go Back");
            choice = sc.nextInt();
            System.out.println(); // one line space
            if(choice == 7){
                break;
            }
            
            switch(choice){
            case 1:
                newValue = oldValue * perDollar;
                System.out.println(oldValue + " Dollar = "+ newValue +" Rupee");
                break;
            case 2:
                newValue = oldValue * perEuro;
                System.out.println(oldValue + " Euro= "+ newValue +" Rupee");
                break;
            case 3:
                newValue = oldValue * perYen;
                System.out.println(oldValue + " Yen = "+ newValue +" Rupee");
                break;
            case 4:
                newValue = oldValue / perDollar;
                System.out.println(oldValue + " Rupee = "+ newValue +" Dollar");
                break;
            case 5:
                newValue = oldValue / perEuro;
                System.out.println(oldValue + " Rupee = "+ newValue +" Euro");
                break;
            case 6:
                newValue = oldValue / perYen;
                System.out.println(oldValue + " Rupee = "+ newValue +" Yen");
                break; 
            
            default:
                System.out.println("Invalid Choice. Select a valid option.");
                break;
            }
        }
    }
}
   
