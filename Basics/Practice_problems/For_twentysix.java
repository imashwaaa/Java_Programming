package Practice_problems;

import java.util.Scanner;

public class For_twentysix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = num1;i>0;i/=10){
            int digit = i%10;
                if (digit%2==0){
                    evenSum += digit;
                }
                else if (digit%2!=0){
                    oddSum += digit;
                }
        }       
        System.out.println("Even sum = "+evenSum);
        System.out.println("Odd sum = "+oddSum);

        sc.close();

    }
    
}
