package Practice_problems;

import java.util.Scanner;

public class For_fortysix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largest = -1;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
                for (int j = num1; j>0 ; j/=10){
                    int countDigit= j%10;
                        if (countDigit==digit){
                            count++;
                        }
                }
            if (count%2!=0){
                if (digit>largest){
                    largest=digit;
                }
            }
        }
        if (largest == -1) {
            System.out.println("No qualifying digit exists.");
        } else {
            System.out.println("Largest digit appearing odd number of times: " + largest);
        }

        sc.close();
    }
    
}
