package needReview.intervie;

import java.util.Scanner;

public class PyramidOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows do you want in your pyramid?");
        int noOfRows = scan.nextInt();

        // Initialize the rowCount variable to start the number at 1 for the first row
        int rowCount = 1;
        // Display a message to indicate the start of the pyramid
        System.out.println("Here is your pyramid:");

        // Outer loop for the number of rows
        for (int i = noOfRows; i > 0; i--) {  // Start with noOfRows and decrement for each row
            // First inner loop for printing spaces (to align numbers in the center)
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");  // Print space
            }
            // Second inner loop to print the numbers
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");  // Print the current row number
            }
            // Move to the next line after printing each row
            System.out.println();
            // Increment rowCount for the next row
            rowCount++;
        }
    }
}

