package mentor_session;
//Anagram - different combination letters of the same words
public class Anagram {
    public static void main(String[] args) {
        String word1 ="listen";
        String word2 ="silent";
        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram (String word1, String word2){
        boolean result=false;
        if (word1.length()!=word2.length()){
            result=false;
        }

        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if(word1.charAt(i)==word2.charAt(j)){
                    word2=word2.replaceFirst("" + word2.charAt(j),"");
                }
            }
            if(word2.isEmpty()){
                result=true;
            }
        }

        return result;
    }
}
