package needReview.intervie;

import java.util.Scanner;

public class Counts {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Please first word: ");
        String first = key.next().toLowerCase();
        System.out.print("Enter Please second word: ");
        String second = key.next().toLowerCase();
        if (first.length()<6 && second.length()<6) {
            System.out.println("Invalid");
        } else {
            String result = first.substring(0,4) +second.substring(second.length()-3);
            System.out.println(result);
        }
    }
}
