import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char toContinue;
        do {
            System.out.print("Enter the integer:  n = ");
            int nr = input.nextInt();
//            toContinue='y';
            if (isEven(nr))
                System.out.printf("The number \"%d\" is even%n",nr);
            else
                System.out.printf("The number \"%d\" is odd%n",nr);

            System.out.println("Do you want to verify another integer?");
            System.out.print("Type \"y\" for yes or \"n\" for no:  ");
            toContinue=input.next().charAt(0);
            System.out.println();
        }
        while (toContinue == 'y');
    }

    public static boolean isEven(int nr) {
        if (nr % 2 == 0)
            return true;
        else
            return false;
    }
}

