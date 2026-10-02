package Practice_problems;

import java.util.Scanner;

public class For_thirtyseven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largest=-1, secLargest=-1, thirdLargest=-1;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit>largest){
                    thirdLargest=secLargest;
                    secLargest=largest;
                    largest=digit;
                }
                else if (digit<largest && digit>secLargest){
                    thirdLargest=secLargest;
                    secLargest=digit;
                }
                else if (digit<secLargest && digit>thirdLargest){
                    thirdLargest=digit;
                }
        }
        if (largest>-1 && secLargest>-1 && thirdLargest>-1){
            int sum = largest+secLargest+thirdLargest;
            System.out.println("Sum of three numbers is: "+sum);
        }
        else{
            System.out.println("Given number doesnt satisfy the conditions");
        }
        
        sc.close();
    }
    
}
