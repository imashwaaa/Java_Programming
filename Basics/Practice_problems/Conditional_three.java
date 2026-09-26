package Practice_problems;

import java.util.Scanner;

public class Conditional_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        if (age<18 || !isStudent){
            System.out.println("Not Eligible");
        }
        else {
            System.out.println("Eligible");
        }

        sc.close();
    }
    
}
