import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        //if else statement
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a kid");
        }

        sc.close();
    }
}
