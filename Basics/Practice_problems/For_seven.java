package Practice_problems;

import java.util.Scanner;

public class For_seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int fac = 1;

        for (int i = num1;i>=1;i--){
            fac *= i;
        }
        System.out.println(fac);
        sc.close();
    }
    
}
