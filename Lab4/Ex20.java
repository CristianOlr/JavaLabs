package LAB;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoursEmp1, hoursEmp2, hoursEmp3;
        int salary1, salary2, salary3;
        System.out.print("Enter the hourly rate(in $):  ");
        int hourlyRate = input.nextInt();
        System.out.println("Enter the number of hours worked by each employee:");
        System.out.print("\temployee 1:  ");
        hoursEmp1 = input.nextInt();
        System.out.print("\temployee 2:  ");
        hoursEmp2 = input.nextInt();
        System.out.print("\temployee 3:  ");
        hoursEmp3 = input.nextInt();
        if (hoursEmp1 <= 40) {
            salary1 = hoursEmp1 * hourlyRate;
        } else {
            salary1 = 40 * hourlyRate + (hoursEmp1 - 40) * hourlyRate / 2;
        }
        if (hoursEmp2 <= 40) {
            salary2 = hoursEmp2 * hourlyRate;
        } else {
            salary2 = 40 * hourlyRate + (hoursEmp2 - 40) * hourlyRate / 2;
        }
        if (hoursEmp3 <= 40) {
            salary3 = hoursEmp3 * hourlyRate;
        } else {
            salary3 = 40 * hourlyRate + (hoursEmp3 - 40) * hourlyRate / 2;
        }
        System.out.printf("\nSalary for employee 1:  $%d", salary1);
        System.out.printf("\nSalary for employee 2:  $%d", salary2);
        System.out.printf("\nSalary for employee 3:  $%d", salary3);
        System.out.println();
    }
}
