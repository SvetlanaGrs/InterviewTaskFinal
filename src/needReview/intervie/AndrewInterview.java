package needReview.intervie;

import java.util.Arrays;
/*
reverse each name
 */

public class AndrewInterview {
    public static void main(String[] args) {
        String [] names = {"Nadir", "Zakhar"};
        System.out.println(Arrays.toString(names));
        String [] eachNameInArr = new String [names.length];
        for (int i = 0; i < names.length; i++) {
           String eachName= names[i];
           String eachNameReverse="";
            for (int j = eachName.length()-1; j >=0; j--) {
                eachNameReverse+=eachName.charAt(j);
            }
            eachNameInArr[i]=eachNameReverse;
        }
        System.out.println(Arrays.toString(eachNameInArr));
    }
}
