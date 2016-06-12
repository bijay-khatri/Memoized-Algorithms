package fibonacci_dynamic;

/**
 * program to print the nth fibonacci number using Recursion (Brutforce)
 * @author Bijay Khatri
 * @since June 7, 2016
 */
public class Fibonacci_Bruteforce {
    
    //Global Variable to hold the number of recursive method call
    private static int counter = 0;
    public static void main(String[] args) {
        int n = 30;
        print("The fibonacci of " + n +" is :" + recursiveFib(n));
        print("Total recursive call is .: "+ counter);
        
    }

    private static int recursiveFib(int n){
        counter++;
        if (n == 0 || n == 1) return n;
        else return recursiveFib(n-1) + recursiveFib(n-2);
    }
    
    private static void print(String string) {
        System.out.println(string);
    }
    
}
