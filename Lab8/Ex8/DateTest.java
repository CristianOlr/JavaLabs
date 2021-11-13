package Lab8.Ex8;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:  ");
        int year = input.nextInt();
        forYear(year);
    }

    static void forYear(int year) {
        System.out.printf("For year %d:%n%n",year);
        Date date1 = new Date(1,1,year);
        for (int i = 0; i < 367; i++) {
            System.out.println("Date:  " + date1);
            date1.nextDay();
            System.out.println("Date + 1 day:  " + date1);
            System.out.println();
        }
    }

}
