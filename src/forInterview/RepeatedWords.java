package forInterview;

public class RepeatedWords {
    public static void main(String[] args) {
        String str1 = "aaacodeebcode";
        String str2="code";
        System.out.println(timesOfRepeating(str1, str2));


    }
    public static Integer timesOfRepeating(String str1, String str2){
        int count=0;
        for (int i = 0; i < str1.length()-3; i++) {
            if(str1.substring(i,i+4).equals(str2)){
                count++;
            }
        }

        return count;
    }
}
