import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 sides of the right triangle:");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        System.out.printf("%nThe hypothenuse is:");
        System.out.printf("%n\t- calculated with sqrt and pow:  %.2f", hypotenuse(side1,side2));
        System.out.printf("%n\t- calculated with \"hypot\" method:  %.2f", Math.hypot(side1,side2));
    }
    public static double hypotenuse(double side1, double side2) {
        double result = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return result;
    }
}
