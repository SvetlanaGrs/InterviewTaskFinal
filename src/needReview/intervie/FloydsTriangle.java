package needReview.intervie;
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("How many rows do you want in Floyd's Triangle?");
        // int noOfRows = scan.nextInt();
        // scan.close();

        //using a hardcoded value for the number of rows
        int noOfRows = 5;
        // Call the method to print Floyd's Triangle
        printFloydsTriangle(noOfRows);
    }
    // Method to generate and print Floyd's Triangle
    public static void printFloydsTriangle(int noOfRows) {

        int value = 1; // Start with the first number in the triangle

        System.out.println("Floyd's Triangle: ");

        // Outer loop to handle rows
        for (int i = 1; i <= noOfRows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                // Print the current value, followed by a space
                System.out.print(value + " ");
                // Increment the value for the next number in the sequence
                value++;
            }
            // After printing all numbers in a row, move to the next line
            System.out.println();
        }
    }
}

