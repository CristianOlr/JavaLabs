package Lab7;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayLength=args.length;
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
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
