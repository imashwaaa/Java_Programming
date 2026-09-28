package Practice_problems;

import java.util.Scanner;

public class For_nineteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int evenlargest = 0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit % 2 ==0 && digit > evenlargest){
                    evenlargest = digit;
                }
        }
        System.out.println(evenlargest);

        sc.close();
    }
    
}
