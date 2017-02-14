/**
 * Created by Victoria on 2/13/2017.
 */
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        //indicate if player wishes to quit
        char quit = 'Y';

        while (quit == 'Y') {
            game.play();

            System.out.println("Would you like to play again? Press Y to continue, or N to quit.");
            quit = scan.nextLine().toUpperCase().charAt(0);
        }

        scan.close();
        game.displayStats();


    }
}
