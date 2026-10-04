package Practice_problems;

import java.util.Scanner;

public class Method_two {

    static int largestDigit(int n) {
        int largest = -1;

        for (int i = n; i>0; i/=10){
            int digit = i%10;
                if (digit>largest){
                    largest=digit;
                }
        }

        return largest;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int largestNum = largestDigit(num1);

        System.out.println("Largest digit: "+largestNum);

        sc.close();
}
}