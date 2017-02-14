/**
 * Created by Victoria on 2/13/2017.
 */
import java.util.Random;

//this class inherits from classGamePieces
public class Computer extends GamePieces {
    //create the variable for the object
    private Random rand;

    // in the constructor, initialize Random and create an object of Random

    public Computer() {

        super();
        rand = new Random();
    }
    //CREATE A FUNCTION THAT RETURNS ONE OF THE GAMEPIECES
    public ROSHAMBO getRoshambo() {

        int roshambo = 1 + rand.nextInt(3);

        switch (roshambo) {
            case 1:
                return ROSHAMBO.ROCK;
            case 2:
                return ROSHAMBO.PAPER;
            case 3:
                return ROSHAMBO.SCISSORS;
        }
        return null;
    }
}
