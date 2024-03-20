import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        // Read the input as an integer
        int n = scanner.nextInt();

        // Display a message indicating the number of terms for the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        // Iterate through each term up to the specified number
        for (int i = 0; i < n; i++) {
            // Print the Fibonacci number at position i
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number at position n
    public static int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n <= 1)
            return n;
            // Recursive case: calculate Fibonacci number by summing the previous two numbers
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
