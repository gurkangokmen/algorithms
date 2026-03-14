class LCM {

    //LCM(a,b)= a×b​ / GCD(a,b)
    public static void main(String[] args) {
        System.out.println(lcm(36, 40));
        //System.out.println(gcd(36, 40));
    }

    public static int lcm(int number1, int number2) {
        return (number1*number2) / gcd(number1, number2);
    }


    public static int gcd(int number1, int number2) {
        if (number1 < number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }

        while (number2>0) {
            int temp = number2;
            number2 = number1%number2;
            number1 = temp;
        }

        return number1;
    }
}
