import java.util.ArrayList;
import java.util.Scanner;

/**
* @author theunknownSAI
*/
class Game {

    /**
    * game board.
    */
    private int[][] board;
    /**
    * player details.
    */
    private Player[] players;
    /**
     * snakes postion.
     */
    private ArrayList<Snake> snakes;
    /**
     * ladders postion.
     */
    private ArrayList<Ladder> ladders;

    
    public static void main(final String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" number of players ");
            }
        }

        Game play = new Game(numberOfPlayers);
        play.getDetails(numberOfPlayers);
        play.createGame();
        play.playGame();

        System.out.println(" total number of chances taken for winning ");
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println(" name = " + play.getPlayers()[i].getPlayerName()
            + " " + " chances = " + play.getPlayers()[i].getNumberOfChances());
        }
    }}