package needReview.interviewTasl;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 4478930;
        System.out.println(num);
        System.out.println(reversedNum(num));
    }

    public static Integer reversedNum (Integer num){
        String numInString = num.toString();
        String reversed ="";
        for (int i = numInString.length()-1; i >=0 ; i--) {
            reversed+=numInString.charAt(i);
        }
        return Integer.valueOf(reversed);
    }
}
