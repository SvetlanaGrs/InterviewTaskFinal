package needReview.interviewTasl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    /*
    Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
     */

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is super cool"));
    }
    public static String reverseWords(String str){
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ",words);
    }

}
