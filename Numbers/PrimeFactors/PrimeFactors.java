import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> result = findPrimeFactors(12);
        System.out.println(result.toString());
    }

    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        int maxPrimeFactor = number;

        for (int i = 2; i < maxPrimeFactor; ) {
                if (number % i == 0) {
                    primeFactors.add(i);
                    number = number/i;                    
                    i = 2;
                } else {
                    i++;
                }

                if (number == 1) {
                    break;
                }
            }
        
        return primeFactors;
    }

}
