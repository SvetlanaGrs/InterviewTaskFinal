package needReview.interviewTasl;

public class maxMinNumberFromArray {
    /*
    Max/min number from an array. Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.
     */
    public static void main(String[] args) {
        System.out.println(maxNumber(new int[]{1, 2, 3, 4, 5, 10}));
        System.out.println(secondMaxNumber(new int[]{1, 2, 3, 4, 5, 10}));
        System.out.println(secondMinNumber(new int[]{1, 2, 3, 4, 5, 10}));
    }

    public static int maxNumber(int [] nums){
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }


    /*
    Find the second min/max number from an array. Write a method that accepts an int array as an argument and returns a second or n min/max number from the given array.
     */
    public static int secondMaxNumber(int [] nums){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                secondMax=max;
                max=nums[i];
            }else if(nums[i]>secondMax&&nums[i]!=secondMax){
                secondMax=nums[i];
            }
        }
        return secondMax;
    }

    public static int secondMinNumber(int [] nums){
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                min2=min;
                min=nums[i];
            }else if(nums[i]<min2&&nums[i]!=min2){
                min2=nums[i];
            }
        }
        return min2;
    }
}
