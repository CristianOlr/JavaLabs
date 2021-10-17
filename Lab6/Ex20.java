import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:  ");
        double radius=input.nextDouble();
        System.out.printf("The area of circle is:  %.2f", circleArea(radius));
    }
    public static double circleArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
