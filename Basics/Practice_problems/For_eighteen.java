package Practice_problems;

import java.util.Scanner;

public class For_eighteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int threeProduct = 1;

        for (int i = num1; i>0; i/=10){
            int digit = i%10;
                if (digit % 3 ==0){
                    threeProduct *= digit;
                }
        }
        System.out.println(threeProduct);

        sc.close();
    }
    
}
