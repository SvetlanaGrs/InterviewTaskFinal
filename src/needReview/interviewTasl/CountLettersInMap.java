package needReview.interviewTasl;

import java.util.HashMap;
import java.util.Map;

public class CountLettersInMap {
/*
Count letters(Map). Write a method that accepts a string as an argument. The method counts the number of appearances of each char and returns a map. The key will be a letter and the value will be the number of appearances in the string. See the input and output in the example.
 */
public static void main(String[] args) {
    countLetters("hello");
}
public static void countLetters(String str){
    Map<Character,Integer> countLetters=new HashMap<>();
    for (int i = 0; i <str.length() ; i++) {
        char ch=str.charAt(i);
        if(countLetters.containsKey(ch)){
            countLetters.put(ch,countLetters.get(ch)+1);
        }else {
            countLetters.put(ch,1);
        }
    }
    System.out.println(countLetters);
}
}
