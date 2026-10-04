package Practice_problems;

import java.util.Scanner;

public class Method_three {

    static int largestInt(int n1, int n2){
        if (n1>n2){
            return n1;
        } else{
            return n2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        int result = largestInt(num1, num2);

        System.out.println("The largest number is: "+result);

        sc.close();
    }
    
}
