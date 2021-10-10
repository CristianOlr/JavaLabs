import java.util.Calendar;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day, month, year;
    private int age, maxHeartRate;
    private double targetHeartRate1, targetHeartRate2;


    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void calculateShow() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        age = currentYear - year;
        maxHeartRate = 220 - age;
        targetHeartRate1 = maxHeartRate * 0.5;
        targetHeartRate2 = maxHeartRate * 0.85;
        System.out.printf("Age:  %d years\n", age);
        System.out.printf("Max Heart Rate:  %d bpm\n", maxHeartRate);
        System.out.printf("Target Heart Rate:  %.2f-%.2f bpm\n", targetHeartRate1,targetHeartRate2);


    }
}
