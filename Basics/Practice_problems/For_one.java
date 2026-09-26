package Practice_problems;

import java.util.Scanner;

public class For_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        for (int i = 1;num1>=i;i++ ){
            System.out.println(i);
        }


        sc.close();
    }
    
}
