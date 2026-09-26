package Practice_problems;

import java.util.Scanner;

public class Do_while_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("===== MENU =====\n" + //
                                "1. Say Hello\n" + //
                                "2. Say Bye\n" + //
                                "3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            
            case 2:
                System.out.println("Bye!");
                break;

            case 3:
                System.out.println("GoodBye!");
                break;

            default:
                System.out.println("Invalid command");
                break;
        }
        }while (choice != 3);

        sc.close();
    }
    
}
