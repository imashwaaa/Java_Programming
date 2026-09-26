package Practice_problems;

import java.util.Scanner;

public class While_six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        //generating output
        int i = num1;
        int even_count = 0;

        while (i>=1) {
            if (i%2==0){
                even_count += 1;
            }
            
            i--;
        }
        System.out.println(even_count);

        sc.close();
    }
}
