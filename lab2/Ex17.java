import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr1, nr2, nr3, max, min;
        System.out.print("Enter first nr:  ");
        nr1 = input.nextInt();
        max = nr1;
        min = nr1;
        System.out.print("Enter second nr:  ");
        nr2 = input.nextInt();
        if (nr2 > max)
            max = nr2;
        if (nr2 < min)
            min = nr2;
        System.out.print("Enter the third nr:  ");
        nr3 = input.nextInt();
        if (nr3 > max)
            max = nr3;
        if (nr3 < min)
            min = nr3;
        System.out.printf("%s = %d%n", "Sum", (nr1 + nr2 + nr3));
        System.out.printf("%s = %d%n", "Average", (int) ((nr1 + nr2 + nr3) / 3));
        System.out.printf("%s = %d%n", "Product", (nr1 * nr2 * nr3));
        System.out.printf("%s = %d%n", "Max number", max);
        System.out.printf("%s = %d%n", "Min number", min);

    }
}
