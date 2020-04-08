/**
 * Given a string and an integer value n, repeat the string and concatenate 
 * to the resultant string n times.
 * 
 * Input : Hi, 2
 * Output : HiHi
 * 
 * You can see the more test cases in the JUnit.java file.
 * 
 * @author Siva Sankar
 * @author Sandeep Kolli
 */

public class StringTimes {
    /**
     * This method returns the String that is appending the String n 
     * times
     * @param  str the given String
     * @param  n   the integer
     * @return the String that is appended n times to the resultant Stirng
     */
    public static String stringTimes(String str, int n) {
        //  Your code goes here....
        //  
        String finalStr="";//final value get stored in this variable and this variable gets returned
        for(int i=0;i<n;i++){
            finalStr=finalStr+str;
        }
        return finalStr;
    }
}