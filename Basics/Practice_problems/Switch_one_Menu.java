package Practice_problems;

import java.util.Scanner;

public class Switch_one_Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Enter a number (1-3): ");
        int item = sc.nextInt();

        //generating output
        System.out.println("===== MENU =====");
        System.out.print("You selected: ");
        switch (item) {
            case 1:
                System.out.println("Coffee");
                break;

            case 2:
                System.out.println("Tea");
                break;

            case 3:
                System.out.println("Juice");
                break;
        
            default:
                System.out.println("Item not in menu");
                break;
        }
        System.out.println("================");

        sc.close();
    }
    
}
