package mentor_session;

import java.util.Map;
import java.util.TreeMap;
//INTERVIEW TASK
/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class WordCount {
    public static void main(String[] args) {
        String [] str = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(str));
    }

    public static Map <String, Integer> wordCount (String [] str){
        Map <String, Integer> map = new TreeMap<>();
        for (String each:str){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else {
                map.put(each,map.get(each)+1);
            }
        }
        return map;
    }
}
// Diana check merge
