import java.util.Scanner;

class Employee {
    private String Emp_name;
    private int Emp_id;
    private String Address;
    private String Mail_id;
    private String Mobile_no;
    private float BasicPay;


    public Employee(float BasicPay){
        this.BasicPay = BasicPay;
    }

    public void getDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name:");
        Emp_name = sc.nextLine();
        System.out.println("Enter the ID:");
        Emp_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Address:");
        Address = sc.nextLine();
        System.out.println("Enter the E-mail ID:");
        Mail_id = sc.nextLine();
        System.out.println("Enter the Mobile Number:");
        Mobile_no = sc.nextLine();
    }

    void generate(String profession, float DA,float HRA,float PF,float staffClubFund){
        //net salary calculation
        float grossSalaray = BasicPay + (DA + HRA);
        float netSalary = grossSalaray - (PF + staffClubFund);

        System.out.println("\n\t\tSalary Slip");
        System.out.println("\nID: "+ Emp_id);
        System.out.println("Name: " + Emp_name);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + Address);
        System.out.println("E-mail: " + Mail_id);
        System.out.println("Mobile: " + Mobile_no);
        System.out.println("Basic Pay: Rs." + BasicPay);
        System.out.println("DA: Rs." + DA);
        System.out.println("HRA: Rs." + HRA);
        System.out.println("PF: Rs." + PF);
        System.out.println("Staff Club Fund: Rs." + staffClubFund);
        System.out.println("\nGross Salary: " + grossSalaray);
        System.out.println("Net Salary: "+ netSalary);
    }
}


class AssociateProfessor extends Employee {
    private float BasicPay;
    private float DA;
    private float HRA;
    private float PF;
    private float staffClubFund;
    public String profession = "Associate Professor";

    public AssociateProfessor(float BasicPay){
        super(BasicPay);

        this.BasicPay = BasicPay;
        this.DA = (97*BasicPay) /100;
        this.HRA = (10*BasicPay) / 100;
        this.PF = (12*BasicPay) / 100;
        this.staffClubFund = (0.1f*BasicPay) / 100;
    }

    public void generatePaySlip(){
        super.generate(profession, DA, HRA, PF, staffClubFund);
    }

}

class AssistantProfessor extends Employee {
    private float BasicPay;
    private float DA;
    private float HRA;
    private float PF;
    private float staffClubFund;
    public String profession = "Assistant Professor";


    public AssistantProfessor(float BasicPay){
        super(BasicPay);

        this.DA = (97*BasicPay) /100;
        this.HRA = (10*BasicPay) / 100;
        this.PF = (12*BasicPay) / 100;
        this.staffClubFund = (0.1f*BasicPay) / 100;
    }

    public void generatePaySlip(){
        super.generate(profession, DA, HRA, PF, staffClubFund);
    }

}

class Programmer extends Employee{
    private float BasicPay;
    private float DA;
    private float HRA;
    private float PF;
    private float staffClubFund;
    public String profession = "Programmer";


    public Programmer(float BasicPay){
        super(BasicPay);

        this.DA = (97*BasicPay) /100;
        this.HRA = (10*BasicPay) / 100;
        this.PF = (12*BasicPay) / 100;
        this.staffClubFund = (0.1f*BasicPay) / 100;
    }

    public void generatePaySlip(){
        super.generate(profession, DA, HRA, PF, staffClubFund);
    }
}



class Professor extends Employee {
    private float BasicPay;
    private float DA;
    private float HRA;
    private float PF;
    private float staffClubFund;
    public String profession = "Professor";


    public Professor(float BasicPay){
        super(BasicPay);

        this.DA = (97*BasicPay) /100;
        this.HRA = (10*BasicPay) / 100;
        this.PF = (12*BasicPay) / 100;
        this.staffClubFund = (0.1f*BasicPay) / 100;
    }

    public void generatePaySlip(){
        super.generate(profession, DA, HRA, PF, staffClubFund);
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Associate Professor\n2.Professor\n3.Assistant Professor\n4.Programmer");
        System.out.println("Choose Profession:");

        int choice = sc.nextInt();

        System.out.println("\nEnter Basic Pay:");
        float BasicPay = sc.nextFloat();

        switch (choice){
            case 1:
                AssociateProfessor associateProfessor = new AssociateProfessor(BasicPay);
                associateProfessor.getDetails();
                associateProfessor.generatePaySlip();
                break;
            case 2:
                Professor professor = new Professor(BasicPay);
                professor.getDetails();
                professor.generatePaySlip();
                break;
            case 3:
                AssistantProfessor assistantProfessor = new AssistantProfessor(BasicPay);
                assistantProfessor.getDetails();
                assistantProfessor.generatePaySlip();
                break;
            case 4:
                Programmer programmer = new Programmer(BasicPay);
                programmer.getDetails();
                programmer.generatePaySlip();
                break;
            default:
                System.out.println("Invalid Selection!!!");
        }

    }
}
