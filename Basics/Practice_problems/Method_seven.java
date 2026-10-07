package Practice_problems;

import java.util.Scanner;

public class Method_seven {
    static boolean isOdd(int num){
        if (num%2!=0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        boolean odd = isOdd(num1);

        System.out.println("Is the number odd?: "+odd);

        sc.close();
    }
    
}
