public class PositiveOrNegative {
    public static void main(String[] args) {
        positiveOrNegative(0);
        positiveOrNegative(-1);
        positiveOrNegative(100);
    }


    public static void positiveOrNegative(int number) {
        if (number<0) {
            System.out.println("Negative");
        } else if (number>0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero is neither Positive nor Negative");   
        }
    }
    
}