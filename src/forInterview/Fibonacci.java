package forInterview;
/*
 The Fibonacci. It is a series of numbers where the next number is the sum of the previous two numbers. The first two numbers of the Fibonacci is 0 followed by 1.
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;  // Base case: Fibonacci(0) = 0
        if (n == 1) return 1;  // Base case: Fibonacci(1) = 1

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;  // Add the last two numbers
            a = b;        // Move to the next numbers
            b = sum;
        }

        return sum;  // Return the Fibonacci number at position n
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
