package Practice_problems;

import java.util.Scanner;

public class Conditional_five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter your attendance: ");
        int attendance = sc.nextInt();
        System.out.print("Are your absent? (true/false): ");
        boolean absent = sc.nextBoolean();

        //generating output
        System.out.print("Result: ");
        if ((marks>=85 && attendance>=90) || (marks>=95 && !absent)){
            System.out.println("Special Access");
        }
        else{
            System.out.println("No Special Access");
        }

        sc.close();
    }
    
}
