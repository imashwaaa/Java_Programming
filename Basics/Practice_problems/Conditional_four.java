package Practice_problems;

import java.util.Scanner;

public class Conditional_four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter your attendance: ");
        int attendance = sc.nextInt();

        //generating output
        System.out.print("Result: ");
        if (age >= 18 && marks >= 60 && attendance >= 75){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        sc.close();
    }
    
}
