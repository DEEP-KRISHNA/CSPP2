/**
 * @author Sandeep Kolli
 */

public class BookYourShow{
    Show [] shows;
    int size;
    BookYourShow(){
        shows = new Show[100];
        size=0;
    }

    public void addAShow(Show s)
    {
        shows[size]=s;
        size++;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(shows[i].moviename);
            System.out.println(shows[i].showtime);
            System.out.println(shows[i].seats[0]);
            System.out.println(shows[i].seats[1]);
        }
    }

    public Show getAShow(String s1, String s2){
        for(int i=0;i<size;i++){
            if(shows[i].moviename.equals(s1) && shows[i].showtime.equals(s2)){
                return shows[i];
            }        
        }
        return null;
    }
}