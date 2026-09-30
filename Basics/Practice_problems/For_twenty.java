package Practice_problems;

import java.util.Scanner;

public class For_twenty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int oddSmallest = 0;
        boolean found = false;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit%2!=0 && found==false){
                    oddSmallest=digit;
                    found=true;
                }
                else if (digit<oddSmallest && digit%2!=0){
                    oddSmallest=digit;
                }

        }

        System.out.println(oddSmallest);

        sc.close();
    }
    
}
