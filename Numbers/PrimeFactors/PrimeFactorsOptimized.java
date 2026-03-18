import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOptimized {
    public static void main(String[] args) {
        List<Integer> result = findPrimeFactors(12);
        System.out.println(result);
    }

    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        if (number < 2) {
            return primeFactors;
        }

        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }

        for (int factor = 3; factor * factor <= number; factor += 2) {
            while (number % factor == 0) {
                primeFactors.add(factor);
                number /= factor;
            }
        }

        if (number > 1) {
            primeFactors.add(number);
        }

        return primeFactors;
    }
}
