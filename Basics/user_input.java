import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //a new Scanner sc is created. Now it is used in below lines
        
        //taking inputs
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        //printing the output
        System.out.println("===== PROFILE =====");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
        System.out.println("===================");

        sc.close();
    }
    
}
