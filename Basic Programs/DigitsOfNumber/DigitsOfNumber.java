import java.util.ArrayList;

public class DigitsOfNumber {
    public static void main(String[] args) {
        digitsOfNumber(4321);
    }

    public static void digitsOfNumber(int number){
        ArrayList<Integer> digits = new ArrayList<>();

        for (; number > 0; ) {
            int remainder = number % 10;
            digits.add(remainder);

            number = number / 10;
        }

        System.out.println(digits);
    }
}
