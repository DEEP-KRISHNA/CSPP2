import java.util.Scanner;

public class DeepGames{
    players [] user;
    DeepGames()
        {
            user = new players[4];   
        }

    public static void main(String[] args) throws Exception{
        DeepGames guess = new DeepGames();
        guess.playerInput();
        guess.gameTurns();
        guess.leaderboard();
    }

    public void playerInput(){
        int k;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please enter 4 user names for the hang man game :");
        for(int i=0;i<4;i++){
            k=i+1;
            user[i] = new players();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter USER"+k+" name: ");
            String usernameInpt=sc.nextLine();
            user[i].setPlayerName(usernameInpt);
        }
    }

    public void gameTurns() throws Exception{
        for(int i=0;i<4;i++){
            user[i].playGame();
        }
    }

    public void leaderboard(){
        System.out.println();
        System.out.println("---------------------!!LEADERBOARD!!---------------------");
        for(int i=0;i<4;i++){
            user[i].displayScores();
        }
    }


}