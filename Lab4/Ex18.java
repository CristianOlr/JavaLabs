package LAB;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acc_nr, init_balance, tot_charged, tot_credits, credit_limit, new_balance, nr;
        boolean exist = false;
        System.out.print("Enter the number of customers:  n = ");
        nr = input.nextInt();
        System.out.print("Enter account number, balance at the beginning of the month, ");
        System.out.print("total of all items charged by the customer this month, ");
        System.out.println("total of all credits applied to the customer’s account this month, ");
        System.out.printf("allowed credit limit for each customer (in this order, every param in new line) :%n%n");


        for (int i = 0; i < nr; i++) {
            System.out.printf("\tcustomer %d:%n", i + 1);
            acc_nr = input.nextInt();
            init_balance = input.nextInt();
            tot_charged = input.nextInt();
            tot_credits = input.nextInt();
            credit_limit = input.nextInt();
            new_balance = init_balance + tot_charged - tot_credits;
            if (new_balance > credit_limit)
                System.out.printf("Credit limit exceeded for customer nr.%d", i + 1);
            System.out.println();
            System.out.println();

        }

    }
}
