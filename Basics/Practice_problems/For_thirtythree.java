package Practice_problems;

import java.util.Scanner;

public class For_thirtythree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largestEven = 0, smallestEven=0;
        boolean found = false;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit%2==0 && found==false){
                    largestEven=digit;
                    smallestEven=digit;
                    found=true;
                }
                if (digit>largestEven && digit%2==0){
                    largestEven=digit;
                }
                if (digit<smallestEven && digit%2==0){
                    smallestEven=digit;
                }
            }

        System.out.println("Largest even: "+largestEven);
        System.out.println("Smallest even: "+smallestEven);

        sc.close();
    }
    
}
