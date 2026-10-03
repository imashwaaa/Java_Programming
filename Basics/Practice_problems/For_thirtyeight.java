package Practice_problems;

import java.util.Scanner;

public class For_thirtyeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largestNum = -1;
        
        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count = 0;

                for (int j=num1; j>0; j/=10){
                    int currentDigit = j%10;
                            if (digit==currentDigit){
                                count++;
                            }
                }
            if (count==1 && digit>largestNum){
                largestNum = digit;
            }
        }
        if (largestNum == -1){
            System.out.println("No digits repeated once");
        }
        else{
            System.out.println("Largest digit to repeat exactly once: "+largestNum);
        }

        sc.close();
    }
    
}
