import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr1, nr2;
        System.out.print("Enter first nr:  ");
        nr1 = input.nextInt();
        System.out.print("Enter second nr:  ");
        nr2 = input.nextInt();
        System.out.printf("%s = %d%n", "Sum", (nr1+nr2));
        System.out.printf("%s = %d%n", "Difference", (nr1-nr2));
        System.out.printf("%s = %d%n", "Product", (nr1*nr2));
        System.out.printf("%s = %d%n", "Quotient(division)", (nr1/nr2));
    }
}
