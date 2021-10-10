package LAB;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10)
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if ((result!=1)&&(result!=2)){
                do {
                    System.out.print("Enter result (only values 1 and 2 are valid): ");
                    result = input.nextInt();
                }
                while ((result!=1)&&(result!=2));
            }
            if (result == 1)
                passes = passes + 1;
            else if (result == 2)
                failures = failures + 1;
            studentCounter = studentCounter + 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
