package Practice_problems;

import java.util.Scanner;

public class For_thirtyfive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int smallest = 10, secondSmallest= 10;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;   
                if (digit<smallest){
                    secondSmallest=smallest;
                    smallest=digit;
                }
                else if (digit>smallest && digit<secondSmallest){
                    secondSmallest=digit;
                }
        }
        System.out.println("Smallest: "+smallest);
        if (secondSmallest==10){
            System.out.println("No distinct second smallest number");
        }
        else{
            System.out.println("Second smallest: "+secondSmallest);
        }

        sc.close();
    }
    
}
