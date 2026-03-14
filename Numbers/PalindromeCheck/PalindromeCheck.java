package Numbers.PalindromeCheck;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(checkPalindromeNumber(12321));
    }

    public static boolean checkPalindromeNumber(int number) {

        StringBuilder sb = new StringBuilder();

        while (number>0) {
            int r = number%10;
            number = number/10;

            sb.append(r);
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
