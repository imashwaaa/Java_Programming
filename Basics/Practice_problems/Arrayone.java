package Practice_problems;

public class Arrayone {
    public static void main(String[] args){
        int[] nums = {12, 25, 36, 48, 59};

        System.out.println("1. Print all elements using a for loop.");
        for (int i=0 ; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("2. Print the first element.");
        System.out.println(nums[0]);

        System.out.println("3. Print the last element using .length.");
        System.out.println(nums[nums.length-1]);
    }
    
}
