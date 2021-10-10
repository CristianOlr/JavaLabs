package LAB;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons, summiles = 0, sumgallons = 0;
        System.out.print("Enter the number of trips:  n = ");
        int n = input.nextInt();
        System.out.println("Enter the number of miles and gallons for each trip:");
        for (int i = 0; i < n; i++) {
            System.out.printf("trip %d:%n\tmiles = ", i + 1);
            miles = input.nextInt();
            System.out.print("\tgallons = ");
            gallons = input.nextInt();
            System.out.printf("Miles per gallon for trip %d:  %.2f%n%n", i + 1, (float) miles / gallons);
            summiles += miles;
            sumgallons += gallons;
        }
        System.out.printf("Miles per gallon for all trips:  %.2f", (float) summiles / sumgallons);
    }
}
