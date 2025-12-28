import java.util.ArrayList;
import java.util.List;

public class FactorsOfANumber {
    public static void main(String[] args) {
        factorsOfANumber(0);
        factorsOfANumber(1);
        factorsOfANumber(12);
    }

    public static void factorsOfANumber(int number) {
        List<Integer> factors = new ArrayList<>();

        if (number == 0 ) {
            System.out.println("All numbers");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }


        System.out.println(factors);
    }
}
