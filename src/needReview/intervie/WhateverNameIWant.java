package needReview.intervie;

public class WhateverNameIWant {
    public static void main(String[] args) {
        System.out.println(getFirstThree("Nadir"));
        System.out.println(getFirstThree("NA"));
    }

    public static String  getFirstThree (String str){
        String result ="";
        result=str.substring(0,3);
        return result;
    }
}
