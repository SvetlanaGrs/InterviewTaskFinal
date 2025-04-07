package needReview.interviewTasl;
/*
Given two Strings determine if they are Anagrams -> Are built of the same characters:
 */
public class Anagram {
    public static void main(String[] args) {
        isAnagram("silent","listen");
    }

    public static void isAnagram(String str1,String str2) {

        if(str1.length()!=str2.length()){
            System.out.println("Not an anagram");
        }else{
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if(str1.charAt(i)==str2.charAt(j)){
                        str2 = str2.replaceFirst("" + str2.charAt(j), "");
                    }
                }
            }
            if(str2.isEmpty()){
                System.out.println("Anagram");
            }
        }
    }

}
