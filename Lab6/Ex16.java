import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char toContinue='y';
        do {
            System.out.println("Enter the 2 integers:");
            int nr1 = input.nextInt();
            int nr2 = input.nextInt();
            toContinue='y';
            if (isMultiple(nr1, nr2) == true)
                System.out.println("Second number is multiple of the first");
            else
                System.out.println("Second number is not a multiple of the first");

            System.out.println("Do you want to verify another pair of integers?");
            System.out.print("Type \"y\" for yes or \"n\" for no:  ");
            toContinue=input.next().charAt(0);
            System.out.println();
        }
        while (toContinue == 'y');
    }

    public static boolean isMultiple(int nr1, int nr2) {
        if (nr2 % nr1 == 0)
            return true;
        else
            return false;
    }
}
