package Practice_problems;

import java.util.Scanner;

public class For_forty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int smallestNum = 10;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
                for (int j = num1; j>0; j/=10){
                    int countDigit = j%10;
                        if (digit==countDigit){
                            count++;
                        }
                }
            if (count==2 && digit<smallestNum){
                smallestNum=digit;
            }

        }
        if (smallestNum!=10){
            System.out.println("Smallest digit occurring exactly twice: "+smallestNum);
        }else{
            System.out.println("No digit is repeating twice");
        }

        sc.close();
    }
    
}
