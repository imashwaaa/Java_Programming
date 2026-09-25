package Practice_problems;
import java.util.Scanner;
public class Bool_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        //generating output
        System.out.println("===== STATUS =====");
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.print("Eligible: ");
        boolean eligible = age >= 18 && marks >= 60;
        System.out.println(eligible);
        System.out.println("==================");

        sc.close();
    }
    
}
