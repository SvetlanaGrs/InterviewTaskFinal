package mentor_session;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnagramWIthMap {
    public static void main(String[] args) {
        String word1 ="robed";
        String word2 ="bored";
        System.out.println(isAnagram(word1, word2));
    }
    public static boolean isAnagram (String word1, String word2){
        boolean result=false;
        if(word1.length()!=word2.length()){
            result=false;
        }
        HashMap <String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <word1.length() ; i++) {
            if(!hashMap.containsKey("" +word1.charAt(i))) {
                hashMap.put("" + word1.charAt(i), 1);
            }else{
                hashMap.put("" + word1.charAt(i), hashMap.get(word1.charAt(i)+1) );
            }
        }

        HashMap <String,Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i <word2.length() ; i++) {
            if(!hashMap2.containsKey("" +word2.charAt(i))) {
                hashMap2.put("" + word2.charAt(i), 1);
            }else{
                hashMap2.put("" + word2.charAt(i), hashMap.get(word2.charAt(i)+1) );
            }
        }

        if(hashMap2.equals(hashMap)){
            result=true;
        }
        return result;
    }
}
