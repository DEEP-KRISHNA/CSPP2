

/** 
* @author sandeep kolli
* Movie class have all the required attributes of a movie.
*/

public class Movie{
    private String movieName;
    private String level;
    private String hint1;
    private String hint2;
    
    /*
    * the following constructer sets the values of attributes according to the order, during the time of object creation.
    */
    
    Movie(String s1, String s2, String s3, String s4){
        movieName = s1;
        level = s2;
        hint1 = s3;
        hint2 = s4;
    }

    /*
    * The following functions are getter function each function returns the each value present accordingly.
    */

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