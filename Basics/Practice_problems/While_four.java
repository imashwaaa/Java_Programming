package Practice_problems;

import java.util.Scanner;

public class While_four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //generating output
        int i = num;
        while (i>=1){
            System.out.println(i);
            i--;
        }

        sc.close();
    }
    
}
