package needReview.interviewTasl;
/*
Given any String determine if itis Palindrome. Print“Palindrome”if itis and “Not Palindrome”if
itis not:
 */
public class palindrome {
    public static void main(String[] args) {
        palindromeOrNot("Madam");
        palindromeInt(101);
    }

    public static void palindromeOrNot(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        if(result.equalsIgnoreCase(str)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }

    public static void palindromeInt(int num){
        String intNuminString= "" + num;
        String result="";
        for (int i = intNuminString.length()-1; i >=0 ; i--) {
            result+=intNuminString.charAt(i);
        }
        if(result.equalsIgnoreCase(intNuminString)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
