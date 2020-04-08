import java.io.*;
import java.util.*;
public class gameOps{
    
    movie[] movies;
    int size;
    
    gameOps() {
        movies = new movie[100];
        size = 0;
    }

    public void readFile(String filepath) throws Exception{
        File file = new File(filepath); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String st;
        String str = "";

        while ((st = br.readLine()) != null){   
            if(st.length() == 0) str = str + "\n";
            else str=str+st+"696";
        }
        String [] strarr = str.split("\n");

        for(int i=0;i<strarr.length;i++){
            if(strarr[i].length()!=0) 
            {
                String [] samplestr;
                samplestr=strarr[i].split("696");
                //System.out.println(samplestr.length);
                movies[size] = new movie(samplestr[0], samplestr[1], samplestr[2], samplestr[3]);
                size++;      
            }
        }
    }
    
    public void displayAll(){
        for(int i=0;i<size;i++){
            System.out.print(movies[i].getMovieName() + "  ");
            System.out.print(movies[i].getLevel() + "  ");
            System.out.print(movies[i].getHint1() + "  ");
            System.out.print(movies[i].getHint2() + "  ");
            System.out.println();
        }
    }

    public movie randomWord(){
        double d = Math.random();
        return movies[(int)(d*size)];
    }

    public movie randomWord(int levelS){
        String levelStr;
        if(levelS==1) levelStr="Easy";
        else if(levelS==2) levelStr="Medium";
        else levelStr="Hard"; 
        double d = Math.random();
        if(movies[(int)(d*size)].getLevel().equals(levelStr)) 
        {
            return movies[(int)(d*size)];
        }
        else return randomWord(levelS);
    }

    public boolean condition1(char ch){
        return ((int)ch>=97 && (int)ch<=122);
    }

    public boolean condition2(char ch){
        return ((int)ch>=65 && (int)ch<=90);
    }

    public String guessedWord(movie m, char s){
        String mov = m.getMovieName().toLowerCase();
        String returnStr="";
        if(s=='\0'){
            for(int i=0;i<mov.length();i++){
                if(condition1(mov.charAt(i)) || condition2(mov.charAt(i))) returnStr=returnStr+"_"+" ";
                else returnStr=returnStr+mov.charAt(i)+" ";
            }
        }
        else{
            if(mov.indexOf(s)==-1){
                returnStr="696NOCOMMON696";
            }
            else{
                for(int i=0;i<mov.length();i++){
                    if(condition1(mov.charAt(i)) || condition2(mov.charAt(i)))
                    {   
                        Character c1 = new Character(mov.charAt(i));
                        Character c2 = new Character(s);
                        if(c1.equals(c2)) returnStr=returnStr+s+" ";
                        else returnStr=returnStr+"_"+" ";
                    } 
                    else returnStr=returnStr+mov.charAt(i)+" ";
                }   
            }
        }
        return returnStr;
    }

    public boolean checkFinal(String str){
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)==95) return false;
        }
        return true;
    }

    public void remainingChars(String allValues, String usedValues){
        String rem="";
        for(int i=0;i<allValues.length();i++){
            if(usedValues.indexOf(allValues.charAt(i))==-1)
            rem=rem+allValues.charAt(i);
        }
        System.out.println("Charachters remained for guessing: "+rem);
    }
    
}