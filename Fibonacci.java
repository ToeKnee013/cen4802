/**
 * This class includes a method to find the nth term in the Fibonacci sequence.
 */
public class Fibonacci {
    // The following IF statement is a Recursive method that finds the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {

        /**
         * Using a Recursive method, this returns the nth term in the Fibonacci sequence.
         *
         * @param n the positive integer term of the sequence.
         * @return the nth term result.
         * @throws IllegalArgumentException if the input term is not a positive integer.
         */
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid. Try again with a positive integer."); // Negative number error message
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Request the 10th term in the sequence
        int result = fibonacci(n); // Calling the method
        System.out.println("The following number " + n + " is the th term of the Fibonacci sequence is " + result + "."); // Output message
    }
}