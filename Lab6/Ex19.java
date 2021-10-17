import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numer of astericks for the sides:  ");
        int nr;
        char fill;
        do {
            nr=input.nextInt();
            if (nr<1)
                System.out.print("Enter a number > 0:  ");
            else {
                System.out.print("Enter the character for filling:  ");
                fill = input.next().charAt(0);
                squareOfAsterisks(nr,fill);
            }
        }
        while (nr<1);
    }
    public static void squareOfAsterisks(int side, char  fillCharacter){
        System.out.println();
        for (int i = 0; i < side; i++) {
            for (int j=0;j<side; j++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
