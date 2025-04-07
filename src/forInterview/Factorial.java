package forInterview;
public class Factorial {

    //Option 1
    // it return it calls itself
    public static int factorial1(int n) {
        if(n==1){
            return n;
        }else{
            return n * factorial1(n-1);
        }
    }

    //2 Option
    public static int factorial2(int n) {
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i; // result = result i
        }
        return result;
    }

       public static void main(String[] args) {
           System.out.println(factorial2(10));
       }

}

