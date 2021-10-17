import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numer of astericks for the sides:  ");
        int nr;
        do {
            nr=input.nextInt();
            if (nr<1)
                System.out.print("Enter a number > 0:  ");
            else
                squareOfAsterisks(nr);
        }
        while (nr<1);
    }
    public static void squareOfAsterisks(int side){
        System.out.println();
        for (int i = 0; i < side; i++) {
            for (int j=0;j<side; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
