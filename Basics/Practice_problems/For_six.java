package Practice_problems;

import java.util.Scanner;

public class For_six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int oddSum = 0;

        for (int i = 1; i<=num1; i++){
            if (i%2!=0){
                oddSum += i;
            }
        }
        System.out.println(oddSum);

        sc.close();
    }
    
}
