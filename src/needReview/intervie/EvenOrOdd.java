package needReview.intervie;

import java.util.Scanner;

/*
user enter a number
if even - "even"
if odd - "odd"
 */
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = key.nextInt();
        evenOrOdd(num);
    }

    public static void evenOrOdd (int num){
        if(num%2==0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
