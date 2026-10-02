package Practice_problems;

import java.util.Scanner;

public class For_twentyfive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int greaterFivecount = 0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit > 5) {
                    greaterFivecount += 1;
                }
        }
        System.out.println(greaterFivecount);
        sc.close();
    }
    
}
