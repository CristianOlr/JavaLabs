package Lab7;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayLength;
        if (args.length != 1)
            arrayLength = 10;
        else
            arrayLength = Integer.parseInt(args[0]);

        int[] array = new int[arrayLength];
        System.out.printf("Enter the %d elements of the array:%n", arrayLength);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("\t- array[%d]:  ", i);
            array[i] = input.nextInt();
        }
        System.out.printf("The rezult of product:  %d", product(array));
    }

    static long product(int a[]) {
        long rezult = 1;
        for (int elem : a) {
            rezult *= elem;
        }
        return rezult;
    }
}
