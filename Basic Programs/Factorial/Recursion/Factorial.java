public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(0));
        System.out.println(factorial(4));
    }

    public static int factorial(int number){

        if (number<0) {
            throw new RuntimeException("number cannot be negative");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number-1);
    }
} 
