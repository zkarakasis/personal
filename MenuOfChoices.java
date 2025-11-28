import java.util.Scanner;

public class MenuOfChoices {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String promt = "1. Enter a positive integer and calculate the sum from 1 up to that number." 
        + "2. Enter a positive integer and calculate its factorial." 
        + "Enter anything else to EXIT the program.";

        int choice;

        do {
            System.out.println(promt);
            choice = scan.nextInt();
            if (choice==1){
                //calculate sum
                System.out.println("Please enter an integer: ");
                int integer = scan.nextInt();
                int sum = 0;

                for (int i=1; i<=integer; i++){
                    sum+=i;
                }
                System.out.println("The sum is: " +sum);
            }
            else if (choice==2){
                //calculate factorial
                System.out.println("Please enter an integer: ");
                int integer = scan.nextInt();
                long factorial=1;
                
                for (int i=2;i<=integer; i++){
                    factorial*=i;
                }
                System.out.println("The factorial is: "+factorial);

            }
            else {
                System.out.println("Goodbye!");
            }
        }
         while (choice==1 || choice==2);  // can also be written as ((choice==1) || (choice==2)); for better clarity


        

    }

}
