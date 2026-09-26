package Practice_problems;

import java.util.Scanner;

public class While_seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        //output
        int sum = 0;
        int i = num1;
        
        while (i>=1) {
            if (i%2==0){
                sum += i;
            }
            i--;
        }
        System.out.println(sum);

        sc.close();
    }
    
}