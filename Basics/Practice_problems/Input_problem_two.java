package Practice_problems;
 import java.util.Scanner;
public class Input_problem_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("===== RESULT =====");
        System.out.println("Marks: "+marks);
         if (marks >= 40){
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
        System.out.println("==================");

        sc.close();
    }
}
