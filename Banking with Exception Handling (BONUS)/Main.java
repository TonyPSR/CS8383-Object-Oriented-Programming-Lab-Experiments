package tonypsr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer johnWick = new Customer();
        try{
            johnWick.getDetails();
        }catch (NegativeAmountException e){
            System.out.println(e);
        }

        int ch;
        double amount;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Print Details");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    amount = sc.nextDouble();
                    try {
                        johnWick.depositMoney(amount);
                    } catch (NegativeAmountException e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    amount = sc.nextDouble();
                    try {
                        johnWick.withDrawMoney(amount);
                    } catch (InsufficientBalanceException | NegativeAmountException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    johnWick.printDetails();
                    break;
                default:
                    System.out.println("Invalid choice!!!");

            }

        }
    }
}
