import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Give the radius of the circle:  ");
        radius = input.nextInt();
        System.out.printf("Diameter = %d%n", (2*radius));
        System.out.printf("Circumference = %f%n", (2*Math.PI*radius));
        System.out.printf("Area = %f", Math.PI*radius*radius);
    }
}
