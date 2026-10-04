package Practice_problems;

import java.util.Scanner;

public class For_fortynine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        boolean found = false;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
                for (int j = num1; j>0; j/=10){
                    int countDigit=j%10;
                        if (digit==countDigit){
                            count++;
                        }
                        if (count>1){
                            found=true;
                            break;
                        }
                }
        }    
        if (found==false){
                System.out.println("No repeated digit");
            } else{
                System.out.println("Repeated digit exists");
            }

        sc.close();
    }
    
}
