package Numbers.ArmstrongNumber;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

    public static boolean isArmstrongNumber(int number) {
        int firstNumber = number;
        int length = String.valueOf(number).length();
        int sum = 0;


        while (number != 0) {

            int r = number % 10;
            number = number / 10;
            sum = sum + Math.powExact(r, length);
        }


        return sum == firstNumber;
    }
}
