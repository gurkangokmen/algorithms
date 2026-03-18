
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11));
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        if (number <= 0) return false;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    
}
