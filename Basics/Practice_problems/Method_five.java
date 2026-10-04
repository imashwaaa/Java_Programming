package Practice_problems;

import java.util.Scanner;

public class Method_five {

    static boolean numPrime(int num){
        int factorCount=0;

            for (int i = 1; i<=num; i++){
                if (num%i==0){
                    factorCount++;
                }
            }
            
            if (factorCount==2){
                return true;
            }   else{
                return false;
            }
       
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Number is prime: "+numPrime(num1));

        sc.close();
    }
}
