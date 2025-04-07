package needReview.intervie;

import java.util.Scanner;

public class DianaInterview {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter a sentence:");
        String sentence = key.nextLine();
        System.out.println(sentence);
        System.out.println(sentence.length());
        if (sentence.contains(" ")) {
            System.out.println("Your sentence has multiple words");
        }
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("You have " + (count+1) + " words");
    }
}
