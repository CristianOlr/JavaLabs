package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items=new ArrayList<Integer>();
        int n = 5, nr;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\t- enter array[%d] element:  ", i);
            nr = input.nextInt();
            if ((nr < 10) || (nr > 100)) {
                do {
                    System.out.printf("\t\t give a valid value for element %d (between 10 and 100):  ", i + 1);
                    nr = input.nextInt();
                }
                while ((nr < 10) || (nr > 100));
            }
            if (!items.contains(nr)) {
                items.add(nr);
            }
            else {
                System.out.printf("\t(element \"%d\" already exists)%n", nr);
            }
            display(items);
        }
    }

    static void display(ArrayList<Integer> items) {
        System.out.print("The new array is:  ");
        for (int item : items) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
