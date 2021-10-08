import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int nr, nrcopy, nrdigits = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        nr = input.nextInt();
        if (nr < 0)
            nr = Math.abs(nr);
        if (nr < 10) nrdigits=1;
        else if (nr < 100) nrdigits = 2;
        else if (nr < 1000) nrdigits = 3;
        else if (nr < 10000) nrdigits = 4;
        else if (nr < 100000) nrdigits = 5;
        else if (nr < 1000000) nrdigits = 6;
        else if (nr < 10000000) nrdigits = 7;
        else if (nr < 100000000) nrdigits = 8;
        else if (nr < 1000000000) nrdigits = 9;
        else if (nr <= 2147483647+1) nrdigits = 10;
            //max value of int has 10 didgits

        int reversedNr = 0;
        for(;nr != 0; nr /= 10) {
            int digit = nr % 10;
            reversedNr = reversedNr * 10 + digit;
        }
        for(;reversedNr!=0; reversedNr/=10){
            System.out.printf("%d   ",reversedNr%10);
        }
    }

}
