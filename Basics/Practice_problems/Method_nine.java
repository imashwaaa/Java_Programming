package Practice_problems;

import java.util.Scanner;

public class Method_nine {

    static int absValue(int n){
        if (n<0){
            return (-n);
        }else{
            return n;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int absVal = absValue(num1);

        System.out.println("Absolute value: "+absVal);

        sc.close();
    }
}