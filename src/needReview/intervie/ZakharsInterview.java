package needReview.intervie;

import java.util.Scanner;

public class ZakharsInterview {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter a word: ");
        String word = key.next();
        System.out.println(word);

        /*
        word = pop
        anagram - read front to back and back to front the same
         */

        String wordAnagram = "";
        for (int i = word.length()-1; i >=0; i--) {
            if (!wordAnagram.contains("" + word.charAt(i)));
            wordAnagram+=word.charAt(i);

        }
        if (word.equals(wordAnagram)){
            System.out.println("It's an anagram");
        } else {
            System.out.println("It is not an anagram");
        }

    }
}
