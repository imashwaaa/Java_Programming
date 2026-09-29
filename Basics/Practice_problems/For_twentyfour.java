package Practice_problems;

import java.util.Scanner;

public class For_twentyfour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int Larodd = num1%10;
        int smallOdd = num1%10;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit>Larodd && digit%2!=0){
                    Larodd = digit;
                }
                if (digit<smallOdd && digit%2!=0){
                    smallOdd = digit;
                }
        }
        System.out.println("Largest: "+Larodd);
        System.out.println("Smallest: "+smallOdd);

        sc.close();
    }
    
}
