
/**
 * purpose demonstrate how loops iterations work in java.
 * 1. for
 * 2. While
 * 3. do.. while
 *
 * License example (insert template here)
 */
public class Day2Notes{
    // loopDemo example
    public static void main(String[] args){
        System.out.println("hello world");

        System.out.println(oddNumbers(1, 100));
        // print odd numbers
        // for loop
        /*
        1. initial value for the starting point ie. i=1
        2. condition when to stop ie. i<100
        3. increment the initial value ie. i++ or i =i+2
         */
       // for(int i=1; i<=100; i=i+2){
       //     System.out.println(i);
        }


    /**
     * Returns odd numbers between start and stop
     * @param start first number of the odd number to display
     * @param stop  last number of the odd number to display
     * @return the odd numbers between first number (start) and last number (stop).
     */
    public static String oddNumbers(int start, int stop) {
        // print odd numbers
        // for loop
        /*
        1. initial value for the starting point ie. i=1
        2. condition when to stop ie. i<100
        3. increment the initial value ie. i++ or i =i+2
         */
        String result="";

        for(int i=start; i<=stop; i=i+2){
            result =+ i +" ";
        }
        return result;
        // update test (1)
    }

}