package Practice_problems;

import java.util.Scanner;

public class Method_four {

    static int evenSum(int num){
        int sum = 0;
        
        for (int i = num; i>0; i/=10){
            int digit = i%10;
                if (digit%2==0){
                    sum+=digit;
                }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int sumEven = evenSum(num1);

        if (sumEven!=0){
            System.out.println("Sum of even digits: "+sumEven);
        } else{
            System.out.println("The number doesnt contain even digits");
        }

        sc.close();
    }
    
}
