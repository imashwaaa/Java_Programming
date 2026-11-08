package Practice_problems;

public class Array_four {
    public static void main(String[] args){
        int[] nums = {45, 12, 78, 3, 56, 21};

        int smallest = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println("Smallest: "+smallest);
    }
    
}