package needReview.intervie;

import java.util.Scanner;

public class FirstInterview {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Please enter 1 number: ");
        int number1 = key.nextInt();
        System.out.print("Please enter 2 number: ");
        int number2 = key.nextInt();
        System.out.print("Choose an operation:\n\t1. Addition\n\t2. Substraction\n\t3. Multiplication\n\t4. Division\n\tYour choice: ");
        int choice = key.nextInt();
        switch (choice) {
            case 1:
                int addition = number1+number2;
                System.out.print("Your result is: " + addition);
                break;
            case 2:
                int sub = number1-number2;
                System.out.print("Your result is: " + sub);
                break;
            case 3:
                int multiplication = number1*number2;
                System.out.println("Your result is: " + multiplication);
                break;
            case 4 :
                int division = number1/number2;
                System.out.println("Your result is: " + division);
                break;
            default:
                System.out.println("Not correct. Provide correct numbers");
        }
    }
}
