import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr1,nr2,nr3,nr4,nr5,max,min;
        System.out.println("Enter 5 numbers:  ");
        nr1 = input.nextInt();
        max=nr1; min=nr1;
        nr2 = input.nextInt();
        nr3 = input.nextInt();
        nr4 = input.nextInt();
        nr5 = input.nextInt();
        if (nr2 > max)
            max = nr2;
        if (nr2 < min)
            min = nr2;
        if (nr3 > max)
            max = nr3;
        if (nr3 < min)
            min = nr3;
        if (nr4 > max)
            max = nr4;
        if (nr4 < min)
            min = nr4;
        if (nr5 > max)
            max = nr5;
        if (nr5 < min)
            min = nr5;
        System.out.printf("%s%d%n", "Max = ", max);
        System.out.printf("%s%d%n", "Min = ", min);
    }
}
