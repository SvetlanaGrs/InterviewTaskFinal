package needReview.intervie;

/* Task #15 - SwitchInLoop

    Create a class called SwitchInLoop in your Practice_Programming project and inside the day18_tasks package

        Task:

                    Given loop iterates n times (from 0 to n), I want to use switch statement in the loop and print out for each case

        Ex:
                    Input:
                        5
                    Output:
            Zero
            One
            Two
            Three
            Four
            Five
*/
public class Switch {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
