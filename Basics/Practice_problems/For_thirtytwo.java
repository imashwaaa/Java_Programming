package Practice_problems;

import java.util.Scanner;

public class For_thirtytwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int sum = 0,digitCount=0,average,averageCount=0,greaterSum=0;

        for (int i = num1;i>0;i/=10){
            int digit = i%10;
            sum +=digit;
            digitCount += 1;
        }
        average = sum/digitCount;
        System.out.println("Average: "+average);

        for (int i = num1;i>0;i/=10){
            int digit = i%10;
                if (digit>average){
                    averageCount += 1;
                    greaterSum+=digit;
                }
        }
        System.out.println("Digit count greater than "+average+": "+averageCount);
        System.out.println("Sum of numbers greater than average: "+greaterSum);

        sc.close();
    }
    
}
