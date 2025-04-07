package needReview.interviewTasl;

import java.util.ArrayList;
import java.util.Arrays;

/*

Write a function to check whether  each number In ArrayList is even or odd.

 */
public class EvenOdd {
    public static void evenOdd(ArrayList <Integer> nums){
        for(Integer each:nums){
            if(each!=0) {
                if (each % 2 == 0) {
                    System.out.println(each + " is even");
                } else if (each % 2 != 0) {
                    System.out.println(each + " is odd");
                }
            }else {
                System.out.println("0 can not be even or odd");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,0,-100));
        evenOdd(nums);
    }
}
