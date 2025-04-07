package needReview.interviewTasl;

/*
Write a program that prints outthe numbers from 1 to 30 butfor numbers which are a multiple
of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA"
instead ofthe number. For numbers which are a multiple of both 3 and 5,print "FINRA" instead
ofthe number.
 */
public class PrimeNumbers {
public static void main (String [] args) {
   // numbers(20);
    System.out.println(isPrime2(20));
    System.out.println(isPrime2(1));
    System.out.println(isPrime2(2));
    System.out.println(isPrime2(3));

}

/*
Prime number. A prime number is a number that can only be divided by itself and 1 without remainder.
 */
    public static boolean isPrime2(int num){
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }



public static void numbers(int number){
    for (int i = 1; i <=30; i++) {
      if(number%3==0&number%5==0)  {
          System.out.println("FINRA");
          break;
      }
      if(number%3==0){
          System.out.println("FIN");
          break;
      }
      if(number%5==0){
          System.out.println("RA");
          break;
      }else{
          System.out.println("Number is not multiple by 3 or 5");
          break;
      }
    }
}


}
