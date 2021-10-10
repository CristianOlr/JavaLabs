import java.util.Calendar;

public class HealthProfile {
    private String firstName, lastName, gender;
    private int day, month, year, height, weight;
    private int age, maxHeartRate;
    private double targetHeartRate1, targetHeartRate2, BMI;

    public HealthProfile(String firstName, String lastName, String gender,
                         int day, int month, int year, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGender(gender);
        setDay(day);
        setMonth(month);
        setYear(year);
        setMonth(month);
        setHeight(height);
        setWeight(weight);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
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

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void calculateShow() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        age = currentYear - getYear();
        maxHeartRate = 220 - age;
        targetHeartRate1 = maxHeartRate * 0.5;
        targetHeartRate2 = maxHeartRate * 0.85;
        BMI = (double) getWeight() * 703 / (Math.pow(getHeight(), 2));
        System.out.printf("Age:  %d years%n", age);
        System.out.printf("Max Heart Rate:  %d bpm%n", maxHeartRate);
        System.out.printf("Target Heart Rate:  %.2f-%.2f bpm%n", targetHeartRate1, targetHeartRate2);
        System.out.printf("BMI:  %.2f%n", BMI);

    }
}
