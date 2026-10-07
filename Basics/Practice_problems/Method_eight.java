package Practice_problems;

import java.util.Scanner;

public class Method_eight {

    static boolean isDivisiblebyFive(int n){
        if (n%5==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        boolean divFive = isDivisiblebyFive(num1);
        System.out.println("Is the number divisible by five?: "+divFive);

        sc.close();
    }
}
