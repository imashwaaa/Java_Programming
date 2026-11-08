package Practice_problems;

public class Array_three {
    public static void main(String[] args){
        int[] nums = {23, 56, 12, 89, 34};

        int largest = nums[0];
        for (int i=0; i<nums.length; i++){
            if (nums[i]>=largest){
                largest=nums[i];
            }
        }
        System.out.println("Largest number: "+largest);
    }
    
}