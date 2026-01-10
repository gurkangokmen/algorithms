public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(153));
    }

    public static int sumOfDigits(int number) {
        // 153 --> 1 + 5 + 3 --> 9
        int sum = 0;
        int remainder = 0;

        for (; number != 0 ;) {
            remainder = number % 10;
            sum = sum + remainder;

            number = number / 10;
        }
        return sum;
    }
}
