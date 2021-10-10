package LAB;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square:  ");
        int number = input.nextInt();
        System.out.println();
        if (number == 1)
            System.out.println("*");
        else if (number == 2) {
            System.out.println("**");
            System.out.println("**");
        } else {
            for (int i = 0; i < number; i++) {
                if (i == 0 || i == number - 1) {
                    for (int j = 0; j < number; j++)
                        System.out.print("*");
                    System.out.println();
                }
                else {
                    for (int j = 0; j < number; j++){
                        if (j==0 || j==number-1)
                            System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
