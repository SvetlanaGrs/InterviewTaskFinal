package needReview.interviewTasl;

public class Anagram2 {
    public static void main(String[] args) {
        isAnagram("listen", "silent");
    }

    public static void isAnagram(String str1, String str2){
        if(str1.length()==str2.length()){
            for (int i = 0; i <str1.length() ; i++) {

                for (int j = 0; j < str2.length(); j++) {
                    if(str1.charAt(i)==str2.charAt(j)){
                       str1= str1.replaceFirst("" + str1.charAt(i)," ");
                    }
                }
            }
            if(str1.isBlank()){
                System.out.println("Is Anagram");
            }
        }
    }
}
