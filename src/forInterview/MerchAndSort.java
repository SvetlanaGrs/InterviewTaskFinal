package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/*
Write a method named mergeAndSortLists that takes two ArrayLists of integers
        as input and returns a new ArrayList.
        This new list should contain all elements from both input lists,
        with duplicates removed and the entire list sorted in ascending order.
 */
public class MerchAndSort {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,5,5,6,7,8,1,2));
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(20,21,2,3,4,6,6));
        System.out.println(merchSort(list1, list2));

    }
    public static ArrayList<Integer> merchSort (ArrayList<Integer> list1, ArrayList <Integer> list2){
        HashSet <Integer> list1Nodublicate = new HashSet<>(list1);
        HashSet <Integer> list2Nodublicate = new HashSet<>(list2);
        TreeSet<Integer> list3 = new TreeSet<>();

        list3.addAll(list1Nodublicate);
        list3.addAll(list2Nodublicate);

        ArrayList <Integer> result = new ArrayList<>(list3);

        return result;
    }

    //And one more method with for loop

    public static ArrayList <Integer> merchSort2 (ArrayList<Integer> list1, ArrayList <Integer> list2){
        ArrayList <Integer> resultList = new ArrayList<>();
        for (Integer each:list1){
            if(!list1.contains(each)){
                resultList.add(each);
            }
        }
        for (Integer each2:list2){
            if(!resultList.contains(each2)){
                resultList.add(each2);
            }
        }
        // Collections.sort(resultList);

        for (int i = 0; i < resultList.size()-1; i++) {
            for (int j = 0; j <resultList.size()-1 ; j++) {
                if(resultList.get(j)>resultList.get(i)){
                    Integer temp = resultList.get(j);
                    resultList.set(j, temp);
                }
            }
        }
        return resultList;
    }
}
