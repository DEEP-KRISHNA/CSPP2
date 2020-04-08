

/** 
* @author sandeep kolli
* Players class have all the attributes of player such as playerName and playerScore
*/

public class Players{
    private String playerName;
    private int playerScore;
    
    /**
     * 
     * @param pName
     * it is one of the setter function
     * it takes pName as argument and set that value to playerName
     */
    public void setPlayerName(String pName){
        playerName = pName;
    }


    /*
    * it is one of the getter function
    * it returns the player Name
    */

    public String getPlayerName(){
        return playerName;
    }

    /*
    * it is one of the getter function
    * it returns the player Score
    */

    public int getPlayerScore(){
        return playerScore;
    }

    /*
    * this function calls the main game
    * score will get updated based on return value of called function
    */

    public void playGame() throws Exception{
        GuessGame game = new GuessGame();
        playerScore = game.playGame(playerName);
    }

    /*
    this function will display the scores of particular player.
    */
    public void displayScores(){
        System.out.println("Score of " + playerName + ": " + playerScore);
    }
}