package needReview.interviewTasl;

import java.util.Arrays;

public class SumOf2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 5}, 4)));
    }
    public static  int [] sum(int [] numArr, int num){
        int [] sumArr = new int [2];
        for (int i = 0; i <numArr.length ; i++) {
            for (int j = 0; j <numArr.length ; j++) {
                if(numArr[i]+numArr[j]==num){
                    sumArr[0]=numArr[i];
                    sumArr[1]=numArr[j];
                }
            }
        }

        return sumArr;
    }
}
