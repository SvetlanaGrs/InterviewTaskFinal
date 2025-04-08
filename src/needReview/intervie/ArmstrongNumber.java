package needReview.intervie;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
   System.out.println("Please enter number");
   int number = scan.nextInt();

   System.out.println("Please enter number of digits");
   int digit = scan.nextInt();

   int temp = number;
   int sum = 0;

    // Loop to calculate the sum of each digit raised to the power of 'digit'
    do {
        int value = temp % 10;  // Extract last digit
        temp /= 10;  // Remove last digit

        int powerResult = 1; // Initialize result for power calculation
        // Multiply the value by itself 'digit' times to simulate power
        for (int i = 0; i < digit; i++) {
            powerResult *= value;
        }

        sum += powerResult;  // Add the powered value to sum
    } while (temp > 0);

    // If the sum equals the original number, it's an Armstrong number
    if (number == sum) {
        System.out.println("This is an Armstrong number");
    } else {
            System.out.println("This is not an Armstrong number");
        }
    }
}

