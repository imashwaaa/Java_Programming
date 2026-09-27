package Practice_problems;

import java.util.Scanner;

public class For_twelve {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int sum = 0;

        for (int i = num1; i > 0; i/=10){
            int digit = i % 10;
            sum += digit;
        }
        System.out.println(sum);

        sc.close();
    }
    
}