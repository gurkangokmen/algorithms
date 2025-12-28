public class Factorial {
    public static void main(String[] args) {
        factorial(0);
        factorial(1);
        factorial(4);
        factorial(-4);
    }

    public static void factorial (int number) {
        if (number < 0) {
            throw new RuntimeException("Number can not be negative ");
        }
        
        int result = 1;
        for (int i = number ; i >= 2 ; i--) {
            result = result * i;
        }

        System.out.println(result);
    }
}
