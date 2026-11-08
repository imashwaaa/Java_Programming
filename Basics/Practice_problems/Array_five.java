package Practice_problems;

public class Array_five {
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50};

        int sum = 0;
        int numCount = nums.length;

        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        double average = (double)sum/numCount;
        System.out.println("Average: "+average);
    }
}