/**
 * Created by Victoria on 2/13/2017.
 */

import java.util.Scanner;

public class Player extends GamePieces {

    //Variable scanner will hold the object scanner
    Scanner scan;

    //build constructor
    public Player() {

        super();
        //instantiate the scanner
        scan = new Scanner(System.in);
    }

    //Give the user the option of a choice of R,P,S
    public GamePieces.ROSHAMBO getRosambo() {

        System.out.println("Please enter R=ROCK, P=PAPER, or S=SCISSORS.");
        char playerRoshambo = scan.nextLine().toUpperCase().charAt(0);



        switch (playerRoshambo) {

            case 'R':
                return GamePieces.ROSHAMBO.ROCK;

            case 'P':
                return GamePieces.ROSHAMBO.PAPER;

            case 'S':
                return GamePieces.ROSHAMBO.SCISSORS;
        }
        System.out.println("Be sure to enter R, P or S.  Only these 3 options are valid.");
        return getRosambo();
    }

}
