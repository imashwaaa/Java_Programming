package Practice_problems;

import java.util.Scanner;

public class For_eleven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int reverse=0;

        for (int i = num1; i > 0; i/=10){
            int digit = i%10;
            reverse = reverse*10+digit;
        }
        System.out.println(reverse);

        sc.close();
    }
}
