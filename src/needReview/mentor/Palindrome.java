package needReview.mentor;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        System.out.println(isPalindrome(str1));
        String str3 = "loop";
        System.out.println(isPalindrome(str3));
    }

    public static boolean isPalindrome(String str1) {
        if (str1.length() == 0) {
            return false;
        }
            String str2 = "";
            for (int i = str1.length() - 1; i >= 0; i--) {
                str2 += str1.charAt(i);
            }
            if (str2.equalsIgnoreCase(str1)) {
                return true;
            }
        return false;//
    }
}
