import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements:  ");
        Scanner input=new Scanner(System.in);
        int nr=input.nextInt();
        if (nr<1) {
            do {
                System.out.print("Enter a number > 0 :  ");
                nr = input.nextInt();
            }
            while (nr<1);
        }

        if (nr==1)
            System.out.printf("Enter the only element:  ");
        else
            System.out.printf("Enter the %d elements:%n",nr);

        int nrRead=input.nextInt();
        int min=nrRead;
        for (int i=0; i<nr-1; i++){
            nrRead=input.nextInt();
            if (nrRead<min)
                min=nrRead;
        }
        System.out.printf("Min number = %d", min);
    }
}
