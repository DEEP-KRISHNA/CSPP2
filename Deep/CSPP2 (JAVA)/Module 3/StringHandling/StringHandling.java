/**
 * Given an array of Strings, convert each string of the array into 
 * lower case String and then return the array. 
 * 
 * Input : {"Hello", "Hi"}
 * Output : {"hello", "hi"}
 * 
 * @author Sandeep Kolli
 */

public class StringHandling {

    /**
     * This method returns the array of lower case strings.
     * @param arr, the input array.
     * @return the array of lower case Strings based on the input parameter.
     */
    public static String[] lower(String[] arr) {
        //  your code goes here....
        String [] lowerArr= new String[arr.length];// lowerArr contains the strings which are converted to lower case
        int i=0;
        for(String str: arr){
            lowerArr[i]=str.toLowerCase();
            i++;
        }
        return lowerArr;
    }
}