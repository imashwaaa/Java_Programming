package Practice_problems;

import java.util.Scanner;

public class For_fortytwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int sum=0, digitCount=0,lowAvgCount = 0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            sum += digit;
            digitCount += 1;
        }
        double average = (double) sum/digitCount;
        System.out.println("Average: "+average);

        for (int j = num1; j>0; j/=10){
            int countDigit = j%10;
            if (countDigit<average){
                lowAvgCount++;
            }
        }
        System.out.println("Count of digits less than average: "+lowAvgCount);
        sc.close();
    }
    
}
