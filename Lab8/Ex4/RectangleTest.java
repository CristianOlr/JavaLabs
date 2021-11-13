package Lab8.Ex4;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght of rectangle:  l = ");
        double lenght = input.nextDouble();
        System.out.print("Enter the width of rectangle:  w = ");
        double width = input.nextDouble();
        Rectangle rectang = new Rectangle(lenght,width);
        System.out.printf("Perimeter = %.2f",rectang.calculatePerimeter());
        System.out.printf("%nArea = %.2f",rectang.calculateArea());
    }
}
