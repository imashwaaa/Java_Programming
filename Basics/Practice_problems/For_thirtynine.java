package Practice_problems;

import java.util.Scanner;

public class For_thirtynine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int largestNum = -1;
        
        
        for (int i = num1; i>0; i/=10){
            int digit = i%10;
            int count=0;
                for (int j = num1; j>0; j/=10){
                    int countDigit = j%10;
                        if (digit==countDigit){
                            count++;
                        }
                }
            if (count==2 && digit>largestNum){
                largestNum=digit;
            }    
        }
        if (largestNum!=-1) {
            System.out.println("Largest digit occurring exactly twice: "+largestNum);
        }else{
            System.out.println("No digit has repeated exactly twice");
        }

        sc.close();
        
    }
    
}
