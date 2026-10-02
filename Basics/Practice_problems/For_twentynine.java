package Practice_problems;

import java.util.Scanner;

public class For_twentynine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter digits to search: ");
        int digitSearch = sc.nextInt();
        int digitCount = 0;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit==digitSearch){
                    digitCount += 1;
                }
        }
        System.out.println("Occurrences: "+digitCount);

        sc.close();
    }
    
}
