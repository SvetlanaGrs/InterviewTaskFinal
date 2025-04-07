package needReview.interviewTasl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Swap two numbers without using a temporary variable.
 */
public class Swap {
    public static void main(String[] args) {
       int a = 100;
       int b = 200;
        System.out.println("Before swap: " +"a= " + a + "b= " + b );
        swapNums(a,b);
        List <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(swapNums2(nums));
        List <String> words = Arrays.asList("Apple", "Pineapple", "Banana", "Watermellon");
        System.out.println(swapNums3(words));

        int aa=1;
        int bb=2;
        swapNum1Num2(aa,bb);
    }

    public static void swapNum1Num2 (int a, int b){
        a = a+ b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }


    public static void swapNums(int num1 , int num2){
       num1=num1+num2;
       num2=num1-num2;
       num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static List<Integer> swapNums2 (List <Integer> nums){
        for (int i = 0; i < nums.size()-1; i+=2) {
            int temporary = nums.get(i);
            nums.set(i, nums.get(i+1));
            nums.set(i+1, temporary );
        }
        return nums;
    }

    public static List <String> swapNums3(List <String> words){
        for (int i = 0; i < words.size()-1; i+=2) {
            String temp = words.get(i);
            words.set(i, words.get(i+1));
            words.set(i+1, temp);

        }
        return words;
    }
}
