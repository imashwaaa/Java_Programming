package Practice_problems;

import java.util.Scanner;

public class Ternary_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //generating output
        System.out.println("===== STATUS =====");
        System.out.println("Age: "+age);
        System.out.print("Status: ");
        System.out.println((age>=18) ? "Adult" : "Minor");
        System.out.println("==================");

        sc.close();
    }
}
