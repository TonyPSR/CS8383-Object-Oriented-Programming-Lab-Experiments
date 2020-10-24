package converter;
import java.util.Scanner;

public class DistanceConverter {
    
    private float oldValue, newValue = 0;
    
    Scanner sc = new Scanner(System.in);
    
    
    public DistanceConverter(float value){
        this.oldValue = value;
    }
    
    public void distanceConverter(){
        int choice;
        
            float perMile = 0.621371f;
        float perMeter = 0.001f;  
       
        
        while(true){
            System.out.println("\nChoose:\n1.Meter to Kilometer\n2.Kilomter to Meter\n3.Miles to Kilometer\n"
                + "4.Kilometer to Miles\n5.Go Back");
        
            choice = sc.nextInt();
            if(choice == 5){
                break;
            }
            
            switch(choice){
                case 1:
                    newValue = oldValue * perMeter;
                    System.out.println(oldValue + " Meter = "+ newValue +" Kilometer");
                    break;
                case 2: 
                    newValue = oldValue / perMeter;
                    System.out.println(oldValue + " Kilometer = "+ newValue + " Meter");
                    break;
                case 3:
                    newValue = oldValue / perMile;
                    System.out.println(oldValue + " Miles = "+ newValue +" Kilometer");
                    break;
                case 4:
                    newValue = oldValue * perMile;
                    System.out.println(oldValue + " Kilometer = "+ newValue + " Miles");
                    break; 
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice. Select a valid option.");
                    break;
            }
        }
    }
}

