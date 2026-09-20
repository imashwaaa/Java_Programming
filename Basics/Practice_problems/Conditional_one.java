package Practice_problems;
import java.util.Scanner;
public class Conditional_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("===== ELIGIBILITY =====");
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        if (age>=18 && marks>=60){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }


        sc.close();
    }
}
