package forInterview;
/*
Remove duplicate numbers from ArrayList
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
       // ArrayList <String> words = new ArrayList<>(Arrays.asList("Java", "Selenium", "java", "Python"));
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,10,10,9));
        System.out.println("Before removing duplicates: " + nums);
        removeDuplicates(nums);
        removeDuplicate2(nums);
    }

    public static void removeDuplicates (ArrayList <Integer> nums){
      ArrayList <Integer> removedList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if(!removedList.contains(nums.get(i))){
                removedList.add(nums.get(i));
            }
        }
        System.out.println("After removing duplicates: " + removedList);
    }

    public static void removeDuplicate2 (ArrayList <Integer> nums){
        HashSet <Integer> removedList = new HashSet<>(nums);
        System.out.println(removedList);
    }
    //3 options -> stream()->.distinct()->collect(COllectors.toList());
    //4 options -> LinkedHashSet
    //Choose the best for you (probably for loop + mentioned HashSet
}
