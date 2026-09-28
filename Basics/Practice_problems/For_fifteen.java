package Practice_problems;

import java.util.Scanner;

public class For_fifteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int smallest=num1%10;
        for (int i = num1; i>0; i/=10){
            int digit = i%10;
             if (digit<smallest) {
                smallest=digit;
             }
        }
        System.out.println(smallest);

        sc.close();
    }
    
}