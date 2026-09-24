package Practice_problems;

import java.util.Scanner;

public class Nested_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        //generating output
        System.out.println("===== ELIGIBILITY =====");
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        if (age>=18){
            if (marks>=60){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Marks too low");
            }
        }
        else{
            System.out.println("Age requirement not met");
        }
        System.out.println("=======================");

        sc.close();
    }
}
