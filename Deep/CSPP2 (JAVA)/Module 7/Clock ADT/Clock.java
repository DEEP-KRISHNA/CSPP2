/**
 * @author Sandeep Kolli
 */
/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    private int hr;
    private int min;

    public Clock(int h, int m) {
        hr=h;
        min=m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        String hr_min[] = s.split(":");
        
        hr=(Character.getNumericValue(hr_min[0].charAt(0))*10) + Character.getNumericValue(hr_min[0].charAt(1));
        min=(Character.getNumericValue(hr_min[1].charAt(0))*10) + Character.getNumericValue(hr_min[1].charAt(1));
    }

    public int getHr(){
        return hr;
    }

    public int getMin(){
        return min;
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String hrStr="";
        String minStr="";
        if(hr<10) hrStr="0"+hr;
        else hrStr=""+hr;
        if(min<10) minStr="0"+min;
        else minStr=""+min;
        String final_str=(hrStr+":"+minStr);
        return final_str;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if(hr<=that.getHr())
        {
            if(min<that.getMin()){
                return true;
            }
            else return false;
        }
        else return true;
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        int oldMin=min;
        min=((min+1)%60);
        hr=((((oldMin+1)/60)+hr)%24);
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if(delta>=0){
        int oldMin=min;
        min=((min+delta)%60);
        hr=((((oldMin+delta)/60)+hr)%24);
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("23:59");
        clock.tic();
    }
}