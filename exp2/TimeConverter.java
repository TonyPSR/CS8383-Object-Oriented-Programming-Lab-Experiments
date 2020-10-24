package converter;
import java.util.Scanner;

public class TimeConverter {
    private float oldValue, newValue = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public TimeConverter(float value){
        this.oldValue = value;
    }
    
    public void timeConverter(){
        int choice;
        
        while(true){
            System.out.println("\nChoose:\n1.Hour to Minute\n2.Minute to Hour\n3.Go Back\n");
            choice = sc.nextInt();
            if(choice == 3){
                break;
            }
            
            
            switch(choice){
                case 1:
                    newValue = oldValue * 60.0f;
                    System.out.println(oldValue +" Hour = "+newValue+"Minutes");
                    break;
                case 2:
                    newValue = oldValue / 60.0f;
                    System.out.println(oldValue +" Minutes = "+newValue+" Hours");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice. Select a valid option.");
                    break;
            }
            
        }
    }
}
        
