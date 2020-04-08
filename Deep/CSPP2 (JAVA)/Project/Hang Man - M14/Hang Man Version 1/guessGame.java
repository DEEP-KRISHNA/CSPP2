import java.util.Scanner; 

public class guessGame{
    Scanner sc = new Scanner(System.in);
    public int playGame(String UserName) throws Exception {
        int bonusFlag=0;
        gameOps game = new gameOps(); 
        game.readFile("C:\\Users\\PINAKA\\Desktop\\JAVA\\Deep\\CSPP2 (JAVA)\\Project\\Hang Man\\movies.txt");
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("        Hey "+ UserName+"!! welcome to the game HANG-MAN");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Which level you want to play (Easy or Medium or Hard): ");
        System.out.println("1 for Easy");
        System.out.println("2 for Medium");
        System.out.println("3 for Hard");
        System.out.println("4 for random level (computer will choose)");
        System.out.println("Only 1 - 4 is accepted");
        System.out.println("-----------------------------------------------------------");
        int level;
        System.out.print("Choose a level : ");
        level=getLevelInput();
        while(level<1 || level >4){
            System.out.print("Choose a level : ");
            level=getLevelInput();
        }
        
        movie randomMovie;
        if(level== 4) randomMovie = game.randomWord();
        else randomMovie = game.randomWord(level);
        char guessedChar='\0';
        String guessedString = game.guessedWord(randomMovie, guessedChar);
        String finalString=guessedString;
        System.out.println(randomMovie.getMovieName());
        System.out.println(randomMovie.getLevel());
        String intialGuessLetters = "zjxqkvbgpwyfmculdrithanose";
        String usedChars="";
        int guessInitial=0;
        int k=0;
        int initialGuessLength = Math.floorDiv(randomMovie.getMovieName().length(), 4);

        while(guessInitial<initialGuessLength){
            guessedChar=intialGuessLetters.charAt(k);
            guessedString = game.guessedWord(randomMovie, guessedChar);
            if(!(guessedString.equals("696NOCOMMON696")))
            {
                String sampleStr = "";
                for(int i=0;i<finalString.length();i++){
                    Character c1 = new Character(finalString.charAt(i));
                    Character c2 = new Character(guessedString.charAt(i));
                    if((c1.equals(c2))) sampleStr=sampleStr+finalString.charAt(i);
                    else
                    {
                        if((int)guessedString.charAt(i)==95) sampleStr=sampleStr+finalString.charAt(i);
                        else sampleStr=sampleStr+guessedString.charAt(i);

                    }
                }
                usedChars=usedChars+guessedChar;
                finalString=sampleStr;
                guessInitial++;
            }
            k++;
        }

        int systemGuessedChances=0;
        for(int i=0;i<finalString.length();i++){
            if(game.condition1(finalString.charAt(i)) || game.condition1(finalString.charAt(i))){
                systemGuessedChances++;
            }
        }

        int chancesLeft;
        boolean check;
        String remaingChars="abcdefghijklmnopqrstuvwxyz";
        if(((randomMovie.getMovieName().length())-(systemGuessedChances*3))<systemGuessedChances*2) 
        {
            chancesLeft=(randomMovie.getMovieName().length())-(systemGuessedChances*2);
        }
        else chancesLeft=(randomMovie.getMovieName().length())-(systemGuessedChances*3);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Give charachter input, only one charachter is accepted at a time");
        System.out.println("  If you want to exit press '@' and if you want hint press '#'");
        System.out.println("       If you ask for hints you wont get bonus points");
        System.out.println("----------------------------------------------------------------");
        while(chancesLeft>0){
            String charInpt;
            System.out.println();
            System.out.println(finalString);
            System.out.println("Chances Left: "+chancesLeft);
            System.out.println("already guessed charachters: "+usedChars );
            game.remainingChars(remaingChars,usedChars);
            System.out.print("Guess a Character (@ to EXIT and # for HINT): ");
            charInpt = getCharInput();
            while(charInpt.length()!=1){
                System.out.print("Character input one at a time : ");
                charInpt=getCharInput();
            }
            guessedChar=charInpt.charAt(0);
            if(((int)guessedChar)==((int)'@'))
            {
                break;
            }
            else if(((int)guessedChar)==((int)'#'))
            {   
                bonusFlag=1;
                System.out.println("------------------------");
                System.out.println("Hints are:");
                System.out.println(randomMovie.getHint1());
                System.out.println(randomMovie.getHint2());
                System.out.println("------------------------");
            }
            else{
                if(usedChars.indexOf(guessedChar)==-1)
                {
                    guessedString = game.guessedWord(randomMovie, guessedChar);
                    if(!(guessedString.equals("696NOCOMMON696")))
                    {
                        String sampleStr = "";
                        for(int i=0;i<finalString.length();i++){
                            Character c1 = new Character(finalString.charAt(i));
                            Character c2 = new Character(guessedString.charAt(i));
                            if((c1.equals(c2))) sampleStr=sampleStr+finalString.charAt(i);
                            else
                            {
                                if((int)guessedString.charAt(i)==95) sampleStr=sampleStr+finalString.charAt(i);
                                else sampleStr=sampleStr+guessedString.charAt(i);
            
                            }
                        }
                        usedChars=usedChars+guessedChar;
                        finalString=sampleStr;
                        check=game.checkFinal(finalString);
                        if(check==true) break;
                    }
                    else{
                        usedChars=usedChars+guessedChar;
                        chancesLeft--;
                    }
                }
                else{
                    System.out.println("=> Already This charachter was guessed please try new one");
                }
            }
        }
        System.out.println();
        System.out.println(finalString);
        check=game.checkFinal(finalString);
        if(check==true) 
        {
            if(bonusFlag==0) return ((randomMovie.getMovieName().length()*10)+100);
            else return randomMovie.getMovieName().length()*10;
        }
        else 
        {
            return 0;
        }
    }

    private int getLevelInput(){
        try{
            return sc.nextInt();
         }
         catch(Exception e){
            sc.next();
            System.out.print("Only Integer Input Is Accepted, please give integer in input: ");
            return getLevelInput();
         }
        
    }

    private String getCharInput(){
        String temp=sc.next();
        return temp;
    }
}