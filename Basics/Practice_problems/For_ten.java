package Practice_problems;

import java.util.Scanner;

public class For_ten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int counter = 0;

        for (int i = num1; i>=1; i/=10){
                counter++;
        }
        System.out.println(counter);

        sc.close();
    }
    
}