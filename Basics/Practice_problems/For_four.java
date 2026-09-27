package Practice_problems;

import java.util.Scanner;

public class For_four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int sum=0;

        for (int i=1; i<=num1; i++){
            sum+=i;
        }
        System.out.println(sum);

        sc.close();
    }
    
}
