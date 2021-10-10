package LAB;

import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter how many numbers do you have to compare:  n = ");
        int n=input.nextInt();
        int firstMax, secondMax,nextNr, nr1,nr2, counter=1;
        System.out.printf("\t- nr.%d:  ",counter++);
        nr1 = input.nextInt();
        System.out.printf("\t- nr.%d:  ",counter++);
        nr2=input.nextInt();
        if (nr2>nr1){
            firstMax=nr2;
            secondMax=nr1;
        }
        else {
            firstMax=nr1;
            secondMax=nr2;
        }
        for (int i=2; i<n; i++){
            System.out.printf("\t- nr.%d:  ",counter++);
            nextNr=input.nextInt();
            if (nextNr>firstMax) {
                int temp=firstMax;
                firstMax=nextNr;
                nextNr=temp;
                //swap firstMax with nextNr
                if (nextNr>secondMax)
                    secondMax=nextNr;
            }
            else if ((nextNr>secondMax)&&(nextNr<firstMax)){
                int temp=secondMax;
                secondMax=nextNr;
                nextNr=temp;
            }
        }
        show(firstMax,secondMax);
    }
    private static void show(int nr1, int nr2) {
        System.out.printf("%nMax number:  %d%n", nr1);
        System.out.printf("Second max number:  %d%n", nr2);
    }
}
