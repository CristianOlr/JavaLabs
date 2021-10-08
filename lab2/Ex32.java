import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int nr1, nr2, nr3, nr4, nr5;
        int nrofzeros = 0, nr_morethan0 = 0, nr_lessthan0 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        nr1 = input.nextInt();
        nr2 = input.nextInt();
        nr3 = input.nextInt();
        nr4 = input.nextInt();
        nr5 = input.nextInt();
        if (nr1 == 0) nrofzeros += 1;
        else if (nr1 > 0) nr_morethan0 += 1;
        else nr_lessthan0 += 1;
        if (nr2 == 0) nrofzeros += 1;
        else if (nr2 > 0) nr_morethan0 += 1;
        else nr_lessthan0 += 1;
        if (nr3 == 0) nrofzeros += 1;
        else if (nr3 > 0) nr_morethan0 += 1;
        else nr_lessthan0 += 1;
        if (nr4 == 0) nrofzeros += 1;
        else if (nr4 > 0) nr_morethan0 += 1;
        else nr_lessthan0 += 1;
        if (nr5 == 0) nrofzeros += 1;
        else if (nr5 > 0) nr_morethan0 += 1;
        else nr_lessthan0 += 1;
        System.out.printf("Numbers equal to 0 :  %d%n", nrofzeros);
        System.out.printf("Negative numbers :  %d%n", nr_lessthan0);
        System.out.printf("Positive numbers :  %d%n", nr_morethan0);
    }
}
