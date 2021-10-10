import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Date object=new Date();
        object.setDay(29);
        object.setMonth(11);
        object.setYear(2007);
        object.displayDate();
    }
}
