package Practice_problems;

import java.util.Scanner;

public class Conditional_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter your attendance: ");
        int attendance = sc.nextInt();

        //generating output
        System.out.println("===== RESULT =====");
        System.out.println("Marks:"+marks);
        System.out.println("Attendance:"+attendance);
        if (marks >= 75 || attendance >= 80){
            System.err.println("Qualified");
        }
        else{
            System.out.println("Not Qualified");
        }
        
        
        sc.close();
    }
}
