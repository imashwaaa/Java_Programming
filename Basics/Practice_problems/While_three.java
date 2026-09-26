package Practice_problems;

import java.util.Scanner;

public class While_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        //generating output
        int i = 1;//start
        while (i<=num1){ //check
            System.out.println(i);//do
            i++;//change
        }

        sc.close();
    }
    
}
