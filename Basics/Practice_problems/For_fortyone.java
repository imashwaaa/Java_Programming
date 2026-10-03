package Practice_problems;

import java.util.Scanner;

public class For_fortyone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int sum=0,digitCount=0,avgCount=0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            sum += digit;
            digitCount += 1;
        }
        double average = (double)sum/digitCount;
        System.out.println("Average: "+average);

        for (int j = num1; j>0; j/=10){
            int countDigit = j%10;
            if (countDigit>average){
                avgCount+=1;
            }
        }
        System.out.println("Digit count greater than average: "+avgCount);
        sc.close();
    }
    
}
