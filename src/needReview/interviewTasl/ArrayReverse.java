package needReview.interviewTasl;

import java.util.Arrays;

public class ArrayReverse {
    /*
    Array reverse. Write a method that will take an array as an argument and reverse it.
     */
    public static void main(String[] args) {
        int [] arr1= {1,2,3,4} ;
        //Before
        System.out.println(Arrays.toString(arr1));
        reverseArray(arr1);
        //After
        System.out.println(Arrays.toString(arr1));

    }

    public static void reverseArray(int [] arr){
        int startPoint=0;
        int endPoint=arr.length-1;
        while(startPoint<endPoint){
            int temp=arr[startPoint];
            arr[startPoint]=arr[endPoint];
            arr[endPoint]=temp;

            startPoint++;
            endPoint--;
        }
    }



























}
