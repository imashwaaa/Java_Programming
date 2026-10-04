package Practice_problems;

import java.util.Scanner;

public class For_fortyseven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int smallest = 10;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
                for (int j = num1; j>0; j/=10){
                    int countDigit = j%10;
                        if (countDigit==digit){
                            count++;
                        }    
                }
            if (count%2==0){
                if (digit<smallest){
                    smallest=digit;
                }
            }    
        }
        if (smallest!=10){
            System.out.println("Smallest digit that appears even number of times: "+smallest);
        }   else{
            System.out.println("No qualifying digit exists");
        }

        sc.close();
    }
    
}
