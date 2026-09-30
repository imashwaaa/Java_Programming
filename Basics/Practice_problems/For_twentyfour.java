package Practice_problems;

import java.util.Scanner;

public class For_twentyfour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int larOdd=0;
        int smallOdd = 0;
        boolean found = false;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (found==false && digit%2!=0){
                    larOdd = digit;
                    smallOdd=digit;
                    found = true;
                }
                else if (digit>larOdd && digit%2!=0){
                    larOdd = digit;
                }
                if (digit<smallOdd && digit%2!=0){
                    smallOdd = digit;
                }
        }
        System.out.println("Largest: "+larOdd);
        System.out.println("Smallest: "+smallOdd);

        sc.close();
    }
    
}
