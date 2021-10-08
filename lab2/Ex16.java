import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr1, nr2;
        System.out.print("Enter first nr:  ");
        nr1 = input.nextInt();
        System.out.print("Enter second nr:  ");
        nr2 = input.nextInt();
        if (nr1 == nr2)
            System.out.print("These numbers are equal");
        else
        {
            if (nr1 > nr2)
                System.out.printf("%d%s%n", nr1, " is larger");
            else
            {
                System.out.printf("%d%s", nr2, " is larger");
            }
        }
    }
}
