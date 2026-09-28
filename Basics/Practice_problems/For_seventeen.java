package Practice_problems;

import java.util.Scanner;

public class For_seventeen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int oddProduct = 1;

        for (int i = num1;i>0;i/=10){
            int digit = i%10;
                if (digit%2!=0){
                    oddProduct *= digit;
                }
        }
        System.out.println("Product of odd numbers: "+oddProduct);
        sc.close();
    }
    
}
