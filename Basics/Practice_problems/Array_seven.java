package Practice_problems;

public class Array_seven {
    public static void main(String[] args){
        int[] nums = {14, 27, 35, 42, 56, 63};
        int target = 42;
        boolean found = false;

        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                found=true;
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        if(found==false){
            System.out.println("Element not found");
        }
    } 
}