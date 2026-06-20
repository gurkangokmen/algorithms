public class ReverseTheNumber {
    
    /*
    * Reverse The Number
    * Say the given number is 123
    * Reverse of the number is 321
    * 
    * Say the given number is 2019
    * Reverse of the number is 9102
    */
    
    
    public static void main(String [] args){
        System.out.println(reverse(2019));
    }

    public static int reverse(int number) {
        String snumber = String.valueOf(number);

        StringBuilder sbnumber = new StringBuilder();

        for (int i = snumber.length() -1 ; i >= 0 ; i--) {
            sbnumber.append(snumber.charAt(i));
        }

        return Integer.parseInt(sbnumber.toString());
        
    }
}