class Player {
    /**
     * name of the player.
     */
    private String playerName;
    /**
     * number of times rolled the dice.
     */
    private int numberOfChances;
    /**
     * indicate player has won the game or not.
     */
    private boolean gameWon = false;
    /**
     * position of player on board.
     */
    private int playerPosition;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(final String playerName1) {
        this.playerName = playerName1;
    }

    public int getNumberOfChances() {
        return numberOfChances;
    }

    public void setNumberOfChances(final int numberOfChances1) {
        this.numberOfChances = numberOfChances1;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public void setGameWon(final boolean gameWon1) {
        this.gameWon = gameWon1;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(final int playerPosition1) {
        this.playerPosition = playerPosition1;
    }

    Player(final String playerName1, final int playerPosition1, final int numberOfChances1, final boolean gameWon1) {
        this.playerName = playerName1;
        this.numberOfChances = numberOfChances1;
        this.gameWon = gameWon1;
        this.playerPosition = playerPosition1;
    }
}
