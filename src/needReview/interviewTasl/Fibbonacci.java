package needReview.interviewTasl;

public class Fibbonacci {
    public static void main(String[] args) {
       fibbonacci(5);
    }
    public static void fibbonacci(int num){
        int a=0;
        int b=1;
        int sum=0;
        System.out.print(a+" ");
        System.out.print(b+ " ");
        for (int i = 2; i < num; i++) {
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
