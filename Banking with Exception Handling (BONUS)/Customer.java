package tonypsr;

import java.util.Scanner;

public class Customer {
    private String name;
    private long acc_no;
    private double balance;
    private double amount;
    void getDetails() throws NegativeAmountException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Bank Account no:");
        acc_no=sc.nextLong();
        System.out.println("Enter amount to deposit:");
        balance=sc.nextDouble();
        if(balance<0) {
            throw new NegativeAmountException(balance);
        }
    }

    void depositMoney(double amount) throws NegativeAmountException{
        this.amount = amount;
        if(amount<0) {
            throw new NegativeAmountException(amount);
        }else{
            balance = balance + amount;
            System.out.println("Rs." + amount + " is credited to Acc. no:" + acc_no );
            System.out.println("New Balance is Rs."+balance);
        }
    }

    void withDrawMoney(double amount) throws NegativeAmountException,InsufficientBalanceException{
        this.amount = amount;
        if(amount < 0) {
            throw new NegativeAmountException(amount);
        }else if(balance-amount < 0) {
            throw new InsufficientBalanceException(balance, amount);
        }else{
            balance = balance - amount;
            System.out.println("Rs." + amount + " is debited from Acc. no:" + acc_no );
            System.out.println("New Balance is Rs."+balance);
        }
    }

    void printDetails() {
        System.out.println("\n");
        System.out.println("Name: "+name);
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}
