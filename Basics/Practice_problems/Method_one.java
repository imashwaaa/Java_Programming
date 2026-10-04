package Practice_problems;

import java.util.Scanner;

public class Method_one {
    static int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int result = square(num1);

        System.out.println("Square: "+result);

        sc.close();
    }
}
