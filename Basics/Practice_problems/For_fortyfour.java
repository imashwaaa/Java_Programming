package Practice_problems;

import java.util.Scanner;

public class For_fortyfour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largest=-1, secLargest=-1;
        
        
        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
            
                for (int j=num1;j>0;j/=10){
                    int countDigit = j%10;
                        if (countDigit==digit){
                            count++;
                        }
                }
        
            if (count==2){
                if (digit>largest){
                    secLargest=largest;
                    largest=digit;
                }
                else if (digit<largest && digit>secLargest){
                    secLargest=digit;
                }
            }
        }
        
        if (secLargest==-1){
            System.out.println("No second-largest qualifying digit exists.");
        }   else {
            System.out.println("Second largest occurring exactly twice: "+secLargest);
        }

        sc.close();
    }
    
}
