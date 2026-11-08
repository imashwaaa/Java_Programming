package Practice_problems;

public class Array_eight {
    public static void main(String[] args){
        int[] nums = {2, 5, 2, 8, 2, 9, 5, 2};
        int target = 2;
        int targetCount = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                targetCount += 1;
            }
        }
        System.out.println(target+" occurs "+targetCount+" times.");
    }
}