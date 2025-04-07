package needReview.interviewTasl;
/*
Remove duplicates from a string. Write a method that accepts one string argument and returns it without duplicates. We will see two versions of this method.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));

    }
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains("" +str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
