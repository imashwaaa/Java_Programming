package Practice_problems;

import java.util.Scanner;

public class For_fortyfive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int smallest = 10, secSmallest=10;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count=0;
                for (int j=num1; j>0; j/=10){
                    int countDigit = j%10;
                        if (countDigit==digit){
                            count++;
                        }
                }
            if (count==2){
                if (digit<smallest){
                    secSmallest=smallest;
                    smallest=digit;
                }
                else if (digit>smallest && digit<secSmallest){
                    secSmallest=digit;
                }
            }
        }
        if (secSmallest!=10){
            System.out.println("Second smallest digit occuring exactly twice: "+secSmallest);
        }   else{
            System.out.println("No second smallest qualifying digit exists");
        }
        

        sc.close();
    }
    
}
