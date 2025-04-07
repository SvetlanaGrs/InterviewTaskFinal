package needReview.intervie;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
Input: {"Java", "Selenium", "API"} Output: {"avaJ", "muineleS", "IPA"}
 */
public class Interview1_10 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java", "Selenium", "API"));
        System.out.println(reversedArr(arr));
    }

    public static ArrayList<String> reversedArr (ArrayList<String> arr){
        ArrayList <String> reverseArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
           String outter =arr.get(i);
           String reverseWord="";
            for (int j = outter.length()-1; j >= 0 ; j--) {
                reverseWord += outter.charAt(j);
            }
            reverseArr.add(reverseWord);
        }

        return reverseArr;
    }

}
