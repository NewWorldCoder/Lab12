/**
 * Created by Victoria on 2/13/2017.
 */
public class Game extends GamePieces {

    private Player player;
    private Computer computer;
    private ROSHAMBO playerRoshambo;
    private ROSHAMBO computerRoshambo;
    private RESULT result;
    private static int wins;
    private static int losses;
    private static int tie;


    public Game() {

        super();
        player = new Player();
        computer = new Computer();
        // now will come back here an call play method as we now have results.  Will assign the result
        //to the variable RESULT
        result = getResult();

    }

    public void play() {

        //need player to make a choice
        playerRoshambo = player.getRosambo();
        //need computer to make a choice
        computerRoshambo = computer.getRoshambo();
        result = getResult();
        displayResult();
        stats();

    }

    //this will be called from Main, hence "public"
    //will be called at the end to display stats
    public void displayStats()  {
        System.out.println("You have played " + (wins + losses + tie));
        System.out.println("You have won " + wins +" games.");
        System.out.println("You have lost " + losses +" games.");
        System.out.println("You have tied " + tie +" games.");
        System.out.println("Thank you for being such a good sport.");
    }


    //create a stats method
    private void stats()  {
        if (result == RESULT.WIN)
            wins++;
        else if (result == RESULT.LOSE)
            losses++;
        else if (result == RESULT.TIE)
            tie++;
    }

    //eval who won
    private void displayResult()  {

        switch (result) {
            case WIN:
                System.out.println(playerRoshambo + " beats " + computerRoshambo + ", Player WINS");
                break;
            case LOSE:
                System.out.println(playerRoshambo + " loses to " + computerRoshambo + ", Computer WINS");
                break;
            case TIE:
                System.out.println(playerRoshambo + " is the same as " + computerRoshambo + ", We have a TIE");
                break;

        }

    }
     //need a method that will get a result
    private RESULT getResult()  {

        if (playerRoshambo == computerRoshambo)
            return RESULT.TIE;

        switch(playerRoshambo) {
            case ROCK:
                return (computerRoshambo == ROSHAMBO.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            case PAPER:
                return (computerRoshambo == ROSHAMBO.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSORS:
                return (computerRoshambo == ROSHAMBO.PAPER ? RESULT.WIN : RESULT.LOSE);
        }
        //this will not happen but needed a return
        return RESULT.LOSE;
        // now display the result in line 19
    }
}