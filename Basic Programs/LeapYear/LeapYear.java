
public class LeapYear {
    public static void main(String[] args) {
        leapYear(2000);
        leapYear(1900);
        leapYear(2024);
        leapYear(2023);
    }

    public static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

}
