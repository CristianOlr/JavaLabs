public class Ex13 {
    public static void main(String[] args) {
        long factorial=1;
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%3s%02d:  %d%n", "n=",i,factorial*=i);
        }
    }
}
