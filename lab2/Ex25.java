import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int nr;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number:  nr = ");
        nr = input.nextInt();
        if (nr%2==0)
            System.out.print("\"Nr\" is even");
        else System.out.print("\"Nr\" is odd");
    }
}
