package Practice_problems;

import java.util.Scanner;

public class While_five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        //generating output
        int i = 1;
        while (i<=10) {
            System.out.println(num1+" X "+i+" = "+num1*i);
            i++;
        }

        sc.close();
    }
    
}
