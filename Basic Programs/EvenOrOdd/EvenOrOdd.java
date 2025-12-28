
public class EvenOrOdd {
    public static void main(String[] args) {
       evenOrOdd(-1);
    }


    public static void evenOrOdd(int number) {
        if (number == 0) {
            System.out.println("Whether even or odd");
        }

        else if (number % 2 == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
    
}