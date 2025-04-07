package forInterview;

public class ReverseInt {
    public static void main(String[] args) {
        int num=12345;
        System.out.println("Original number is: " + num);
        reverseNum(num); //12345:10 = 5 (remainder)

    }

    public static void reverseNum(int num){
        int result=0;
        while (num!=0){
            int lastDigit = num % 10; //getting last number
            result = result * 10 +lastDigit;
            num=num/10; //remove last digit

        }
        System.out.println("Reverse number is: " + result);
    }
}
