import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        boolean hasID = false;

        if (age>=18){
            if (hasID){
                System.out.println("Entry allowed");
            }
            else{
                System.out.println("Bring your ID");
            }
        }
        else{
            System.out.println("You are too young :)");
        }
        
        sc.close();
    }
}
