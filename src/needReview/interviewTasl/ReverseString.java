package needReview.interviewTasl;

public class ReverseString {
    /*
     String reverse. Write a method that will take one string as an argument and return the reverse version of this string.
     */
    public static void main(String[] args) {
        System.out.println(reverseString("Feyruz"));
    }
    public static String reverseString(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
