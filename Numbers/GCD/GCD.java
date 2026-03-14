import java.util.List;
import java.util.ArrayList;

class GCD {
    public static void main(String[] args) {
       System.out.println(gcd(12, 18));
    }

    public static int gcd(int number1, int number2) {
        List<Integer> divisors1 = disivors(number1);
        List<Integer> divisors2 = disivors(number2);

        int result = 0;
        for (Integer d1 : divisors1) {
            for (Integer d2 : divisors2) {
                if (d1 == d2) {
                    result = d1;
                    return result;
                }
            }
        }

        return result;

    }

    public static List<Integer> disivors(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                divisors.add(i);
            }
        }

        return divisors.reversed();
    }
}