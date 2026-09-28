package Practice_problems;

import java.util.Scanner;

public class For_sixteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int oddCount = 0;
        int oddSum = 0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit%2!=0){
                    oddCount += 1;
                    oddSum += digit;
                }
        }
        System.out.println("Number of odd digit = "+oddCount);
        System.out.println("Sum of those odd numbers = "+oddSum);

        sc.close();
    }
    
}
