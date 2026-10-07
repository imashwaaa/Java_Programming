package Practice_problems;

import java.util.Scanner;

public class Method_ten {

    static int larDigit(int num){
        int largest = -1;

        for (int i = num; i>0; i/=10){
            int digit = i%10;
                if (digit>largest){
                    largest=digit;
                }
        }
        return largest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int largestDigit = larDigit(num1);

        if (largestDigit!=0){
            System.out.println("Largest Digit: "+largestDigit); 
        } else{
            System.out.println("number invalid");
        }

        sc.close();
    }
}
