import java.util.Scanner;

public class houses {
    public static void main(String[] args) {

        System.out.println(
            "\nWelcome to houses, a java game for all ages!\n\n" +
            "Rules of the game:\n" +
            "- White player always starts first.\n" +
            "- The two players take turns generating a random number from 1-15.\n" +
            "- Once they do, they add the number to one of the four houses on the board\n" +
            "- If a house reaches exactly 31 then the current player adds 50 points to their total and the house resets.\n" +
            "- If a house exceeds 31, then it is removed for the rest of the round.\n" +
            "- Houses are shared between players.\n" +
            "- A player must avoid closing a house if another safe move exists.\n" +
            "- The game ends when all houses are closed.\n");
        
            Scanner scan = new Scanner(System.in);
            System.out.println("Press ENTER to continue.");
            scan.nextLine();
        
    

        int[] houseSum = {0, 0, 0, 0};
        boolean[] houseClosed = {false, false, false, false};
        String[] history = {"", "", "", ""};
        int[] points = {0, 0};
        boolean whitePlayrTurn = true;

        do{
            String currentPlayer;
            int currentPoints;

            if (whitePlayrTurn) {
                currentPlayer = "White";
                currentPoints = points[0];
            } 
            else {
                currentPlayer = "Black";
                currentPoints = points[1];
            }
            System.out.println(currentPlayer + " player's turn (" + currentPoints + " points)\n");


            showHouses(houseSum, houseClosed, history);

            int randomNumber = (int) (Math.random() * 15) + 1;
            System.out.println("Random number generated: " + randomNumber);
            System.out.print("To which House do you wish to place the number? ");
            int choice = scan.nextInt() - 1;

            do {
                System.out.println("Invalid move.\n" +"Please choose another house:");
                choice = scan.nextInt() - 1;
            }
            while (!isValidChoice(choice, randomNumber, houseSum, houseClosed));

            houseSum[choice] += randomNumber;
            history[choice] += randomNumber + " ";

            if (houseSum[choice] == 31) {
                System.out.println("\n***House " + (choice + 1) + " completes a sum of 31!");
                System.out.println("*** " + currentPlayer + " player gains 50 points!");
                System.out.println("*** House " + (choice + 1) + " has reset.");

                if (whitePlayrTurn) {
                    points[0] += 50;
                } else {
                    points[1] += 50;
                }

                houseSum[choice] = 0;
                history[choice] = "";
            }
            else if (houseSum[choice] > 31) {
                System.out.println("\n*** House "+ choice +" CLOSED!\n");
                houseClosed[choice] = true;
                history[choice] = "";
            }

            whitePlayrTurn = !whitePlayrTurn;
            System.out.println("\n-------------------------------\n");
        }
        while (allHousesClosed(houseClosed) == false);

        System.out.println("\nGAME OVER");
        System.out.println("White points: " + points[0]);
        System.out.println("Black points: " + points[1]);

        if (points[0] > points[1])
            System.out.println("WHITE WINS!");
        else if (points[1] > points[0])
            System.out.println("BLACK WINS!");
        else
            System.out.println("DRAW!");
    }
 // -----------------------------------------------------------------------------------

    public static boolean allHousesClosed(boolean[] houseClosed) {
        for (int i = 0; i < 4; i++) {
            if (!houseClosed[i])
                return false;
        }
        return true;
    }

    public static void showHouses(int[] houseSum, boolean[] houseClosed, String[] history) {

        System.out.println("Houses:");
        for (int i = 0; i <=3; i++) {
            if (houseClosed[i])
                System.out.println("H" + (i + 1) + ": CLOSED!");
            else{
                System.out.println(
                "H" + (i + 1) + " (Sum: " + houseSum[i] + "): " + history[i]);
            }       
        }
        System.out.println();
    }

    public static boolean hasSafeMove(int number, int[] houseSum, boolean[] houseClosed) {
        for (int i = 0; i <= 3; i++) {
            if (!houseClosed[i] && houseSum[i] + number <= 31) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidChoice(int choice, int randomNumber, int[] houseSum, boolean[] houseClosed) {
        if (choice < 0 || choice > 3){
            return false;   
        }
        if (houseClosed[choice]){
            return false;
        }
        int newHouseSum = houseSum[choice] + randomNumber;
        if (newHouseSum > 31 && hasSafeMove(randomNumber, houseSum, houseClosed)){
            return false;
        }
        return true;
    }

    
}




















    












