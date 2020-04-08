import java.util.Scanner;

public class DeepGames{
    players [] user;
    int maxusers;
    DeepGames(int n)
        {
            maxusers=n;
            user = new players[n];   
        }

    public static void main(String[] args) throws Exception{
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("           welcome to the game HANG-MAN");
        System.out.println("-----------------------------------------------------------");
        System.out.println("     atleast one player should play the game");
        System.out.print("How many users wanna play the game HANG-MAN : ");
        int maxuserss=DeepGames.getMaxUsersInput();
        while(maxuserss<=0){
            System.out.print("How many users wanna play the game HANG-MAN : ");
            maxuserss=DeepGames.getMaxUsersInput();
        }

        DeepGames guess = new DeepGames(maxuserss);
        guess.playerInput();
        guess.gameTurns();
        guess.leaderboard();
    }

    public static int getMaxUsersInput(){
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
         }
         catch(Exception e){
            sc.next();
            System.out.print("Only Integer Input Is Accepted, please give integer in input: ");
            return getMaxUsersInput();
         }
        

    }

    public void playerInput(){
        int k;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please enter "+ maxusers +" user names for the game :");
        for(int i=0;i<maxusers;i++){
            k=i+1;
            user[i] = new players();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter USER"+k+" name: ");
            String usernameInpt=sc.nextLine();
            user[i].setPlayerName(usernameInpt);
        }
    }

    public void gameTurns() throws Exception{
        for(int i=0;i<maxusers;i++){
            user[i].playGame();
        }
    }

    public void leaderboard(){
        System.out.println();
        System.out.println("---------------------!!LEADERBOARD!!---------------------");
        int [] playerScore = new int[maxusers];
        String [] playerName = new String[maxusers];
        for(int i=0;i<maxusers;i++)
        {
            playerScore[i]=user[i].getPlayerScore();
            playerName[i]=user[i].getPlayerName();
        }
        if(maxusers>=2){
            for (int i = 0; i < maxusers-1; i++)
            {
                for (int j = 0; j < maxusers-1-i; j++)
                {
                    if (playerScore[j] < playerScore[j+1])
                    {
                        // swap temp and arr[i]
                        int temp = playerScore[j];
                        playerScore[j] = playerScore[j+1];
                        playerScore[j+1] = temp;

                        String tempe = playerName[j];
                        playerName[j] = playerName[j+1];
                        playerName[j+1] = tempe;
                    }
                }
            }
        }

        for(int i=0;i<maxusers;i++)
        {
            System.out.println("The score of " + playerName[i] + " is : "+playerScore[i]);
        }
        System.out.println();

        System.out.println("**********************************************************");
        if(playerScore[0]!=0){
            System.out.println(playerName[0] + " is a winner of the game!! congratulations");
        }
        else{
            System.out.println("Everyone is a loser");
        }
        System.out.println("**********************************************************");
    }
}