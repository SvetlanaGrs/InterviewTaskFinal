package needReview.mentor;
//it is harder sentence
public class Valid_palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
           while(start<end && !Character.isLetterOrDigit(str.charAt(start))){
               start++;
           }
           while (start<end && !Character.isLetterOrDigit(str.charAt(end))){
               end--;
           }

           if(start<end && Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end))){
               return false;

           }
            start++;
            end--;

        }return true;
    }
}
