package Practice_problems;

public class Array_six {
    public static void main(String[] args){
        int[] nums = {12, 7, 8, 15, 20, 3, 11};
        int evencount = 0, oddcount=0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i]%2==0){
                evencount+=1;
            }
            else if (nums[i]%2!=0){
                oddcount+=1;
            }
        }
        System.out.println("Even numbers: "+evencount);
        System.out.println("Odd numbers: "+oddcount);
    }
    
}