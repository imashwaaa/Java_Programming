package Practice_problems;

import java.util.Scanner;

public class For_thirtysix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num1 = sc.nextLong();
        long largest=-1, secLargest = -1, thirdLargest = -1;

        for (long i = num1; i>0; i/=10){
            long digit = i%10;
                if (digit>largest){
                    thirdLargest=secLargest;
                    secLargest=largest;
                    largest=digit;
                }
                else if (digit<largest && digit>secLargest){
                    thirdLargest=secLargest;
                    secLargest=digit;
                }
                else if (digit<secLargest && digit>thirdLargest){
                    thirdLargest=digit;
                }
        }
        System.out.println("Largest: "+largest);
        if (secLargest == -1) {
            System.out.println("There is no valid Second largest number");
        } else{
            System.out.println("Second largest: "+secLargest);
        }

        if (thirdLargest == -1) {
            System.out.println("There is no valid Third largest number");
        }else{
            System.out.println("Third largest: "+thirdLargest);
        }
        

        sc.close();
    }
    
}
