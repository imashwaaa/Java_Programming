package Practice_problems;

import java.util.Scanner;

public class For_twentyseven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largest = 0;
        int smallest = num1%10;

        for (int i = num1; i>0 ; i/=10){
            int digit = i%10;
                if (digit>largest){
                    largest = digit;
                }
                if (digit<smallest){
                    smallest = digit;
                }
        }       
        int difference = largest - smallest;
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);

        System.out.println("Difference = "+largest+" - "+smallest+" = "+difference);

        sc.close();
    }
    
}
