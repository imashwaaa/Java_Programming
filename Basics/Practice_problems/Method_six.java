package Practice_problems;

import java.util.Scanner;

public class Method_six {

    static int reverseNum (int num){
        int reversed = 0;
        for (int i = num; i>0; i/=10){
            int digit= i%10;
            reversed = reversed*10+digit;
        }
        return reversed;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int result = reverseNum(num1);

        System.out.println("Reversed: "+result);

        sc.close();
    }
}
