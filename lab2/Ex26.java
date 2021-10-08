import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int nr1, nr2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:  ");
        nr1 = input.nextInt();
        System.out.print("Enter the second integer:  ");
        nr2 = input.nextInt();
        if (nr1 % nr2 == 0)
            System.out.print("First nr is a multiple of the second nr");
        else System.out.print("First nr isn't a multiple of the second nr");
    }
}
