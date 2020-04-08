/**
 * @author Sandeep Kolli
 */

public class Show{
    public String moviename;
    public String showtime;
    public String [] seats;
    Patron [] people;
    int sizee;
    Show(String s1, String s2, String [] s3){
        moviename=s1;
        showtime=s2;
        seats=s3;
        people=new Patron[100];
        sizee=0;
    }

    public void bookAShow(Patron p, String [] s){
        people[sizee]=p;
        people[sizee].bookedSeats=s;
        sizee++;
    }

    public void printTickets(Patron p){
        for(int i=0;i<sizee;i++){
            if(p.name.equals(people[i].name)){
                System.out.println(people[i].name);
                System.out.println(people[i].number);
                System.out.println(people[i].bookedSeats[0]);
                System.out.println(people[i].bookedSeats[1]);
                System.out.println();
            }
        }
    }
}