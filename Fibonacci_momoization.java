package fibonacci_dynamic;

/**
 * program to print the nth fibonacci number using Recursion (memoized)
 * @author Bijay Khatri
 * @since June 7, 2016
 */
public class Fibonacci_momoization {
    private static int recursiveCallCounter = 0;
    public static void main(String[] args) {
        int n = 30;
        print("The fibonacci of " + n +" is :" + memoizedFib(n));
        print("Total recursive call is .: "+ recursiveCallCounter);
    }

    private static int memoizedFib(int n) {
        int [] arr = new int[n+1];
        //let's initialize the content initally to -1
        for(int i = 0; i < n + 1 ;i++){
            arr[i] = -1;
        }
        return recursiveFib(n,arr);
    }

    private static int recursiveFib(int n, int[] arr) {
        ++recursiveCallCounter;
        if(arr[n] < 0){
            if (n == 0 || n == 1){
                arr[n] = n;
            }
            else{
                arr[n] = recursiveFib(n-1, arr) + recursiveFib(n-2, arr);
            }
        }
        return arr[n];
    }

    private static void print(String string) {
        System.out.println(string);
    }
    
}
