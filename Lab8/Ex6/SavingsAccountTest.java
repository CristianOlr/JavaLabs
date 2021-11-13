package Lab8.Ex6;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.printf("Annual interest rate = %.1f", SavingsAccount.getAnnualInterestRate()*100);
        System.out.print("%");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("%nThe monthly interest for saver1 = $%.2f", saver1.getMonthlyInterest());
        System.out.printf("%nThe monthly interest for saver2 = $%.2f%n%n", saver2.getMonthlyInterest());

        SavingsAccount.setAnnualInterestRate(0.05);
        System.out.printf("Annual interest rate = %.1f", SavingsAccount.getAnnualInterestRate()*100);
        System.out.print("%");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("%nThe monthly interest for saver1 = $%.2f", saver1.getMonthlyInterest());
        System.out.printf("%nThe monthly interest for saver2 = $%.2f%n", saver2.getMonthlyInterest());
    }


}



