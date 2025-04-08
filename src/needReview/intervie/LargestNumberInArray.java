package needReview.intervie;

import java.util.Arrays; // Import Arrays class for sorting

public class LargestNumberInArray {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {5, 6, 76, 31, 43, 1};

        // Call the method to find and print the largest number
        System.out.println("The largest number in the array is: " + findLargestNumber(arr));
    }

    public static int findLargestNumber(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // The largest number will be at the last index of the sorted array
        return arr[arr.length - 1]; // Return the largest number
    }
}

