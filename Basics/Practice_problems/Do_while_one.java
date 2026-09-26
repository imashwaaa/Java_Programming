package Practice_problems;

import java.util.Scanner;

public class Do_while_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int i = num1;
        do{
            System.out.println(i);
            i--;
        } while (i>=1);

        sc.close();
    }
    
}
