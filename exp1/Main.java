import java.util.*;

class Main{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		String consumer_name;
		int consumer_number;
		int perviousMonthReading;
		int currentMonthReading;
		boolean isCommercial=false;		

		System.out.println("Enter the Consumer First Name:");
		consumer_name = sc.next();
		consumer_name += " ";	
		System.out.println("Enter the Consumer Last Name");
		consumer_name += sc.next();

		System.out.println("Enter the Consumer Number:");
		consumer_number = sc.nextInt();

		System.out.println("Enter the prev month reading:");
		perviousMonthReading = sc.nextInt();

		System.out.println("Enter the current month reading:");
		currentMonthReading = sc.nextInt();
		
		while(true){
			System.out.println("Is it Commercial Connection?: Y/N");
			String type = sc.next();
			if(type.equals("n") || type.equals("N")){
				isCommercial = false;break;
			}else if(type.equals("y") || type.equals("Y")){
				isCommercial = true;break;
			}else{
				System.out.println("Invalid choice, Enter a valid choice.");		
				continue;
			}
		}		


		ElectricityBill dante = new ElectricityBill(consumer_number, consumer_name, perviousMonthReading, currentMonthReading, isCommercial);

		dante.generateBill();
	}
}

class ElectricityBill{
	private String consumer_name;
	private int consumer_number;
	private int perviousMonthReading;
	private int currentMonthReading;
	private boolean isCommercial=false;
	private float netAmount=0f;
	private int currentMonthReadingActual;
	

	public ElectricityBill(int cnum, String cname, int prev, int current, boolean isCom){
		this.consumer_name = cname;
		this.consumer_number = cnum;
		this.perviousMonthReading = prev;
		this.currentMonthReading = current;
		this.isCommercial = isCom;	
		this.currentMonthReadingActual = currentMonthReading - perviousMonthReading;
	}

	public void generateBill(){
		if(isCommercial == false){
			for(int i=1; i<=currentMonthReadingActual; i++){
				if(i<=100){
					netAmount+= 1.0f;			
				}else if(i>=101 && i<=200){
					netAmount += 2.50f;
				}else if(i>=201 && i<=500){
					netAmount += 4.0f;
				}else if(i>=501){
					netAmount += 5.0f;
				}
			}
		}else{
			for(int i=1; i<=currentMonthReadingActual; i++){
				if(i<=100){
					netAmount+= 2.0f;			
				}else if(i>=101 && i<=200){
					netAmount += 4.50f;
				}else if(i>=201 && i<=500){
					netAmount += 6.0f;
				}else if(i>=501){
					netAmount += 7.0f;	
				}
			}
		}
		System.out.println("\n\n\n\nName: "+consumer_name);
		System.out.println("Number: "+consumer_number);
		System.out.println("Previous Month Reading: "+perviousMonthReading);
		System.out.println("Current Month Readin: "+currentMonthReading);
		if(isCommercial){
			System.out.println("Connection Type: Commercial");
		}else{
			System.out.println("Connection Type: Domestic");			
		}	
		System.out.println("Bill Amount(INR): "+netAmount);
	}

}
