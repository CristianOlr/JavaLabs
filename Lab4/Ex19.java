package LAB;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list of items sold(enter -1 to stop):");
        int value, totValue = 0;
        boolean stop = true;
        while (stop != false) {
            value = input.nextInt();
            if (value < 0)
                stop = false;
            else totValue += value;
        }
        System.out.printf("\nTotal earnings: %.2f", (double) 200 + (0.09 * totValue));

    }
}
