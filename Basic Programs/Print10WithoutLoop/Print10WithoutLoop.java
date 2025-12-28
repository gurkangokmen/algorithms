public class Print10WithoutLoop {
    public static void main(String[] args) {
        print10WithoutLoop(1);


    }

    public static void print10WithoutLoop(int number) {
        if (number>10) {
            return;
        }
        
        System.out.println(number);
        print10WithoutLoop(number+1);
    }
}
