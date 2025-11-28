import java.util.Scanner;

public class BreakDemoWithString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String string = scan.nextLine();

        System.out.println("Please enter a character: ");
        char character = scan.nextLine().charAt(0);  //up to nextLine() the method returns a string, that's why we use charAt(0) to return the 1st char of the string
        //can also be written as: String string2 = scan.nextLine();
        //                        char character2 = string2.charAt(0); 
        boolean found =false;

        for(int i=0; i<string.length(); i++){
            if (character == string.charAt(i)){
                System.out.println("The character "+character+" appears in position "+(i+1));
                found = true;
                break; // We stop the loop since we have already found what we are looking for
            }
        }    
        if (found == false) {
            //if (!found) == if (found == false)   
                System.out.println("The character"+character+" does not appear in the "+string);
            }   
    }

}
