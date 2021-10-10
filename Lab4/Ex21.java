package LAB;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        System.out.println("Enter 10 integers:");
        int entered = input.nextInt();
        int max = entered;
        for (int i = 2; i <= 10; i++) {
            entered = input.nextInt();
            if (entered > max)
                max = entered;
        }
        System.out.print("The largest integer is:  " + max);
    }
}
