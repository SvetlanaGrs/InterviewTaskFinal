package needReview.intervie;
import java.util.Scanner;

public class DiamondOfAsterisks {
public static void main(String[] args) {

   // Input the number of rows (height of the diamond)
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the height of the diamond (odd number): ");
   int n = scanner.nextInt();

   // Check if the number is odd, as the diamond pattern requires it
   if (n % 2 == 0) {
       System.out.println("Please enter an odd number.");
       return;
   }
   // Upper part of the diamond (including the middle row)
   for (int i = 1; i <= n; i += 2) {
       // Print spaces
       for (int j = i; j < n; j += 2) {
           System.out.print(" ");
       }
       // Print stars
       for (int j = 1; j <= i; j++) {
           System.out.print("*");
       }
       // Move to the next line after each row
       System.out.println();
   }
   // The Lower part of the diamond (below the middle row)
   for (int i = n - 2; i >= 1; i -= 2) {
       // Print spaces
       for (int j = n; j > i; j -= 2) {
           System.out.print(" ");
       }
       // Print stars
       for (int j = 1; j <= i; j++) {
           System.out.print("*");
       }
       // Move to the next line after each row
       System.out.println();
   }
  }
 }
