package Practice_problems;

import java.util.Scanner;

public class For_fortyeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largeCount=-1,digitCount=-1;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;
                for (int j = num1; j>0; j/=10){
                    int countDigit=j%10;
                        if (digit==countDigit){
                            count++;
                        }
                }
                if (count>largeCount){
                    largeCount=count;
                    digitCount=digit;
                } else if (count==largeCount && digit>digitCount){
                    digitCount=digit;
                }

        }
        System.out.println("Largest Most frequent digit: "+digitCount);
        System.out.println("Frequency: "+largeCount);

        sc.close();
    }
    
}
