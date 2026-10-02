package Practice_problems;

import java.util.Scanner;

public class For_thirtyfour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int count=0, sum=0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit>5){
                    count+=1;
                    sum+=digit;
                }
        }
        System.out.println("Count: "+count);
        System.out.println("Sum: "+sum);

        sc.close();
    }
    
}
