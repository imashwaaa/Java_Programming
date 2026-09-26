package Practice_problems;

import java.util.Scanner;

public class For_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int count = 0;

        for (int i=1; i<=num1; i++){
            if (i%2!=0){
                count += 1;
            }
        }
        System.out.println("There are "+count+" odd numbers.");

        sc.close();
    }
    
}
