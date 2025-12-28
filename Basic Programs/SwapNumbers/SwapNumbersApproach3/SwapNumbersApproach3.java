public class SwapNumbersApproach3 {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        b = b^a;
        a = b^a;
        b = b^a;
        

        System.out.println(a); //20
        System.out.println(b); //15

    }  
}
