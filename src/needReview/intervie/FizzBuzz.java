package needReview.intervie;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(50); // Call the method to print FizzBuzz up to 50
    }

    public static void fizzBuzz(int limit) {
        // Loop through numbers from 1 to the given limit
        for (int num = 1; num <= limit; num++) {

            // Check if the number is divisible by both 3 and 5 (FizzBuzz)
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz"); // Print "FizzBuzz"
            }
            // Check if the number is divisible by 5 (Buzz)
            else if (num % 5 == 0) {
                System.out.println("Buzz"); // Print "Buzz"
            }
            // Check if the number is divisible by 3 (Fizz)
            else if (num % 3 == 0) {
                System.out.println("Fizz"); // Print "Fizz"
            }
            // If the number is neither divisible by 3 nor 5, print the number itself
            else {
                System.out.println(num); // Print the number
            }
        }
    }
}
