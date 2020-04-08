public class players{
    private String playerName;
    private int playerScore;
    
    public void setPlayerName(String pName){
        playerName=pName;
    }

    public String getPlayerName(){
        return playerName;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public void playGame() throws Exception{
        guessGame game = new guessGame();
        playerScore = game.playGame(playerName);
    }

    public void displayScores(){
        System.out.println("Score of "+ playerName +": "+playerScore);
    }
}