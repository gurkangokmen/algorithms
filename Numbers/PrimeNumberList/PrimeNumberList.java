package Numbers.PrimeNumberList;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {
    public static void main(String[] args) {
        List<Integer> primeNumberList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                primeNumberList.add(i);
            }
        }

        System.out.println(primeNumberList.toString());
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
