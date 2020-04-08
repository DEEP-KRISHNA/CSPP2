public class movie{
    private String movieName;
    private String level;
    private String hint1;
    private String hint2;
    movie(String s1, String s2, String s3, String s4){
        movieName = s1;
        level = s2;
        hint1 = s3;
        hint2 = s4;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getLevel(){
        return level;
    }

    public String getHint1(){
        return hint1;
    }

    public String getHint2(){
        return hint2;
    }
}