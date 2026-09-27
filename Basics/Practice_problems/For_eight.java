package Practice_problems;

import java.util.Scanner;

public class For_eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int evenFac = 1;

        for (int i = 2;i<=num1;i+=2){
            evenFac *= i;
        }
        System.out.println(evenFac);

        sc.close();
    }
    
}
