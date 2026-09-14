package Practice_problems;
import java.util.Scanner;

public class Input_problem_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking inputs
        System.out.print("Enter first number: ");
        double first_num = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second_num = sc.nextDouble();

        //applying operations and printing
        System.out.println("Sum = "+(first_num+second_num));
        System.out.println("Difference = "+(first_num-second_num));
        System.out.println("Product = "+(first_num*second_num));
        
    }
}
